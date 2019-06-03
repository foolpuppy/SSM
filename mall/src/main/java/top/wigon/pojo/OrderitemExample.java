package top.wigon.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<OrderitemCriteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public OrderitemExample() {
        oredCriteria = new ArrayList<OrderitemCriteria>();
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

    public List<OrderitemCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(OrderitemCriteria orderitemCriteria) {
        oredCriteria.add(orderitemCriteria);
    }

    public OrderitemCriteria or() {
        OrderitemCriteria orderitemCriteria = createCriteriaInternal();
        oredCriteria.add(orderitemCriteria);
        return orderitemCriteria;
    }

    public OrderitemCriteria createCriteria() {
        OrderitemCriteria orderitemCriteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(orderitemCriteria);
        }
        return orderitemCriteria;
    }

    protected OrderitemCriteria createCriteriaInternal() {
        OrderitemCriteria orderitemCriteria = new OrderitemCriteria();
        return orderitemCriteria;
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

    protected abstract static class OrderitemGeneratedCriteria {
        protected List<OrderitemCriterion> criteria;

        protected OrderitemGeneratedCriteria() {
            super();
            criteria = new ArrayList<OrderitemCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<OrderitemCriterion> getAllCriteria() {
            return criteria;
        }

        public List<OrderitemCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new OrderitemCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new OrderitemCriterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new OrderitemCriterion(condition, value1, value2));
        }

        public OrderitemCriteria andIdIsNull() {
            addCriterion("id is null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidIsNull() {
            addCriterion("oid is null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidIsNull() {
            addCriterion("pid is null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumIsNull() {
            addCriterion("num is null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (OrderitemCriteria) this;
        }

        public OrderitemCriteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (OrderitemCriteria) this;
        }
    }

    /**
     */
    public static class OrderitemCriteria extends OrderitemGeneratedCriteria {

        protected OrderitemCriteria() {
            super();
        }
    }

    public static class OrderitemCriterion {
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

        protected OrderitemCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected OrderitemCriterion(String condition, Object value, String typeHandler) {
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

        protected OrderitemCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected OrderitemCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected OrderitemCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}