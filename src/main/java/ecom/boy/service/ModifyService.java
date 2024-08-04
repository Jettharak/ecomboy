package ecom.boy.service;

import ecom.boy.model.ECBUserdto;
import ecom.boy.model.persistence.ECBUser;
import ecom.boy.repository.LoginRepository;
import ecom.boy.repository.ModifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ModifyService {

    @Autowired
    private ModifyRepository modifyRepository;

    public ECBUserdto updateUser(ECBUserdto user) {
        return modifyRepository.save(user);
    }

    public void deleteUser(int id) {
        modifyRepository.deleteById(id);
    }
}
