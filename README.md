# EditTextDialog


![参考实例](http://upload-images.jianshu.io/upload_images/2433593-b93daeab64ce9f8f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

用到了接口的方法

定义一个接口,通过该接口来实现获取到里面的内容
```
    public interface LoginInputListener {
        void onLoginInputComplete(String username, String password);
    }
```

在主activity中去实现接口
```

    @Override
    public void onLoginInputComplete(String username, String password)
    {
        Toast.makeText(this, "帐号：" + username + ",  密码 :" + password,
                Toast.LENGTH_SHORT).show();
    }
```

