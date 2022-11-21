// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

public final class ResourceMetadata
{
    final ArrayList dependencies;
    final String resourceIdentifier;
    final Long resourceTag;
    final ResourceType resourceType;
    final String securityVerifier;
    
    public ResourceMetadata(final String resourceIdentifier, final ResourceType resourceType, final Long resourceTag, final ArrayList dependencies, final String securityVerifier) {
        this.resourceIdentifier = resourceIdentifier;
        this.resourceType = resourceType;
        this.resourceTag = resourceTag;
        this.dependencies = dependencies;
        this.securityVerifier = securityVerifier;
    }
    
    public ArrayList getDependencies() {
        return this.dependencies;
    }
    
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }
    
    public Long getResourceTag() {
        return this.resourceTag;
    }
    
    public ResourceType getResourceType() {
        return this.resourceType;
    }
    
    public String getSecurityVerifier() {
        return this.securityVerifier;
    }
    
    @Override
    public String toString() {
        final String resourceIdentifier = this.resourceIdentifier;
        final String value = String.valueOf(this.resourceType);
        final Long resourceTag = this.resourceTag;
        final String value2 = String.valueOf(this.dependencies);
        final String securityVerifier = this.securityVerifier;
        final StringBuilder sb = new StringBuilder("ResourceMetadata{resourceIdentifier=");
        sb.append(resourceIdentifier);
        sb.append(",resourceType=");
        sb.append(value);
        sb.append(",resourceTag=");
        sb.append(resourceTag);
        sb.append(",dependencies=");
        sb.append(value2);
        sb.append(",securityVerifier=");
        sb.append(securityVerifier);
        sb.append("}");
        return sb.toString();
    }
}
