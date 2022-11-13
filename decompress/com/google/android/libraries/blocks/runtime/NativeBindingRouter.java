// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

public final class NativeBindingRouter
{
    public static final NativeBindingRouter a;
    
    static {
        a = new NativeBindingRouter();
    }
    
    private NativeBindingRouter() {
    }
    
    private native byte[] nativeCallRootBinding(final byte[] p0);
    
    private native long nativeCreateContainerBinding(final int p0, final byte[] p1);
    
    public final long a(final int n, final aqae aqae) {
        return this.nativeCreateContainerBinding(n, ((agzk)aqae).toByteArray());
    }
}
