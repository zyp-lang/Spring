package com.zyp.entity;

import java.util.*;

public class User {
    private String id;
    private String username;
    private String password;
    private Integer age;
    private String[] names;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> maps;
    private Properties properties;

    public User() {
    }

    public User(String id, String username, String password, Integer age, String[] names, List<String> list, Set<String> set, Map<String, String> maps, Properties properties) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.names = names;
        this.list = list;
        this.set = set;
        this.maps = maps;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", names=" + Arrays.toString(names) +
                ", list=" + list +
                ", set=" + set +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
