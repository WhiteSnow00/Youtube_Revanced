// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class ResourceStatus
{
    final String identifier;
    final StatusInResponse status;
    
    public ResourceStatus(final String identifier, final StatusInResponse status) {
        this.identifier = identifier;
        this.status = status;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public StatusInResponse getStatus() {
        return this.status;
    }
    
    @Override
    public String toString() {
        final String identifier = this.identifier;
        final String value = String.valueOf(this.status);
        final StringBuilder sb = new StringBuilder("ResourceStatus{identifier=");
        sb.append(identifier);
        sb.append(",status=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
