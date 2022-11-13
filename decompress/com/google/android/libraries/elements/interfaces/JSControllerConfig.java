// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class JSControllerConfig
{
    public static final int DEFAULT_VM_CONTEXT_LRU_SIZE = 5;
    final boolean enableDedicatedJsVmThread;
    final boolean enableVmContextLru;
    final JSControllerInitializationMode initializationMode;
    final int jsEngineSelection;
    final boolean shouldLockVmIsolate;
    final boolean shouldUseDirectJsObjectCreation;
    final boolean skipLegacyFunctionBindings;
    final int vmContextLruSize;
    
    public JSControllerConfig(final JSControllerInitializationMode initializationMode, final boolean enableVmContextLru, final int vmContextLruSize, final boolean shouldLockVmIsolate, final boolean shouldUseDirectJsObjectCreation, final boolean skipLegacyFunctionBindings, final boolean enableDedicatedJsVmThread, final int jsEngineSelection) {
        this.initializationMode = initializationMode;
        this.enableVmContextLru = enableVmContextLru;
        this.vmContextLruSize = vmContextLruSize;
        this.shouldLockVmIsolate = shouldLockVmIsolate;
        this.shouldUseDirectJsObjectCreation = shouldUseDirectJsObjectCreation;
        this.skipLegacyFunctionBindings = skipLegacyFunctionBindings;
        this.enableDedicatedJsVmThread = enableDedicatedJsVmThread;
        this.jsEngineSelection = jsEngineSelection;
    }
    
    public boolean getEnableDedicatedJsVmThread() {
        return this.enableDedicatedJsVmThread;
    }
    
    public boolean getEnableVmContextLru() {
        return this.enableVmContextLru;
    }
    
    public JSControllerInitializationMode getInitializationMode() {
        return this.initializationMode;
    }
    
    public int getJsEngineSelection() {
        return this.jsEngineSelection;
    }
    
    public boolean getShouldLockVmIsolate() {
        return this.shouldLockVmIsolate;
    }
    
    public boolean getShouldUseDirectJsObjectCreation() {
        return this.shouldUseDirectJsObjectCreation;
    }
    
    public boolean getSkipLegacyFunctionBindings() {
        return this.skipLegacyFunctionBindings;
    }
    
    public int getVmContextLruSize() {
        return this.vmContextLruSize;
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.initializationMode);
        final boolean enableVmContextLru = this.enableVmContextLru;
        final int vmContextLruSize = this.vmContextLruSize;
        final boolean shouldLockVmIsolate = this.shouldLockVmIsolate;
        final boolean shouldUseDirectJsObjectCreation = this.shouldUseDirectJsObjectCreation;
        final boolean skipLegacyFunctionBindings = this.skipLegacyFunctionBindings;
        final boolean enableDedicatedJsVmThread = this.enableDedicatedJsVmThread;
        final int jsEngineSelection = this.jsEngineSelection;
        final StringBuilder sb = new StringBuilder("JSControllerConfig{initializationMode=");
        sb.append(value);
        sb.append(",enableVmContextLru=");
        sb.append(enableVmContextLru);
        sb.append(",vmContextLruSize=");
        sb.append(vmContextLruSize);
        sb.append(",shouldLockVmIsolate=");
        sb.append(shouldLockVmIsolate);
        sb.append(",shouldUseDirectJsObjectCreation=");
        sb.append(shouldUseDirectJsObjectCreation);
        sb.append(",skipLegacyFunctionBindings=");
        sb.append(skipLegacyFunctionBindings);
        sb.append(",enableDedicatedJsVmThread=");
        sb.append(enableDedicatedJsVmThread);
        sb.append(",jsEngineSelection=");
        sb.append(jsEngineSelection);
        sb.append("}");
        return sb.toString();
    }
}
