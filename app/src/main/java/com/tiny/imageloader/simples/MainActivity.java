package com.tiny.imageloader.simples;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.tiny.loader.TinyImageLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView view = (ImageView) findViewById(R.id.image);

        TinyImageLoader.create("http://pic.baike.soso.com/p/20140111/20140111121833-809734577.jpg")
                //设置图片解码格式
                .setBitmapConfig(Bitmap.Config.RGB_565)
                //设置采样率
//                .setInSampleSize(1)
                //设置默认加载中的图片
                .setDefaultDrawable(new ColorDrawable(Color.GRAY))
                //设置默认的加载图片,res
//                .setDefaultRes(R.drawable.abc_ic_ab_back_mtrl_am_alpha)
                //设置图片展示样式,举个栗子 圆形
//                .setDisplayType(TinyImageLoader.DISPLAY_CIRCLE)
                //再举个栗子,高斯模糊的圆形图片
                .setDisplayType(TinyImageLoader.DISPLAY_CIRCLE_BLUR)
                //设置高斯模糊radius
                .setBlurDepth(20)
                //如果不希望图片被压缩缓存
                .isCompress(false)
                //如果是七牛图片,可以设置宽高,在七牛上进行等比裁剪
//                .setQiniu(500,500)
                .into(view);
    }
}
