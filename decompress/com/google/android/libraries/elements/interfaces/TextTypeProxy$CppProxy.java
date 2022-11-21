// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class TextTypeProxy$CppProxy extends TextTypeProxy
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private TextTypeProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native AttributedStringProxy native_additionalTruncationText(final long p0);
    
    private native int native_maxLines(final long p0);
    
    private native AttributedStringProxy native_text(final long p0);
    
    private native AttributedStringProxy native_truncationText(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public AttributedStringProxy additionalTruncationText() {
        return this.native_additionalTruncationText(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public int maxLines() {
        return this.native_maxLines(this.nativeRef);
    }
    
    @Override
    public AttributedStringProxy text() {
        return this.native_text(this.nativeRef);
    }
    
    @Override
    public AttributedStringProxy truncationText() {
        return this.native_truncationText(this.nativeRef);
    }
}
