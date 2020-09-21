package com.dmall.autotest.component.scheduling;
import java.util.List;

/**
* Auto-generated: 2020-09-12 16:38:16
*
* @author bejson.com (i@bejson.com)
* @website http://www.bejson.com/java2pojo/
*/
public class SchedulingDetail {

   private long userId;
   private String userNo;
   private String userName;
   private List<String> shiftList;
   private List<String> checkSiteIdList;
   public void setUserId(long userId) {
        this.userId = userId;
    }
    public long getUserId() {
        return userId;
    }

   public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    public String getUserNo() {
        return userNo;
    }

   public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

   public void setShiftList(List<String> shiftList) {
        this.shiftList = shiftList;
    }
    public List<String> getShiftList() {
        return shiftList;
    }

   public void setCheckSiteIdList(List<String> checkSiteIdList) {
        this.checkSiteIdList = checkSiteIdList;
    }
    public List<String> getCheckSiteIdList() {
        return checkSiteIdList;
    }

}