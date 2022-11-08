// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class CellTypeProxy$CppProxy extends CellTypeProxy
{
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private CellTypeProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native long native_highlightedBackgroundColor(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    public long highlightedBackgroundColor() {
        return this.native_highlightedBackgroundColor(this.nativeRef);
    }
}
