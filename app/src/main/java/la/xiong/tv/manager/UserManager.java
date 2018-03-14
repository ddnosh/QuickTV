package la.xiong.tv.manager;

import la.xiong.tv.bean.HomeModel;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class UserManager {

    private static UserManager sInstance;

    private HomeModel homeModel;

    public static UserManager getInstance() {
        if (null == sInstance) {
            synchronized (UserManager.class) {
                if (null == sInstance) {
                    sInstance = new UserManager();
                }
            }
        }

        return sInstance;
    }

    public HomeModel getHomeModel() {
        return homeModel;
    }

    public void setHomeModel(HomeModel homeModel) {
        this.homeModel = homeModel;
    }
}
