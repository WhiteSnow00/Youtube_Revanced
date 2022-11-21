// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class ResourceMetadataTracker$CppProxy extends ResourceMetadataTracker
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ResourceMetadataTracker$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    private native void nativeDestroy(final long p0);
    
    private native void native_addMetadata(final long p0, final ResourceMetadata p1);
    
    private native ResourceMetadata native_getResourceMetadata(final long p0, final String p1);
    
    private native TreeSet native_getTransitiveDeps(final long p0, final TreeSet p1);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public void addMetadata(final ResourceMetadata resourceMetadata) {
        this.native_addMetadata(this.nativeRef, resourceMetadata);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public ResourceMetadata getResourceMetadata(final String s) {
        return this.native_getResourceMetadata(this.nativeRef, s);
    }
    
    @Override
    public TreeSet getTransitiveDeps(final TreeSet set) {
        return this.native_getTransitiveDeps(this.nativeRef, set);
    }
}
