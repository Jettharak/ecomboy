package ecom.boy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ECBUserdto {
    private int userid;
    private String username;
    private String password;
    private String name;
    private String snaem;
    private String address;
    private String tel;
    private String email;
    private String permission;

    // Getters and setters

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnaem() {
        return snaem;
    }

    public void setSnaem(String surname) {
        this.snaem = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public ECBUserdto mapForObject(Map<String, Object> mapValue){
        ECBUserdto result = new ECBUserdto();
        result.setUserid((int)mapValue.get("userid"));
        result.setUsername((String)mapValue.get("username"));
        result.setPassword((String)mapValue.get("password"));
        result.setName((String)mapValue.get("name"));
        result.setSnaem((String)mapValue.get("snaem"));
        result.setAddress((String)mapValue.get("address"));
        result.setTel((String)mapValue.get("tel"));
        result.setEmail((String)mapValue.get("email"));
        result.setPermission((String)mapValue.get("permission"));
        return result;
    }
}
