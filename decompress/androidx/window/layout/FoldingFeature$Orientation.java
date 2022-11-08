// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class FoldingFeature$Orientation
{
    public static final FoldingFeature$Orientation$Companion Companion;
    public static final FoldingFeature$Orientation HORIZONTAL;
    public static final FoldingFeature$Orientation VERTICAL;
    private final String description;
    
    static {
        Companion = new FoldingFeature$Orientation$Companion(null);
        VERTICAL = new FoldingFeature$Orientation("VERTICAL");
        HORIZONTAL = new FoldingFeature$Orientation("HORIZONTAL");
    }
    
    private FoldingFeature$Orientation(final String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
