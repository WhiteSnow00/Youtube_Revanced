// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

final class ResponseHydration$CppProxy extends ResponseHydration
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ResponseHydration$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    public static native ResponseHydration create(final ResourceMetadataTracker p0, final CertificateTracker p1, final JSModuleBytesProvider p2);
    
    private native void nativeDestroy(final long p0);
    
    private native StatusOr native_rehydrateResponse(final long p0, final byte[] p1);
    
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
    public StatusOr rehydrateResponse(final byte[] array) {
        return this.native_rehydrateResponse(this.nativeRef, array);
    }
}
