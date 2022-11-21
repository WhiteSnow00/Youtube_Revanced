// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class PublicKeyVerifier$CppProxy extends PublicKeyVerifier
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private PublicKeyVerifier$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native Status native_initialize(final long p0, final String p1, final byte[] p2, final byte[] p3);
    
    private native Status native_verify(final long p0, final byte[] p1, final byte[] p2);
    
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
    public Status initialize(final String s, final byte[] array, final byte[] array2) {
        return this.native_initialize(this.nativeRef, s, array, array2);
    }
    
    @Override
    public Status verify(final byte[] array, final byte[] array2) {
        return this.native_verify(this.nativeRef, array, array2);
    }
}
