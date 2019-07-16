package com.bytesing.gradle;
public class Deps{
   private static final String kotlin_version = "1.3.30";
   private static final String gradle_version = "3.4.0";
   private static final String support_version = "27.1.1";

    public static final int compileSdkVersion = 28;
    public static final String buildToolsVersion = "28.0.3";
    public static final int minSdkVersion = 16;
    public static final int targetSdkVersion = 28;
    public static final int versionCode = 10001;
    public static final String versionName = "1.0.1";
    public static final String app_name = "AndX";

    public static final String kotlin_android = "kotlin-android";
    public static final String kotlin_android_es = "kotlin-android-extensions";

    public static final boolean isKotlinEnable = false;
    public static final String support_appcompat = "com.android.support:appcompat-v7:"+support_version;
    public static final String kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib::"+kotlin_version;

    public static final String gradlePlugin = "com.android.tools.build:gradle:3.4.0";
    public static final String kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:"+kotlin_version;
}