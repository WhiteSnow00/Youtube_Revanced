// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum JSControllerLifecycleMode
{
    private static final JSControllerLifecycleMode[] $VALUES;
    
    CREATE("CREATE", 0), 
    DESTROY("DESTROY", 2), 
    NOTIFY_MODEL_UPDATE("NOTIFY_MODEL_UPDATE", 1);
    
    private static JSControllerLifecycleMode[] $values() {
        return new JSControllerLifecycleMode[] { JSControllerLifecycleMode.CREATE, JSControllerLifecycleMode.NOTIFY_MODEL_UPDATE, JSControllerLifecycleMode.DESTROY };
    }
    
    static {
        $VALUES = $values();
    }
    
    private JSControllerLifecycleMode(final String s, final int n) {
    }
}
