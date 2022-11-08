// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.ndk.base.SdkConfigurationReader;
import android.view.Display;
import com.google.vr.sdk.proto.Display$DisplayParams;
import android.content.res.Resources;
import android.util.Log;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.content.Context;
import android.util.DisplayMetrics;

public class VrParamsProviderJni
{
    private static void a(final long n, final DisplayMetrics displayMetrics, final float n2, final int n3) {
        nativeUpdateNativeDisplayParamsPointer(n, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, n2, n3);
    }
    
    private static native void nativeUpdateNativeDisplayParamsPointer(final long p0, final int p1, final int p2, final float p3, final float p4, final float p5, final int p6);
    
    private static byte[] readDeviceParams(final Context context) {
        final aral o = aqql.o(context);
        final CardboardDevice$DeviceParams b = o.b();
        o.f();
        if (b == null) {
            return null;
        }
        return ((agxl)b).toByteArray();
    }
    
    private static void readDisplayParams(final Context context, final long n) {
        int n2 = 0;
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            a(n, Resources.getSystem().getDisplayMetrics(), aqzg.n((Display$DisplayParams)null), 0);
            return;
        }
        final aral o = aqql.o(context);
        final Display$DisplayParams d = o.d();
        o.f();
        final Display r = aqzg.r(context);
        final DisplayMetrics q = aqzg.q(r, d);
        final float n3 = aqzg.n(d);
        final aqzf f = aqzg.f(r);
        if (f != null) {
            int n4;
            int n5;
            if (context.getResources().getConfiguration().orientation == 1) {
                n4 = f.d();
                n5 = f.a();
            }
            else {
                n4 = f.b();
                n5 = f.c();
            }
            n2 = n5 + n4;
        }
        a(n, q, n3, n2);
    }
    
    private static byte[] readSdkConfigurationParams(final Context context) {
        return ((agxl)SdkConfigurationReader.getParams(context)).toByteArray();
    }
    
    private static byte[] readUserPrefs(final Context context) {
        final aral o = aqql.o(context);
        final Preferences$UserPrefs e = o.e();
        o.f();
        if (e == null) {
            return null;
        }
        return ((agxl)e).toByteArray();
    }
    
    private static boolean writeDeviceParams(final Context context, final byte[] array) {
        final aral o = aqql.o(context);
        Label_0028: {
            if (array == null) {
                break Label_0028;
            }
            try {
                try {
                    CardboardDevice$DeviceParams.parseFrom(array, ExtensionRegistryLite.getGeneratedRegistry());
                }
                finally {}
            }
            catch (final ahab ahab) {
                final String string = ahab.toString();
                final StringBuilder sb = new StringBuilder("Error parsing protocol buffer: ");
                sb.append(string);
                Log.w("VrParamsProviderJni", sb.toString());
                o.f();
                return false;
                while (true) {
                    final CardboardDevice$DeviceParams cardboardDevice$DeviceParams;
                    final boolean g = o.g(cardboardDevice$DeviceParams);
                    o.f();
                    return g;
                    cardboardDevice$DeviceParams = null;
                    continue;
                }
            }
        }
        o.f();
    }
}
