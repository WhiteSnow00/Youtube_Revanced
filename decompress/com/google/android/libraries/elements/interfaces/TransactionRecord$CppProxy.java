// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class TransactionRecord$CppProxy extends TransactionRecord
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private TransactionRecord$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native Snapshot native_beginState(final long p0);
    
    private native Snapshot native_endState(final long p0);
    
    private native HashSet native_keys(final long p0);
    
    private native ArrayList native_keysOrdered(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public Snapshot beginState() {
        return this.native_beginState(this.nativeRef);
    }
    
    @Override
    public Snapshot endState() {
        return this.native_endState(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public HashSet keys() {
        return this.native_keys(this.nativeRef);
    }
    
    @Override
    public ArrayList keysOrdered() {
        return this.native_keysOrdered(this.nativeRef);
    }
}
