package com.gyq.model;

public class ManageTabInfo {
    private Integer tabid;

    private String tabname;

    private String tabbrief;

    private Integer tablevel;

    private Integer parentid;

    private String remark;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname == null ? null : tabname.trim();
    }

    public String getTabbrief() {
        return tabbrief;
    }

    public void setTabbrief(String tabbrief) {
        this.tabbrief = tabbrief == null ? null : tabbrief.trim();
    }

    public Integer getTablevel() {
        return tablevel;
    }

    public void setTablevel(Integer tablevel) {
        this.tablevel = tablevel;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}