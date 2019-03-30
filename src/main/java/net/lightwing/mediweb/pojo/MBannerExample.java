package net.lightwing.mediweb.pojo;

import java.util.ArrayList;
import java.util.List;

public class MBannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MBannerExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNull() {
            addCriterion("imgpath is null");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNotNull() {
            addCriterion("imgpath is not null");
            return (Criteria) this;
        }

        public Criteria andImgpathEqualTo(String value) {
            addCriterion("imgpath =", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotEqualTo(String value) {
            addCriterion("imgpath <>", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThan(String value) {
            addCriterion("imgpath >", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("imgpath >=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThan(String value) {
            addCriterion("imgpath <", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThanOrEqualTo(String value) {
            addCriterion("imgpath <=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLike(String value) {
            addCriterion("imgpath like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotLike(String value) {
            addCriterion("imgpath not like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathIn(List<String> values) {
            addCriterion("imgpath in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotIn(List<String> values) {
            addCriterion("imgpath not in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathBetween(String value1, String value2) {
            addCriterion("imgpath between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotBetween(String value1, String value2) {
            addCriterion("imgpath not between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andSmalltitleIsNull() {
            addCriterion("smalltitle is null");
            return (Criteria) this;
        }

        public Criteria andSmalltitleIsNotNull() {
            addCriterion("smalltitle is not null");
            return (Criteria) this;
        }

        public Criteria andSmalltitleEqualTo(String value) {
            addCriterion("smalltitle =", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleNotEqualTo(String value) {
            addCriterion("smalltitle <>", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleGreaterThan(String value) {
            addCriterion("smalltitle >", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleGreaterThanOrEqualTo(String value) {
            addCriterion("smalltitle >=", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleLessThan(String value) {
            addCriterion("smalltitle <", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleLessThanOrEqualTo(String value) {
            addCriterion("smalltitle <=", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleLike(String value) {
            addCriterion("smalltitle like", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleNotLike(String value) {
            addCriterion("smalltitle not like", value, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleIn(List<String> values) {
            addCriterion("smalltitle in", values, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleNotIn(List<String> values) {
            addCriterion("smalltitle not in", values, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleBetween(String value1, String value2) {
            addCriterion("smalltitle between", value1, value2, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andSmalltitleNotBetween(String value1, String value2) {
            addCriterion("smalltitle not between", value1, value2, "smalltitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleIsNull() {
            addCriterion("bigtitle is null");
            return (Criteria) this;
        }

        public Criteria andBigtitleIsNotNull() {
            addCriterion("bigtitle is not null");
            return (Criteria) this;
        }

        public Criteria andBigtitleEqualTo(String value) {
            addCriterion("bigtitle =", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleNotEqualTo(String value) {
            addCriterion("bigtitle <>", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleGreaterThan(String value) {
            addCriterion("bigtitle >", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleGreaterThanOrEqualTo(String value) {
            addCriterion("bigtitle >=", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleLessThan(String value) {
            addCriterion("bigtitle <", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleLessThanOrEqualTo(String value) {
            addCriterion("bigtitle <=", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleLike(String value) {
            addCriterion("bigtitle like", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleNotLike(String value) {
            addCriterion("bigtitle not like", value, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleIn(List<String> values) {
            addCriterion("bigtitle in", values, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleNotIn(List<String> values) {
            addCriterion("bigtitle not in", values, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleBetween(String value1, String value2) {
            addCriterion("bigtitle between", value1, value2, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andBigtitleNotBetween(String value1, String value2) {
            addCriterion("bigtitle not between", value1, value2, "bigtitle");
            return (Criteria) this;
        }

        public Criteria andShowbtnIsNull() {
            addCriterion("showbtn is null");
            return (Criteria) this;
        }

        public Criteria andShowbtnIsNotNull() {
            addCriterion("showbtn is not null");
            return (Criteria) this;
        }

        public Criteria andShowbtnEqualTo(Integer value) {
            addCriterion("showbtn =", value, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnNotEqualTo(Integer value) {
            addCriterion("showbtn <>", value, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnGreaterThan(Integer value) {
            addCriterion("showbtn >", value, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnGreaterThanOrEqualTo(Integer value) {
            addCriterion("showbtn >=", value, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnLessThan(Integer value) {
            addCriterion("showbtn <", value, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnLessThanOrEqualTo(Integer value) {
            addCriterion("showbtn <=", value, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnIn(List<Integer> values) {
            addCriterion("showbtn in", values, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnNotIn(List<Integer> values) {
            addCriterion("showbtn not in", values, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnBetween(Integer value1, Integer value2) {
            addCriterion("showbtn between", value1, value2, "showbtn");
            return (Criteria) this;
        }

        public Criteria andShowbtnNotBetween(Integer value1, Integer value2) {
            addCriterion("showbtn not between", value1, value2, "showbtn");
            return (Criteria) this;
        }

        public Criteria andBtntextIsNull() {
            addCriterion("btntext is null");
            return (Criteria) this;
        }

        public Criteria andBtntextIsNotNull() {
            addCriterion("btntext is not null");
            return (Criteria) this;
        }

        public Criteria andBtntextEqualTo(String value) {
            addCriterion("btntext =", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextNotEqualTo(String value) {
            addCriterion("btntext <>", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextGreaterThan(String value) {
            addCriterion("btntext >", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextGreaterThanOrEqualTo(String value) {
            addCriterion("btntext >=", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextLessThan(String value) {
            addCriterion("btntext <", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextLessThanOrEqualTo(String value) {
            addCriterion("btntext <=", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextLike(String value) {
            addCriterion("btntext like", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextNotLike(String value) {
            addCriterion("btntext not like", value, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextIn(List<String> values) {
            addCriterion("btntext in", values, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextNotIn(List<String> values) {
            addCriterion("btntext not in", values, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextBetween(String value1, String value2) {
            addCriterion("btntext between", value1, value2, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtntextNotBetween(String value1, String value2) {
            addCriterion("btntext not between", value1, value2, "btntext");
            return (Criteria) this;
        }

        public Criteria andBtnhrefIsNull() {
            addCriterion("btnhref is null");
            return (Criteria) this;
        }

        public Criteria andBtnhrefIsNotNull() {
            addCriterion("btnhref is not null");
            return (Criteria) this;
        }

        public Criteria andBtnhrefEqualTo(String value) {
            addCriterion("btnhref =", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefNotEqualTo(String value) {
            addCriterion("btnhref <>", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefGreaterThan(String value) {
            addCriterion("btnhref >", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefGreaterThanOrEqualTo(String value) {
            addCriterion("btnhref >=", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefLessThan(String value) {
            addCriterion("btnhref <", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefLessThanOrEqualTo(String value) {
            addCriterion("btnhref <=", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefLike(String value) {
            addCriterion("btnhref like", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefNotLike(String value) {
            addCriterion("btnhref not like", value, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefIn(List<String> values) {
            addCriterion("btnhref in", values, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefNotIn(List<String> values) {
            addCriterion("btnhref not in", values, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefBetween(String value1, String value2) {
            addCriterion("btnhref between", value1, value2, "btnhref");
            return (Criteria) this;
        }

        public Criteria andBtnhrefNotBetween(String value1, String value2) {
            addCriterion("btnhref not between", value1, value2, "btnhref");
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