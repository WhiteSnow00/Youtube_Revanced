// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitAttributes$SplitType$HingeSplitType extends SplitAttributes$SplitType
{
    private final SplitAttributes$SplitType fallbackSplitType;
    
    public SplitAttributes$SplitType$HingeSplitType(final SplitAttributes$SplitType fallbackSplitType) {
        fallbackSplitType.getClass();
        new StringBuilder("hinge, fallback=").append(fallbackSplitType);
        super("hinge, fallback=".concat(fallbackSplitType.toString()), -1.0f);
        this.fallbackSplitType = fallbackSplitType;
    }
    
    public final SplitAttributes$SplitType getFallbackSplitType() {
        return this.fallbackSplitType;
    }
}
