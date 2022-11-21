// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.TreeSet;
import io.grpc.Status;
import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

final class ResourceLoader$CppProxy extends ResourceLoader
{
    static final boolean $assertionsDisabled = false;
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ResourceLoader$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    public static native StatusOr create(final ControllerModuleLoader p0, final BlocksContainerLoaderProxy p1, final PublicKeyVerifierProvider p2, final ResourceLoaderDelegate p3, final ResourceLoaderConfig p4);
    
    public static native StatusOr createWithCache(final ControllerModuleLoader p0, final BlocksContainerLoaderProxy p1, final PublicKeyVerifierProvider p2, final ResourceLoaderDelegate p3, final CacheStrategyDelegate p4, final ResourceLoaderConfig p5);
    
    public static native ResourceLoader createWithDefaultConfig(final ControllerModuleLoader p0, final PublicKeyVerifierProvider p1, final ResourceLoaderDelegate p2);
    
    public static native ResourceLoader createWithDefaultConfigWithBlocks(final ControllerModuleLoader p0, final BlocksContainerLoaderProxy p1, final PublicKeyVerifierProvider p2, final ResourceLoaderDelegate p3);
    
    private native void nativeDestroy(final long p0);
    
    private native Status native_cacheResources(final long p0);
    
    private native Status native_commitCachedTrackableResources(final long p0);
    
    private native CertificateTracker native_getCertificateTracker(final long p0);
    
    private native ResourceMetadataTracker native_getMetadataTracker(final long p0);
    
    private native ResourcePreloader native_getPreloader(final long p0);
    
    private native Status native_handleOmittedResources(final long p0, final TreeSet p1);
    
    private native Status native_handleResources(final long p0, final ArrayList p1);
    
    private native boolean native_isCacheValid(final long p0);
    
    private native void native_registerMissingResourceHandler(final long p0, final MissingResourceHandler p1);
    
    private native void native_registerVerifier(final long p0, final String p1, final StatusOr p2);
    
    private native void native_updateResourceStatus(final long p0, final ResourceCheck p1);
    
    private native Status native_updateResources(final long p0, final ArrayList p1, final ResourceLoaderCallback p2);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    public Status cacheResources() {
        return this.native_cacheResources(this.nativeRef);
    }
    
    @Override
    public Status commitCachedTrackableResources() {
        return this.native_commitCachedTrackableResources(this.nativeRef);
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    @Override
    public CertificateTracker getCertificateTracker() {
        return this.native_getCertificateTracker(this.nativeRef);
    }
    
    @Override
    public ResourceMetadataTracker getMetadataTracker() {
        return this.native_getMetadataTracker(this.nativeRef);
    }
    
    @Override
    public ResourcePreloader getPreloader() {
        return this.native_getPreloader(this.nativeRef);
    }
    
    @Override
    public Status handleOmittedResources(final TreeSet set) {
        return this.native_handleOmittedResources(this.nativeRef, set);
    }
    
    @Override
    public Status handleResources(final ArrayList list) {
        return this.native_handleResources(this.nativeRef, list);
    }
    
    @Override
    public boolean isCacheValid() {
        return this.native_isCacheValid(this.nativeRef);
    }
    
    @Override
    public void registerMissingResourceHandler(final MissingResourceHandler missingResourceHandler) {
        this.native_registerMissingResourceHandler(this.nativeRef, missingResourceHandler);
    }
    
    @Override
    public void registerVerifier(final String s, final StatusOr statusOr) {
        this.native_registerVerifier(this.nativeRef, s, statusOr);
    }
    
    @Override
    public void updateResourceStatus(final ResourceCheck resourceCheck) {
        this.native_updateResourceStatus(this.nativeRef, resourceCheck);
    }
    
    @Override
    public Status updateResources(final ArrayList list, final ResourceLoaderCallback resourceLoaderCallback) {
        return this.native_updateResources(this.nativeRef, list, resourceLoaderCallback);
    }
}
