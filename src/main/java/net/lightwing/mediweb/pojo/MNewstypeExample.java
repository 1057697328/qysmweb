package net.lightwing.mediweb.pojo;

import java.util.ArrayList;
import java.util.List;

public class MNewstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MNewstypeExample() {
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

        public Criteria andNtypeidIsNull() {
            addCriterion("ntypeid is null");
            return (Criteria) this;
        }

        public Criteria andNtypeidIsNotNull() {
            addCriterion("ntypeid is not null");
            return (Criteria) this;
        }

        public Criteria andNtypeidEqualTo(Integer value) {
            addCriterion("ntypeid =", value, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidNotEqualTo(Integer value) {
            addCriterion("ntypeid <>", value, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidGreaterThan(Integer value) {
            addCriterion("ntypeid >", value, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ntypeid >=", value, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidLessThan(Integer value) {
            addCriterion("ntypeid <", value, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ntypeid <=", value, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidIn(List<Integer> values) {
            addCriterion("ntypeid in", values, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidNotIn(List<Integer> values) {
            addCriterion("ntypeid not in", values, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidBetween(Integer value1, Integer value2) {
            addCriterion("ntypeid between", value1, value2, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ntypeid not between", value1, value2, "ntypeid");
            return (Criteria) this;
        }

        public Criteria andNtypenameIsNull() {
            addCriterion("ntypename is null");
            return (Criteria) this;
        }

        public Criteria andNtypenameIsNotNull() {
            addCriterion("ntypename is not null");
            return (Criteria) this;
        }

        public Criteria andNtypenameEqualTo(String value) {
            addCriterion("ntypename =", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotEqualTo(String value) {
            addCriterion("ntypename <>", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameGreaterThan(String value) {
            addCriterion("ntypename >", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("ntypename >=", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameLessThan(String value) {
            addCriterion("ntypename <", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameLessThanOrEqualTo(String value) {
            addCriterion("ntypename <=", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameLike(String value) {
            addCriterion("ntypename like", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotLike(String value) {
            addCriterion("ntypename not like", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameIn(List<String> values) {
            addCriterion("ntypename in", values, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotIn(List<String> values) {
            addCriterion("ntypename not in", values, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameBetween(String value1, String value2) {
            addCriterion("ntypename between", value1, value2, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotBetween(String value1, String value2) {
            addCriterion("ntypename not between", value1, value2, "ntypename");
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