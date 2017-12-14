package demo.sc.gtihubdemo.utils;

import android.Manifest;
import android.app.Activity;
import android.os.Build;

import com.yanzhenjie.permission.AndPermission;

/**
 * @描述： android 6.0 权限处理
 * @作者： SuCheng
 * @时间： 2017/3/16 17:58
 */


public class PermissionUtils {

    /**
     * 位置权限
     * @param activity
     */
    public static void checkLoctionPermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_LOCATION)
                .permission(Manifest.permission.ACCESS_FINE_LOCATION)
                .send();
    }

    /**
     * 相机权限
     * @param activity
     */
    public static void checkCameraPermission(Activity activity) {
        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_CAMERA)
                .permission(Manifest.permission.CAMERA)
                .send();
    }

    /**
     * 存储卡权限
     * @param activity
     */
    public static void checkStoragePermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_STORAGE)
                .permission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .send();
    }

    /**
     * 联系人权限
     * @param activity
     */
    public static void checkContactsPermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_CONTACTS)
                .permission(Manifest.permission.READ_CONTACTS)
                .send();
    }

    /**
     * 拨打电话权限
     * @param activity
     */
    public static void checkCallPhonePermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_CALL_PHONECONTACTS)
                .permission(Manifest.permission.CALL_PHONE)
                .send();
    }

    /**
     * 读写日历权限
     * @param activity
     */
    public static void checkCalendarPermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_CALENDAR)
                .permission(Manifest.permission.READ_CALENDAR)
                .send();
    }

    /**
     * 传感器权限
     * @param activity
     */
    public static void checkSensorsPermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_SENSORS)
                .permission(Manifest.permission.BODY_SENSORS)
                .send();
    }

    /**
     * 录音权限
     * @param activity
     */
    public static void checkReconrdAudioPermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_RECORD_AUDIO)
                .permission(Manifest.permission.RECORD_AUDIO)
                .send();
    }

    /**
     * 短信权限
     * @param activity
     */
    public static void checkSmsPermission(Activity activity) {

        AndPermission.with(activity)
                .requestCode(RequestCode.PERMISSION_SMS)
                .permission(Manifest.permission.READ_SMS)
                .send();
    }



    public static boolean isAndroidM() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return true;
        }

        return false;
    }

}
