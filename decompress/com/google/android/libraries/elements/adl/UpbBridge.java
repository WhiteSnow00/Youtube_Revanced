// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.adl;

public final class UpbBridge
{
    private static final UpbBridge a;
    private final long b;
    
    static {
        a = new UpbBridge();
    }
    
    private UpbBridge() {
        this.b = this.jniNewInstance();
    }
    
    private native long jniCreateMessage(final long p0, final long p1);
    
    private native void jniDeleteInstance(final long p0);
    
    private native long jniGetOrCreateEnumMiniTable(final long p0, final String p1);
    
    private native long jniNewInstance();
    
    private native long jniRegisterMiniTable(final long p0, final String p1);
    
    private native void jniRegisterMiniTableLinks(final long p0, final long p1, final long[] p2);
    
    @Override
    protected final void finalize() {
        this.jniDeleteInstance(this.b);
        super.finalize();
    }
}
