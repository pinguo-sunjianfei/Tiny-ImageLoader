# Tiny-ImageLoader
关于取名,我喜欢玩dota,Tiny是我最擅长的英雄,没有之一,这个项目就以Tiny来命名了
<br>
项目介绍:基于ImageLoader修改和优化的版本.比原来的ImageLoader更好用.更方便.功能更强大

用法：
<br>
1.初始化 
```Java
//1.初始化TinyImageLoader
TinyImageLoader.init(this, FileUtil.getPathByType(FileUtil.DIR_TYPE_CACHE));
//2.初始化TinyImageLoader当中的日志系统
L.writeDebugLogs(BuildConfig.DEBUG);
```

<br>
2.加载网络图片
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
```
<br>
3.加载SD卡图片
TinyImageLoader.create(file:///" + imagePath)
<br>
4.加载Res图片
TinyImageLoader.create(drawable://" + R.drawable.xxx)
<br>
时间匆忙,先到这里了,后续有空更新
