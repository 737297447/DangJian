package com.lingdian.dangjian.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

import com.lingdian.dangjian.ui.bean.User;

import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

/**
 * 缓存工具类
 */
public class SPUtils {

    public static final String IS_SPLASH = "isSplash"; // 是否跳过了引导页
    public static final String IS_ONLE = "isOnle"; // 是否是线上线下

    public static final String PREFERNCE_FILE_NAME = "xiaorong"; // 缓存文件名
    public static final String USER = "user"; // 缓存登录信息




    /**
     * 认证界面跳转到个人中心还是首页
     *  1.MainActivity,2.PeopleCenterActivity
     */
    public static final String RENZHENG_INTENT = "RENZHENG_INTENT";


    /**
     * 第一次进入高级认证弹出
     */
    public static final String ISFIRST_HIGH = "ISFIRST_HIGH";


    public static void setOnLine(Context context,boolean isOnline) {
        SharedPreferences prefe = context.getSharedPreferences(IS_ONLE, 0);
        Editor editor = prefe.edit();
        editor.putBoolean("changeOnline", isOnline);
        editor.commit();
    }

    public static boolean isOnLine(Context context) {
        SharedPreferences prefe = context.getSharedPreferences(IS_ONLE, 0);
        boolean b = prefe.getBoolean("changeOnline", true);
        return b;
    }




    public static void setFisrt(Context context) {
        SharedPreferences prefe = context.getSharedPreferences(IS_SPLASH, 0);
        Editor editor = prefe.edit();
        editor.putBoolean("isSplash", false);
        editor.commit();
    }

    public static boolean isFirst(Context context) {
        SharedPreferences prefe = context.getSharedPreferences(IS_SPLASH, 0);
        boolean b = prefe.getBoolean("isSplash", true);
        return b;
    }


    public static void setHighFisrt(Context context) {
        SharedPreferences prefe = context.getSharedPreferences(ISFIRST_HIGH, 0);
        Editor editor = prefe.edit();
        editor.putBoolean("isHigh", false);
        editor.commit();
    }

    public static boolean isHighFirst(Context context) {
        SharedPreferences prefe = context.getSharedPreferences(ISFIRST_HIGH, 0);
        boolean b = prefe.getBoolean("isHigh", true);
        return b;
    }





    /**
     * 寸公告
     * @param context
     */
    public static void setUser(Context context, User user) {
        saveObj(context, user, USER);
    }
    public static User getUser(Context context) {
        return (User) readObj(context, USER);
    }







    /**
     * 清除某个key对应的缓存
     *
     * @param key
     * @param context
     */
    public static void clearByKey(String key, Context context) {
        SharedPreferences prefe = context.getSharedPreferences(PREFERNCE_FILE_NAME, 0);
        Editor editor = prefe.edit();
        editor.putString(key, "");
        editor.commit();
    }

    /**
     * 读取一个对象
     *
     * @param context
     * @return
     */
    public static Object readObj(Context context, String key) {
        Object obj = null;
        SharedPreferences prefe = context.getSharedPreferences(PREFERNCE_FILE_NAME, 0);
        String replysBase64 = prefe.getString(key, "");
        if (TextUtils.isEmpty(replysBase64)) {
            return obj;
        }
        // 读取字节
        byte[] base64 = Base64.decodeBase64(replysBase64.getBytes());
        // 封装到字节读取流
        ByteArrayInputStream bais = new ByteArrayInputStream(base64);
        try {
            // 封装到对象读取流
            ObjectInputStream ois = new ObjectInputStream(bais);
            try {
                // 读取对象
                obj = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (StreamCorruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     * 存储一个对象
     *
     * @param context
     * @param key
     */
    public static <T> void saveObj(Context context, T obj, String key) {
        T _obj = obj;

        SharedPreferences prefe = context.getSharedPreferences(PREFERNCE_FILE_NAME, 0);
        // 创建字节输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            // 创建对象输出流,封装字节流
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            // 将对象写入字节流
            oos.writeObject(_obj);
            // 将字节流编码成base64的字符串
            String list_base64 = new String(Base64.encodeBase64(baos.toByteArray()));
            Editor editor = prefe.edit();
            editor.putString(key, list_base64);
            editor.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
