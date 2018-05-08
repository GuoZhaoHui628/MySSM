package ssm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by guozhaohui628@gmail.com on 2018/5/7
 * Description:
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;// 用户姓名
    private Date birthday;// 生日
    private Integer sex;// 性别
    private String address;// 地址

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
