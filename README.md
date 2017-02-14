# EditTextDialog

![参考实例](http://upload-images.jianshu.io/upload_images/2433593-2d5f9fadfa8d2856?imageMogr2/auto-orient/strip)

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

[[Android 官方推荐 : DialogFragment 创建对话框](http://blog.csdn.net/lmj623565791/article/details/37815413)](http://blog.csdn.net/lmj623565791/article/details/37815413/)

[Github](https://github.com/shun1249844726/EditTextDialog/tree/master)


