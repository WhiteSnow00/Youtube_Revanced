// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitAttributes$LayoutDirection
{
    public static final SplitAttributes$LayoutDirection BOTTOM_TO_TOP;
    public static final SplitAttributes$LayoutDirection$Companion Companion;
    public static final SplitAttributes$LayoutDirection LEFT_TO_RIGHT;
    public static final SplitAttributes$LayoutDirection LOCALE;
    public static final SplitAttributes$LayoutDirection RIGHT_TO_LEFT;
    public static final SplitAttributes$LayoutDirection TOP_TO_BOTTOM;
    private final String description;
    private final int value;
    
    static {
        Companion = new SplitAttributes$LayoutDirection$Companion(null);
        LOCALE = new SplitAttributes$LayoutDirection("LOCALE", 0);
        LEFT_TO_RIGHT = new SplitAttributes$LayoutDirection("LEFT_TO_RIGHT", 1);
        RIGHT_TO_LEFT = new SplitAttributes$LayoutDirection("RIGHT_TO_LEFT", 2);
        TOP_TO_BOTTOM = new SplitAttributes$LayoutDirection("TOP_TO_BOTTOM", 3);
        BOTTOM_TO_TOP = new SplitAttributes$LayoutDirection("BOTTOM_TO_TOP", 4);
    }
    
    private SplitAttributes$LayoutDirection(final String description, final int value) {
        this.description = description;
        this.value = value;
    }
    
    public static final SplitAttributes$LayoutDirection getLayoutDirectionFromValue$window_release(final int n) {
        return SplitAttributes$LayoutDirection.Companion.getLayoutDirectionFromValue$window_release(n);
    }
    
    public final int getValue$window_release() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
