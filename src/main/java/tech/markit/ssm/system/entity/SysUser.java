package tech.markit.ssm.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName sys_user
 */
public class SysUser implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 工号
     */
    private String workNo;

    /**
     * 职务id
     */
    private String positionId;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 部门id
     */
    private String departmentId;

    /**
     * 头像地址
     */
    private String avaterUrl;

    /**
     * 出生年月
     */
    private Date birthday;

    /**
     * 性别;0-男，1-女;
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 工号
     */
    public String getWorkNo() {
        return workNo;
    }

    /**
     * 工号
     */
    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    /**
     * 职务id
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * 职务id
     */
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    /**
     * 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 部门id
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 部门id
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 头像地址
     */
    public String getAvaterUrl() {
        return avaterUrl;
    }

    /**
     * 头像地址
     */
    public void setAvaterUrl(String avaterUrl) {
        this.avaterUrl = avaterUrl;
    }

    /**
     * 出生年月
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 出生年月
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 性别;0-男，1-女;
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别;0-男，1-女;
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getWorkNo() == null ? other.getWorkNo() == null : this.getWorkNo().equals(other.getWorkNo()))
            && (this.getPositionId() == null ? other.getPositionId() == null : this.getPositionId().equals(other.getPositionId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getAvaterUrl() == null ? other.getAvaterUrl() == null : this.getAvaterUrl().equals(other.getAvaterUrl()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getWorkNo() == null) ? 0 : getWorkNo().hashCode());
        result = prime * result + ((getPositionId() == null) ? 0 : getPositionId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getAvaterUrl() == null) ? 0 : getAvaterUrl().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", realname=").append(realname);
        sb.append(", workNo=").append(workNo);
        sb.append(", positionId=").append(positionId);
        sb.append(", roleId=").append(roleId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", avaterUrl=").append(avaterUrl);
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}