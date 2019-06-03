package top.wigon.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<DeliveryCriteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DeliveryExample() {
        oredCriteria = new ArrayList<DeliveryCriteria>();
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

    public List<DeliveryCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(DeliveryCriteria deliveryCriteria) {
        oredCriteria.add(deliveryCriteria);
    }

    public DeliveryCriteria or() {
        DeliveryCriteria deliveryCriteria = createCriteriaInternal();
        oredCriteria.add(deliveryCriteria);
        return deliveryCriteria;
    }

    public DeliveryCriteria createCriteria() {
        DeliveryCriteria deliveryCriteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(deliveryCriteria);
        }
        return deliveryCriteria;
    }

    protected DeliveryCriteria createCriteriaInternal() {
        DeliveryCriteria deliveryCriteria = new DeliveryCriteria();
        return deliveryCriteria;
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

    protected abstract static class DeliveryGeneratedCriteria {
        protected List<DeliveryCriterion> criteria;

        protected DeliveryGeneratedCriteria() {
            super();
            criteria = new ArrayList<DeliveryCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<DeliveryCriterion> getAllCriteria() {
            return criteria;
        }

        public List<DeliveryCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new DeliveryCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new DeliveryCriterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new DeliveryCriterion(condition, value1, value2));
        }

        public DeliveryCriteria andIdIsNull() {
            addCriterion("id is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidIsNull() {
            addCriterion("oid is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameIsNull() {
            addCriterion("`name` is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelIsNull() {
            addCriterion("tel is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateIsNull() {
            addCriterion("`state` is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityIsNull() {
            addCriterion("city is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictIsNull() {
            addCriterion("district is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressIsNull() {
            addCriterion("address is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationIsNull() {
            addCriterion("currentLocation is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationIsNotNull() {
            addCriterion("currentLocation is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationEqualTo(String value) {
            addCriterion("currentLocation =", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationNotEqualTo(String value) {
            addCriterion("currentLocation <>", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationGreaterThan(String value) {
            addCriterion("currentLocation >", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationGreaterThanOrEqualTo(String value) {
            addCriterion("currentLocation >=", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationLessThan(String value) {
            addCriterion("currentLocation <", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationLessThanOrEqualTo(String value) {
            addCriterion("currentLocation <=", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationLike(String value) {
            addCriterion("currentLocation like", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationNotLike(String value) {
            addCriterion("currentLocation not like", value, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationIn(List<String> values) {
            addCriterion("currentLocation in", values, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationNotIn(List<String> values) {
            addCriterion("currentLocation not in", values, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationBetween(String value1, String value2) {
            addCriterion("currentLocation between", value1, value2, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andCurrentlocationNotBetween(String value1, String value2) {
            addCriterion("currentLocation not between", value1, value2, "currentlocation");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateIsNull() {
            addCriterion("deliveryState is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateIsNotNull() {
            addCriterion("deliveryState is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateEqualTo(Byte value) {
            addCriterion("deliveryState =", value, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateNotEqualTo(Byte value) {
            addCriterion("deliveryState <>", value, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateGreaterThan(Byte value) {
            addCriterion("deliveryState >", value, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateGreaterThanOrEqualTo(Byte value) {
            addCriterion("deliveryState >=", value, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateLessThan(Byte value) {
            addCriterion("deliveryState <", value, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateLessThanOrEqualTo(Byte value) {
            addCriterion("deliveryState <=", value, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateIn(List<Byte> values) {
            addCriterion("deliveryState in", values, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateNotIn(List<Byte> values) {
            addCriterion("deliveryState not in", values, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateBetween(Byte value1, Byte value2) {
            addCriterion("deliveryState between", value1, value2, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andDeliverystateNotBetween(Byte value1, Byte value2) {
            addCriterion("deliveryState not between", value1, value2, "deliverystate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (DeliveryCriteria) this;
        }

        public DeliveryCriteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (DeliveryCriteria) this;
        }
    }

    /**
     */
    public static class DeliveryCriteria extends DeliveryGeneratedCriteria {

        protected DeliveryCriteria() {
            super();
        }
    }

    public static class DeliveryCriterion {
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

        protected DeliveryCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected DeliveryCriterion(String condition, Object value, String typeHandler) {
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

        protected DeliveryCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected DeliveryCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected DeliveryCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}