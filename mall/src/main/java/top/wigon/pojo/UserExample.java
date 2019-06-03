package top.wigon.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<UserCriteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserExample() {
        oredCriteria = new ArrayList<UserCriteria>();
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

    public List<UserCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(UserCriteria userCriteria) {
        oredCriteria.add(userCriteria);
    }

    public UserCriteria or() {
        UserCriteria userCriteria = createCriteriaInternal();
        oredCriteria.add(userCriteria);
        return userCriteria;
    }

    public UserCriteria createCriteria() {
        UserCriteria userCriteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(userCriteria);
        }
        return userCriteria;
    }

    protected UserCriteria createCriteriaInternal() {
        UserCriteria userCriteria = new UserCriteria();
        return userCriteria;
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

    protected abstract static class UserGeneratedCriteria {
        protected List<UserCriterion> criteria;

        protected UserGeneratedCriteria() {
            super();
            criteria = new ArrayList<UserCriterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<UserCriterion> getAllCriteria() {
            return criteria;
        }

        public List<UserCriterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new UserCriterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new UserCriterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new UserCriterion(condition, value1, value2));
        }

        public UserCriteria andIdIsNull() {
            addCriterion("id is null");
            return (UserCriteria) this;
        }

        public UserCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (UserCriteria) this;
        }

        public UserCriteria andTelIsNull() {
            addCriterion("tel is null");
            return (UserCriteria) this;
        }

        public UserCriteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailIsNull() {
            addCriterion("email is null");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameIsNull() {
            addCriterion("username is null");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveIsNull() {
            addCriterion("active is null");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveEqualTo(Byte value) {
            addCriterion("active =", value, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveNotEqualTo(Byte value) {
            addCriterion("active <>", value, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveGreaterThan(Byte value) {
            addCriterion("active >", value, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("active >=", value, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveLessThan(Byte value) {
            addCriterion("active <", value, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("active <=", value, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveIn(List<Byte> values) {
            addCriterion("active in", values, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveNotIn(List<Byte> values) {
            addCriterion("active not in", values, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("active between", value1, value2, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("active not between", value1, value2, "active");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleIsNull() {
            addCriterion("`role` is null");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleIsNotNull() {
            addCriterion("`role` is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleEqualTo(Byte value) {
            addCriterion("`role` =", value, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleNotEqualTo(Byte value) {
            addCriterion("`role` <>", value, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleGreaterThan(Byte value) {
            addCriterion("`role` >", value, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleGreaterThanOrEqualTo(Byte value) {
            addCriterion("`role` >=", value, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleLessThan(Byte value) {
            addCriterion("`role` <", value, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleLessThanOrEqualTo(Byte value) {
            addCriterion("`role` <=", value, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleIn(List<Byte> values) {
            addCriterion("`role` in", values, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleNotIn(List<Byte> values) {
            addCriterion("`role` not in", values, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleBetween(Byte value1, Byte value2) {
            addCriterion("`role` between", value1, value2, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andRoleNotBetween(Byte value1, Byte value2) {
            addCriterion("`role` not between", value1, value2, "role");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (UserCriteria) this;
        }

        public UserCriteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (UserCriteria) this;
        }
    }

    /**
     */
    public static class UserCriteria extends UserGeneratedCriteria {

        protected UserCriteria() {
            super();
        }
    }

    public static class UserCriterion {
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

        protected UserCriterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected UserCriterion(String condition, Object value, String typeHandler) {
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

        protected UserCriterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected UserCriterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected UserCriterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}