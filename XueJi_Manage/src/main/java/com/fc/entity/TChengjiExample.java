package com.fc.entity;

import java.util.ArrayList;
import java.util.List;

public class TChengjiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TChengjiExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andKechengIdIsNull() {
            addCriterion("kecheng_id is null");
            return (Criteria) this;
        }

        public Criteria andKechengIdIsNotNull() {
            addCriterion("kecheng_id is not null");
            return (Criteria) this;
        }

        public Criteria andKechengIdEqualTo(Integer value) {
            addCriterion("kecheng_id =", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdNotEqualTo(Integer value) {
            addCriterion("kecheng_id <>", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdGreaterThan(Integer value) {
            addCriterion("kecheng_id >", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kecheng_id >=", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdLessThan(Integer value) {
            addCriterion("kecheng_id <", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdLessThanOrEqualTo(Integer value) {
            addCriterion("kecheng_id <=", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdIn(List<Integer> values) {
            addCriterion("kecheng_id in", values, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdNotIn(List<Integer> values) {
            addCriterion("kecheng_id not in", values, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdBetween(Integer value1, Integer value2) {
            addCriterion("kecheng_id between", value1, value2, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kecheng_id not between", value1, value2, "kechengId");
            return (Criteria) this;
        }

        public Criteria andChengjiIsNull() {
            addCriterion("chengji is null");
            return (Criteria) this;
        }

        public Criteria andChengjiIsNotNull() {
            addCriterion("chengji is not null");
            return (Criteria) this;
        }

        public Criteria andChengjiEqualTo(Integer value) {
            addCriterion("chengji =", value, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiNotEqualTo(Integer value) {
            addCriterion("chengji <>", value, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiGreaterThan(Integer value) {
            addCriterion("chengji >", value, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("chengji >=", value, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiLessThan(Integer value) {
            addCriterion("chengji <", value, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiLessThanOrEqualTo(Integer value) {
            addCriterion("chengji <=", value, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiIn(List<Integer> values) {
            addCriterion("chengji in", values, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiNotIn(List<Integer> values) {
            addCriterion("chengji not in", values, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiBetween(Integer value1, Integer value2) {
            addCriterion("chengji between", value1, value2, "chengji");
            return (Criteria) this;
        }

        public Criteria andChengjiNotBetween(Integer value1, Integer value2) {
            addCriterion("chengji not between", value1, value2, "chengji");
            return (Criteria) this;
        }

        public Criteria andXuenianIsNull() {
            addCriterion("xuenian is null");
            return (Criteria) this;
        }

        public Criteria andXuenianIsNotNull() {
            addCriterion("xuenian is not null");
            return (Criteria) this;
        }

        public Criteria andXuenianEqualTo(String value) {
            addCriterion("xuenian =", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianNotEqualTo(String value) {
            addCriterion("xuenian <>", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianGreaterThan(String value) {
            addCriterion("xuenian >", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianGreaterThanOrEqualTo(String value) {
            addCriterion("xuenian >=", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianLessThan(String value) {
            addCriterion("xuenian <", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianLessThanOrEqualTo(String value) {
            addCriterion("xuenian <=", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianLike(String value) {
            addCriterion("xuenian like", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianNotLike(String value) {
            addCriterion("xuenian not like", value, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianIn(List<String> values) {
            addCriterion("xuenian in", values, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianNotIn(List<String> values) {
            addCriterion("xuenian not in", values, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianBetween(String value1, String value2) {
            addCriterion("xuenian between", value1, value2, "xuenian");
            return (Criteria) this;
        }

        public Criteria andXuenianNotBetween(String value1, String value2) {
            addCriterion("xuenian not between", value1, value2, "xuenian");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(String value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(String value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(String value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(String value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(String value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(String value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLike(String value) {
            addCriterion("del like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotLike(String value) {
            addCriterion("del not like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<String> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<String> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(String value1, String value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(String value1, String value2) {
            addCriterion("del not between", value1, value2, "del");
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