package cn.maitian.api;

import cn.maitian.bean.img.ImgBean;
import cn.maitian.response.base.Response;

/**
 * api 列表
 * <p/>
 * <p>
 * [restful的规范](http://www.cnblogs.com/tommyli/p/3913018.html)
 * </p>
 * <p>
 * [retrofit的规范](http://square.github.io/retrofit/)
 * </p>
 *
 * @author geng
 */
public interface Api {
    /**
     * img base path
     */
    public final static String IMG_PATH = "img" + "/";

    /**
     * @param imgId 图片的Id
     * @return response
     */
    Response<ImgBean> getImgByImgId(String imgId);

}
