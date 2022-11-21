// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class StylePropertiesProxy$CppProxy extends StylePropertiesProxy
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private StylePropertiesProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native long native_backgroundColor(final long p0);
    
    private native long native_borderColor(final long p0);
    
    private native float native_borderRadius(final long p0);
    
    private native RectCornersProxy native_borderRadiusCorners(final long p0);
    
    private native float native_borderWidth(final long p0);
    
    private native boolean native_clipBounds(final long p0);
    
    private native boolean native_hasBackgroundColor(final long p0);
    
    private native boolean native_hasBorderColor(final long p0);
    
    private native boolean native_hasBorderRadius(final long p0);
    
    private native boolean native_hasBorderWidth(final long p0);
    
    private native boolean native_hasClipBounds(final long p0);
    
    private native boolean native_hasOpacity(final long p0);
    
    private native boolean native_hasRotation(final long p0);
    
    private native boolean native_hasScale(final long p0);
    
    private native float native_opacity(final long p0);
    
    private native float native_rotation(final long p0);
    
    private native float native_scale(final long p0);
    
    private native PointProxy native_translation(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public long backgroundColor() {
        return this.native_backgroundColor(this.nativeRef);
    }
    
    @Override
    public long borderColor() {
        return this.native_borderColor(this.nativeRef);
    }
    
    @Override
    public float borderRadius() {
        return this.native_borderRadius(this.nativeRef);
    }
    
    @Override
    public RectCornersProxy borderRadiusCorners() {
        return this.native_borderRadiusCorners(this.nativeRef);
    }
    
    @Override
    public float borderWidth() {
        return this.native_borderWidth(this.nativeRef);
    }
    
    @Override
    public boolean clipBounds() {
        return this.native_clipBounds(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public boolean hasBackgroundColor() {
        return this.native_hasBackgroundColor(this.nativeRef);
    }
    
    @Override
    public boolean hasBorderColor() {
        return this.native_hasBorderColor(this.nativeRef);
    }
    
    @Override
    public boolean hasBorderRadius() {
        return this.native_hasBorderRadius(this.nativeRef);
    }
    
    @Override
    public boolean hasBorderWidth() {
        return this.native_hasBorderWidth(this.nativeRef);
    }
    
    @Override
    public boolean hasClipBounds() {
        return this.native_hasClipBounds(this.nativeRef);
    }
    
    @Override
    public boolean hasOpacity() {
        return this.native_hasOpacity(this.nativeRef);
    }
    
    @Override
    public boolean hasRotation() {
        return this.native_hasRotation(this.nativeRef);
    }
    
    @Override
    public boolean hasScale() {
        return this.native_hasScale(this.nativeRef);
    }
    
    @Override
    public float opacity() {
        return this.native_opacity(this.nativeRef);
    }
    
    @Override
    public float rotation() {
        return this.native_rotation(this.nativeRef);
    }
    
    @Override
    public float scale() {
        return this.native_scale(this.nativeRef);
    }
    
    @Override
    public PointProxy translation() {
        return this.native_translation(this.nativeRef);
    }
}
