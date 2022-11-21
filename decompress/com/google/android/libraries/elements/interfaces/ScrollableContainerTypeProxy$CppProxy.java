// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class ScrollableContainerTypeProxy$CppProxy extends ScrollableContainerTypeProxy
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ScrollableContainerTypeProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native PointProxy native_contentOffset(final long p0);
    
    private native SizeProxy native_contentSize(final long p0);
    
    private native ScrollableContainerTypeDirection native_direction(final long p0);
    
    private native ScrollableContainerMarqueeConfigProxy native_marqueeConfig(final long p0);
    
    private native ScrollableContainerTypeOverscrollMode native_overscrollMode(final long p0);
    
    private native boolean native_showHorizontalIndicator(final long p0);
    
    private native boolean native_showVerticalIndicator(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public PointProxy contentOffset() {
        return this.native_contentOffset(this.nativeRef);
    }
    
    @Override
    public SizeProxy contentSize() {
        return this.native_contentSize(this.nativeRef);
    }
    
    @Override
    public ScrollableContainerTypeDirection direction() {
        return this.native_direction(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public ScrollableContainerMarqueeConfigProxy marqueeConfig() {
        return this.native_marqueeConfig(this.nativeRef);
    }
    
    @Override
    public ScrollableContainerTypeOverscrollMode overscrollMode() {
        return this.native_overscrollMode(this.nativeRef);
    }
    
    @Override
    public boolean showHorizontalIndicator() {
        return this.native_showHorizontalIndicator(this.nativeRef);
    }
    
    @Override
    public boolean showVerticalIndicator() {
        return this.native_showVerticalIndicator(this.nativeRef);
    }
}
