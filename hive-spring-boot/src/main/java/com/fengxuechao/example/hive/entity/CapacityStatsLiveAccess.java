package com.fengxuechao.example.hive.entity;

import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author fengxuechao
 */
@Data
public class CapacityStatsLiveAccess implements RowMapper<CapacityStatsLiveAccess> {
    /**
     * 主键
     */
    private Long id;

    /**
     * 设备号
     */
    private String deviceNum;

    /**
     * 调阅开始时间
     */
    private Date startTime;

    /**
     * 调阅结束时间
     */
    private Date finishTime;

    /**
     * 耗时，单位秒
     */
    private Long duration;

    /**
     * 调用结果 1.成功 0.失败
     */
    private Byte response;

    /**
     * Implementations must implement this method to map each row of data
     * in the ResultSet. This method should not call {@code next()} on
     * the ResultSet; it is only supposed to map values of the current row.
     *
     * @param rs     the ResultSet to map (pre-initialized for the current row)
     * @param rowNum the number of the current row
     * @return the result object for the current row (may be {@code null})
     * @throws SQLException if a SQLException is encountered getting
     *                      column values (that is, there's no need to catch SQLException)
     */
    @Override
    public CapacityStatsLiveAccess mapRow(ResultSet rs, int rowNum) throws SQLException {
        CapacityStatsLiveAccess access = new CapacityStatsLiveAccess();
        access.setId(rs.getLong("id"));
        access.setDeviceNum(rs.getString("device_num"));
        access.setStartTime(rs.getDate("start_time"));
        access.setFinishTime(rs.getDate("finish_time"));
        access.setDuration(rs.getLong("duration"));
        access.setResponse(rs.getByte("response"));
        return access;
    }
}