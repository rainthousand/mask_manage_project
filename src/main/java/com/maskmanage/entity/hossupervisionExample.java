package com.maskmanage.entity;

import java.util.ArrayList;
import java.util.List;

public class hossupervisionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public hossupervisionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
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
     * This method corresponds to the database table hossupervision
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
     * This method corresponds to the database table hossupervision
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hossupervision
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
     * This class corresponds to the database table hossupervision
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

        public Criteria andSupervisionidIsNull() {
            addCriterion("supervisionId is null");
            return (Criteria) this;
        }

        public Criteria andSupervisionidIsNotNull() {
            addCriterion("supervisionId is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisionidEqualTo(Integer value) {
            addCriterion("supervisionId =", value, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidNotEqualTo(Integer value) {
            addCriterion("supervisionId <>", value, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidGreaterThan(Integer value) {
            addCriterion("supervisionId >", value, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervisionId >=", value, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidLessThan(Integer value) {
            addCriterion("supervisionId <", value, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidLessThanOrEqualTo(Integer value) {
            addCriterion("supervisionId <=", value, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidIn(List<Integer> values) {
            addCriterion("supervisionId in", values, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidNotIn(List<Integer> values) {
            addCriterion("supervisionId not in", values, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidBetween(Integer value1, Integer value2) {
            addCriterion("supervisionId between", value1, value2, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisionidNotBetween(Integer value1, Integer value2) {
            addCriterion("supervisionId not between", value1, value2, "supervisionid");
            return (Criteria) this;
        }

        public Criteria andSupidIsNull() {
            addCriterion("supId is null");
            return (Criteria) this;
        }

        public Criteria andSupidIsNotNull() {
            addCriterion("supId is not null");
            return (Criteria) this;
        }

        public Criteria andSupidEqualTo(Integer value) {
            addCriterion("supId =", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidNotEqualTo(Integer value) {
            addCriterion("supId <>", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidGreaterThan(Integer value) {
            addCriterion("supId >", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supId >=", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidLessThan(Integer value) {
            addCriterion("supId <", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidLessThanOrEqualTo(Integer value) {
            addCriterion("supId <=", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidIn(List<Integer> values) {
            addCriterion("supId in", values, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidNotIn(List<Integer> values) {
            addCriterion("supId not in", values, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidBetween(Integer value1, Integer value2) {
            addCriterion("supId between", value1, value2, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidNotBetween(Integer value1, Integer value2) {
            addCriterion("supId not between", value1, value2, "supid");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hossupervision
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
     * This class corresponds to the database table hossupervision
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