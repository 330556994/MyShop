package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����11:57:38
 * @description �ϴ�������Ϣ��
 *
 */
public class UploadConfigInfo {

	private String uploadimgtype = "";				//�ϴ���ͼƬ����,����".jpg"
    private int uploadimgsize = 22;					//�ϴ�ͼƬ�Ĵ�С(��λΪ�ֽ�)
    private int watermarktype = 0;					//ˮӡ����(0����û��ˮӡ��1��������ˮӡ��2����ͼƬˮӡ)
    private int watermarkquality = 0;				//ˮӡ����(����λ��0��100֮��)
    private int watermarkposition = 0;				//ˮӡλ��(1��������2�������У�3�������ң�4��������5�������У�6�������ң�7��������8�������У�9��������)
    private String watermarkimg = "";				//ˮӡͼƬ
    private int watermarkimgopacity = 0;			//ˮӡͼƬ͸����(����λ��1��10֮��)
    private String watermarktext = "";				//ˮӡ����
    private String watermarktextfont = "";			//ˮӡ��������
    private int watermarktextsize = 0;				//ˮӡ���ִ�С
    private String brandthumbsize = "";				//Ʒ������ͼ��С
    private String productshowthumbsize = "";		//��Ʒչʾ����ͼ��С
    private String useravatarthumbsize = "";		//�û�ͷ������ͼ��С
    private String userrankavatarthumbsize = "";	//�û��ȼ�ͷ������ͼ��С
    private String storerankavatarthumbsize = "";	//���̵ȼ�ͷ������ͼ��С
    private String storelogothumbsize = "";			//����logo����ͼ��С
    
    //����Ϊ getter setter ����
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
