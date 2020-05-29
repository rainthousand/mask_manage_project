package com.maskmanage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class dataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public dataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
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
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
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

        public Criteria andDataidIsNull() {
            addCriterion("dataId is null");
            return (Criteria) this;
        }

        public Criteria andDataidIsNotNull() {
            addCriterion("dataId is not null");
            return (Criteria) this;
        }

        public Criteria andDataidEqualTo(Integer value) {
            addCriterion("dataId =", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotEqualTo(Integer value) {
            addCriterion("dataId <>", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThan(Integer value) {
            addCriterion("dataId >", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dataId >=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThan(Integer value) {
            addCriterion("dataId <", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThanOrEqualTo(Integer value) {
            addCriterion("dataId <=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidIn(List<Integer> values) {
            addCriterion("dataId in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotIn(List<Integer> values) {
            addCriterion("dataId not in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidBetween(Integer value1, Integer value2) {
            addCriterion("dataId between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotBetween(Integer value1, Integer value2) {
            addCriterion("dataId not between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDatatitleIsNull() {
            addCriterion("dataTitle is null");
            return (Criteria) this;
        }

        public Criteria andDatatitleIsNotNull() {
            addCriterion("dataTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDatatitleEqualTo(String value) {
            addCriterion("dataTitle =", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleNotEqualTo(String value) {
            addCriterion("dataTitle <>", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleGreaterThan(String value) {
            addCriterion("dataTitle >", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleGreaterThanOrEqualTo(String value) {
            addCriterion("dataTitle >=", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleLessThan(String value) {
            addCriterion("dataTitle <", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleLessThanOrEqualTo(String value) {
            addCriterion("dataTitle <=", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleLike(String value) {
            addCriterion("dataTitle like", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleNotLike(String value) {
            addCriterion("dataTitle not like", value, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleIn(List<String> values) {
            addCriterion("dataTitle in", values, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleNotIn(List<String> values) {
            addCriterion("dataTitle not in", values, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleBetween(String value1, String value2) {
            addCriterion("dataTitle between", value1, value2, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatatitleNotBetween(String value1, String value2) {
            addCriterion("dataTitle not between", value1, value2, "datatitle");
            return (Criteria) this;
        }

        public Criteria andDatalocationIsNull() {
            addCriterion("dataLocation is null");
            return (Criteria) this;
        }

        public Criteria andDatalocationIsNotNull() {
            addCriterion("dataLocation is not null");
            return (Criteria) this;
        }

        public Criteria andDatalocationEqualTo(String value) {
            addCriterion("dataLocation =", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationNotEqualTo(String value) {
            addCriterion("dataLocation <>", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationGreaterThan(String value) {
            addCriterion("dataLocation >", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationGreaterThanOrEqualTo(String value) {
            addCriterion("dataLocation >=", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationLessThan(String value) {
            addCriterion("dataLocation <", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationLessThanOrEqualTo(String value) {
            addCriterion("dataLocation <=", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationLike(String value) {
            addCriterion("dataLocation like", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationNotLike(String value) {
            addCriterion("dataLocation not like", value, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationIn(List<String> values) {
            addCriterion("dataLocation in", values, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationNotIn(List<String> values) {
            addCriterion("dataLocation not in", values, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationBetween(String value1, String value2) {
            addCriterion("dataLocation between", value1, value2, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDatalocationNotBetween(String value1, String value2) {
            addCriterion("dataLocation not between", value1, value2, "datalocation");
            return (Criteria) this;
        }

        public Criteria andDataadminidIsNull() {
            addCriterion("dataAdminId is null");
            return (Criteria) this;
        }

        public Criteria andDataadminidIsNotNull() {
            addCriterion("dataAdminId is not null");
            return (Criteria) this;
        }

        public Criteria andDataadminidEqualTo(Integer value) {
            addCriterion("dataAdminId =", value, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidNotEqualTo(Integer value) {
            addCriterion("dataAdminId <>", value, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidGreaterThan(Integer value) {
            addCriterion("dataAdminId >", value, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dataAdminId >=", value, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidLessThan(Integer value) {
            addCriterion("dataAdminId <", value, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidLessThanOrEqualTo(Integer value) {
            addCriterion("dataAdminId <=", value, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidIn(List<Integer> values) {
            addCriterion("dataAdminId in", values, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidNotIn(List<Integer> values) {
            addCriterion("dataAdminId not in", values, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidBetween(Integer value1, Integer value2) {
            addCriterion("dataAdminId between", value1, value2, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDataadminidNotBetween(Integer value1, Integer value2) {
            addCriterion("dataAdminId not between", value1, value2, "dataadminid");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeIsNull() {
            addCriterion("dataPubTime is null");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeIsNotNull() {
            addCriterion("dataPubTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeEqualTo(Date value) {
            addCriterion("dataPubTime =", value, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeNotEqualTo(Date value) {
            addCriterion("dataPubTime <>", value, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeGreaterThan(Date value) {
            addCriterion("dataPubTime >", value, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dataPubTime >=", value, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeLessThan(Date value) {
            addCriterion("dataPubTime <", value, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeLessThanOrEqualTo(Date value) {
            addCriterion("dataPubTime <=", value, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeIn(List<Date> values) {
            addCriterion("dataPubTime in", values, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeNotIn(List<Date> values) {
            addCriterion("dataPubTime not in", values, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeBetween(Date value1, Date value2) {
            addCriterion("dataPubTime between", value1, value2, "datapubtime");
            return (Criteria) this;
        }

        public Criteria andDatapubtimeNotBetween(Date value1, Date value2) {
            addCriterion("dataPubTime not between", value1, value2, "datapubtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data
     *
     * @mbggenerated do_not_delete_during_merge Fri May 29 11:02:06 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data
     *
     * @mbggenerated Fri May 29 11:02:06 CST 2020
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