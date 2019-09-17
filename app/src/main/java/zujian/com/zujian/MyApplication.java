package zujian.com.zujian;

import android.app.Application;

import study.hank.com.api.ZRouter;


/**
 * @des: Created by ybf
 * @version: 3.3.2
 * @date: 2019/9/17 16:41
 * @see {@link }
 */
public class MyApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
       ZRouter.getInstance().initRegister(this);
    }
}
