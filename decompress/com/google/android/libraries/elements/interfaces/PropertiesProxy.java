// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class PropertiesProxy
{
    public abstract boolean hasLayoutProperties();
    
    public abstract boolean hasStyleProperties();
    
    public abstract LayoutPropertiesProxy layoutProperties();
    
    public abstract StylePropertiesProxy styleProperties();
}
