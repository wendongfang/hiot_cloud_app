package com.example.hiot_cloud.test.mvptest;

import com.example.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {
    private TestView view;
    public TestPresenter(TestView view){
        this.view = view;

    }
    public void login(User user){
        if ("wendongfang".equals(user.getUserName()) && "123456789".equals(user.getPassword())){
view.showMessage("登录成功");
        }else{
            view.showMessage("登录失败");

        }

    }
}
