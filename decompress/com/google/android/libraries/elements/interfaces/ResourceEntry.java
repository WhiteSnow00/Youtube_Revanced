// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class ResourceEntry
{
    final byte[] resourceBytes;
    final ResourceMetadata resourceMetadata;
    
    public ResourceEntry(final ResourceMetadata resourceMetadata, final byte[] resourceBytes) {
        this.resourceMetadata = resourceMetadata;
        this.resourceBytes = resourceBytes;
    }
    
    public byte[] getResourceBytes() {
        return this.resourceBytes;
    }
    
    public ResourceMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.resourceMetadata);
        final String value2 = String.valueOf(this.resourceBytes);
        final StringBuilder sb = new StringBuilder("ResourceEntry{resourceMetadata=");
        sb.append(value);
        sb.append(",resourceBytes=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
