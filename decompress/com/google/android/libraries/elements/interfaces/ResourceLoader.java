// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.TreeSet;
import io.grpc.Status;
import com.youtube.android.libraries.elements.StatusOr;

public abstract class ResourceLoader
{
    public static StatusOr create(final ControllerModuleLoader controllerModuleLoader, final BlocksContainerLoaderProxy blocksContainerLoaderProxy, final PublicKeyVerifierProvider publicKeyVerifierProvider, final ResourceLoaderDelegate resourceLoaderDelegate, final ResourceLoaderConfig resourceLoaderConfig) {
        return ResourceLoader$CppProxy.create(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, resourceLoaderConfig);
    }
    
    public static StatusOr createWithCache(final ControllerModuleLoader controllerModuleLoader, final BlocksContainerLoaderProxy blocksContainerLoaderProxy, final PublicKeyVerifierProvider publicKeyVerifierProvider, final ResourceLoaderDelegate resourceLoaderDelegate, final CacheStrategyDelegate cacheStrategyDelegate, final ResourceLoaderConfig resourceLoaderConfig) {
        return ResourceLoader$CppProxy.createWithCache(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, cacheStrategyDelegate, resourceLoaderConfig);
    }
    
    public static ResourceLoader createWithDefaultConfig(final ControllerModuleLoader controllerModuleLoader, final PublicKeyVerifierProvider publicKeyVerifierProvider, final ResourceLoaderDelegate resourceLoaderDelegate) {
        return ResourceLoader$CppProxy.createWithDefaultConfig(controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate);
    }
    
    public static ResourceLoader createWithDefaultConfigWithBlocks(final ControllerModuleLoader controllerModuleLoader, final BlocksContainerLoaderProxy blocksContainerLoaderProxy, final PublicKeyVerifierProvider publicKeyVerifierProvider, final ResourceLoaderDelegate resourceLoaderDelegate) {
        return ResourceLoader$CppProxy.createWithDefaultConfigWithBlocks(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate);
    }
    
    public abstract Status cacheResources();
    
    public abstract Status commitCachedTrackableResources();
    
    public abstract CertificateTracker getCertificateTracker();
    
    public abstract ResourceMetadataTracker getMetadataTracker();
    
    public abstract ResourcePreloader getPreloader();
    
    public abstract Status handleOmittedResources(final TreeSet p0);
    
    public abstract Status handleResources(final ArrayList p0);
    
    public abstract boolean isCacheValid();
    
    public abstract void registerMissingResourceHandler(final MissingResourceHandler p0);
    
    public abstract void registerVerifier(final String p0, final StatusOr p1);
    
    public abstract void updateResourceStatus(final ResourceCheck p0);
    
    public abstract Status updateResources(final ArrayList p0, final ResourceLoaderCallback p1);
}
