package com.lingdian.dangjian.base;


import com.lingdian.dangjian.App;
import com.lingdian.dangjian.util.update.FileUtils;

public class Constant {

    //线上环境还是测试环境
    public static  boolean isOnline = false;

//    http://yanan.airwalker.net/pmc/mobile/findExperiences HTTP/1.1
    public static final String API_BASE_URL = isOnline ? "http://yadj.airwalker.net"
            : "http://yanan.airwalker.net";


    public static final String Image_Header = API_BASE_URL + "/pmc";


    //后端服务器请求成功返回字段 level = A
    public static String LEVEL_SUCCESS = "A";
    public static String LEVEL_LOGINOUT = "D";

    public static String BASE_PATH = FileUtils.createRootPath(App.getInstance()) + "/aixin/";
    public static String PATH_DATA = FileUtils.createRootPath(App.getInstance()) + "/cache";





}
