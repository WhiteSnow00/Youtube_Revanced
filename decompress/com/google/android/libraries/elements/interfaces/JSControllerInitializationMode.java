// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum JSControllerInitializationMode
{
    private static final JSControllerInitializationMode[] $VALUES;
    
    DEFAULT("DEFAULT", 0), 
    EAGER_CONTEXT_INITIALIZATION("EAGER_CONTEXT_INITIALIZATION", 1), 
    EAGER_MODULE_LOADING("EAGER_MODULE_LOADING", 2);
    
    private static JSControllerInitializationMode[] $values() {
        return new JSControllerInitializationMode[] { JSControllerInitializationMode.DEFAULT, JSControllerInitializationMode.EAGER_CONTEXT_INITIALIZATION, JSControllerInitializationMode.EAGER_MODULE_LOADING };
    }
    
    static {
        $VALUES = $values();
    }
    
    private JSControllerInitializationMode(final String s, final int n) {
    }
}
