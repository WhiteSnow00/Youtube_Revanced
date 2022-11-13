// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import com.youtube.android.libraries.elements.StatusOr;

public abstract class JSController
{
    public static JSController create(final PerformanceLogger performanceLogger, final JSModuleCache jsModuleCache, final JSBlocksContainerProvider jsBlocksContainerProvider, final JSControllerConfig jsControllerConfig) {
        return JSController$CppProxy.create(performanceLogger, jsModuleCache, jsBlocksContainerProvider, jsControllerConfig);
    }
    
    public abstract void executeControllerCommand(final byte[] p0, final byte[] p1, final String p2, final ByteStore p3, final JSCommandResolver p4, final JSFutureHandler p5, final JSControllerLifecycleMode p6);
    
    public abstract StatusOr executeFfiFunction(final String p0, final String p1, final byte[] p2);
    
    public abstract void executeFunction(final byte[] p0, final byte[] p1, final byte[] p2, final ByteStore p3, final JSCommandResolver p4, final JSFutureHandler p5);
    
    public abstract Status executePreloadInstruction(final byte[] p0);
    
    public abstract void prewarmExecutor();
    
    public abstract void registerControllerInitializer(final String p0, final JSControllerInitializer p1);
    
    public abstract void registerFunctionBinding(final int p0, final JSFunctionBinding p1);
    
    public abstract void registerStateUpdateHandler(final String p0, final JSStateUpdateHandler p1);
    
    public abstract void setPreloader(final ResourcePreloader p0);
    
    public abstract Status unregisterControllerInitializer(final String p0);
    
    public abstract Status unregisterStateUpdateHandler(final String p0);
}
