package io.github.lizhangqu.lesson9.model;

/**
 * Created by lizhangqu on 2017/7/17.
 */
public class User {
    private Long id;
    private String userName;
    private Integer userAge;

    public User() {
    }

    public User(String userName, Integer userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
