// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

public final class JavaRuntime
{
    public static final JavaRuntime a;
    
    static {
        a = new JavaRuntime();
    }
    
    private JavaRuntime() {
    }
    
    private native void nativeRegisterContainerManifest(final byte[] p0);
    
    public final void a(final int n, final int n2, final oam oam) {
        this.nativeRegister(n, n2, (JavaRuntime$NativeInstanceProxyCreator)new oal(oam));
    }
    
    public final void b(final apxw apxw) {
        this.nativeRegisterContainerManifest(((agxl)apxw).toByteArray());
    }
    
    public native void nativeRegister(final int p0, final int p1, final JavaRuntime$NativeInstanceProxyCreator p2);
}
