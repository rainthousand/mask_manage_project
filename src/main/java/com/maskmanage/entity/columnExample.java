package com.maskmanage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class columnExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public columnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
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
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table column
     *
     * @mbggenerated Fri May 29 11:02:05 CST 2020
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

        public Criteria andColumnidIsNull() {
            addCriterion("columnId is null");
            return (Criteria) this;
        }

        public Criteria andColumnidIsNotNull() {
            addCriterion("columnId is not null");
            return (Criteria) this;
        }

        public Criteria andColumnidEqualTo(Integer value) {
            addCriterion("columnId =", value, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidNotEqualTo(Integer value) {
            addCriterion("columnId <>", value, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidGreaterThan(Integer value) {
            addCriterion("columnId >", value, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnId >=", value, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidLessThan(Integer value) {
            addCriterion("columnId <", value, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidLessThanOrEqualTo(Integer value) {
            addCriterion("columnId <=", value, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidIn(List<Integer> values) {
            addCriterion("columnId in", values, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidNotIn(List<Integer> values) {
            addCriterion("columnId not in", values, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidBetween(Integer value1, Integer value2) {
            addCriterion("columnId between", value1, value2, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumnidNotBetween(Integer value1, Integer value2) {
            addCriterion("columnId not between", value1, value2, "columnid");
            return (Criteria) this;
        }

        public Criteria andColumntitleIsNull() {
            addCriterion("columnTitle is null");
            return (Criteria) this;
        }

        public Criteria andColumntitleIsNotNull() {
            addCriterion("columnTitle is not null");
            return (Criteria) this;
        }

        public Criteria andColumntitleEqualTo(String value) {
            addCriterion("columnTitle =", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleNotEqualTo(String value) {
            addCriterion("columnTitle <>", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleGreaterThan(String value) {
            addCriterion("columnTitle >", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleGreaterThanOrEqualTo(String value) {
            addCriterion("columnTitle >=", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleLessThan(String value) {
            addCriterion("columnTitle <", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleLessThanOrEqualTo(String value) {
            addCriterion("columnTitle <=", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleLike(String value) {
            addCriterion("columnTitle like", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleNotLike(String value) {
            addCriterion("columnTitle not like", value, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleIn(List<String> values) {
            addCriterion("columnTitle in", values, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleNotIn(List<String> values) {
            addCriterion("columnTitle not in", values, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleBetween(String value1, String value2) {
            addCriterion("columnTitle between", value1, value2, "columntitle");
            return (Criteria) this;
        }

        public Criteria andColumntitleNotBetween(String value1, String value2) {
            addCriterion("columnTitle not between", value1, value2, "columntitle");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andColumnadminidIsNull() {
            addCriterion("columnAdminId is null");
            return (Criteria) this;
        }

        public Criteria andColumnadminidIsNotNull() {
            addCriterion("columnAdminId is not null");
            return (Criteria) this;
        }

        public Criteria andColumnadminidEqualTo(Integer value) {
            addCriterion("columnAdminId =", value, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidNotEqualTo(Integer value) {
            addCriterion("columnAdminId <>", value, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidGreaterThan(Integer value) {
            addCriterion("columnAdminId >", value, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnAdminId >=", value, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidLessThan(Integer value) {
            addCriterion("columnAdminId <", value, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidLessThanOrEqualTo(Integer value) {
            addCriterion("columnAdminId <=", value, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidIn(List<Integer> values) {
            addCriterion("columnAdminId in", values, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidNotIn(List<Integer> values) {
            addCriterion("columnAdminId not in", values, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidBetween(Integer value1, Integer value2) {
            addCriterion("columnAdminId between", value1, value2, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumnadminidNotBetween(Integer value1, Integer value2) {
            addCriterion("columnAdminId not between", value1, value2, "columnadminid");
            return (Criteria) this;
        }

        public Criteria andColumncontentIsNull() {
            addCriterion("columnContent is null");
            return (Criteria) this;
        }

        public Criteria andColumncontentIsNotNull() {
            addCriterion("columnContent is not null");
            return (Criteria) this;
        }

        public Criteria andColumncontentEqualTo(String value) {
            addCriterion("columnContent =", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentNotEqualTo(String value) {
            addCriterion("columnContent <>", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentGreaterThan(String value) {
            addCriterion("columnContent >", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentGreaterThanOrEqualTo(String value) {
            addCriterion("columnContent >=", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentLessThan(String value) {
            addCriterion("columnContent <", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentLessThanOrEqualTo(String value) {
            addCriterion("columnContent <=", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentLike(String value) {
            addCriterion("columnContent like", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentNotLike(String value) {
            addCriterion("columnContent not like", value, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentIn(List<String> values) {
            addCriterion("columnContent in", values, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentNotIn(List<String> values) {
            addCriterion("columnContent not in", values, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentBetween(String value1, String value2) {
            addCriterion("columnContent between", value1, value2, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumncontentNotBetween(String value1, String value2) {
            addCriterion("columnContent not between", value1, value2, "columncontent");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeIsNull() {
            addCriterion("columnInterviewee is null");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeIsNotNull() {
            addCriterion("columnInterviewee is not null");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeEqualTo(String value) {
            addCriterion("columnInterviewee =", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeNotEqualTo(String value) {
            addCriterion("columnInterviewee <>", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeGreaterThan(String value) {
            addCriterion("columnInterviewee >", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeGreaterThanOrEqualTo(String value) {
            addCriterion("columnInterviewee >=", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeLessThan(String value) {
            addCriterion("columnInterviewee <", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeLessThanOrEqualTo(String value) {
            addCriterion("columnInterviewee <=", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeLike(String value) {
            addCriterion("columnInterviewee like", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeNotLike(String value) {
            addCriterion("columnInterviewee not like", value, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeIn(List<String> values) {
            addCriterion("columnInterviewee in", values, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeNotIn(List<String> values) {
            addCriterion("columnInterviewee not in", values, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeBetween(String value1, String value2) {
            addCriterion("columnInterviewee between", value1, value2, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnintervieweeNotBetween(String value1, String value2) {
            addCriterion("columnInterviewee not between", value1, value2, "columninterviewee");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeIsNull() {
            addCriterion("columnPubTime is null");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeIsNotNull() {
            addCriterion("columnPubTime is not null");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeEqualTo(Date value) {
            addCriterion("columnPubTime =", value, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeNotEqualTo(Date value) {
            addCriterion("columnPubTime <>", value, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeGreaterThan(Date value) {
            addCriterion("columnPubTime >", value, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("columnPubTime >=", value, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeLessThan(Date value) {
            addCriterion("columnPubTime <", value, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeLessThanOrEqualTo(Date value) {
            addCriterion("columnPubTime <=", value, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeIn(List<Date> values) {
            addCriterion("columnPubTime in", values, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeNotIn(List<Date> values) {
            addCriterion("columnPubTime not in", values, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeBetween(Date value1, Date value2) {
            addCriterion("columnPubTime between", value1, value2, "columnpubtime");
            return (Criteria) this;
        }

        public Criteria andColumnpubtimeNotBetween(Date value1, Date value2) {
            addCriterion("columnPubTime not between", value1, value2, "columnpubtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table column
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
     * This class corresponds to the database table column
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