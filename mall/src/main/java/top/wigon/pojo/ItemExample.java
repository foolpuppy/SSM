package top.wigon.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<ItemCriteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ItemExample() {
        oredCriteria = new ArrayList<ItemCriteria>();
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

    public List<ItemCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(ItemCriteria itemCriteria) {
        oredCriteria.add(itemCriteria);
    }

    public ItemCriteria or() {
        ItemCriteria itemCriteria = createCriteriaInternal();
        oredCriteria.add(itemCriteria);
        return itemCriteria;
    }

    public ItemCriteria createCriteria() {
        ItemCriteria itemCriteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(itemCriteria);
        }
        return itemCriteria;
    }

    protected ItemCriteria createCriteriaInternal() {
        ItemCriteria itemCriteria = new ItemCriteria();
        return itemCriteria;
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

    protected abstract static class ItemGeneratedCriteria {
        protected List<ItemCriterion> criteria;

        protected ItemGeneratedCriteria() {
            super();
            criteria = new ArrayList<ItemCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<ItemCriterion> getAllCriteria() {
            return criteria;
        }

        public List<ItemCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new ItemCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new ItemCriterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new ItemCriterion(condition, value1, value2));
        }

        public ItemCriteria andIdIsNull() {
            addCriterion("id is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleIsNull() {
            addCriterion("title is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryIsNull() {
            addCriterion("category is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceIsNull() {
            addCriterion("price is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockIsNull() {
            addCriterion("stock is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateIsNull() {
            addCriterion("`state` is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateEqualTo(Byte value) {
            addCriterion("`state` =", value, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateNotEqualTo(Byte value) {
            addCriterion("`state` <>", value, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateGreaterThan(Byte value) {
            addCriterion("`state` >", value, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("`state` >=", value, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateLessThan(Byte value) {
            addCriterion("`state` <", value, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("`state` <=", value, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateIn(List<Byte> values) {
            addCriterion("`state` in", values, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateNotIn(List<Byte> values) {
            addCriterion("`state` not in", values, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidEqualTo(String value) {
            addCriterion("shopId =", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidNotEqualTo(String value) {
            addCriterion("shopId <>", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidGreaterThan(String value) {
            addCriterion("shopId >", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("shopId >=", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidLessThan(String value) {
            addCriterion("shopId <", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("shopId <=", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidLike(String value) {
            addCriterion("shopId like", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidNotLike(String value) {
            addCriterion("shopId not like", value, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidIn(List<String> values) {
            addCriterion("shopId in", values, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidNotIn(List<String> values) {
            addCriterion("shopId not in", values, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidBetween(String value1, String value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andShopidNotBetween(String value1, String value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (ItemCriteria) this;
        }

        public ItemCriteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (ItemCriteria) this;
        }
    }

    /**
     */
    public static class ItemCriteria extends ItemGeneratedCriteria {

        protected ItemCriteria() {
            super();
        }
    }

    public static class ItemCriterion {
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

        protected ItemCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected ItemCriterion(String condition, Object value, String typeHandler) {
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

        protected ItemCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected ItemCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected ItemCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}