// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.filters.renderer.client.common;

public final class QosContainerRegistrar
{
    public boolean a;
    public final noj b;
    public final med c;
    public final aefs d;
    public final aefs e;
    
    public QosContainerRegistrar(final noj b, final med c, final aefs e, final aefs d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = false;
        this.c = c;
        this.e = e;
        this.d = d;
        this.b = b;
    }
    
    public static native void registerNative();
    
    private static native void unregisterNative();
}
