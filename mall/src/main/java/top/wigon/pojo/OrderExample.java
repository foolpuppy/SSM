package top.wigon.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<OrderCriteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public OrderExample() {
        oredCriteria = new ArrayList<OrderCriteria>();
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

    public List<OrderCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(OrderCriteria orderCriteria) {
        oredCriteria.add(orderCriteria);
    }

    public OrderCriteria or() {
        OrderCriteria orderCriteria = createCriteriaInternal();
        oredCriteria.add(orderCriteria);
        return orderCriteria;
    }

    public OrderCriteria createCriteria() {
        OrderCriteria orderCriteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(orderCriteria);
        }
        return orderCriteria;
    }

    protected OrderCriteria createCriteriaInternal() {
        OrderCriteria orderCriteria = new OrderCriteria();
        return orderCriteria;
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

    protected abstract static class OrderGeneratedCriteria {
        protected List<OrderCriterion> criteria;

        protected OrderGeneratedCriteria() {
            super();
            criteria = new ArrayList<OrderCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<OrderCriterion> getAllCriteria() {
            return criteria;
        }

        public List<OrderCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new OrderCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new OrderCriterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new OrderCriterion(condition, value1, value2));
        }

        public OrderCriteria andIdIsNull() {
            addCriterion("id is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidEqualTo(String value) {
            addCriterion("`uid` =", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidNotEqualTo(String value) {
            addCriterion("`uid` <>", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidGreaterThan(String value) {
            addCriterion("`uid` >", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("`uid` >=", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidLessThan(String value) {
            addCriterion("`uid` <", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidLessThanOrEqualTo(String value) {
            addCriterion("`uid` <=", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidLike(String value) {
            addCriterion("`uid` like", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidNotLike(String value) {
            addCriterion("`uid` not like", value, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidIn(List<String> values) {
            addCriterion("`uid` in", values, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidNotIn(List<String> values) {
            addCriterion("`uid` not in", values, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidBetween(String value1, String value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andUidNotBetween(String value1, String value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyIsNull() {
            addCriterion("totalMoney is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyIsNotNull() {
            addCriterion("totalMoney is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyEqualTo(Integer value) {
            addCriterion("totalMoney =", value, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyNotEqualTo(Integer value) {
            addCriterion("totalMoney <>", value, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyGreaterThan(Integer value) {
            addCriterion("totalMoney >", value, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalMoney >=", value, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyLessThan(Integer value) {
            addCriterion("totalMoney <", value, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("totalMoney <=", value, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyIn(List<Integer> values) {
            addCriterion("totalMoney in", values, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyNotIn(List<Integer> values) {
            addCriterion("totalMoney not in", values, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyBetween(Integer value1, Integer value2) {
            addCriterion("totalMoney between", value1, value2, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andTotalmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("totalMoney not between", value1, value2, "totalmoney");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeIsNull() {
            addCriterion("payDateTime is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeIsNotNull() {
            addCriterion("payDateTime is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeEqualTo(Date value) {
            addCriterion("payDateTime =", value, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeNotEqualTo(Date value) {
            addCriterion("payDateTime <>", value, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeGreaterThan(Date value) {
            addCriterion("payDateTime >", value, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payDateTime >=", value, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeLessThan(Date value) {
            addCriterion("payDateTime <", value, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeLessThanOrEqualTo(Date value) {
            addCriterion("payDateTime <=", value, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeIn(List<Date> values) {
            addCriterion("payDateTime in", values, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeNotIn(List<Date> values) {
            addCriterion("payDateTime not in", values, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeBetween(Date value1, Date value2) {
            addCriterion("payDateTime between", value1, value2, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andPaydatetimeNotBetween(Date value1, Date value2) {
            addCriterion("payDateTime not between", value1, value2, "paydatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateIsNull() {
            addCriterion("orderState is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateIsNotNull() {
            addCriterion("orderState is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateEqualTo(Byte value) {
            addCriterion("orderState =", value, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateNotEqualTo(Byte value) {
            addCriterion("orderState <>", value, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateGreaterThan(Byte value) {
            addCriterion("orderState >", value, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderState >=", value, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateLessThan(Byte value) {
            addCriterion("orderState <", value, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateLessThanOrEqualTo(Byte value) {
            addCriterion("orderState <=", value, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateIn(List<Byte> values) {
            addCriterion("orderState in", values, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateNotIn(List<Byte> values) {
            addCriterion("orderState not in", values, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateBetween(Byte value1, Byte value2) {
            addCriterion("orderState between", value1, value2, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOrderstateNotBetween(Byte value1, Byte value2) {
            addCriterion("orderState not between", value1, value2, "orderstate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoIsNull() {
            addCriterion("outTradeNo is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoIsNotNull() {
            addCriterion("outTradeNo is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoEqualTo(String value) {
            addCriterion("outTradeNo =", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoNotEqualTo(String value) {
            addCriterion("outTradeNo <>", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoGreaterThan(String value) {
            addCriterion("outTradeNo >", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoGreaterThanOrEqualTo(String value) {
            addCriterion("outTradeNo >=", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoLessThan(String value) {
            addCriterion("outTradeNo <", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoLessThanOrEqualTo(String value) {
            addCriterion("outTradeNo <=", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoLike(String value) {
            addCriterion("outTradeNo like", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoNotLike(String value) {
            addCriterion("outTradeNo not like", value, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoIn(List<String> values) {
            addCriterion("outTradeNo in", values, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoNotIn(List<String> values) {
            addCriterion("outTradeNo not in", values, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoBetween(String value1, String value2) {
            addCriterion("outTradeNo between", value1, value2, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andOuttradenoNotBetween(String value1, String value2) {
            addCriterion("outTradeNo not between", value1, value2, "outtradeno");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeIsNull() {
            addCriterion("expressCode is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeIsNotNull() {
            addCriterion("expressCode is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeEqualTo(String value) {
            addCriterion("expressCode =", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeNotEqualTo(String value) {
            addCriterion("expressCode <>", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeGreaterThan(String value) {
            addCriterion("expressCode >", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeGreaterThanOrEqualTo(String value) {
            addCriterion("expressCode >=", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeLessThan(String value) {
            addCriterion("expressCode <", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeLessThanOrEqualTo(String value) {
            addCriterion("expressCode <=", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeLike(String value) {
            addCriterion("expressCode like", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeNotLike(String value) {
            addCriterion("expressCode not like", value, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeIn(List<String> values) {
            addCriterion("expressCode in", values, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeNotIn(List<String> values) {
            addCriterion("expressCode not in", values, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeBetween(String value1, String value2) {
            addCriterion("expressCode between", value1, value2, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpresscodeNotBetween(String value1, String value2) {
            addCriterion("expressCode not between", value1, value2, "expresscode");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameIsNull() {
            addCriterion("expressName is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameIsNotNull() {
            addCriterion("expressName is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameEqualTo(String value) {
            addCriterion("expressName =", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameNotEqualTo(String value) {
            addCriterion("expressName <>", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameGreaterThan(String value) {
            addCriterion("expressName >", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameGreaterThanOrEqualTo(String value) {
            addCriterion("expressName >=", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameLessThan(String value) {
            addCriterion("expressName <", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameLessThanOrEqualTo(String value) {
            addCriterion("expressName <=", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameLike(String value) {
            addCriterion("expressName like", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameNotLike(String value) {
            addCriterion("expressName not like", value, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameIn(List<String> values) {
            addCriterion("expressName in", values, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameNotIn(List<String> values) {
            addCriterion("expressName not in", values, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameBetween(String value1, String value2) {
            addCriterion("expressName between", value1, value2, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andExpressnameNotBetween(String value1, String value2) {
            addCriterion("expressName not between", value1, value2, "expressname");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeIsNull() {
            addCriterion("consignDateTime is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeIsNotNull() {
            addCriterion("consignDateTime is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeEqualTo(Date value) {
            addCriterion("consignDateTime =", value, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeNotEqualTo(Date value) {
            addCriterion("consignDateTime <>", value, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeGreaterThan(Date value) {
            addCriterion("consignDateTime >", value, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consignDateTime >=", value, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeLessThan(Date value) {
            addCriterion("consignDateTime <", value, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeLessThanOrEqualTo(Date value) {
            addCriterion("consignDateTime <=", value, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeIn(List<Date> values) {
            addCriterion("consignDateTime in", values, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeNotIn(List<Date> values) {
            addCriterion("consignDateTime not in", values, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeBetween(Date value1, Date value2) {
            addCriterion("consignDateTime between", value1, value2, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andConsigndatetimeNotBetween(Date value1, Date value2) {
            addCriterion("consignDateTime not between", value1, value2, "consigndatetime");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (OrderCriteria) this;
        }

        public OrderCriteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (OrderCriteria) this;
        }
    }

    /**
     */
    public static class OrderCriteria extends OrderGeneratedCriteria {

        protected OrderCriteria() {
            super();
        }
    }

    public static class OrderCriterion {
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

        protected OrderCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected OrderCriterion(String condition, Object value, String typeHandler) {
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

        protected OrderCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected OrderCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected OrderCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}