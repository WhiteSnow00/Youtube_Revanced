// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

final class Transaction$CppProxy extends Transaction
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private Transaction$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native void native_abort(final long p0);
    
    private native void native_commit(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public void abort() {
        this.native_abort(this.nativeRef);
    }
    
    @Override
    public void commit() {
        this.native_commit(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
}
