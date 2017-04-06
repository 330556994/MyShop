package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 上午11:57:38
 * @description 上传配置信息类
 *
 */
public class UploadConfigInfo {

	private String uploadimgtype = "";				//上传的图片类型,例如".jpg"
    private int uploadimgsize = 22;					//上传图片的大小(单位为字节)
    private int watermarktype = 0;					//水印类型(0代表没有水印，1代表文字水印，2代表图片水印)
    private int watermarkquality = 0;				//水印质量(必须位于0到100之间)
    private int watermarkposition = 0;				//水印位置(1代表上左，2代表上中，3代表上右，4代表中左，5代表中中，6代表中右，7代表下左，8代表下中，9代表下右)
    private String watermarkimg = "";				//水印图片
    private int watermarkimgopacity = 0;			//水印图片透明度(必须位于1到10之间)
    private String watermarktext = "";				//水印文字
    private String watermarktextfont = "";			//水印文字字体
    private int watermarktextsize = 0;				//水印文字大小
    private String brandthumbsize = "";				//品牌缩略图大小
    private String productshowthumbsize = "";		//商品展示缩略图大小
    private String useravatarthumbsize = "";		//用户头像缩略图大小
    private String userrankavatarthumbsize = "";	//用户等级头像缩略图大小
    private String storerankavatarthumbsize = "";	//店铺等级头像缩略图大小
    private String storelogothumbsize = "";			//店铺logo缩略图大小
    
    //以下为 getter setter 方法
	public String getUploadimgtype() {
		return uploadimgtype;
	}
	public void setUploadimgtype(String uploadimgtype) {
		this.uploadimgtype = uploadimgtype;
	}
	public int getUploadimgsize() {
		return uploadimgsize;
	}
	public void setUploadimgsize(int uploadimgsize) {
		this.uploadimgsize = uploadimgsize;
	}
	public int getWatermarktype() {
		return watermarktype;
	}
	public void setWatermarktype(int watermarktype) {
		this.watermarktype = watermarktype;
	}
	public int getWatermarkquality() {
		return watermarkquality;
	}
	public void setWatermarkquality(int watermarkquality) {
		this.watermarkquality = watermarkquality;
	}
	public int getWatermarkposition() {
		return watermarkposition;
	}
	public void setWatermarkposition(int watermarkposition) {
		this.watermarkposition = watermarkposition;
	}
	public String getWatermarkimg() {
		return watermarkimg;
	}
	public void setWatermarkimg(String watermarkimg) {
		this.watermarkimg = watermarkimg;
	}
	public int getWatermarkimgopacity() {
		return watermarkimgopacity;
	}
	public void setWatermarkimgopacity(int watermarkimgopacity) {
		this.watermarkimgopacity = watermarkimgopacity;
	}
	public String getWatermarktext() {
		return watermarktext;
	}
	public void setWatermarktext(String watermarktext) {
		this.watermarktext = watermarktext;
	}
	public String getWatermarktextfont() {
		return watermarktextfont;
	}
	public void setWatermarktextfont(String watermarktextfont) {
		this.watermarktextfont = watermarktextfont;
	}
	public int getWatermarktextsize() {
		return watermarktextsize;
	}
	public void setWatermarktextsize(int watermarktextsize) {
		this.watermarktextsize = watermarktextsize;
	}
	public String getBrandthumbsize() {
		return brandthumbsize;
	}
	public void setBrandthumbsize(String brandthumbsize) {
		this.brandthumbsize = brandthumbsize;
	}
	public String getProductshowthumbsize() {
		return productshowthumbsize;
	}
	public void setProductshowthumbsize(String productshowthumbsize) {
		this.productshowthumbsize = productshowthumbsize;
	}
	public String getUseravatarthumbsize() {
		return useravatarthumbsize;
	}
	public void setUseravatarthumbsize(String useravatarthumbsize) {
		this.useravatarthumbsize = useravatarthumbsize;
	}
	public String getUserrankavatarthumbsize() {
		return userrankavatarthumbsize;
	}
	public void setUserrankavatarthumbsize(String userrankavatarthumbsize) {
		this.userrankavatarthumbsize = userrankavatarthumbsize;
	}
	public String getStorerankavatarthumbsize() {
		return storerankavatarthumbsize;
	}
	public void setStorerankavatarthumbsize(String storerankavatarthumbsize) {
		this.storerankavatarthumbsize = storerankavatarthumbsize;
	}
	public String getStorelogothumbsize() {
		return storelogothumbsize;
	}
	public void setStorelogothumbsize(String storelogothumbsize) {
		this.storelogothumbsize = storelogothumbsize;
	}
    
}
