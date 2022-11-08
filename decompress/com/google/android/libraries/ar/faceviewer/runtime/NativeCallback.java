// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.ar.faceviewer.runtime;

import java.io.FileNotFoundException;

public final class NativeCallback
{
    public static final afik a;
    private final nyh b;
    private final phq c;
    
    static {
        a = afik.m("com/google/android/libraries/ar/faceviewer/runtime/NativeCallback");
    }
    
    private NativeCallback(final phq c, final nyh b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
    }
    
    public static NativeCallback a(final phq phq) {
        return new NativeCallback(phq, (nyh)nyi.b, null, null, null, null);
    }
    
    public static NativeCallback b(final phq phq, final nyh nyh) {
        return new NativeCallback(phq, nyh, null, null, null, null);
    }
    
    public void setNativeHandle(final long n) {
        this.c.t(this.b.a(n));
    }
    
    public void setStatus(final int n, final String s) {
        Exception ex;
        if (n != 0) {
            if (n != 3) {
                if (n != 5) {
                    if (n != 11) {
                        if (n != 12) {
                            ex = new IllegalStateException(s);
                        }
                        else {
                            ex = new UnsupportedOperationException(s);
                        }
                    }
                    else {
                        ex = new IndexOutOfBoundsException(s);
                    }
                }
                else {
                    ex = new FileNotFoundException(s);
                }
            }
            else {
                ex = new IllegalArgumentException(s);
            }
        }
        else {
            ex = null;
        }
        if (ex == null) {
            this.c.t((Object)null);
            return;
        }
        ((acb)this.c.b).d(ex);
    }
}
