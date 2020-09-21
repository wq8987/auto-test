package com.dmall.autotest.component.scheduling;
import java.util.List;
import java.util.Date;

/**
* Auto-generated: 2020-09-12 16:38:16
*
* @author bejson.com (i@bejson.com)
* @website http://www.bejson.com/java2pojo/
*/
public class SchedulingRequest {

   private List<SchedulingDetail> scheduleDetailList;
   private int siteId;
   private int venderId;
   private Date startDate;
   private Date endDate;
   private List<String> shiftNo;
   public void setScheduleDetailList(List<SchedulingDetail> scheduleDetailList) {
        this.scheduleDetailList = scheduleDetailList;
    }
    public List<SchedulingDetail> getScheduleDetailList() {
        return scheduleDetailList;
    }

   public void setSiteId(int siteId) {
        this.siteId = siteId;
    }
    public int getSiteId() {
        return siteId;
    }

   public void setVenderId(int venderId) {
        this.venderId = venderId;
    }
    public int getVenderId() {
        return venderId;
    }

   public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getStartDate() {
        return startDate;
    }

   public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Date getEndDate() {
        return endDate;
    }

   public void setShiftNo(List<String> shiftNo) {
        this.shiftNo = shiftNo;
    }
    public List<String> getShiftNo() {
        return shiftNo;
    }

}