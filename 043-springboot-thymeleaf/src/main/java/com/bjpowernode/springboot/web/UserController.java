package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("each/list")
    public String eachList(Model model) {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("张" + i);
            user.setPhone("011-6543254" + i);
            user.setAddress("Port Dickson Dataran Segar Lorong " + i);
            userList.add(user);
        }
        model.addAttribute("userList", userList);
        model.addAttribute("data", "SpringBoot");
        return "each";
    }

    @RequestMapping("/each/map")
    public String eachMap(Model model) {
        Map<Integer, Object> userMap = new HashMap<Integer, Object>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("李四 " + i);
            user.setPhone("019-4405352" + i);
            user.setAddress("Port Dickson Dataran Segar Lorong " + i);
            userMap.put(i,user);
        }
        model.addAttribute("userMap",userMap);
        return "eachMap";
    }

    @RequestMapping("/each/array")
    public String eachArray(Model model) {
        User[] userArray = new User[10];
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("李四 " + i);
            user.setPhone("019-4405352" + i);
            user.setAddress("Port Dickson Dataran Segar Lorong " + i);
            userArray[i] = user;
        }
        model.addAttribute("userArray",userArray);
        return "eachArray";
    }

    @RequestMapping("/each/all")
    public String eachAll(Model model){
        List<Map<Integer,List<User>>> myList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Map<Integer,List<User>> myMap = new HashMap<>();
            for (int j = 0; j < 2; j++) {
                List<User> myUserList = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    User user = new User();
                    user.setId(k);
                    user.setName("Chloe Gan " + k );
                    user.setPhone("011-1055648" + k);
                    user.setAddress("Dataran Segar Lorong" + (k+2));
                    myUserList.add(user);
                }
                myMap.put(j,myUserList);
            }
            myList.add(myMap);
        }
        model.addAttribute("List",myList);
        return "eachAll";
    }
}

