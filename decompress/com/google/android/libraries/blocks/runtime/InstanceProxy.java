// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

import com.google.common.util.concurrent.ListenableFuture;

public abstract class InstanceProxy
{
    protected InstanceProxy() {
    }
    
    public abstract ListenableFuture a(final int p0, final byte[] p1);
    
    public abstract void b(final int p0, final long p1, final byte[] p2);
    
    public abstract void c();
    
    public abstract boolean d(final int p0);
    
    public abstract byte[] e(final int p0, final byte[] p1);
    
    public abstract void f(final int p0);
    
    public abstract ListenableFuture g(final int p0);
}
