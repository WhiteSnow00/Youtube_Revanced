// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitAttributes$LayoutDirection$Companion
{
    private SplitAttributes$LayoutDirection$Companion() {
    }
    
    public final SplitAttributes$LayoutDirection getLayoutDirectionFromValue$window_release(final int n) {
        SplitAttributes$LayoutDirection splitAttributes$LayoutDirection;
        if (n == SplitAttributes$LayoutDirection.LEFT_TO_RIGHT.getValue$window_release()) {
            splitAttributes$LayoutDirection = SplitAttributes$LayoutDirection.LEFT_TO_RIGHT;
        }
        else if (n == SplitAttributes$LayoutDirection.RIGHT_TO_LEFT.getValue$window_release()) {
            splitAttributes$LayoutDirection = SplitAttributes$LayoutDirection.RIGHT_TO_LEFT;
        }
        else if (n == SplitAttributes$LayoutDirection.LOCALE.getValue$window_release()) {
            splitAttributes$LayoutDirection = SplitAttributes$LayoutDirection.LOCALE;
        }
        else if (n == SplitAttributes$LayoutDirection.TOP_TO_BOTTOM.getValue$window_release()) {
            splitAttributes$LayoutDirection = SplitAttributes$LayoutDirection.TOP_TO_BOTTOM;
        }
        else {
            if (n != SplitAttributes$LayoutDirection.BOTTOM_TO_TOP.getValue$window_release()) {
                final StringBuilder sb = new StringBuilder("Undefined value:");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            splitAttributes$LayoutDirection = SplitAttributes$LayoutDirection.BOTTOM_TO_TOP;
        }
        return splitAttributes$LayoutDirection;
    }
}
