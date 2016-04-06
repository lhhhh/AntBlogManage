package com.gyq.model;

import java.util.ArrayList;
import java.util.List;

public class ManageTabInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageTabInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTabidIsNull() {
            addCriterion("tabId is null");
            return (Criteria) this;
        }

        public Criteria andTabidIsNotNull() {
            addCriterion("tabId is not null");
            return (Criteria) this;
        }

        public Criteria andTabidEqualTo(Integer value) {
            addCriterion("tabId =", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidNotEqualTo(Integer value) {
            addCriterion("tabId <>", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidGreaterThan(Integer value) {
            addCriterion("tabId >", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tabId >=", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidLessThan(Integer value) {
            addCriterion("tabId <", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidLessThanOrEqualTo(Integer value) {
            addCriterion("tabId <=", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidIn(List<Integer> values) {
            addCriterion("tabId in", values, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidNotIn(List<Integer> values) {
            addCriterion("tabId not in", values, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidBetween(Integer value1, Integer value2) {
            addCriterion("tabId between", value1, value2, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidNotBetween(Integer value1, Integer value2) {
            addCriterion("tabId not between", value1, value2, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabnameIsNull() {
            addCriterion("tabName is null");
            return (Criteria) this;
        }

        public Criteria andTabnameIsNotNull() {
            addCriterion("tabName is not null");
            return (Criteria) this;
        }

        public Criteria andTabnameEqualTo(String value) {
            addCriterion("tabName =", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotEqualTo(String value) {
            addCriterion("tabName <>", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameGreaterThan(String value) {
            addCriterion("tabName >", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameGreaterThanOrEqualTo(String value) {
            addCriterion("tabName >=", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameLessThan(String value) {
            addCriterion("tabName <", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameLessThanOrEqualTo(String value) {
            addCriterion("tabName <=", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameLike(String value) {
            addCriterion("tabName like", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotLike(String value) {
            addCriterion("tabName not like", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameIn(List<String> values) {
            addCriterion("tabName in", values, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotIn(List<String> values) {
            addCriterion("tabName not in", values, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameBetween(String value1, String value2) {
            addCriterion("tabName between", value1, value2, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotBetween(String value1, String value2) {
            addCriterion("tabName not between", value1, value2, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabbriefIsNull() {
            addCriterion("tabBrief is null");
            return (Criteria) this;
        }

        public Criteria andTabbriefIsNotNull() {
            addCriterion("tabBrief is not null");
            return (Criteria) this;
        }

        public Criteria andTabbriefEqualTo(String value) {
            addCriterion("tabBrief =", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefNotEqualTo(String value) {
            addCriterion("tabBrief <>", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefGreaterThan(String value) {
            addCriterion("tabBrief >", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefGreaterThanOrEqualTo(String value) {
            addCriterion("tabBrief >=", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefLessThan(String value) {
            addCriterion("tabBrief <", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefLessThanOrEqualTo(String value) {
            addCriterion("tabBrief <=", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefLike(String value) {
            addCriterion("tabBrief like", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefNotLike(String value) {
            addCriterion("tabBrief not like", value, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefIn(List<String> values) {
            addCriterion("tabBrief in", values, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefNotIn(List<String> values) {
            addCriterion("tabBrief not in", values, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefBetween(String value1, String value2) {
            addCriterion("tabBrief between", value1, value2, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTabbriefNotBetween(String value1, String value2) {
            addCriterion("tabBrief not between", value1, value2, "tabbrief");
            return (Criteria) this;
        }

        public Criteria andTablevelIsNull() {
            addCriterion("tabLevel is null");
            return (Criteria) this;
        }

        public Criteria andTablevelIsNotNull() {
            addCriterion("tabLevel is not null");
            return (Criteria) this;
        }

        public Criteria andTablevelEqualTo(Integer value) {
            addCriterion("tabLevel =", value, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelNotEqualTo(Integer value) {
            addCriterion("tabLevel <>", value, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelGreaterThan(Integer value) {
            addCriterion("tabLevel >", value, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tabLevel >=", value, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelLessThan(Integer value) {
            addCriterion("tabLevel <", value, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelLessThanOrEqualTo(Integer value) {
            addCriterion("tabLevel <=", value, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelIn(List<Integer> values) {
            addCriterion("tabLevel in", values, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelNotIn(List<Integer> values) {
            addCriterion("tabLevel not in", values, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelBetween(Integer value1, Integer value2) {
            addCriterion("tabLevel between", value1, value2, "tablevel");
            return (Criteria) this;
        }

        public Criteria andTablevelNotBetween(Integer value1, Integer value2) {
            addCriterion("tabLevel not between", value1, value2, "tablevel");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}