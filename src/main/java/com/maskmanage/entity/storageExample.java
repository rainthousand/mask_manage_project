package com.maskmanage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class storageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public storageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
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

        public Criteria andStorageidIsNull() {
            addCriterion("storageId is null");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNotNull() {
            addCriterion("storageId is not null");
            return (Criteria) this;
        }

        public Criteria andStorageidEqualTo(Integer value) {
            addCriterion("storageId =", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotEqualTo(Integer value) {
            addCriterion("storageId <>", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThan(Integer value) {
            addCriterion("storageId >", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storageId >=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThan(Integer value) {
            addCriterion("storageId <", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThanOrEqualTo(Integer value) {
            addCriterion("storageId <=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidIn(List<Integer> values) {
            addCriterion("storageId in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotIn(List<Integer> values) {
            addCriterion("storageId not in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidBetween(Integer value1, Integer value2) {
            addCriterion("storageId between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("storageId not between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andHosidIsNull() {
            addCriterion("hosId is null");
            return (Criteria) this;
        }

        public Criteria andHosidIsNotNull() {
            addCriterion("hosId is not null");
            return (Criteria) this;
        }

        public Criteria andHosidEqualTo(Integer value) {
            addCriterion("hosId =", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidNotEqualTo(Integer value) {
            addCriterion("hosId <>", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidGreaterThan(Integer value) {
            addCriterion("hosId >", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosId >=", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidLessThan(Integer value) {
            addCriterion("hosId <", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidLessThanOrEqualTo(Integer value) {
            addCriterion("hosId <=", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidIn(List<Integer> values) {
            addCriterion("hosId in", values, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidNotIn(List<Integer> values) {
            addCriterion("hosId not in", values, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidBetween(Integer value1, Integer value2) {
            addCriterion("hosId between", value1, value2, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidNotBetween(Integer value1, Integer value2) {
            addCriterion("hosId not between", value1, value2, "hosid");
            return (Criteria) this;
        }

        public Criteria andResidIsNull() {
            addCriterion("resId is null");
            return (Criteria) this;
        }

        public Criteria andResidIsNotNull() {
            addCriterion("resId is not null");
            return (Criteria) this;
        }

        public Criteria andResidEqualTo(Integer value) {
            addCriterion("resId =", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotEqualTo(Integer value) {
            addCriterion("resId <>", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThan(Integer value) {
            addCriterion("resId >", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resId >=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThan(Integer value) {
            addCriterion("resId <", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThanOrEqualTo(Integer value) {
            addCriterion("resId <=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidIn(List<Integer> values) {
            addCriterion("resId in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotIn(List<Integer> values) {
            addCriterion("resId not in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidBetween(Integer value1, Integer value2) {
            addCriterion("resId between", value1, value2, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotBetween(Integer value1, Integer value2) {
            addCriterion("resId not between", value1, value2, "resid");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNull() {
            addCriterion("storageNum is null");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNotNull() {
            addCriterion("storageNum is not null");
            return (Criteria) this;
        }

        public Criteria andStoragenumEqualTo(Integer value) {
            addCriterion("storageNum =", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotEqualTo(Integer value) {
            addCriterion("storageNum <>", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThan(Integer value) {
            addCriterion("storageNum >", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("storageNum >=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThan(Integer value) {
            addCriterion("storageNum <", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThanOrEqualTo(Integer value) {
            addCriterion("storageNum <=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumIn(List<Integer> values) {
            addCriterion("storageNum in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotIn(List<Integer> values) {
            addCriterion("storageNum not in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumBetween(Integer value1, Integer value2) {
            addCriterion("storageNum between", value1, value2, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotBetween(Integer value1, Integer value2) {
            addCriterion("storageNum not between", value1, value2, "storagenum");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table storage
     *
     * @mbggenerated do_not_delete_during_merge Wed May 27 13:01:29 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table storage
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
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