// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

import com.google.mediapipe.framework.TextureReleaseCallback;
import java.util.Set;
import android.util.Pair;

public class Control
{
    public Control$BoolSetting a;
    public Control$FloatSetting b;
    public Control$GpuBufferSetting c;
    public Control$IntSetting d;
    public Control$RuntimeOptionsSetting e;
    public Control$StringSetting f;
    
    private Control(final Control$BoolSetting a, final Control$FloatSetting b, final Control$GpuBufferSetting c, final Control$IntSetting d, final Control$RuntimeOptionsSetting e, final Control$StringSetting f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private static native boolean nativeGetBoolValue(final long p0);
    
    public static native Pair nativeGetFloatRange(final long p0);
    
    public static native float nativeGetFloatValue(final long p0);
    
    public static native Pair nativeGetIntRange(final long p0);
    
    private static native int nativeGetIntValue(final long p0);
    
    private static native byte[] nativeGetRuntimeOptionsValue(final long p0);
    
    private static native Set nativeGetStringPossibleValues(final long p0);
    
    private static native String nativeGetStringValue(final long p0);
    
    public static native void nativeSetBoolValue(final long p0, final boolean p1);
    
    public static native void nativeSetFloatValue(final long p0, final float p1);
    
    public static native void nativeSetGpuBufferValue(final long p0, final int p1, final int p2, final int p3, final TextureReleaseCallback p4);
    
    public static native void nativeSetIntValue(final long p0, final int p1);
    
    public static native void nativeSetRuntimeOptionsValue(final long p0, final byte[] p1);
    
    public static native void nativeSetStringValue(final long p0, final String p1);
    
    public static native void nativeUnsetGpuBufferValue(final long p0);
}
