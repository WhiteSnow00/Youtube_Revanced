// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class SecurityVerifier$CppProxy extends SecurityVerifier
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private SecurityVerifier$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native Status native_verify(final long p0, final ResourceEntry p1);
    
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
    public Status verify(final ResourceEntry resourceEntry) {
        return this.native_verify(this.nativeRef, resourceEntry);
    }
}
