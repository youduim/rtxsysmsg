package im.youdu.sdk.entity;

public class Const {


    public static final String Message_App_Type_Text = "app_text";    //应用文本消息
    public static final String Message_App_Type_File = "app_file";    //应用文件消息
    public static final String Message_App_Type_Image = "app_image";  //图片消息
    public static final String Message_App_Type_Sms = "sms";        //短信消息

    public static final String Message_Session_Create = "session_create";    //创建会话
    public static final String Message_Session_Update = "session_update";    //修改会话
    public static final String Message_Session_Type_Text = "session_text";    //会话文本消息
    public static final String Message_Session_Type_Image = "session_image";  //图片消息
    public static final String Message_Session_Type_File = "session_file";    //会话文件消息
    public static final String Message_Session_Type_Link = "link";    //隐式链接消息
    public static final String Message_Session_Type_Audio = "audio";//语音消息
    public static final String Message_Session_Type_System = "system";//系统消息（新版本）
    public static final String Message_Session_Type_Complex = "complex";//复合消息
    public static final String Message_Session_Type_Broadcast = "broadcast";//广播消息

//        后续可能会支持
//        public static final String Message_App_Type_Exlink = "exlink";//外链消息
//        public static final String Message_App_Type_Mpnews = "mpnews";//图文消息
//        public static final String Message_App_Type_Link = "link";    //会话隐式链接消息
//        public static final String MessageTypeEmail = "mail";//邮件消息
//        public static final String MessageTypeVideo = "video";//视频消息
//        public static final String ActionTypeUnread = "unRead";
//        public static final String ActionTypeNewMail = "newMail";

    public static final String Error_Not_Json = "It is not a json object";

    public static final String Log_Receive_Msg = "[%s] receive msg";
    public static final String Log_Receive_Msg_Error_Invalid_Signature = "[%s][error] signature is invalid";
    public static final String Log_Receive_Msg_Error_Invalid_BuinUnequal = "[%s][error] from buin %d is unequal local buin %d";
    public static final String Log_Receive_Msg_Error_Invalid_AppIdUnequal = "[%s][error] from appId %s is unequal local appId %s";

    public static final Integer Avatar_Large = 0;
    public static final Integer Avatar_Small = 1;

    public static final String UserInfo_Account = "account";
    public static final String UserInfo_ChsName = "chsName";
    public static final String UserInfo_Gender = "gender";
    public static final String UserInfo_Mobile = "mobile";
    public static final String UserInfo_Phone = "phone";
    public static final String UserInfo_Email = "email";

    public static final String ErrMsg_MissSection_Status = "找不到返回结果状态字段";
    public static final String ErrMsg_MissSection_UserInfo = "找不到返回结果用户字段";

    public static final Integer Gender_Male = 0; //男
    public static final Integer Gender_Female = 1; //女

    public static final Integer Duration_Forever = -1;
    public static final Integer Position_TopLeft = 1;//左上
    public static final Integer Position_TopRight = 2;//右上
    public static final Integer Position_BottomRight = 3; //右下
    public static final Integer Position_BottomLeft = 4; //左下
}

