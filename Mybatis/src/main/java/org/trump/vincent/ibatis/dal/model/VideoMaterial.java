package org.trump.vincent.ibatis.dal.model;

import java.io.Serializable;
import java.util.Date;

public class VideoMaterial implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.material_id
     *
     * @mbg.generated
     */
    private Long materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.userid
     *
     * @mbg.generated
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.campaignid
     *
     * @mbg.generated
     */
    private Long campaignid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.material_type
     *
     * @mbg.generated
     */
    private Integer materialType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.version
     *
     * @mbg.generated
     */
    private Long version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.isdel
     *
     * @mbg.generated
     */
    private Byte isdel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.audit_userid
     *
     * @mbg.generated
     */
    private Long auditUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.audit_time
     *
     * @mbg.generated
     */
    private Date auditTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.audit_status
     *
     * @mbg.generated
     */
    private Byte auditStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.reason_id
     *
     * @mbg.generated
     */
    private Long reasonId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.reason_text
     *
     * @mbg.generated
     */
    private String reasonText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.source
     *
     * @mbg.generated
     */
    private Integer source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.mod_time
     *
     * @mbg.generated
     */
    private Date modTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.deluid
     *
     * @mbg.generated
     */
    private Long deluid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.optid
     *
     * @mbg.generated
     */
    private Long optid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.adgroupid
     *
     * @mbg.generated
     */
    private Long adgroupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.pause_status
     *
     * @mbg.generated
     */
    private Byte pauseStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.video_type
     *
     * @mbg.generated
     */
    private Byte videoType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.video_count
     *
     * @mbg.generated
     */
    private Integer videoCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.pic_count
     *
     * @mbg.generated
     */
    private Integer picCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.material_content
     *
     * @mbg.generated
     */
    private String materialContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_material.audit_content
     *
     * @mbg.generated
     */
    private String auditContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_material
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.material_id
     *
     * @return the value of video_material.material_id
     *
     * @mbg.generated
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.material_id
     *
     * @param materialId the value for video_material.material_id
     *
     * @mbg.generated
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.userid
     *
     * @return the value of video_material.userid
     *
     * @mbg.generated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.userid
     *
     * @param userid the value for video_material.userid
     *
     * @mbg.generated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.campaignid
     *
     * @return the value of video_material.campaignid
     *
     * @mbg.generated
     */
    public Long getCampaignid() {
        return campaignid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.campaignid
     *
     * @param campaignid the value for video_material.campaignid
     *
     * @mbg.generated
     */
    public void setCampaignid(Long campaignid) {
        this.campaignid = campaignid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.material_type
     *
     * @return the value of video_material.material_type
     *
     * @mbg.generated
     */
    public Integer getMaterialType() {
        return materialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.material_type
     *
     * @param materialType the value for video_material.material_type
     *
     * @mbg.generated
     */
    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.version
     *
     * @return the value of video_material.version
     *
     * @mbg.generated
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.version
     *
     * @param version the value for video_material.version
     *
     * @mbg.generated
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.isdel
     *
     * @return the value of video_material.isdel
     *
     * @mbg.generated
     */
    public Byte getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.isdel
     *
     * @param isdel the value for video_material.isdel
     *
     * @mbg.generated
     */
    public void setIsdel(Byte isdel) {
        this.isdel = isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.audit_userid
     *
     * @return the value of video_material.audit_userid
     *
     * @mbg.generated
     */
    public Long getAuditUserid() {
        return auditUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.audit_userid
     *
     * @param auditUserid the value for video_material.audit_userid
     *
     * @mbg.generated
     */
    public void setAuditUserid(Long auditUserid) {
        this.auditUserid = auditUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.audit_time
     *
     * @return the value of video_material.audit_time
     *
     * @mbg.generated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.audit_time
     *
     * @param auditTime the value for video_material.audit_time
     *
     * @mbg.generated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.audit_status
     *
     * @return the value of video_material.audit_status
     *
     * @mbg.generated
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.audit_status
     *
     * @param auditStatus the value for video_material.audit_status
     *
     * @mbg.generated
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.reason_id
     *
     * @return the value of video_material.reason_id
     *
     * @mbg.generated
     */
    public Long getReasonId() {
        return reasonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.reason_id
     *
     * @param reasonId the value for video_material.reason_id
     *
     * @mbg.generated
     */
    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.reason_text
     *
     * @return the value of video_material.reason_text
     *
     * @mbg.generated
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.reason_text
     *
     * @param reasonText the value for video_material.reason_text
     *
     * @mbg.generated
     */
    public void setReasonText(String reasonText) {
        this.reasonText = reasonText == null ? null : reasonText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.source
     *
     * @return the value of video_material.source
     *
     * @mbg.generated
     */
    public Integer getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.source
     *
     * @param source the value for video_material.source
     *
     * @mbg.generated
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.add_time
     *
     * @return the value of video_material.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.add_time
     *
     * @param addTime the value for video_material.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.mod_time
     *
     * @return the value of video_material.mod_time
     *
     * @mbg.generated
     */
    public Date getModTime() {
        return modTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.mod_time
     *
     * @param modTime the value for video_material.mod_time
     *
     * @mbg.generated
     */
    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.deluid
     *
     * @return the value of video_material.deluid
     *
     * @mbg.generated
     */
    public Long getDeluid() {
        return deluid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.deluid
     *
     * @param deluid the value for video_material.deluid
     *
     * @mbg.generated
     */
    public void setDeluid(Long deluid) {
        this.deluid = deluid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.optid
     *
     * @return the value of video_material.optid
     *
     * @mbg.generated
     */
    public Long getOptid() {
        return optid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.optid
     *
     * @param optid the value for video_material.optid
     *
     * @mbg.generated
     */
    public void setOptid(Long optid) {
        this.optid = optid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.adgroupid
     *
     * @return the value of video_material.adgroupid
     *
     * @mbg.generated
     */
    public Long getAdgroupid() {
        return adgroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.adgroupid
     *
     * @param adgroupid the value for video_material.adgroupid
     *
     * @mbg.generated
     */
    public void setAdgroupid(Long adgroupid) {
        this.adgroupid = adgroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.pause_status
     *
     * @return the value of video_material.pause_status
     *
     * @mbg.generated
     */
    public Byte getPauseStatus() {
        return pauseStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.pause_status
     *
     * @param pauseStatus the value for video_material.pause_status
     *
     * @mbg.generated
     */
    public void setPauseStatus(Byte pauseStatus) {
        this.pauseStatus = pauseStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.video_type
     *
     * @return the value of video_material.video_type
     *
     * @mbg.generated
     */
    public Byte getVideoType() {
        return videoType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.video_type
     *
     * @param videoType the value for video_material.video_type
     *
     * @mbg.generated
     */
    public void setVideoType(Byte videoType) {
        this.videoType = videoType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.video_count
     *
     * @return the value of video_material.video_count
     *
     * @mbg.generated
     */
    public Integer getVideoCount() {
        return videoCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.video_count
     *
     * @param videoCount the value for video_material.video_count
     *
     * @mbg.generated
     */
    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.pic_count
     *
     * @return the value of video_material.pic_count
     *
     * @mbg.generated
     */
    public Integer getPicCount() {
        return picCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.pic_count
     *
     * @param picCount the value for video_material.pic_count
     *
     * @mbg.generated
     */
    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.material_content
     *
     * @return the value of video_material.material_content
     *
     * @mbg.generated
     */
    public String getMaterialContent() {
        return materialContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.material_content
     *
     * @param materialContent the value for video_material.material_content
     *
     * @mbg.generated
     */
    public void setMaterialContent(String materialContent) {
        this.materialContent = materialContent == null ? null : materialContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_material.audit_content
     *
     * @return the value of video_material.audit_content
     *
     * @mbg.generated
     */
    public String getAuditContent() {
        return auditContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_material.audit_content
     *
     * @param auditContent the value for video_material.audit_content
     *
     * @mbg.generated
     */
    public void setAuditContent(String auditContent) {
        this.auditContent = auditContent == null ? null : auditContent.trim();
    }
}