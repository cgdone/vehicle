package com.tyys.vehicle;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/*
 * MD5 算法
*/
public class md5 {
    
    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
    
    public md5() {
    }

    // 返回形式为数字跟字符串
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
         if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    // 返回形式只为数字
/*    private static String byteToNum(byte bByte) {
        int iRet = bByte;
        System.out.println("iRet1=" + iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }*/

    // 转换字节数组为16进制字串
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }
    
   
    public static String Getmd5(String strObj) {
        
        // 序列号长度不得低于5位
        if (strObj.length() < 1)
        	return "*";
        
        String str1 = strObj + "TYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CN";
        String str2 = str1.substring(0,64);
        String str3 = GetMD5Code(str2);
        
        //String strAp = "tyys-" + str3.substring(0,4) + "-" +  str3.substring(4,8);
        //String strPwd = "ty*"+ str3.substring(24,28) + "*" + str3.substring(28,32) +"*";
   
        return str3;
    }
    
    public static String GetAP(String strObj) {
        
        // 序列号长度不得低于5位
        if (strObj.length() < 1)
        	return "*";
        
        String str1 = strObj + "TYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CN";
        String str2 = str1.substring(0,64);
        String str3 = GetMD5Code(str2);
        
        String strAp = "tyys-" + str3.substring(0,4) + "-" +  str3.substring(4,8);
        //String strPwd = "ty*"+ str3.substring(24,28) + "*" + str3.substring(28,32) +"*";
   
        return strAp;
    }
    
    public static String GetPassword(String strObj) {
               
        // 序列号长度不得低于5位
        if (strObj.length() < 1)
        	return "*";
        
        String str1 = strObj + "TYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CNTYYS168.CN";
        String str2 = str1.substring(0,64);
        String str3 = GetMD5Code(str2);
        
        //String strAp = "tyys-" + str3.substring(0,4) + "-" +  str3.substring(4,8);
        String strPwd = "ty*"+ str3.substring(24,28) + "*" + str3.substring(28,32) +"*";        
  
        return strPwd;
    }

    public static void main(String[] args) {
    	
        String str1 = "abc";
        System.out.println("sn:"+ str1);
        System.out.println("md5:"+ md5.Getmd5(str1));
        System.out.println(md5.GetAP(str1));
        System.out.println(md5.GetPassword(str1));
        
      
        str1 = "123345";
        System.out.println("sn:"+ str1);
        System.out.println("md5:"+ md5.Getmd5(str1));
        System.out.println(md5.GetAP(str1));
        System.out.println(md5.GetPassword(str1));
        
        str1 = "!^#abcdefghjk";
        System.out.println("sn: "+ str1);
        System.out.println("md5:"+ md5.Getmd5(str1));
        System.out.println(md5.GetAP(str1));
        System.out.println(md5.GetPassword(str1));
    }
}