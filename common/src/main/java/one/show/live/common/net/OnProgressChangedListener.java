package one.show.live.common.net;

/**
 * 上传、下载进度监听
 */
public interface OnProgressChangedListener {
    void onTotalSize(long totalSize);
    void onProgressChanged(long progress);
    void onFinish();
}
