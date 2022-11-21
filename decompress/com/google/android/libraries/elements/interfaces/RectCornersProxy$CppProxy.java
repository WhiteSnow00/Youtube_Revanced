// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class RectCornersProxy$CppProxy extends RectCornersProxy
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private RectCornersProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native boolean native_bottomEnd(final long p0);
    
    private native boolean native_bottomLeft(final long p0);
    
    private native boolean native_bottomRight(final long p0);
    
    private native boolean native_bottomStart(final long p0);
    
    private native boolean native_hasBottomEnd(final long p0);
    
    private native boolean native_hasBottomLeft(final long p0);
    
    private native boolean native_hasBottomRight(final long p0);
    
    private native boolean native_hasBottomStart(final long p0);
    
    private native boolean native_hasTopEnd(final long p0);
    
    private native boolean native_hasTopLeft(final long p0);
    
    private native boolean native_hasTopRight(final long p0);
    
    private native boolean native_hasTopStart(final long p0);
    
    private native boolean native_topEnd(final long p0);
    
    private native boolean native_topLeft(final long p0);
    
    private native boolean native_topRight(final long p0);
    
    private native boolean native_topStart(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public boolean bottomEnd() {
        return this.native_bottomEnd(this.nativeRef);
    }
    
    @Override
    public boolean bottomLeft() {
        return this.native_bottomLeft(this.nativeRef);
    }
    
    @Override
    public boolean bottomRight() {
        return this.native_bottomRight(this.nativeRef);
    }
    
    @Override
    public boolean bottomStart() {
        return this.native_bottomStart(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public boolean hasBottomEnd() {
        return this.native_hasBottomEnd(this.nativeRef);
    }
    
    @Override
    public boolean hasBottomLeft() {
        return this.native_hasBottomLeft(this.nativeRef);
    }
    
    @Override
    public boolean hasBottomRight() {
        return this.native_hasBottomRight(this.nativeRef);
    }
    
    @Override
    public boolean hasBottomStart() {
        return this.native_hasBottomStart(this.nativeRef);
    }
    
    @Override
    public boolean hasTopEnd() {
        return this.native_hasTopEnd(this.nativeRef);
    }
    
    @Override
    public boolean hasTopLeft() {
        return this.native_hasTopLeft(this.nativeRef);
    }
    
    @Override
    public boolean hasTopRight() {
        return this.native_hasTopRight(this.nativeRef);
    }
    
    @Override
    public boolean hasTopStart() {
        return this.native_hasTopStart(this.nativeRef);
    }
    
    @Override
    public boolean topEnd() {
        return this.native_topEnd(this.nativeRef);
    }
    
    @Override
    public boolean topLeft() {
        return this.native_topLeft(this.nativeRef);
    }
    
    @Override
    public boolean topRight() {
        return this.native_topRight(this.nativeRef);
    }
    
    @Override
    public boolean topStart() {
        return this.native_topStart(this.nativeRef);
    }
}
