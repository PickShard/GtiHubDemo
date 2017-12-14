package demo.sc.gtihubdemo.utils;

/**
 * Created by sc on 2016/12/8.
 */
public interface RequestCode {

    int DETAIL_REQUEST = 1;

    int REQUST_ORG = 2;  //选择组织机构

    int REQUST_EMP = 3;  //选择用户

    int REQUST_GROUP = 4;    //选择群组

    int ADD_NEWS = 5;

    int REQUST_TACK_PHOTO = 6;// 使用照相机拍照获取图片

    int REQUST_PICK_PHOTO = 7;// 使用相册中的图片

    int DEFAULT_CODE = 8;

    int REQUST_ADDRESS = 9;

    //权限
    int PERMISSION_CAMERA = 1;

    int PERMISSION_LOCATION = 2;

    int PERMISSION_STORAGE = 3;

    int PERMISSION_CONTACTS = 4;

    int PERMISSION_CALL_PHONECONTACTS = 5;

    int PERMISSION_CALENDAR = 6;

    int PERMISSION_SENSORS = 7;

    int PERMISSION_RECORD_AUDIO = 8;

    int PERMISSION_SMS = 9;
}
