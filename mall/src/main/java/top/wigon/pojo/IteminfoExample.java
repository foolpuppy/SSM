package top.wigon.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IteminfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<IteminfoCriteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public IteminfoExample() {
        oredCriteria = new ArrayList<IteminfoCriteria>();
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

    public List<IteminfoCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(IteminfoCriteria iteminfoCriteria) {
        oredCriteria.add(iteminfoCriteria);
    }

    public IteminfoCriteria or() {
        IteminfoCriteria iteminfoCriteria = createCriteriaInternal();
        oredCriteria.add(iteminfoCriteria);
        return iteminfoCriteria;
    }

    public IteminfoCriteria createCriteria() {
        IteminfoCriteria iteminfoCriteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(iteminfoCriteria);
        }
        return iteminfoCriteria;
    }

    protected IteminfoCriteria createCriteriaInternal() {
        IteminfoCriteria iteminfoCriteria = new IteminfoCriteria();
        return iteminfoCriteria;
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

    protected abstract static class IteminfoGeneratedCriteria {
        protected List<IteminfoCriterion> criteria;

        protected IteminfoGeneratedCriteria() {
            super();
            criteria = new ArrayList<IteminfoCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<IteminfoCriterion> getAllCriteria() {
            return criteria;
        }

        public List<IteminfoCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new IteminfoCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new IteminfoCriterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new IteminfoCriterion(condition, value1, value2));
        }

        public IteminfoCriteria andIdIsNull() {
            addCriterion("id is null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidIsNull() {
            addCriterion("iid is null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgIsNull() {
            addCriterion("img is null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (IteminfoCriteria) this;
        }

        public IteminfoCriteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (IteminfoCriteria) this;
        }
    }

    /**
     */
    public static class IteminfoCriteria extends IteminfoGeneratedCriteria {

        protected IteminfoCriteria() {
            super();
        }
    }

    public static class IteminfoCriterion {
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

        protected IteminfoCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected IteminfoCriterion(String condition, Object value, String typeHandler) {
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

        protected IteminfoCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected IteminfoCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected IteminfoCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}