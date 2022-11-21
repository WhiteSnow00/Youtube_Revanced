// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class ResourceLoaderCallback$CppProxy extends ResourceLoaderCallback
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ResourceLoaderCallback$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native void native_resourcesProcessed(final long p0, final ValidationResult p1, final Status p2);
    
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
    public void resourcesProcessed(final ValidationResult validationResult, final Status status) {
        this.native_resourcesProcessed(this.nativeRef, validationResult, status);
    }
}
