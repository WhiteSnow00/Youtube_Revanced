// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public class SplitAttributes$SplitType
{
    public static final SplitAttributes$SplitType$Companion Companion;
    private static final SplitAttributes$SplitType$ExpandContainersSplitType EXPAND_CONTAINERS;
    private final String description;
    private final float value;
    
    static {
        Companion = new SplitAttributes$SplitType$Companion(null);
        EXPAND_CONTAINERS = new SplitAttributes$SplitType$ExpandContainersSplitType();
    }
    
    public SplitAttributes$SplitType(final String description, final float value) {
        description.getClass();
        this.description = description;
        this.value = value;
    }
    
    public static final SplitAttributes$SplitType buildSplitTypeFromValue$window_release(final float n) {
        return SplitAttributes$SplitType.Companion.buildSplitTypeFromValue$window_release(n);
    }
    
    public static final SplitAttributes$SplitType$ExpandContainersSplitType expandContainers() {
        return SplitAttributes$SplitType.Companion.expandContainers();
    }
    
    public static final SplitAttributes$SplitType$RatioSplitType ratio(final float n) {
        return SplitAttributes$SplitType.Companion.ratio(n);
    }
    
    public static final SplitAttributes$SplitType$HingeSplitType splitByHinge(final SplitAttributes$SplitType splitAttributes$SplitType) {
        return SplitAttributes$SplitType.Companion.splitByHinge(splitAttributes$SplitType);
    }
    
    public static final SplitAttributes$SplitType$RatioSplitType splitEqually() {
        return SplitAttributes$SplitType.Companion.splitEqually();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SplitAttributes$SplitType)) {
            return false;
        }
        final float value = this.value;
        final SplitAttributes$SplitType splitAttributes$SplitType = (SplitAttributes$SplitType)o;
        return value == splitAttributes$SplitType.value && atnh.c((Object)this.description, (Object)splitAttributes$SplitType.description);
    }
    
    public final String getDescription$window_release() {
        return this.description;
    }
    
    public final float getValue$window_release() {
        return this.value;
    }
    
    @Override
    public int hashCode() {
        return this.description.hashCode() + Float.floatToIntBits(this.value) * 31;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
