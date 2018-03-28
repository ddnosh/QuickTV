package la.xiong.tv.network;

import java.util.List;

import la.xiong.tv.bean.CategoryModel;
import la.xiong.tv.bean.HomeModel;
import la.xiong.tv.bean.Video;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface TVApis {
    @GET("page/appv2-index/info.json")
    Observable<HomeModel> getHomeModel();

    @GET("categories/list.json")
    Observable<List<CategoryModel>> getCategoryModelList();
//
//    @GET("play/list.json")
//    Observable<AllLiveModel> getAllLive();

    @GET("rooms/{uid}/info.json")
    Observable<Video> getVideoInfo(@Path("uid")String uid);
//
//    @GET("categories/{classify}/list.json")
//    Observable<AllLiveModel> getAllClassifyLive(@Path("classify") String classify);
}
