package com.xiguaLab.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageId is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageId is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(String value) {
            addCriterion("messageId =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(String value) {
            addCriterion("messageId <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(String value) {
            addCriterion("messageId >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(String value) {
            addCriterion("messageId >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(String value) {
            addCriterion("messageId <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(String value) {
            addCriterion("messageId <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLike(String value) {
            addCriterion("messageId like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotLike(String value) {
            addCriterion("messageId not like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<String> values) {
            addCriterion("messageId in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<String> values) {
            addCriterion("messageId not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(String value1, String value2) {
            addCriterion("messageId between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(String value1, String value2) {
            addCriterion("messageId not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNull() {
            addCriterion("messageContent is null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNotNull() {
            addCriterion("messageContent is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentEqualTo(String value) {
            addCriterion("messageContent =", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotEqualTo(String value) {
            addCriterion("messageContent <>", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThan(String value) {
            addCriterion("messageContent >", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThanOrEqualTo(String value) {
            addCriterion("messageContent >=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThan(String value) {
            addCriterion("messageContent <", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThanOrEqualTo(String value) {
            addCriterion("messageContent <=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLike(String value) {
            addCriterion("messageContent like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotLike(String value) {
            addCriterion("messageContent not like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIn(List<String> values) {
            addCriterion("messageContent in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotIn(List<String> values) {
            addCriterion("messageContent not in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentBetween(String value1, String value2) {
            addCriterion("messageContent between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotBetween(String value1, String value2) {
            addCriterion("messageContent not between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNull() {
            addCriterion("messageTime is null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNotNull() {
            addCriterion("messageTime is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeEqualTo(String value) {
            addCriterion("messageTime =", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotEqualTo(String value) {
            addCriterion("messageTime <>", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThan(String value) {
            addCriterion("messageTime >", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThanOrEqualTo(String value) {
            addCriterion("messageTime >=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThan(String value) {
            addCriterion("messageTime <", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThanOrEqualTo(String value) {
            addCriterion("messageTime <=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLike(String value) {
            addCriterion("messageTime like", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotLike(String value) {
            addCriterion("messageTime not like", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIn(List<String> values) {
            addCriterion("messageTime in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotIn(List<String> values) {
            addCriterion("messageTime not in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeBetween(String value1, String value2) {
            addCriterion("messageTime between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotBetween(String value1, String value2) {
            addCriterion("messageTime not between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryIsNull() {
            addCriterion("messageCategory is null");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryIsNotNull() {
            addCriterion("messageCategory is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryEqualTo(String value) {
            addCriterion("messageCategory =", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryNotEqualTo(String value) {
            addCriterion("messageCategory <>", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryGreaterThan(String value) {
            addCriterion("messageCategory >", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryGreaterThanOrEqualTo(String value) {
            addCriterion("messageCategory >=", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryLessThan(String value) {
            addCriterion("messageCategory <", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryLessThanOrEqualTo(String value) {
            addCriterion("messageCategory <=", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryLike(String value) {
            addCriterion("messageCategory like", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryNotLike(String value) {
            addCriterion("messageCategory not like", value, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryIn(List<String> values) {
            addCriterion("messageCategory in", values, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryNotIn(List<String> values) {
            addCriterion("messageCategory not in", values, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryBetween(String value1, String value2) {
            addCriterion("messageCategory between", value1, value2, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagecategoryNotBetween(String value1, String value2) {
            addCriterion("messageCategory not between", value1, value2, "messagecategory");
            return (Criteria) this;
        }

        public Criteria andMessagefromIsNull() {
            addCriterion("messageFrom is null");
            return (Criteria) this;
        }

        public Criteria andMessagefromIsNotNull() {
            addCriterion("messageFrom is not null");
            return (Criteria) this;
        }

        public Criteria andMessagefromEqualTo(String value) {
            addCriterion("messageFrom =", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromNotEqualTo(String value) {
            addCriterion("messageFrom <>", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromGreaterThan(String value) {
            addCriterion("messageFrom >", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromGreaterThanOrEqualTo(String value) {
            addCriterion("messageFrom >=", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromLessThan(String value) {
            addCriterion("messageFrom <", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromLessThanOrEqualTo(String value) {
            addCriterion("messageFrom <=", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromLike(String value) {
            addCriterion("messageFrom like", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromNotLike(String value) {
            addCriterion("messageFrom not like", value, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromIn(List<String> values) {
            addCriterion("messageFrom in", values, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromNotIn(List<String> values) {
            addCriterion("messageFrom not in", values, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromBetween(String value1, String value2) {
            addCriterion("messageFrom between", value1, value2, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagefromNotBetween(String value1, String value2) {
            addCriterion("messageFrom not between", value1, value2, "messagefrom");
            return (Criteria) this;
        }

        public Criteria andMessagetoIsNull() {
            addCriterion("messageTo is null");
            return (Criteria) this;
        }

        public Criteria andMessagetoIsNotNull() {
            addCriterion("messageTo is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetoEqualTo(String value) {
            addCriterion("messageTo =", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoNotEqualTo(String value) {
            addCriterion("messageTo <>", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoGreaterThan(String value) {
            addCriterion("messageTo >", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoGreaterThanOrEqualTo(String value) {
            addCriterion("messageTo >=", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoLessThan(String value) {
            addCriterion("messageTo <", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoLessThanOrEqualTo(String value) {
            addCriterion("messageTo <=", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoLike(String value) {
            addCriterion("messageTo like", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoNotLike(String value) {
            addCriterion("messageTo not like", value, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoIn(List<String> values) {
            addCriterion("messageTo in", values, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoNotIn(List<String> values) {
            addCriterion("messageTo not in", values, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoBetween(String value1, String value2) {
            addCriterion("messageTo between", value1, value2, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagetoNotBetween(String value1, String value2) {
            addCriterion("messageTo not between", value1, value2, "messageto");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIsNull() {
            addCriterion("messageStatus is null");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIsNotNull() {
            addCriterion("messageStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMessagestatusEqualTo(Integer value) {
            addCriterion("messageStatus =", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotEqualTo(Integer value) {
            addCriterion("messageStatus <>", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusGreaterThan(Integer value) {
            addCriterion("messageStatus >", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageStatus >=", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusLessThan(Integer value) {
            addCriterion("messageStatus <", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusLessThanOrEqualTo(Integer value) {
            addCriterion("messageStatus <=", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIn(List<Integer> values) {
            addCriterion("messageStatus in", values, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotIn(List<Integer> values) {
            addCriterion("messageStatus not in", values, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusBetween(Integer value1, Integer value2) {
            addCriterion("messageStatus between", value1, value2, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("messageStatus not between", value1, value2, "messagestatus");
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