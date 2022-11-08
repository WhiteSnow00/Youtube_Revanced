// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class BlocksContainerLoaderProxy$CppProxy extends BlocksContainerLoaderProxy
{
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private BlocksContainerLoaderProxy$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native Status native_loadContainerManifest(final long p0, final byte[] p1);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    public Status loadContainerManifest(final byte[] array) {
        return this.native_loadContainerManifest(this.nativeRef, array);
    }
}
