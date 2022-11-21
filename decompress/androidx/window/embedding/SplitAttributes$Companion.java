// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitAttributes$Companion
{
    private SplitAttributes$Companion() {
    }
    
    public SplitAttributes$Companion(final atqv atqv) {
        this();
    }
    
    public final SplitAttributes buildSplitAttributesFromValue$window_release(final float n, final int n2) {
        return new SplitAttributes(SplitAttributes$SplitType.Companion.buildSplitTypeFromValue$window_release(n), SplitAttributes$LayoutDirection.Companion.getLayoutDirectionFromValue$window_release(n2));
    }
}
