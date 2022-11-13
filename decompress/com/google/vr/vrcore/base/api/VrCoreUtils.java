// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.base.api;

import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.List;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInstaller$SessionInfo;
import android.util.Log;
import android.content.pm.Signature;
import android.content.Context;

public final class VrCoreUtils
{
    public static int a(final Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            return 0;
        }
        try {
            if (context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 0).enabled) {
                final PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
                if (!ardb.a(packageInfo, new Signature[] { ardb.a })) {
                    boolean b;
                    if (aqsx.b != null) {
                        b = aqsx.b;
                    }
                    else {
                        b = aqsx.n(context);
                    }
                    if (!b || !ardb.a(packageInfo, new Signature[] { ardb.b })) {
                        return 9;
                    }
                }
                return 0;
            }
            return 2;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            List allSessions;
            try {
                allSessions = context.getPackageManager().getPackageInstaller().getAllSessions();
            }
            catch (final RuntimeException ex2) {
                Log.w("VrCoreUtils", "Failure querying package installer sessions: ".concat(ex2.toString()));
                allSessions = null;
            }
            if (allSessions != null) {
                final Iterator iterator = allSessions.iterator();
                while (iterator.hasNext()) {
                    if ("com.google.vr.vrcore".equals(((PackageInstaller$SessionInfo)iterator.next()).getAppPackageName())) {
                        return 3;
                    }
                }
            }
            final PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.getApplicationInfo("com.google.vr.vrcore", 8192).enabled) {
                    return 3;
                }
                return 1;
            }
            catch (final PackageManager$NameNotFoundException ex3) {}
        }
    }
    
    public static int getVrCoreClientApiVersion(final Context context) {
        try {
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (applicationInfo.enabled) {
                final Bundle metaData = applicationInfo.metaData;
                int int1 = 0;
                if (metaData != null) {
                    int1 = applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
                }
                return int1;
            }
            throw new ardc(2);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new ardc(a(context));
        }
    }
}
