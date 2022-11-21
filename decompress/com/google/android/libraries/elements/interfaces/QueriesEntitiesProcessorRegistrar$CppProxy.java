// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import com.google.android.libraries.blocks.Container;
import java.util.concurrent.atomic.AtomicBoolean;

final class QueriesEntitiesProcessorRegistrar$CppProxy extends QueriesEntitiesProcessorRegistrar
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private QueriesEntitiesProcessorRegistrar$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    public static native StatusOr create(final Container p0, final byte[] p1);
    
    private native void nativeDestroy(final long p0);
    
    private native void native_registerProcessors(final long p0, final EntitiesProcessorResolver p1);
    
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
    public void registerProcessors(final EntitiesProcessorResolver entitiesProcessorResolver) {
        this.native_registerProcessors(this.nativeRef, entitiesProcessorResolver);
    }
}
