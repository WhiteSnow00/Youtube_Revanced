// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class FoldingFeature$OcclusionType
{
    public static final FoldingFeature$OcclusionType$Companion Companion;
    public static final FoldingFeature$OcclusionType FULL;
    public static final FoldingFeature$OcclusionType NONE;
    private final String description;
    
    static {
        Companion = new FoldingFeature$OcclusionType$Companion(null);
        NONE = new FoldingFeature$OcclusionType("NONE");
        FULL = new FoldingFeature$OcclusionType("FULL");
    }
    
    private FoldingFeature$OcclusionType(final String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
