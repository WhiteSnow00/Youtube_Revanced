// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class ComponentState
{
    public static ComponentState create() {
        return ComponentState$CppProxy.create();
    }
    
    public abstract Status dispose();
    
    public abstract boolean isEmpty();
}
