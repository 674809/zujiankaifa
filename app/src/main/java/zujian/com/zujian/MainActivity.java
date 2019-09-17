package zujian.com.zujian;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import study.hank.com.api.ZRouter;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
    }


    public void initButton(){
        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  ARouter.getInstance().build("/app/HomeActivity").navigation();
                ZRouter.getInstance().build("/app/Main").navigation();
                /*try {
                    Class clazz = Class.forName("zujian.com.model_main.MainActivity");
                    Intent intent = new Intent(getApplicationContext(),clazz);
                    startActivity(intent);
                } catch (ClassNotFoundException e) {
                    Log.e("zhuang","未集成，无法跳转");
               }*/
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ZRouter.getInstance().release();// 很诡异的一个问题。静态变量难道不会随着进程被杀而释放内存么，还要我在onDestroy里面手动释放
    }
}
