package ecom.boy.controller;

import ecom.boy.Constant.CommonConstant;
import ecom.boy.model.ECBUserdto;
import ecom.boy.model.persistence.ECBUser;
import ecom.boy.model.response.CommonResponse;
import ecom.boy.service.LoginService;
import ecom.boy.service.ModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/modify")

public class ModifyController {

    @Autowired
    private ModifyService modifyService = new ModifyService();

    @PutMapping("/updateUser")
    public CommonResponse<String> updateUser(@RequestBody ECBUserdto user) {
        ECBUserdto updatedUser = modifyService.updateUser(user);
        CommonResponse<String> response = new CommonResponse<>();
        response.setCode(200);
        response.setMessage("User updated successfully");
        return response;
    }

    @DeleteMapping("/deleteUser/{id}")
    public CommonResponse<Void> deleteUser(@PathVariable int id) {
        modifyService.deleteUser(id);
        CommonResponse<Void> response = new CommonResponse<>();
        response.setCode(200);
        response.setMessage("User deleted successfully");
        return response;
    }

}
