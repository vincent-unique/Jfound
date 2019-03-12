package org.trump.vincent.ibatis.dal.model;

import java.io.Serializable;
import java.util.Date;

public class VideoTranscode implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.videoid
     *
     * @mbg.generated
     */
    private Long videoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.userid
     *
     * @mbg.generated
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.format
     *
     * @mbg.generated
     */
    private String format;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.capacity
     *
     * @mbg.generated
     */
    private Double capacity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.height
     *
     * @mbg.generated
     */
    private Integer height;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.width
     *
     * @mbg.generated
     */
    private Integer width;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.bit_rate
     *
     * @mbg.generated
     */
    private Double bitRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.frame_rate
     *
     * @mbg.generated
     */
    private Double frameRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.audio_rate
     *
     * @mbg.generated
     */
    private Double audioRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.duration
     *
     * @mbg.generated
     */
    private Integer duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.thumbnail
     *
     * @mbg.generated
     */
    private String thumbnail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.mod_time
     *
     * @mbg.generated
     */
    private Date modTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.transfer_status
     *
     * @mbg.generated
     */
    private Byte transferStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.transfer_time
     *
     * @mbg.generated
     */
    private Date transferTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.video_codec
     *
     * @mbg.generated
     */
    private String videoCodec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.audio_codec
     *
     * @mbg.generated
     */
    private String audioCodec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.transferMd5
     *
     * @mbg.generated
     */
    private String transfermd5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_transfer.video_rate
     *
     * @mbg.generated
     */
    private Double videoRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_transfer
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.id
     *
     * @return the value of video_transfer.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.id
     *
     * @param id the value for video_transfer.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.videoid
     *
     * @return the value of video_transfer.videoid
     *
     * @mbg.generated
     */
    public Long getVideoid() {
        return videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.videoid
     *
     * @param videoid the value for video_transfer.videoid
     *
     * @mbg.generated
     */
    public void setVideoid(Long videoid) {
        this.videoid = videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.userid
     *
     * @return the value of video_transfer.userid
     *
     * @mbg.generated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.userid
     *
     * @param userid the value for video_transfer.userid
     *
     * @mbg.generated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.url
     *
     * @return the value of video_transfer.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.url
     *
     * @param url the value for video_transfer.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.type
     *
     * @return the value of video_transfer.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.type
     *
     * @param type the value for video_transfer.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.format
     *
     * @return the value of video_transfer.format
     *
     * @mbg.generated
     */
    public String getFormat() {
        return format;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.format
     *
     * @param format the value for video_transfer.format
     *
     * @mbg.generated
     */
    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.capacity
     *
     * @return the value of video_transfer.capacity
     *
     * @mbg.generated
     */
    public Double getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.capacity
     *
     * @param capacity the value for video_transfer.capacity
     *
     * @mbg.generated
     */
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.height
     *
     * @return the value of video_transfer.height
     *
     * @mbg.generated
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.height
     *
     * @param height the value for video_transfer.height
     *
     * @mbg.generated
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.width
     *
     * @return the value of video_transfer.width
     *
     * @mbg.generated
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.width
     *
     * @param width the value for video_transfer.width
     *
     * @mbg.generated
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.bit_rate
     *
     * @return the value of video_transfer.bit_rate
     *
     * @mbg.generated
     */
    public Double getBitRate() {
        return bitRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.bit_rate
     *
     * @param bitRate the value for video_transfer.bit_rate
     *
     * @mbg.generated
     */
    public void setBitRate(Double bitRate) {
        this.bitRate = bitRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.frame_rate
     *
     * @return the value of video_transfer.frame_rate
     *
     * @mbg.generated
     */
    public Double getFrameRate() {
        return frameRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.frame_rate
     *
     * @param frameRate the value for video_transfer.frame_rate
     *
     * @mbg.generated
     */
    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.audio_rate
     *
     * @return the value of video_transfer.audio_rate
     *
     * @mbg.generated
     */
    public Double getAudioRate() {
        return audioRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.audio_rate
     *
     * @param audioRate the value for video_transfer.audio_rate
     *
     * @mbg.generated
     */
    public void setAudioRate(Double audioRate) {
        this.audioRate = audioRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.duration
     *
     * @return the value of video_transfer.duration
     *
     * @mbg.generated
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.duration
     *
     * @param duration the value for video_transfer.duration
     *
     * @mbg.generated
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.thumbnail
     *
     * @return the value of video_transfer.thumbnail
     *
     * @mbg.generated
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.thumbnail
     *
     * @param thumbnail the value for video_transfer.thumbnail
     *
     * @mbg.generated
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.add_time
     *
     * @return the value of video_transfer.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.add_time
     *
     * @param addTime the value for video_transfer.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.mod_time
     *
     * @return the value of video_transfer.mod_time
     *
     * @mbg.generated
     */
    public Date getModTime() {
        return modTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.mod_time
     *
     * @param modTime the value for video_transfer.mod_time
     *
     * @mbg.generated
     */
    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.transfer_status
     *
     * @return the value of video_transfer.transfer_status
     *
     * @mbg.generated
     */
    public Byte getTransferStatus() {
        return transferStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.transfer_status
     *
     * @param transferStatus the value for video_transfer.transfer_status
     *
     * @mbg.generated
     */
    public void setTransferStatus(Byte transferStatus) {
        this.transferStatus = transferStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.transfer_time
     *
     * @return the value of video_transfer.transfer_time
     *
     * @mbg.generated
     */
    public Date getTransferTime() {
        return transferTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.transfer_time
     *
     * @param transferTime the value for video_transfer.transfer_time
     *
     * @mbg.generated
     */
    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.video_codec
     *
     * @return the value of video_transfer.video_codec
     *
     * @mbg.generated
     */
    public String getVideoCodec() {
        return videoCodec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.video_codec
     *
     * @param videoCodec the value for video_transfer.video_codec
     *
     * @mbg.generated
     */
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec == null ? null : videoCodec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.audio_codec
     *
     * @return the value of video_transfer.audio_codec
     *
     * @mbg.generated
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.audio_codec
     *
     * @param audioCodec the value for video_transfer.audio_codec
     *
     * @mbg.generated
     */
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec == null ? null : audioCodec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.transferMd5
     *
     * @return the value of video_transfer.transferMd5
     *
     * @mbg.generated
     */
    public String getTransfermd5() {
        return transfermd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.transferMd5
     *
     * @param transfermd5 the value for video_transfer.transferMd5
     *
     * @mbg.generated
     */
    public void setTransfermd5(String transfermd5) {
        this.transfermd5 = transfermd5 == null ? null : transfermd5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_transfer.video_rate
     *
     * @return the value of video_transfer.video_rate
     *
     * @mbg.generated
     */
    public Double getVideoRate() {
        return videoRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_transfer.video_rate
     *
     * @param videoRate the value for video_transfer.video_rate
     *
     * @mbg.generated
     */
    public void setVideoRate(Double videoRate) {
        this.videoRate = videoRate;
    }
}