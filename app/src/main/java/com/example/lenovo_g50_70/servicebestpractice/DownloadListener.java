package com.example.lenovo_g50_70.servicebestpractice;

/**
 * Created by lenovo-G50-70 on 2017/3/18.
 */

public interface DownloadListener {
    void onProgress(int progress);//通知当前下载进度
    void onSuccess();//通知下载成功
    void onFailed();//通知下载失败
    void onPaused();//通知下载暂停
    void onCanceled();//通知下载取消
}
