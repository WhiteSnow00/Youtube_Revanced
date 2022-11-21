// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

public final class ResourceCheck
{
    final String buildLabel;
    final ArrayList resourceStatuses;
    
    public ResourceCheck(final String buildLabel, final ArrayList resourceStatuses) {
        this.buildLabel = buildLabel;
        this.resourceStatuses = resourceStatuses;
    }
    
    public String getBuildLabel() {
        return this.buildLabel;
    }
    
    public ArrayList getResourceStatuses() {
        return this.resourceStatuses;
    }
    
    @Override
    public String toString() {
        final String buildLabel = this.buildLabel;
        final String value = String.valueOf(this.resourceStatuses);
        final StringBuilder sb = new StringBuilder("ResourceCheck{buildLabel=");
        sb.append(buildLabel);
        sb.append(",resourceStatuses=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
