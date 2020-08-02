package com.juntai.wisdom.basecomponent.bean;

import com.juntai.wisdom.basecomponent.base.BaseResult;

/**
 * @Author: tobato
 * @Description: 作用描述
 * @CreateDate: 2020/5/30 10:25
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/30 10:25
 */
public class OpenLiveBean extends BaseResult {

    /**
     * errcode : 0
     * errdesc : OK
     * strsessionid : 37131201561327001001
     * videourl : rtmp://60.213.43.241:1935/video/37131201561327001001
     * keepalivetime : 60
     */

    private int errcode;
    private String errdesc;
    private String strsessionid;
    private String videourl;
    private String imagetime;//截图时返回的参数
    private String imageurl;//截图时返回的参数
    private int keepalivetime;

    public String getImagetime() {
        return imagetime == null ? "" : imagetime;
    }

    public void setImagetime(String imagetime) {
        this.imagetime = imagetime == null ? "" : imagetime;
    }

    public String getImageurl() {
        return imageurl == null ? "" : imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? "" : imageurl;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrdesc() {
        return errdesc;
    }

    public void setErrdesc(String errdesc) {
        this.errdesc = errdesc;
    }

    public String getStrsessionid() {
        return strsessionid;
    }

    public void setStrsessionid(String strsessionid) {
        this.strsessionid = strsessionid;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public int getKeepalivetime() {
        return keepalivetime;
    }

    public void setKeepalivetime(int keepalivetime) {
        this.keepalivetime = keepalivetime;
    }
}
