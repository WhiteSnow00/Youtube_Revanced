// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class JSEnvironment
{
    public abstract JSModuleBytesProvider getBytesProvider();
    
    public abstract JSController getController();
    
    public abstract JSModuleCache getModuleCache();
    
    public abstract ControllerModuleLoader getModuleLoader();
}
