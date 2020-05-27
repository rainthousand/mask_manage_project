package com.maskmanage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class donationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public donationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
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
     * This method corresponds to the database table donation
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
     * This method corresponds to the database table donation
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donation
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
     * This class corresponds to the database table donation
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

        public Criteria andDonationidIsNull() {
            addCriterion("donationId is null");
            return (Criteria) this;
        }

        public Criteria andDonationidIsNotNull() {
            addCriterion("donationId is not null");
            return (Criteria) this;
        }

        public Criteria andDonationidEqualTo(Integer value) {
            addCriterion("donationId =", value, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidNotEqualTo(Integer value) {
            addCriterion("donationId <>", value, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidGreaterThan(Integer value) {
            addCriterion("donationId >", value, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("donationId >=", value, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidLessThan(Integer value) {
            addCriterion("donationId <", value, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidLessThanOrEqualTo(Integer value) {
            addCriterion("donationId <=", value, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidIn(List<Integer> values) {
            addCriterion("donationId in", values, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidNotIn(List<Integer> values) {
            addCriterion("donationId not in", values, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidBetween(Integer value1, Integer value2) {
            addCriterion("donationId between", value1, value2, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationidNotBetween(Integer value1, Integer value2) {
            addCriterion("donationId not between", value1, value2, "donationid");
            return (Criteria) this;
        }

        public Criteria andDonationnameIsNull() {
            addCriterion("donationName is null");
            return (Criteria) this;
        }

        public Criteria andDonationnameIsNotNull() {
            addCriterion("donationName is not null");
            return (Criteria) this;
        }

        public Criteria andDonationnameEqualTo(String value) {
            addCriterion("donationName =", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotEqualTo(String value) {
            addCriterion("donationName <>", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameGreaterThan(String value) {
            addCriterion("donationName >", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameGreaterThanOrEqualTo(String value) {
            addCriterion("donationName >=", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameLessThan(String value) {
            addCriterion("donationName <", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameLessThanOrEqualTo(String value) {
            addCriterion("donationName <=", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameLike(String value) {
            addCriterion("donationName like", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotLike(String value) {
            addCriterion("donationName not like", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameIn(List<String> values) {
            addCriterion("donationName in", values, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotIn(List<String> values) {
            addCriterion("donationName not in", values, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameBetween(String value1, String value2) {
            addCriterion("donationName between", value1, value2, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotBetween(String value1, String value2) {
            addCriterion("donationName not between", value1, value2, "donationname");
            return (Criteria) this;
        }

        public Criteria andResourceidIsNull() {
            addCriterion("resourceId is null");
            return (Criteria) this;
        }

        public Criteria andResourceidIsNotNull() {
            addCriterion("resourceId is not null");
            return (Criteria) this;
        }

        public Criteria andResourceidEqualTo(Integer value) {
            addCriterion("resourceId =", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotEqualTo(Integer value) {
            addCriterion("resourceId <>", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThan(Integer value) {
            addCriterion("resourceId >", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resourceId >=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThan(Integer value) {
            addCriterion("resourceId <", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThanOrEqualTo(Integer value) {
            addCriterion("resourceId <=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidIn(List<Integer> values) {
            addCriterion("resourceId in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotIn(List<Integer> values) {
            addCriterion("resourceId not in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidBetween(Integer value1, Integer value2) {
            addCriterion("resourceId between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("resourceId not between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridIsNull() {
            addCriterion("fromDonatorId is null");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridIsNotNull() {
            addCriterion("fromDonatorId is not null");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridEqualTo(Integer value) {
            addCriterion("fromDonatorId =", value, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridNotEqualTo(Integer value) {
            addCriterion("fromDonatorId <>", value, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridGreaterThan(Integer value) {
            addCriterion("fromDonatorId >", value, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromDonatorId >=", value, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridLessThan(Integer value) {
            addCriterion("fromDonatorId <", value, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridLessThanOrEqualTo(Integer value) {
            addCriterion("fromDonatorId <=", value, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridIn(List<Integer> values) {
            addCriterion("fromDonatorId in", values, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridNotIn(List<Integer> values) {
            addCriterion("fromDonatorId not in", values, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridBetween(Integer value1, Integer value2) {
            addCriterion("fromDonatorId between", value1, value2, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andFromdonatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("fromDonatorId not between", value1, value2, "fromdonatorid");
            return (Criteria) this;
        }

        public Criteria andDonationtimeIsNull() {
            addCriterion("donationTime is null");
            return (Criteria) this;
        }

        public Criteria andDonationtimeIsNotNull() {
            addCriterion("donationTime is not null");
            return (Criteria) this;
        }

        public Criteria andDonationtimeEqualTo(Date value) {
            addCriterion("donationTime =", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeNotEqualTo(Date value) {
            addCriterion("donationTime <>", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeGreaterThan(Date value) {
            addCriterion("donationTime >", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("donationTime >=", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeLessThan(Date value) {
            addCriterion("donationTime <", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeLessThanOrEqualTo(Date value) {
            addCriterion("donationTime <=", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeIn(List<Date> values) {
            addCriterion("donationTime in", values, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeNotIn(List<Date> values) {
            addCriterion("donationTime not in", values, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeBetween(Date value1, Date value2) {
            addCriterion("donationTime between", value1, value2, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeNotBetween(Date value1, Date value2) {
            addCriterion("donationTime not between", value1, value2, "donationtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table donation
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
     * This class corresponds to the database table donation
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