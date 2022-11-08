// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.hwcodec;

import java.nio.ByteBuffer;

abstract class NativeBitstreamParser implements arcd
{
    private final long a;
    private boolean b;
    
    public NativeBitstreamParser() {
        this.b = false;
        this.a = this.nativeCreate();
    }
    
    private static native void nativeFree(final long p0);
    
    private static native BitstreamParser$BitstreamInfo nativeParse(final long p0, final ByteBuffer p1);
    
    public final BitstreamParser$BitstreamInfo a(final ByteBuffer byteBuffer) {
        if (!this.b) {
            return nativeParse(this.a, byteBuffer);
        }
        throw new IllegalStateException("Already disposed.");
    }
    
    public final void b() {
        if (!this.b) {
            nativeFree(this.a);
            this.b = true;
            return;
        }
        throw new IllegalStateException("Already disposed.");
    }
    
    protected abstract long nativeCreate();
}
