// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;

public abstract class JSModuleCache
{
    public static JSModuleCache create() {
        return JSModuleCache$CppProxy.create();
    }
    
    public abstract void addObserver(final JSModuleCacheObserver p0);
    
    public abstract StatusOr getAvailableModuleSetVersion(final String p0);
    
    public abstract JSModuleBytesProvider getBytesProvider();
    
    public abstract ControllerModuleLoader getLoader();
    
    public abstract StatusOr getModuleContents(final String p0);
    
    public abstract StatusOr getModuleDependencies(final String p0);
    
    public abstract StatusOr getSerializedModuleConfig(final String p0);
}
