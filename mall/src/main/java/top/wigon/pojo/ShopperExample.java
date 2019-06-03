package top.wigon.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<ShopCriteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ShopperExample() {
        oredCriteria = new ArrayList<ShopCriteria>();
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

    public List<ShopCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(ShopCriteria shopCriteria) {
        oredCriteria.add(shopCriteria);
    }

    public ShopCriteria or() {
        ShopCriteria shopCriteria = createCriteriaInternal();
        oredCriteria.add(shopCriteria);
        return shopCriteria;
    }

    public ShopCriteria createCriteria() {
        ShopCriteria shopCriteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(shopCriteria);
        }
        return shopCriteria;
    }

    protected ShopCriteria createCriteriaInternal() {
        ShopCriteria shopCriteria = new ShopCriteria();
        return shopCriteria;
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

    protected abstract static class ShopperGeneratedCriteria {
        protected List<ShopCriterion> criteria;

        protected ShopperGeneratedCriteria() {
            super();
            criteria = new ArrayList<ShopCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<ShopCriterion> getAllCriteria() {
            return criteria;
        }

        public List<ShopCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new ShopCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new ShopCriterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new ShopCriterion(condition, value1, value2));
        }

        public ShopCriteria andIdIsNull() {
            addCriterion("id is null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidEqualTo(Integer value) {
            addCriterion("`uid` =", value, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidNotEqualTo(Integer value) {
            addCriterion("`uid` <>", value, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidGreaterThan(Integer value) {
            addCriterion("`uid` >", value, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`uid` >=", value, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidLessThan(Integer value) {
            addCriterion("`uid` <", value, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("`uid` <=", value, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidIn(List<Integer> values) {
            addCriterion("`uid` in", values, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidNotIn(List<Integer> values) {
            addCriterion("`uid` not in", values, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (ShopCriteria) this;
        }

        public ShopCriteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (ShopCriteria) this;
        }
    }

    /**
     */
    public static class ShopCriteria extends ShopperGeneratedCriteria {

        protected ShopCriteria() {
            super();
        }
    }

    public static class ShopCriterion {
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

        protected ShopCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected ShopCriterion(String condition, Object value, String typeHandler) {
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

        protected ShopCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected ShopCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected ShopCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}