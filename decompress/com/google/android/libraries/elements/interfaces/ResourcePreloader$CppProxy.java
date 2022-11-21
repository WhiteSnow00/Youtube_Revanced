// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class ResourcePreloader$CppProxy extends ResourcePreloader
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ResourcePreloader$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native Status native_ensureLoaded(final long p0, final HashSet p1, final ProcessState p2, final ErrorPolicy p3, final Long p4);
    
    private native Status native_loadAll(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public Status ensureLoaded(final HashSet set, final ProcessState processState, final ErrorPolicy errorPolicy, final Long n) {
        return this.native_ensureLoaded(this.nativeRef, set, processState, errorPolicy, n);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public Status loadAll() {
        return this.native_loadAll(this.nativeRef);
    }
}
