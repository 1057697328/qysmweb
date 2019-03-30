package net.lightwing.mediweb.pojo;

import java.util.ArrayList;
import java.util.List;

public class MGoodtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MGoodtypeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andGtypeidIsNull() {
            addCriterion("gtypeid is null");
            return (Criteria) this;
        }

        public Criteria andGtypeidIsNotNull() {
            addCriterion("gtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeidEqualTo(Integer value) {
            addCriterion("gtypeid =", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotEqualTo(Integer value) {
            addCriterion("gtypeid <>", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidGreaterThan(Integer value) {
            addCriterion("gtypeid >", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtypeid >=", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidLessThan(Integer value) {
            addCriterion("gtypeid <", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("gtypeid <=", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidIn(List<Integer> values) {
            addCriterion("gtypeid in", values, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotIn(List<Integer> values) {
            addCriterion("gtypeid not in", values, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidBetween(Integer value1, Integer value2) {
            addCriterion("gtypeid between", value1, value2, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gtypeid not between", value1, value2, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypenameIsNull() {
            addCriterion("gtypename is null");
            return (Criteria) this;
        }

        public Criteria andGtypenameIsNotNull() {
            addCriterion("gtypename is not null");
            return (Criteria) this;
        }

        public Criteria andGtypenameEqualTo(String value) {
            addCriterion("gtypename =", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameNotEqualTo(String value) {
            addCriterion("gtypename <>", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameGreaterThan(String value) {
            addCriterion("gtypename >", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("gtypename >=", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameLessThan(String value) {
            addCriterion("gtypename <", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameLessThanOrEqualTo(String value) {
            addCriterion("gtypename <=", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameLike(String value) {
            addCriterion("gtypename like", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameNotLike(String value) {
            addCriterion("gtypename not like", value, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameIn(List<String> values) {
            addCriterion("gtypename in", values, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameNotIn(List<String> values) {
            addCriterion("gtypename not in", values, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameBetween(String value1, String value2) {
            addCriterion("gtypename between", value1, value2, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypenameNotBetween(String value1, String value2) {
            addCriterion("gtypename not between", value1, value2, "gtypename");
            return (Criteria) this;
        }

        public Criteria andGtypedescIsNull() {
            addCriterion("gtypedesc is null");
            return (Criteria) this;
        }

        public Criteria andGtypedescIsNotNull() {
            addCriterion("gtypedesc is not null");
            return (Criteria) this;
        }

        public Criteria andGtypedescEqualTo(String value) {
            addCriterion("gtypedesc =", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescNotEqualTo(String value) {
            addCriterion("gtypedesc <>", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescGreaterThan(String value) {
            addCriterion("gtypedesc >", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescGreaterThanOrEqualTo(String value) {
            addCriterion("gtypedesc >=", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescLessThan(String value) {
            addCriterion("gtypedesc <", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescLessThanOrEqualTo(String value) {
            addCriterion("gtypedesc <=", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescLike(String value) {
            addCriterion("gtypedesc like", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescNotLike(String value) {
            addCriterion("gtypedesc not like", value, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescIn(List<String> values) {
            addCriterion("gtypedesc in", values, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescNotIn(List<String> values) {
            addCriterion("gtypedesc not in", values, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescBetween(String value1, String value2) {
            addCriterion("gtypedesc between", value1, value2, "gtypedesc");
            return (Criteria) this;
        }

        public Criteria andGtypedescNotBetween(String value1, String value2) {
            addCriterion("gtypedesc not between", value1, value2, "gtypedesc");
            return (Criteria) this;
        }
    }

    /**
     */
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