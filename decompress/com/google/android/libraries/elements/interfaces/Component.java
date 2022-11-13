// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;

public abstract class Component
{
    public static StatusOr create(final ByteBuffer byteBuffer, final DevResourceManager devResourceManager, final EntitiesProcessorResolver entitiesProcessorResolver, final ComponentConfig componentConfig, final ComponentState componentState) {
        return Component$CppProxy.create(byteBuffer, devResourceManager, entitiesProcessorResolver, componentConfig, componentState);
    }
    
    public static StatusOr createWithElement(final ComponentElement componentElement, final DevResourceManager devResourceManager, final EntitiesProcessorResolver entitiesProcessorResolver, final ComponentConfig componentConfig, final ComponentState componentState) {
        return Component$CppProxy.createWithElement(componentElement, devResourceManager, entitiesProcessorResolver, componentConfig, componentState);
    }
    
    public static int getInstanceCount() {
        return Component$CppProxy.getInstanceCount();
    }
    
    public static int getUndisposedInstanceCount() {
        return Component$CppProxy.getUndisposedInstanceCount();
    }
    
    public abstract byte[] debugLatestModel();
    
    public abstract Status debugSetModel(final byte[] p0);
    
    public abstract Status dispose();
    
    public abstract int getCompletedMaterializationCount();
    
    public abstract int getMaterializationCount();
    
    public abstract String getTemplateUri();
    
    public abstract boolean isDirty();
    
    public abstract byte[] latestEntitiesConfig();
    
    public abstract void markDirtyForHotReload();
    
    public abstract StatusOr materialize(final boolean p0);
    
    public abstract Status setElement(final ByteBuffer p0);
    
    public abstract void setObserver(final ComponentObserver p0);
}
