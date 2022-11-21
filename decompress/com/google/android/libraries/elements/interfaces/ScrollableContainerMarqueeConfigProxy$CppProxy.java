// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class ScrollableContainerMarqueeConfigProxy$CppProxy extends ScrollableContainerMarqueeConfigProxy
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ScrollableContainerMarqueeConfigProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native boolean native_alwaysScroll(final long p0);
    
    private native float native_delaySeconds(final long p0);
    
    private native long native_loopCount(final long p0);
    
    private native float native_marqueeSpacing(final long p0);
    
    private native ScrollableContainerMarqueeSpeedProxy native_marqueeSpeed(final long p0);
    
    private native MarqueeScrollDirection native_scrollDirection(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public boolean alwaysScroll() {
        return this.native_alwaysScroll(this.nativeRef);
    }
    
    @Override
    public float delaySeconds() {
        return this.native_delaySeconds(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public long loopCount() {
        return this.native_loopCount(this.nativeRef);
    }
    
    @Override
    public float marqueeSpacing() {
        return this.native_marqueeSpacing(this.nativeRef);
    }
    
    @Override
    public ScrollableContainerMarqueeSpeedProxy marqueeSpeed() {
        return this.native_marqueeSpeed(this.nativeRef);
    }
    
    @Override
    public MarqueeScrollDirection scrollDirection() {
        return this.native_scrollDirection(this.nativeRef);
    }
}
