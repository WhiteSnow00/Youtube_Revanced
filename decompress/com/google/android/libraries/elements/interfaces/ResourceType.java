// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ResourceType
{
    private static final ResourceType[] $VALUES;
    
    BLOCKS_CONTAINER_MANIFEST("BLOCKS_CONTAINER_MANIFEST", 3), 
    CERTIFICATE("CERTIFICATE", 2), 
    EML_TEMPLATE("EML_TEMPLATE", 0), 
    JAVASCRIPT_MODULE("JAVASCRIPT_MODULE", 1);
    
    private static ResourceType[] $values() {
        return new ResourceType[] { ResourceType.EML_TEMPLATE, ResourceType.JAVASCRIPT_MODULE, ResourceType.CERTIFICATE, ResourceType.BLOCKS_CONTAINER_MANIFEST };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ResourceType(final String s, final int n) {
    }
}
