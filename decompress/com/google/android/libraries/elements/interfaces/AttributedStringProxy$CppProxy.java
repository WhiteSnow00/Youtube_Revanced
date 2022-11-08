// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class AttributedStringProxy$CppProxy extends AttributedStringProxy
{
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private AttributedStringProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native TextAlignment native_alignment(final long p0);
    
    private native boolean native_androidIncludeFontPadding(final long p0);
    
    private native String native_content(final long p0);
    
    private native LineBreakMode native_lineBreakMode(final long p0);
    
    private native float native_lineSpacing(final long p0);
    
    private native TruncationMode native_truncationMode(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    public TextAlignment alignment() {
        return this.native_alignment(this.nativeRef);
    }
    
    public boolean androidIncludeFontPadding() {
        return this.native_androidIncludeFontPadding(this.nativeRef);
    }
    
    public String content() {
        return this.native_content(this.nativeRef);
    }
    
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    public LineBreakMode lineBreakMode() {
        return this.native_lineBreakMode(this.nativeRef);
    }
    
    public float lineSpacing() {
        return this.native_lineSpacing(this.nativeRef);
    }
    
    public TruncationMode truncationMode() {
        return this.native_truncationMode(this.nativeRef);
    }
}
