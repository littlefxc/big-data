package com.fengxuechao.example.hive.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

/**
 * (Airline)实体类
 *
 * @author makejava
 * @since 2020-11-25 15:44:56
 */
@ApiModel
public class Airline implements Serializable {
    private static final long serialVersionUID = 885184328983190337L;

    private Integer year;

    private Integer quarter;

    private Integer month;

    private Integer dayofmonth;

    private Integer dayofweek;

    private String uniquecarrier;

    private Long airlineid;

    private String carrier;

    private String tailnum;

    private Integer flightnum;

    private Long originairportid;

    private Long originairportseqid;

    private Long origincitymarketid;

    private String origin;

    private String origincityname;

    private String originstate;

    private Integer originstatefips;

    private String originstatename;

    private Integer originwac;

    private Integer destairportid;

    private Long destairportseqid;

    private Long destcitymarketid;

    private String dest;

    private String destcityname;

    private String deststate;

    private Integer deststatefips;

    private String deststatename;

    private Integer destwac;

    private Integer crsdeptime;

    private Integer deptime;

    private Integer depdelay;

    private Integer depdelayminutes;

    private Integer depdel15;

    private Integer departuredelaygroups;

    private String deptimeblk;

    private Integer taxiout;

    private Integer wheelsoff;

    private Integer wheelson;

    private Integer taxiin;

    private Integer crsarrtime;

    private Integer arrtime;

    private Integer arrdelay;

    private Integer arrdelayminutes;

    private Integer arrdel15;

    private Integer arrivaldelaygroups;

    private String arrtimeblk;

    private Integer cancelled;

    private String cancellationcode;

    private Integer diverted;

    private Integer crselapsedtime;

    private Integer actualelapsedtime;

    private Integer airtime;

    private Integer flights;

    private Long distance;

    private Integer distancegroup;

    private Integer carrierdelay;

    private Integer weatherdelay;

    private Integer nasdelay;

    private Integer securitydelay;

    private Integer lateaircraftdelay;

    private Integer firstdeptime;

    private Integer totaladdgtime;

    private Integer longestaddgtime;

    private Integer divairportlandings;

    private Integer divreacheddest;

    private Integer divactualelapsedtime;

    private Integer divarrdelay;

    private Integer divdistance;

    private Integer div1airport;

    private Integer div1airportid;

    private Integer div1airportseqid;

    private Integer div1wheelson;

    private Integer div1totalgtime;

    private Integer div1longestgtime;

    private Integer div1wheelsoff;

    private Integer div1tailnum;

    private Integer div2airport;

    private Integer div2airportid;

    private Integer div2airportseqid;

    private Integer div2wheelson;

    private Integer div2totalgtime;

    private Integer div2longestgtime;

    private Integer div2wheelsoff;

    private Integer div2tailnum;

    private Integer div3airport;

    private Integer div3airportid;

    private Integer div3airportseqid;

    private Integer div3wheelson;

    private Integer div3totalgtime;

    private Integer div3longestgtime;

    private Integer div3wheelsoff;

    private Integer div3tailnum;

    private Integer div4airport;

    private Integer div4airportid;

    private Integer div4airportseqid;

    private Integer div4wheelson;

    private Integer div4totalgtime;

    private Integer div4longestgtime;

    private Integer div4wheelsoff;

    private Integer div4tailnum;

    private Integer div5airport;

    private Integer div5airportid;

    private Integer div5airportseqid;

    private Integer div5wheelson;

    private Integer div5totalgtime;

    private Integer div5longestgtime;

    private Integer div5wheelsoff;

    private Integer div5tailnum;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date flightdate;


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDayofmonth() {
        return dayofmonth;
    }

    public void setDayofmonth(Integer dayofmonth) {
        this.dayofmonth = dayofmonth;
    }

    public Integer getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(Integer dayofweek) {
        this.dayofweek = dayofweek;
    }

    public String getUniquecarrier() {
        return uniquecarrier;
    }

    public void setUniquecarrier(String uniquecarrier) {
        this.uniquecarrier = uniquecarrier;
    }

    public Long getAirlineid() {
        return airlineid;
    }

    public void setAirlineid(Long airlineid) {
        this.airlineid = airlineid;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTailnum() {
        return tailnum;
    }

    public void setTailnum(String tailnum) {
        this.tailnum = tailnum;
    }

    public Integer getFlightnum() {
        return flightnum;
    }

    public void setFlightnum(Integer flightnum) {
        this.flightnum = flightnum;
    }

    public Long getOriginairportid() {
        return originairportid;
    }

    public void setOriginairportid(Long originairportid) {
        this.originairportid = originairportid;
    }

    public Long getOriginairportseqid() {
        return originairportseqid;
    }

    public void setOriginairportseqid(Long originairportseqid) {
        this.originairportseqid = originairportseqid;
    }

    public Long getOrigincitymarketid() {
        return origincitymarketid;
    }

    public void setOrigincitymarketid(Long origincitymarketid) {
        this.origincitymarketid = origincitymarketid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigincityname() {
        return origincityname;
    }

    public void setOrigincityname(String origincityname) {
        this.origincityname = origincityname;
    }

    public String getOriginstate() {
        return originstate;
    }

    public void setOriginstate(String originstate) {
        this.originstate = originstate;
    }

    public Integer getOriginstatefips() {
        return originstatefips;
    }

    public void setOriginstatefips(Integer originstatefips) {
        this.originstatefips = originstatefips;
    }

    public String getOriginstatename() {
        return originstatename;
    }

    public void setOriginstatename(String originstatename) {
        this.originstatename = originstatename;
    }

    public Integer getOriginwac() {
        return originwac;
    }

    public void setOriginwac(Integer originwac) {
        this.originwac = originwac;
    }

    public Integer getDestairportid() {
        return destairportid;
    }

    public void setDestairportid(Integer destairportid) {
        this.destairportid = destairportid;
    }

    public Long getDestairportseqid() {
        return destairportseqid;
    }

    public void setDestairportseqid(Long destairportseqid) {
        this.destairportseqid = destairportseqid;
    }

    public Long getDestcitymarketid() {
        return destcitymarketid;
    }

    public void setDestcitymarketid(Long destcitymarketid) {
        this.destcitymarketid = destcitymarketid;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDestcityname() {
        return destcityname;
    }

    public void setDestcityname(String destcityname) {
        this.destcityname = destcityname;
    }

    public String getDeststate() {
        return deststate;
    }

    public void setDeststate(String deststate) {
        this.deststate = deststate;
    }

    public Integer getDeststatefips() {
        return deststatefips;
    }

    public void setDeststatefips(Integer deststatefips) {
        this.deststatefips = deststatefips;
    }

    public String getDeststatename() {
        return deststatename;
    }

    public void setDeststatename(String deststatename) {
        this.deststatename = deststatename;
    }

    public Integer getDestwac() {
        return destwac;
    }

    public void setDestwac(Integer destwac) {
        this.destwac = destwac;
    }

    public Integer getCrsdeptime() {
        return crsdeptime;
    }

    public void setCrsdeptime(Integer crsdeptime) {
        this.crsdeptime = crsdeptime;
    }

    public Integer getDeptime() {
        return deptime;
    }

    public void setDeptime(Integer deptime) {
        this.deptime = deptime;
    }

    public Integer getDepdelay() {
        return depdelay;
    }

    public void setDepdelay(Integer depdelay) {
        this.depdelay = depdelay;
    }

    public Integer getDepdelayminutes() {
        return depdelayminutes;
    }

    public void setDepdelayminutes(Integer depdelayminutes) {
        this.depdelayminutes = depdelayminutes;
    }

    public Integer getDepdel15() {
        return depdel15;
    }

    public void setDepdel15(Integer depdel15) {
        this.depdel15 = depdel15;
    }

    public Integer getDeparturedelaygroups() {
        return departuredelaygroups;
    }

    public void setDeparturedelaygroups(Integer departuredelaygroups) {
        this.departuredelaygroups = departuredelaygroups;
    }

    public String getDeptimeblk() {
        return deptimeblk;
    }

    public void setDeptimeblk(String deptimeblk) {
        this.deptimeblk = deptimeblk;
    }

    public Integer getTaxiout() {
        return taxiout;
    }

    public void setTaxiout(Integer taxiout) {
        this.taxiout = taxiout;
    }

    public Integer getWheelsoff() {
        return wheelsoff;
    }

    public void setWheelsoff(Integer wheelsoff) {
        this.wheelsoff = wheelsoff;
    }

    public Integer getWheelson() {
        return wheelson;
    }

    public void setWheelson(Integer wheelson) {
        this.wheelson = wheelson;
    }

    public Integer getTaxiin() {
        return taxiin;
    }

    public void setTaxiin(Integer taxiin) {
        this.taxiin = taxiin;
    }

    public Integer getCrsarrtime() {
        return crsarrtime;
    }

    public void setCrsarrtime(Integer crsarrtime) {
        this.crsarrtime = crsarrtime;
    }

    public Integer getArrtime() {
        return arrtime;
    }

    public void setArrtime(Integer arrtime) {
        this.arrtime = arrtime;
    }

    public Integer getArrdelay() {
        return arrdelay;
    }

    public void setArrdelay(Integer arrdelay) {
        this.arrdelay = arrdelay;
    }

    public Integer getArrdelayminutes() {
        return arrdelayminutes;
    }

    public void setArrdelayminutes(Integer arrdelayminutes) {
        this.arrdelayminutes = arrdelayminutes;
    }

    public Integer getArrdel15() {
        return arrdel15;
    }

    public void setArrdel15(Integer arrdel15) {
        this.arrdel15 = arrdel15;
    }

    public Integer getArrivaldelaygroups() {
        return arrivaldelaygroups;
    }

    public void setArrivaldelaygroups(Integer arrivaldelaygroups) {
        this.arrivaldelaygroups = arrivaldelaygroups;
    }

    public String getArrtimeblk() {
        return arrtimeblk;
    }

    public void setArrtimeblk(String arrtimeblk) {
        this.arrtimeblk = arrtimeblk;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }

    public String getCancellationcode() {
        return cancellationcode;
    }

    public void setCancellationcode(String cancellationcode) {
        this.cancellationcode = cancellationcode;
    }

    public Integer getDiverted() {
        return diverted;
    }

    public void setDiverted(Integer diverted) {
        this.diverted = diverted;
    }

    public Integer getCrselapsedtime() {
        return crselapsedtime;
    }

    public void setCrselapsedtime(Integer crselapsedtime) {
        this.crselapsedtime = crselapsedtime;
    }

    public Integer getActualelapsedtime() {
        return actualelapsedtime;
    }

    public void setActualelapsedtime(Integer actualelapsedtime) {
        this.actualelapsedtime = actualelapsedtime;
    }

    public Integer getAirtime() {
        return airtime;
    }

    public void setAirtime(Integer airtime) {
        this.airtime = airtime;
    }

    public Integer getFlights() {
        return flights;
    }

    public void setFlights(Integer flights) {
        this.flights = flights;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Integer getDistancegroup() {
        return distancegroup;
    }

    public void setDistancegroup(Integer distancegroup) {
        this.distancegroup = distancegroup;
    }

    public Integer getCarrierdelay() {
        return carrierdelay;
    }

    public void setCarrierdelay(Integer carrierdelay) {
        this.carrierdelay = carrierdelay;
    }

    public Integer getWeatherdelay() {
        return weatherdelay;
    }

    public void setWeatherdelay(Integer weatherdelay) {
        this.weatherdelay = weatherdelay;
    }

    public Integer getNasdelay() {
        return nasdelay;
    }

    public void setNasdelay(Integer nasdelay) {
        this.nasdelay = nasdelay;
    }

    public Integer getSecuritydelay() {
        return securitydelay;
    }

    public void setSecuritydelay(Integer securitydelay) {
        this.securitydelay = securitydelay;
    }

    public Integer getLateaircraftdelay() {
        return lateaircraftdelay;
    }

    public void setLateaircraftdelay(Integer lateaircraftdelay) {
        this.lateaircraftdelay = lateaircraftdelay;
    }

    public Integer getFirstdeptime() {
        return firstdeptime;
    }

    public void setFirstdeptime(Integer firstdeptime) {
        this.firstdeptime = firstdeptime;
    }

    public Integer getTotaladdgtime() {
        return totaladdgtime;
    }

    public void setTotaladdgtime(Integer totaladdgtime) {
        this.totaladdgtime = totaladdgtime;
    }

    public Integer getLongestaddgtime() {
        return longestaddgtime;
    }

    public void setLongestaddgtime(Integer longestaddgtime) {
        this.longestaddgtime = longestaddgtime;
    }

    public Integer getDivairportlandings() {
        return divairportlandings;
    }

    public void setDivairportlandings(Integer divairportlandings) {
        this.divairportlandings = divairportlandings;
    }

    public Integer getDivreacheddest() {
        return divreacheddest;
    }

    public void setDivreacheddest(Integer divreacheddest) {
        this.divreacheddest = divreacheddest;
    }

    public Integer getDivactualelapsedtime() {
        return divactualelapsedtime;
    }

    public void setDivactualelapsedtime(Integer divactualelapsedtime) {
        this.divactualelapsedtime = divactualelapsedtime;
    }

    public Integer getDivarrdelay() {
        return divarrdelay;
    }

    public void setDivarrdelay(Integer divarrdelay) {
        this.divarrdelay = divarrdelay;
    }

    public Integer getDivdistance() {
        return divdistance;
    }

    public void setDivdistance(Integer divdistance) {
        this.divdistance = divdistance;
    }

    public Integer getDiv1airport() {
        return div1airport;
    }

    public void setDiv1airport(Integer div1airport) {
        this.div1airport = div1airport;
    }

    public Integer getDiv1airportid() {
        return div1airportid;
    }

    public void setDiv1airportid(Integer div1airportid) {
        this.div1airportid = div1airportid;
    }

    public Integer getDiv1airportseqid() {
        return div1airportseqid;
    }

    public void setDiv1airportseqid(Integer div1airportseqid) {
        this.div1airportseqid = div1airportseqid;
    }

    public Integer getDiv1wheelson() {
        return div1wheelson;
    }

    public void setDiv1wheelson(Integer div1wheelson) {
        this.div1wheelson = div1wheelson;
    }

    public Integer getDiv1totalgtime() {
        return div1totalgtime;
    }

    public void setDiv1totalgtime(Integer div1totalgtime) {
        this.div1totalgtime = div1totalgtime;
    }

    public Integer getDiv1longestgtime() {
        return div1longestgtime;
    }

    public void setDiv1longestgtime(Integer div1longestgtime) {
        this.div1longestgtime = div1longestgtime;
    }

    public Integer getDiv1wheelsoff() {
        return div1wheelsoff;
    }

    public void setDiv1wheelsoff(Integer div1wheelsoff) {
        this.div1wheelsoff = div1wheelsoff;
    }

    public Integer getDiv1tailnum() {
        return div1tailnum;
    }

    public void setDiv1tailnum(Integer div1tailnum) {
        this.div1tailnum = div1tailnum;
    }

    public Integer getDiv2airport() {
        return div2airport;
    }

    public void setDiv2airport(Integer div2airport) {
        this.div2airport = div2airport;
    }

    public Integer getDiv2airportid() {
        return div2airportid;
    }

    public void setDiv2airportid(Integer div2airportid) {
        this.div2airportid = div2airportid;
    }

    public Integer getDiv2airportseqid() {
        return div2airportseqid;
    }

    public void setDiv2airportseqid(Integer div2airportseqid) {
        this.div2airportseqid = div2airportseqid;
    }

    public Integer getDiv2wheelson() {
        return div2wheelson;
    }

    public void setDiv2wheelson(Integer div2wheelson) {
        this.div2wheelson = div2wheelson;
    }

    public Integer getDiv2totalgtime() {
        return div2totalgtime;
    }

    public void setDiv2totalgtime(Integer div2totalgtime) {
        this.div2totalgtime = div2totalgtime;
    }

    public Integer getDiv2longestgtime() {
        return div2longestgtime;
    }

    public void setDiv2longestgtime(Integer div2longestgtime) {
        this.div2longestgtime = div2longestgtime;
    }

    public Integer getDiv2wheelsoff() {
        return div2wheelsoff;
    }

    public void setDiv2wheelsoff(Integer div2wheelsoff) {
        this.div2wheelsoff = div2wheelsoff;
    }

    public Integer getDiv2tailnum() {
        return div2tailnum;
    }

    public void setDiv2tailnum(Integer div2tailnum) {
        this.div2tailnum = div2tailnum;
    }

    public Integer getDiv3airport() {
        return div3airport;
    }

    public void setDiv3airport(Integer div3airport) {
        this.div3airport = div3airport;
    }

    public Integer getDiv3airportid() {
        return div3airportid;
    }

    public void setDiv3airportid(Integer div3airportid) {
        this.div3airportid = div3airportid;
    }

    public Integer getDiv3airportseqid() {
        return div3airportseqid;
    }

    public void setDiv3airportseqid(Integer div3airportseqid) {
        this.div3airportseqid = div3airportseqid;
    }

    public Integer getDiv3wheelson() {
        return div3wheelson;
    }

    public void setDiv3wheelson(Integer div3wheelson) {
        this.div3wheelson = div3wheelson;
    }

    public Integer getDiv3totalgtime() {
        return div3totalgtime;
    }

    public void setDiv3totalgtime(Integer div3totalgtime) {
        this.div3totalgtime = div3totalgtime;
    }

    public Integer getDiv3longestgtime() {
        return div3longestgtime;
    }

    public void setDiv3longestgtime(Integer div3longestgtime) {
        this.div3longestgtime = div3longestgtime;
    }

    public Integer getDiv3wheelsoff() {
        return div3wheelsoff;
    }

    public void setDiv3wheelsoff(Integer div3wheelsoff) {
        this.div3wheelsoff = div3wheelsoff;
    }

    public Integer getDiv3tailnum() {
        return div3tailnum;
    }

    public void setDiv3tailnum(Integer div3tailnum) {
        this.div3tailnum = div3tailnum;
    }

    public Integer getDiv4airport() {
        return div4airport;
    }

    public void setDiv4airport(Integer div4airport) {
        this.div4airport = div4airport;
    }

    public Integer getDiv4airportid() {
        return div4airportid;
    }

    public void setDiv4airportid(Integer div4airportid) {
        this.div4airportid = div4airportid;
    }

    public Integer getDiv4airportseqid() {
        return div4airportseqid;
    }

    public void setDiv4airportseqid(Integer div4airportseqid) {
        this.div4airportseqid = div4airportseqid;
    }

    public Integer getDiv4wheelson() {
        return div4wheelson;
    }

    public void setDiv4wheelson(Integer div4wheelson) {
        this.div4wheelson = div4wheelson;
    }

    public Integer getDiv4totalgtime() {
        return div4totalgtime;
    }

    public void setDiv4totalgtime(Integer div4totalgtime) {
        this.div4totalgtime = div4totalgtime;
    }

    public Integer getDiv4longestgtime() {
        return div4longestgtime;
    }

    public void setDiv4longestgtime(Integer div4longestgtime) {
        this.div4longestgtime = div4longestgtime;
    }

    public Integer getDiv4wheelsoff() {
        return div4wheelsoff;
    }

    public void setDiv4wheelsoff(Integer div4wheelsoff) {
        this.div4wheelsoff = div4wheelsoff;
    }

    public Integer getDiv4tailnum() {
        return div4tailnum;
    }

    public void setDiv4tailnum(Integer div4tailnum) {
        this.div4tailnum = div4tailnum;
    }

    public Integer getDiv5airport() {
        return div5airport;
    }

    public void setDiv5airport(Integer div5airport) {
        this.div5airport = div5airport;
    }

    public Integer getDiv5airportid() {
        return div5airportid;
    }

    public void setDiv5airportid(Integer div5airportid) {
        this.div5airportid = div5airportid;
    }

    public Integer getDiv5airportseqid() {
        return div5airportseqid;
    }

    public void setDiv5airportseqid(Integer div5airportseqid) {
        this.div5airportseqid = div5airportseqid;
    }

    public Integer getDiv5wheelson() {
        return div5wheelson;
    }

    public void setDiv5wheelson(Integer div5wheelson) {
        this.div5wheelson = div5wheelson;
    }

    public Integer getDiv5totalgtime() {
        return div5totalgtime;
    }

    public void setDiv5totalgtime(Integer div5totalgtime) {
        this.div5totalgtime = div5totalgtime;
    }

    public Integer getDiv5longestgtime() {
        return div5longestgtime;
    }

    public void setDiv5longestgtime(Integer div5longestgtime) {
        this.div5longestgtime = div5longestgtime;
    }

    public Integer getDiv5wheelsoff() {
        return div5wheelsoff;
    }

    public void setDiv5wheelsoff(Integer div5wheelsoff) {
        this.div5wheelsoff = div5wheelsoff;
    }

    public Integer getDiv5tailnum() {
        return div5tailnum;
    }

    public void setDiv5tailnum(Integer div5tailnum) {
        this.div5tailnum = div5tailnum;
    }

    public Date getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(Date flightdate) {
        this.flightdate = flightdate;
    }

}