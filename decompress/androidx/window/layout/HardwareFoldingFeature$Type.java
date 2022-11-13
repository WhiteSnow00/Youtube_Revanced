// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class HardwareFoldingFeature$Type
{
    public static final HardwareFoldingFeature$Type$Companion Companion;
    private static final HardwareFoldingFeature$Type FOLD;
    private static final HardwareFoldingFeature$Type HINGE;
    private final String description;
    
    static {
        Companion = new HardwareFoldingFeature$Type$Companion(null);
        FOLD = new HardwareFoldingFeature$Type("FOLD");
        HINGE = new HardwareFoldingFeature$Type("HINGE");
    }
    
    private HardwareFoldingFeature$Type(final String description) {
        this.description = description;
    }
    
    public static final HardwareFoldingFeature$Type access$getFOLD$cp() {
        return HardwareFoldingFeature$Type.FOLD;
    }
    
    public static final HardwareFoldingFeature$Type access$getHINGE$cp() {
        return HardwareFoldingFeature$Type.HINGE;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
