package im.youdu.sdk.entity;

public class YdApi {
    public static final String SCHEME = "http://";

    public static final String MEDIA_TYPE_FILE = "file";
    public static final String MEDIA_TYPE_IMG = "image";
    public static final String MEDIA_TYPE_VOICE = "voice";
    public static final String MEDIA_TYPE_VIDEO = "video";

    /*****API FOR TOKEN*****/
    public static final String API_GET_TOKEN = "/cgi/gettoken";

    public static final String API_SET_NOTICE = "/cgi/set.ent.notice";
    public static final String API_POPWINDOW = "/cgi/popwin";

    /*****API FOR MEDIA*****/
    public static final String API_UPLOAD_MEDIA = "/cgi/media/upload";
    public static final String API_DOWNLOAD_MEDIA = "/cgi/media/get";
    public static final String API_SEARCHE_MEDIA = "/cgi/media/search";

    /*****API FOR MSG*****/
    public static final String API_APP_SEND_MSG = "/cgi/msg/send";

    /*****API FOR AVATAR*****/
    public static final String API_USER_AVATAR_SET = "/cgi/avatar/set";
    public static final String API_USER_AVATAR_DOWNLOAD = "/cgi/avatar/get";

    /*****API FOR IDENTIFY*****/
    public static final String API_IDENTIFY = "/cgi/identify";

    /*****API FOR DEPT*****/
    public static final String API_DEPT_CREATE = "/cgi/dept/create";
    public static final String API_DEPT_UPDATE = "/cgi/dept/update";
    public static final String API_DEPT_DELETE = "/cgi/dept/delete";
    public static final String API_DEPT_GET = "/cgi/dept/get";
    public static final String API_DEPT_LISTCHILDREN = "/cgi/dept/listchildren";
    public static final String API_DEPT_LISTSELFANDCHILDREN = "/cgi/dept/list";
    public static final String API_DEPT_GETID = "/cgi/dept/getid";

    /*****API FOR USER*****/
    public static final String API_USER_CREATE = "/cgi/user/create";
    public static final String API_USER_UPDATE = "/cgi/user/update";
    public static final String API_USER_UPDATE_POSITION = "/cgi/user/positionupdate";
    public static final String API_USER_DELETE = "/cgi/user/delete";
    public static final String API_USER_DELETE_BATCH = "/cgi/user/batchdelete";
    public static final String API_USER_GET = "/cgi/user/get";
    public static final String API_USER_GET_DEPT = "/cgi/user/simplelist";
    public static final String API_USER_GET_DEPT_DETAIL = "/cgi/user/list";
    public static final String API_USER_SET_AUTH = "/cgi/user/setauth";

    /*****API FOR SESSION*****/
    public static final String API_SESSION_GET = "/cgi/session/get";
    public static final String API_SESSION_CREATE = "/cgi/session/create";
    public static final String API_SESSION_UPDATE = "/cgi/session/update";

    /*****API FOR SESSION MSG*****/
    public static final String API_SESSION_SEND_MSG = "/cgi/session/send";

    /*****API FOR GROUP*****/
    public static final String API_GROUP_CREATE = "/cgi/group/create";
    public static final String API_GROUP_DELETE = "/cgi/group/delete";
    public static final String API_GROUP_UPDATE = "/cgi/group/update";
    public static final String API_GROUP_INFO = "/cgi/group/info";
    public static final String API_GROUP_LIST = "/cgi/group/list";
    public static final String API_GROUP_ADDMEMBER = "/cgi/group/addmember";
    public static final String API_GROUP_DELMEMBER = "/cgi/group/delmember";
    public static final String API_GROUP_ISMEMBER = "/cgi/group/ismember";
}
