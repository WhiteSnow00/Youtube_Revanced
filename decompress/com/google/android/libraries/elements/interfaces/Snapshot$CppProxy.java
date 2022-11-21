// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class Snapshot$CppProxy extends Snapshot
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private Snapshot$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native long native_byteSize(final long p0);
    
    private native boolean native_contains(final long p0, final String p1);
    
    private native boolean native_empty(final long p0);
    
    private native boolean native_equals(final long p0, final Snapshot p1);
    
    private native byte[] native_find(final long p0, final String p1);
    
    private native byte[] native_findNoCopy(final long p0, final String p1);
    
    private native HashSet native_keys(final long p0);
    
    private native byte[] native_retrieveMetadata(final long p0, final String p1);
    
    private native long native_size(final long p0);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public long byteSize() {
        return this.native_byteSize(this.nativeRef);
    }
    
    @Override
    public boolean contains(final String s) {
        return this.native_contains(this.nativeRef, s);
    }
    
    @Override
    public boolean empty() {
        return this.native_empty(this.nativeRef);
    }
    
    @Override
    public boolean equals(final Snapshot snapshot) {
        return this.native_equals(this.nativeRef, snapshot);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public byte[] find(final String s) {
        return this.native_find(this.nativeRef, s);
    }
    
    @Override
    public byte[] findNoCopy(final String s) {
        return this.native_findNoCopy(this.nativeRef, s);
    }
    
    @Override
    public HashSet keys() {
        return this.native_keys(this.nativeRef);
    }
    
    @Override
    public byte[] retrieveMetadata(final String s) {
        return this.native_retrieveMetadata(this.nativeRef, s);
    }
    
    @Override
    public long size() {
        return this.native_size(this.nativeRef);
    }
}
