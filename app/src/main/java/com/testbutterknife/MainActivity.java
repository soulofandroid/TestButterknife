package com.testbutterknife;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindArray;
import butterknife.BindBitmap;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

/**
 *  在Activity中绑定ButterKnife：
 */
public class MainActivity extends AppCompatActivity {
    // 绑定View：
    @BindView( R2.id.button1)
    public Button button1;
    // 绑定View：
    @BindView( R2.id.button2)
    public Button button2;
    // 绑定View：
    @BindView( R2.id.button3)
    public Button button3;
    // 绑定View：
    @BindView( R2.id.button4)
    public Button button4;

    @BindViews({ R2.id.tv1, R2.id.tv2,  R2.id.tv3,R2.id.tv4})
    public List<TextView> textList ;

    //绑定资源文件中string字符串
    @BindString(R2.string.app_name)
    String str;
    //绑定string里面array数组
    @BindArray(R2.array.city)
    String [] citys ;
    @BindView( R2.id.imageView ) //绑定ImageView 控件
    public ImageView imageView ;
    //绑定Bitmap 资源
    @BindBitmap( R.mipmap.ic_launcher)
    public Bitmap bitmap ;
    //具体色值在color文件中
    @BindColor( R2.color.colorAccent )
    int colorAccent ;  //绑定一个颜色值

    //给 button 设置一个点击事件
    @OnClick(R2.id.button1 )
    public void showToast(){
        Toast.makeText(this, "is a click", Toast.LENGTH_SHORT).show();
    }
    //给 button 设置一个长按事件
    @OnLongClick( R2.id.button1)
    public boolean showToast2(){
        Toast.makeText(this, "is a long click", Toast.LENGTH_SHORT).show();
        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定初始化ButterKnife
        ButterKnife.bind(this);
        textList.get(0).setText("哈哈赛啥时候");
        textList.get(1).setText("啊飒飒");
        textList.get(2).setText(str);
        textList.get(3).setText(citys[0]);
        imageView.setImageBitmap(bitmap);
        button1.setTextColor(  colorAccent );
    }

    @OnClick({R2.id.button1, R2.id.button2, R2.id.button3, R2.id.button4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Log.d("TestButterknife","我是点击事件1");
                break;
            case R.id.button2:
                System.out.println("sasasas");
                Log.d("TestButterknife","我是点击事件2");
                break;
            case R.id.button3:
                Log.d("TestButterknife","我是点击事件3");
                break;
            case R.id.button4:
                Log.d("TestButterknife","我是点击事件4");
                break;
        }
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
