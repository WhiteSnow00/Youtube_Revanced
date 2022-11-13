// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.blocks;

import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.android.libraries.elements.interfaces.BlocksContainerLoaderProxy;

public abstract class BlocksRuntimeProxy
{
    public static BlocksContainerLoaderProxy createContainerLoader() {
        return BlocksRuntimeProxy$CppProxy.createContainerLoader();
    }
    
    public static void setJsModuleCache(final JSModuleCache jsModuleCache) {
        BlocksRuntimeProxy$CppProxy.setJsModuleCache(jsModuleCache);
    }
    
    public static void setLogger(final BlocksLogger logger) {
        BlocksRuntimeProxy$CppProxy.setLogger(logger);
    }
}
