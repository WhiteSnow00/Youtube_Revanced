// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class FoldingFeature$State
{
    public static final FoldingFeature$State$Companion Companion;
    public static final FoldingFeature$State FLAT;
    public static final FoldingFeature$State HALF_OPENED;
    private final String description;
    
    static {
        Companion = new FoldingFeature$State$Companion(null);
        FLAT = new FoldingFeature$State("FLAT");
        HALF_OPENED = new FoldingFeature$State("HALF_OPENED");
    }
    
    private FoldingFeature$State(final String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
