// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import android.content.pm.PackageManager;

public class DaydreamUtils
{
    private static boolean sDaydreamPhoneOverrideForTesting;
    
    private static boolean canResolveIntent(final PackageManager packageManager, final ComponentName componentName, final Intent intent) {
        final List queryIntentActivities = packageManager.queryIntentActivities(intent, 128);
        if (queryIntentActivities != null) {
            for (final ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.name.equals(componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean checkHeadsetCompatibility(final PackageManager packageManager, final ComponentName componentName, final String s) {
        final Intent intent = new Intent();
        intent.setPackage(componentName.getPackageName());
        intent.addCategory(s);
        return canResolveIntent(packageManager, componentName, intent);
    }
    
    public static DaydreamCompatibility getComponentDaydreamCompatibility(final Context context, final ComponentName componentName) {
        return getComponentDaydreamCompatibility(context.getPackageManager(), componentName);
    }
    
    static DaydreamCompatibility getComponentDaydreamCompatibility(final PackageManager packageManager, final ComponentName componentName) {
        int checkHeadsetCompatibility;
        final boolean b = (checkHeadsetCompatibility = (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM") ? 1 : 0)) != 0;
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.CARDBOARD")) {
            checkHeadsetCompatibility = ((b ? 1 : 0) | 0x2);
        }
        int n = checkHeadsetCompatibility;
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM_CONTROLLER_OPTIONAL")) {
            n = (checkHeadsetCompatibility | 0x4);
        }
        return new DaydreamCompatibility(n);
    }
    
    public static String getDeviceParamsDisplayedName(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null) {
            Log.e("DaydreamUtils", "Null params in getDeviceParamsDisplayedName");
            return "";
        }
        return getDeviceParamsDisplayedName(cardboardDevice$DeviceParams.getVendor(), cardboardDevice$DeviceParams.getModel());
    }
    
    public static String getDeviceParamsDisplayedName(final String s, final String s2) {
        if (s != null && s2 != null) {
            if (!s.equals("Google, Inc.") && !s.equals("Google")) {
                return s2;
            }
            final int hashCode = s2.hashCode();
            int n = 0;
            Label_0084: {
                if (hashCode != -2120800987) {
                    if (hashCode == 1761541558) {
                        if (s2.equals("Cardboard")) {
                            n = 0;
                            break Label_0084;
                        }
                    }
                }
                else if (s2.equals("Cardboard v1")) {
                    n = 1;
                    break Label_0084;
                }
                n = -1;
            }
            if (n == 0) {
                return "Google Cardboard (I/O 2015)";
            }
            if (n != 1) {
                return s2;
            }
            return "Google Cardboard";
        }
        else {
            Log.e("DaydreamUtils", "Null vendor/model in getDeviceParamsDisplayedName");
            if (s2 != null) {
                return s2;
            }
            return "";
        }
    }
    
    public static boolean isDaydreamPhone(final Context context) {
        return DaydreamUtils.sDaydreamPhoneOverrideForTesting || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
    }
    
    public static boolean isDaydreamViewer(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        return cardboardDevice$DeviceParams != null && cardboardDevice$DeviceParams.hasDaydreamInternal();
    }
}
