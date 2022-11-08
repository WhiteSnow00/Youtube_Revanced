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
    
    @Override
    public String toString() {
        return this.description;
    }
}
