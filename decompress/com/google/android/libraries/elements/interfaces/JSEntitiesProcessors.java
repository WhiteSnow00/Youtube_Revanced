// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class JSEntitiesProcessors
{
    public static void registerProcessors(final JSController jsController, final EntitiesProcessorResolver entitiesProcessorResolver) {
        JSEntitiesProcessors$CppProxy.registerProcessors(jsController, entitiesProcessorResolver);
    }
}
