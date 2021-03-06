package org.trump.vincent.ibatis.dal.model;

import java.io.Serializable;
import java.util.Date;

public class VideoReference implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.videoid
     *
     * @mbg.generated
     */
    private Long videoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.userid
     *
     * @mbg.generated
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.source
     *
     * @mbg.generated
     */
    private Byte source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.materialid
     *
     * @mbg.generated
     */
    private Long materialid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.material_type
     *
     * @mbg.generated
     */
    private Byte materialType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.isdel
     *
     * @mbg.generated
     */
    private Byte isdel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.mod_time
     *
     * @mbg.generated
     */
    private Date modTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_reference.transferid
     *
     * @mbg.generated
     */
    private Long transferid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_reference
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.id
     *
     * @return the value of video_reference.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.id
     *
     * @param id the value for video_reference.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.videoid
     *
     * @return the value of video_reference.videoid
     *
     * @mbg.generated
     */
    public Long getVideoid() {
        return videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.videoid
     *
     * @param videoid the value for video_reference.videoid
     *
     * @mbg.generated
     */
    public void setVideoid(Long videoid) {
        this.videoid = videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.userid
     *
     * @return the value of video_reference.userid
     *
     * @mbg.generated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.userid
     *
     * @param userid the value for video_reference.userid
     *
     * @mbg.generated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.source
     *
     * @return the value of video_reference.source
     *
     * @mbg.generated
     */
    public Byte getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.source
     *
     * @param source the value for video_reference.source
     *
     * @mbg.generated
     */
    public void setSource(Byte source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.materialid
     *
     * @return the value of video_reference.materialid
     *
     * @mbg.generated
     */
    public Long getMaterialid() {
        return materialid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.materialid
     *
     * @param materialid the value for video_reference.materialid
     *
     * @mbg.generated
     */
    public void setMaterialid(Long materialid) {
        this.materialid = materialid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.material_type
     *
     * @return the value of video_reference.material_type
     *
     * @mbg.generated
     */
    public Byte getMaterialType() {
        return materialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.material_type
     *
     * @param materialType the value for video_reference.material_type
     *
     * @mbg.generated
     */
    public void setMaterialType(Byte materialType) {
        this.materialType = materialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.isdel
     *
     * @return the value of video_reference.isdel
     *
     * @mbg.generated
     */
    public Byte getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.isdel
     *
     * @param isdel the value for video_reference.isdel
     *
     * @mbg.generated
     */
    public void setIsdel(Byte isdel) {
        this.isdel = isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.add_time
     *
     * @return the value of video_reference.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.add_time
     *
     * @param addTime the value for video_reference.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.mod_time
     *
     * @return the value of video_reference.mod_time
     *
     * @mbg.generated
     */
    public Date getModTime() {
        return modTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.mod_time
     *
     * @param modTime the value for video_reference.mod_time
     *
     * @mbg.generated
     */
    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_reference.transferid
     *
     * @return the value of video_reference.transferid
     *
     * @mbg.generated
     */
    public Long getTransferid() {
        return transferid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_reference.transferid
     *
     * @param transferid the value for video_reference.transferid
     *
     * @mbg.generated
     */
    public void setTransferid(Long transferid) {
        this.transferid = transferid;
    }
}