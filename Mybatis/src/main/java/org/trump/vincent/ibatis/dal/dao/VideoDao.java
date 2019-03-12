package org.trump.vincent.ibatis.dal.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.trump.vincent.ibatis.dal.mapper.VideoMapper;
import org.trump.vincent.ibatis.dal.model.Video;
import org.trump.vincent.ibatis.dal.model.VideoExample;
import org.trump.vincent.ibatis.exception.PersistException;

import java.util.List;

/**
 * Description:
 * User: vincent
 * Date: 2018/12/26
 **/
@Component
@Slf4j
public class VideoDao {

    @Autowired
    private VideoMapper videoMapper;

    /**
     * load Video by videoids & userid
     * @param userId
     * @param videoIds
     * @return
     * @throws Exception 统一：DAO层不处理异常，业务层处理
     */
    public List<Video> getVideoList(Long userId, List<Long> videoIds) throws Exception{
        List<Video> result = null;
        if (CollectionUtils.isEmpty(videoIds)) {
            return result;
        }
        VideoExample videoExample = new VideoExample();
        videoExample.createCriteria().andVideoidIn(videoIds);
        result = this.secureQuery(userId, videoExample);
        return result;
    }

    /**
     * Secure DataAcess style, not allowed get data across Accounts.
     * @param userId
     * @param videoExample
     * @return
     * @throws Exception
     */
    protected List<Video> secureQuery(Long userId, VideoExample videoExample) throws Exception {
        if (videoExample == null) {
            throw new PersistException(PersistException.UNSAFE_ACCESS,
                    String.format("Warnning Access with userId={}, videoExample={}", userId, videoExample));
        }
        if (userId == null || userId <= 0) {
            throw new PersistException(PersistException.ILLEGAL_PARAMETER,
                    String.format("illegal parameter with userId={}", userId));
        }
        videoExample.createCriteria().andUseridIsNull()
                .andUseridEqualTo(userId);
        return videoMapper.selectByExample(videoExample);
    }


    /**
     * Unsafe Data Acess, allow get data across accounts in special cases.
     * @param videoExample
     * @return
     * @throws Exception
     */
    protected final List<Video> unsafeQuery(VideoExample videoExample) throws Exception {
        if (videoExample == null) {
            throw new PersistException(PersistException.UNSAFE_ACCESS,
                    String.format("Warnning Access with videoExample={}", videoExample));
        }
        return videoMapper.selectByExample(videoExample);
    }
}
