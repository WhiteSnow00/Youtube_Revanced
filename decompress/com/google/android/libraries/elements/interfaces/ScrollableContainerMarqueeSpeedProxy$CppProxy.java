// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class ScrollableContainerMarqueeSpeedProxy$CppProxy extends ScrollableContainerMarqueeSpeedProxy
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ScrollableContainerMarqueeSpeedProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native MarqueeSpeedCurveType native_marqueeSpeedCurveType(final long p0);
    
    private native long native_scrollSpeed(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public MarqueeSpeedCurveType marqueeSpeedCurveType() {
        return this.native_marqueeSpeedCurveType(this.nativeRef);
    }
    
    @Override
    public long scrollSpeed() {
        return this.native_scrollSpeed(this.nativeRef);
    }
}
