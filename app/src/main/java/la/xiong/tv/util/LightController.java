package la.xiong.tv.util;

import android.app.Activity;
import android.provider.Settings;
import android.view.WindowManager;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class LightController {

    /**
     * 亮度加  distanceY > 0
     */
    public static void lightUp(Activity activity, float distanceY, int mScreenWidth) {

        //先关闭系统的亮度自动调节
        try {
            float addLight = 255 * 2 * distanceY / mScreenWidth;

            int currentLight = (int) (Settings.System.getInt(activity.getContentResolver(),
                    Settings.System.SCREEN_BRIGHTNESS,
                    255));

            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.screenBrightness = Math.min(1.0f, currentLight / 255 + addLight);
            activity.getWindow().setAttributes(attributes);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 亮度加  distanceY < 0
     */
    public static void lightDown(Activity activity, float distanceY, int mScreenWidth) {
        //先关闭系统的亮度自动调节
        try {
            float reduceLight = 2 * distanceY / mScreenWidth;

            int currentLight = (int) (Settings.System.getInt(activity.getContentResolver(),
                    Settings.System.SCREEN_BRIGHTNESS,
                    255));

            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.screenBrightness = Math.max(0f, currentLight / 255 + reduceLight);
            activity.getWindow().setAttributes(attributes);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
