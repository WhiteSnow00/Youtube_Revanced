// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

public final class RuntimeStreamReader implements AutoCloseable
{
    public final long a;
    public final obt b;
    
    public RuntimeStreamReader(final long a, final ahdd ahdd) {
        this.a = a;
        this.b = new obt(ahdd);
    }
    
    private native void nativeDelete(final long p0);
    
    private native void nativeReadsDone(final long p0);
    
    private native void nativeReadsDoneWithError(final long p0, final byte[] p1);
    
    @Override
    public final void close() {
        this.nativeReadsDone(this.a);
    }
    
    @Override
    protected final void finalize() {
        this.nativeDelete(this.a);
    }
    
    public native void nativeSetReader(final long p0, final ReaderProxy p1);
}
