// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

public final class ContainerInstanceProxy extends ClientCreatorProxy
{
    public final long b;
    
    public ContainerInstanceProxy(final long b) {
        super(b);
        this.b = b;
    }
    
    private native byte[] nativeContainerDebugSnapshot(final long p0);
}
