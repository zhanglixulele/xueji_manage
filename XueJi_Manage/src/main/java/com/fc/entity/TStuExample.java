package com.fc.entity;

import java.util.ArrayList;
import java.util.List;

public class TStuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStuExample() {
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

        public Criteria andXuehaoIsNull() {
            addCriterion("xuehao is null");
            return (Criteria) this;
        }

        public Criteria andXuehaoIsNotNull() {
            addCriterion("xuehao is not null");
            return (Criteria) this;
        }

        public Criteria andXuehaoEqualTo(String value) {
            addCriterion("xuehao =", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotEqualTo(String value) {
            addCriterion("xuehao <>", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoGreaterThan(String value) {
            addCriterion("xuehao >", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoGreaterThanOrEqualTo(String value) {
            addCriterion("xuehao >=", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoLessThan(String value) {
            addCriterion("xuehao <", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoLessThanOrEqualTo(String value) {
            addCriterion("xuehao <=", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoLike(String value) {
            addCriterion("xuehao like", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotLike(String value) {
            addCriterion("xuehao not like", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoIn(List<String> values) {
            addCriterion("xuehao in", values, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotIn(List<String> values) {
            addCriterion("xuehao not in", values, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoBetween(String value1, String value2) {
            addCriterion("xuehao between", value1, value2, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotBetween(String value1, String value2) {
            addCriterion("xuehao not between", value1, value2, "xuehao");
            return (Criteria) this;
        }

        public Criteria andName1IsNull() {
            addCriterion("name1 is null");
            return (Criteria) this;
        }

        public Criteria andName1IsNotNull() {
            addCriterion("name1 is not null");
            return (Criteria) this;
        }

        public Criteria andName1EqualTo(String value) {
            addCriterion("name1 =", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotEqualTo(String value) {
            addCriterion("name1 <>", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThan(String value) {
            addCriterion("name1 >", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThanOrEqualTo(String value) {
            addCriterion("name1 >=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThan(String value) {
            addCriterion("name1 <", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThanOrEqualTo(String value) {
            addCriterion("name1 <=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Like(String value) {
            addCriterion("name1 like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotLike(String value) {
            addCriterion("name1 not like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1In(List<String> values) {
            addCriterion("name1 in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotIn(List<String> values) {
            addCriterion("name1 not in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Between(String value1, String value2) {
            addCriterion("name1 between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotBetween(String value1, String value2) {
            addCriterion("name1 not between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBanjiIdIsNull() {
            addCriterion("banji_id is null");
            return (Criteria) this;
        }

        public Criteria andBanjiIdIsNotNull() {
            addCriterion("banji_id is not null");
            return (Criteria) this;
        }

        public Criteria andBanjiIdEqualTo(String value) {
            addCriterion("banji_id =", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdNotEqualTo(String value) {
            addCriterion("banji_id <>", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdGreaterThan(String value) {
            addCriterion("banji_id >", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdGreaterThanOrEqualTo(String value) {
            addCriterion("banji_id >=", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdLessThan(String value) {
            addCriterion("banji_id <", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdLessThanOrEqualTo(String value) {
            addCriterion("banji_id <=", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdLike(String value) {
            addCriterion("banji_id like", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdNotLike(String value) {
            addCriterion("banji_id not like", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdIn(List<String> values) {
            addCriterion("banji_id in", values, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdNotIn(List<String> values) {
            addCriterion("banji_id not in", values, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdBetween(String value1, String value2) {
            addCriterion("banji_id between", value1, value2, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdNotBetween(String value1, String value2) {
            addCriterion("banji_id not between", value1, value2, "banjiId");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianIsNull() {
            addCriterion("ruxueshijian is null");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianIsNotNull() {
            addCriterion("ruxueshijian is not null");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianEqualTo(String value) {
            addCriterion("ruxueshijian =", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianNotEqualTo(String value) {
            addCriterion("ruxueshijian <>", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianGreaterThan(String value) {
            addCriterion("ruxueshijian >", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianGreaterThanOrEqualTo(String value) {
            addCriterion("ruxueshijian >=", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianLessThan(String value) {
            addCriterion("ruxueshijian <", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianLessThanOrEqualTo(String value) {
            addCriterion("ruxueshijian <=", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianLike(String value) {
            addCriterion("ruxueshijian like", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianNotLike(String value) {
            addCriterion("ruxueshijian not like", value, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianIn(List<String> values) {
            addCriterion("ruxueshijian in", values, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianNotIn(List<String> values) {
            addCriterion("ruxueshijian not in", values, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianBetween(String value1, String value2) {
            addCriterion("ruxueshijian between", value1, value2, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andRuxueshijianNotBetween(String value1, String value2) {
            addCriterion("ruxueshijian not between", value1, value2, "ruxueshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianIsNull() {
            addCriterion("biyeshijian is null");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianIsNotNull() {
            addCriterion("biyeshijian is not null");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianEqualTo(String value) {
            addCriterion("biyeshijian =", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianNotEqualTo(String value) {
            addCriterion("biyeshijian <>", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianGreaterThan(String value) {
            addCriterion("biyeshijian >", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianGreaterThanOrEqualTo(String value) {
            addCriterion("biyeshijian >=", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianLessThan(String value) {
            addCriterion("biyeshijian <", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianLessThanOrEqualTo(String value) {
            addCriterion("biyeshijian <=", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianLike(String value) {
            addCriterion("biyeshijian like", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianNotLike(String value) {
            addCriterion("biyeshijian not like", value, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianIn(List<String> values) {
            addCriterion("biyeshijian in", values, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianNotIn(List<String> values) {
            addCriterion("biyeshijian not in", values, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianBetween(String value1, String value2) {
            addCriterion("biyeshijian between", value1, value2, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andBiyeshijianNotBetween(String value1, String value2) {
            addCriterion("biyeshijian not between", value1, value2, "biyeshijian");
            return (Criteria) this;
        }

        public Criteria andXuezhiIsNull() {
            addCriterion("xuezhi is null");
            return (Criteria) this;
        }

        public Criteria andXuezhiIsNotNull() {
            addCriterion("xuezhi is not null");
            return (Criteria) this;
        }

        public Criteria andXuezhiEqualTo(String value) {
            addCriterion("xuezhi =", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotEqualTo(String value) {
            addCriterion("xuezhi <>", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiGreaterThan(String value) {
            addCriterion("xuezhi >", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiGreaterThanOrEqualTo(String value) {
            addCriterion("xuezhi >=", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiLessThan(String value) {
            addCriterion("xuezhi <", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiLessThanOrEqualTo(String value) {
            addCriterion("xuezhi <=", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiLike(String value) {
            addCriterion("xuezhi like", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotLike(String value) {
            addCriterion("xuezhi not like", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiIn(List<String> values) {
            addCriterion("xuezhi in", values, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotIn(List<String> values) {
            addCriterion("xuezhi not in", values, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiBetween(String value1, String value2) {
            addCriterion("xuezhi between", value1, value2, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotBetween(String value1, String value2) {
            addCriterion("xuezhi not between", value1, value2, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuexiaoIsNull() {
            addCriterion("xuexiao is null");
            return (Criteria) this;
        }

        public Criteria andXuexiaoIsNotNull() {
            addCriterion("xuexiao is not null");
            return (Criteria) this;
        }

        public Criteria andXuexiaoEqualTo(String value) {
            addCriterion("xuexiao =", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoNotEqualTo(String value) {
            addCriterion("xuexiao <>", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoGreaterThan(String value) {
            addCriterion("xuexiao >", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoGreaterThanOrEqualTo(String value) {
            addCriterion("xuexiao >=", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoLessThan(String value) {
            addCriterion("xuexiao <", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoLessThanOrEqualTo(String value) {
            addCriterion("xuexiao <=", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoLike(String value) {
            addCriterion("xuexiao like", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoNotLike(String value) {
            addCriterion("xuexiao not like", value, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoIn(List<String> values) {
            addCriterion("xuexiao in", values, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoNotIn(List<String> values) {
            addCriterion("xuexiao not in", values, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoBetween(String value1, String value2) {
            addCriterion("xuexiao between", value1, value2, "xuexiao");
            return (Criteria) this;
        }

        public Criteria andXuexiaoNotBetween(String value1, String value2) {
            addCriterion("xuexiao not between", value1, value2, "xuexiao");
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