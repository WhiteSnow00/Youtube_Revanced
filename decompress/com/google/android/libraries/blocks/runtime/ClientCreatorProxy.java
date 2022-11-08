// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

public class ClientCreatorProxy
{
    public final long a;
    
    public ClientCreatorProxy(final long a) {
        this.a = a;
    }
    
    private native long nativeCreateConcreteBlock(final long p0, final int p1, final InstanceProxy p2);
    
    private native long nativeCreateFromSharedRef(final long p0, final String p1);
    
    private native long nativeCreateInstanceContext(final long p0, final int p1);
    
    private native void nativeDelete(final long p0);
    
    public final long a(final int n, final InstanceProxy instanceProxy) {
        return this.nativeCreateConcreteBlock(this.a, n, instanceProxy);
    }
    
    public final long b(final int n) {
        return this.nativeCreateInstanceContext(this.a, n);
    }
    
    @Override
    protected final void finalize() {
        this.nativeDelete(this.a);
    }
    
    public native long nativeCreateBlock(final long p0, final int p1);
    
    public native long nativeCreateFromMovableRef(final long p0, final String p1);
}
