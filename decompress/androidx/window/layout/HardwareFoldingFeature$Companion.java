// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import androidx.window.core.Bounds;

public final class HardwareFoldingFeature$Companion
{
    private HardwareFoldingFeature$Companion() {
    }
    
    public HardwareFoldingFeature$Companion(final atqv atqv) {
        this();
    }
    
    public final void validateFeatureBounds$window_release(final Bounds bounds) {
        bounds.getClass();
        if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }
}
