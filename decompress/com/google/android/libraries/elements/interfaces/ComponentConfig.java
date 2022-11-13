// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class ComponentConfig
{
    final int materializationBloatMs;
    final boolean reuseEntitiesProcessors;
    final boolean suppressPriorModelCheck;
    final boolean useEkoCanaryChannel;
    final boolean useEntitiesProcessorMap;
    final boolean usePriorModelHash;
    
    public ComponentConfig(final boolean useEkoCanaryChannel, final int materializationBloatMs, final boolean reuseEntitiesProcessors, final boolean useEntitiesProcessorMap, final boolean usePriorModelHash, final boolean suppressPriorModelCheck) {
        this.useEkoCanaryChannel = useEkoCanaryChannel;
        this.materializationBloatMs = materializationBloatMs;
        this.reuseEntitiesProcessors = reuseEntitiesProcessors;
        this.useEntitiesProcessorMap = useEntitiesProcessorMap;
        this.usePriorModelHash = usePriorModelHash;
        this.suppressPriorModelCheck = suppressPriorModelCheck;
    }
    
    public int getMaterializationBloatMs() {
        return this.materializationBloatMs;
    }
    
    public boolean getReuseEntitiesProcessors() {
        return this.reuseEntitiesProcessors;
    }
    
    public boolean getSuppressPriorModelCheck() {
        return this.suppressPriorModelCheck;
    }
    
    public boolean getUseEkoCanaryChannel() {
        return this.useEkoCanaryChannel;
    }
    
    public boolean getUseEntitiesProcessorMap() {
        return this.useEntitiesProcessorMap;
    }
    
    public boolean getUsePriorModelHash() {
        return this.usePriorModelHash;
    }
    
    @Override
    public String toString() {
        final boolean useEkoCanaryChannel = this.useEkoCanaryChannel;
        final int materializationBloatMs = this.materializationBloatMs;
        final boolean reuseEntitiesProcessors = this.reuseEntitiesProcessors;
        final boolean useEntitiesProcessorMap = this.useEntitiesProcessorMap;
        final boolean usePriorModelHash = this.usePriorModelHash;
        final boolean suppressPriorModelCheck = this.suppressPriorModelCheck;
        final StringBuilder sb = new StringBuilder("ComponentConfig{useEkoCanaryChannel=");
        sb.append(useEkoCanaryChannel);
        sb.append(",materializationBloatMs=");
        sb.append(materializationBloatMs);
        sb.append(",reuseEntitiesProcessors=");
        sb.append(reuseEntitiesProcessors);
        sb.append(",useEntitiesProcessorMap=");
        sb.append(useEntitiesProcessorMap);
        sb.append(",usePriorModelHash=");
        sb.append(usePriorModelHash);
        sb.append(",suppressPriorModelCheck=");
        sb.append(suppressPriorModelCheck);
        sb.append("}");
        return sb.toString();
    }
}
