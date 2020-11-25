package com.fengxuechao.example.hive.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 日志AOP
 * 如果你的AOP产生了两个代理导致执行了两次，那么请你升级 druid-spring-boot-starter 的版本为最新。
 *
 * @author fengxuechao
 * @date 2020/6/23
 */
@Component
public class LogAspect implements MethodBeforeAdvice, MethodInterceptor, AfterReturningAdvice, ThrowsAdvice {

    private static final int ERROR_DURATION = 3000;
    private static final int WARN_DURATION = 2000;
    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 环绕通知
     *
     * @param invocation the method invocation joinpoint
     * @return the result of the call to {@link Joinpoint#proceed()};
     * might be intercepted by the interceptor
     * @throws Throwable if the interceptors or the target object
     *                   throws an exception
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String className = invocation.getMethod().getDeclaringClass().getName();
        log.info("====== 开始执行 {}.{} ======", className, invocation.getMethod().getName());

        if (invocation.getArguments() != null) {
            log.info("入参 {}", invocation.getArguments());
        }

        // 记录开始时间
        long begin = System.currentTimeMillis();

        // 执行目标 service
        Object result = invocation.proceed();

        log.info("出参 {}", result);

        // 记录结束时间
        long end = System.currentTimeMillis();
        long takeTime = end - begin;

        if (takeTime > ERROR_DURATION) {
            log.error("====== 执行结束，耗时：{} 毫秒 ======", takeTime);
        } else if (takeTime > WARN_DURATION) {
            log.warn("====== 执行结束，耗时：{} 毫秒 ======", takeTime);
        } else {
            log.info("====== 执行结束，耗时：{} 毫秒 ======", takeTime);
        }

        return result;
    }

    /**
     * 后置通知
     *
     * @param returnValue the value returned by the method, if any
     * @param method      method being invoked
     * @param args        arguments to the method
     * @param target      target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }

    /**
     * 前置通知
     *
     * @param method method being invoked
     * @param args   arguments to the method
     * @param target target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
    }

    /**
     * 抛出异常才会执行的通知比较特殊，它的接口类体为空，
     * 只起一个标记作用。
     * 不过会默认调用afterThrowing方法作为通知。
     *
     * @see ThrowsAdvice
     */
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {

    }

}
