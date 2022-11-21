// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class ResourceLoaderConfig
{
    final String bytesPath;
    final Long cacheCap;
    final Long cacheExpirationBuffer;
    final Boolean enforceDependencyOrdering;
    final Integer maxBuildLabels;
    final Integer maxTags;
    final String metadataPath;
    
    public ResourceLoaderConfig(final Integer maxTags, final Integer maxBuildLabels, final String bytesPath, final String metadataPath, final Long cacheCap, final Long cacheExpirationBuffer, final Boolean enforceDependencyOrdering) {
        this.maxTags = maxTags;
        this.maxBuildLabels = maxBuildLabels;
        this.bytesPath = bytesPath;
        this.metadataPath = metadataPath;
        this.cacheCap = cacheCap;
        this.cacheExpirationBuffer = cacheExpirationBuffer;
        this.enforceDependencyOrdering = enforceDependencyOrdering;
    }
    
    public String getBytesPath() {
        return this.bytesPath;
    }
    
    public Long getCacheCap() {
        return this.cacheCap;
    }
    
    public Long getCacheExpirationBuffer() {
        return this.cacheExpirationBuffer;
    }
    
    public Boolean getEnforceDependencyOrdering() {
        return this.enforceDependencyOrdering;
    }
    
    public Integer getMaxBuildLabels() {
        return this.maxBuildLabels;
    }
    
    public Integer getMaxTags() {
        return this.maxTags;
    }
    
    public String getMetadataPath() {
        return this.metadataPath;
    }
    
    @Override
    public String toString() {
        final Integer maxTags = this.maxTags;
        final Integer maxBuildLabels = this.maxBuildLabels;
        final String bytesPath = this.bytesPath;
        final String metadataPath = this.metadataPath;
        final Long cacheCap = this.cacheCap;
        final Long cacheExpirationBuffer = this.cacheExpirationBuffer;
        final Boolean enforceDependencyOrdering = this.enforceDependencyOrdering;
        final StringBuilder sb = new StringBuilder("ResourceLoaderConfig{maxTags=");
        sb.append(maxTags);
        sb.append(",maxBuildLabels=");
        sb.append(maxBuildLabels);
        sb.append(",bytesPath=");
        sb.append(bytesPath);
        sb.append(",metadataPath=");
        sb.append(metadataPath);
        sb.append(",cacheCap=");
        sb.append(cacheCap);
        sb.append(",cacheExpirationBuffer=");
        sb.append(cacheExpirationBuffer);
        sb.append(",enforceDependencyOrdering=");
        sb.append(enforceDependencyOrdering);
        sb.append("}");
        return sb.toString();
    }
}
