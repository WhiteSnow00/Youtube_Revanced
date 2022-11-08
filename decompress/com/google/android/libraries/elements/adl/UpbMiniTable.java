// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.adl;

public final class UpbMiniTable
{
    private native void jniDeleteInstance(final long p0);
    
    @Override
    protected final void finalize() {
        this.jniDeleteInstance(0L);
        super.finalize();
    }
}
