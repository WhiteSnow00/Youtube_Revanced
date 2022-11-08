// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Set;

public final class SplitPairRule$Builder
{
    private boolean clearTop;
    private SplitAttributes defaultSplitAttributes;
    private final Set filters;
    private SplitRule$FinishBehavior finishPrimaryWithSecondary;
    private SplitRule$FinishBehavior finishSecondaryWithPrimary;
    private final int minHeight;
    private final int minSmallestWidth;
    private final int minWidth;
    private String tag;
    
    public SplitPairRule$Builder(final Set filters, final int minWidth, final int minHeight, final int minSmallestWidth) {
        filters.getClass();
        this.filters = filters;
        this.minWidth = minWidth;
        this.minHeight = minHeight;
        this.minSmallestWidth = minSmallestWidth;
        this.finishPrimaryWithSecondary = SplitRule$FinishBehavior.NEVER;
        this.finishSecondaryWithPrimary = SplitRule$FinishBehavior.ALWAYS;
        this.defaultSplitAttributes = new SplitAttributes$Builder().build();
    }
    
    public final SplitPairRule build() {
        return new SplitPairRule(this.tag, this.filters, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, this.minWidth, this.minHeight, this.minSmallestWidth, this.defaultSplitAttributes);
    }
    
    public final SplitPairRule$Builder setClearTop(final boolean clearTop) {
        this.clearTop = clearTop;
        return this;
    }
    
    public final SplitPairRule$Builder setDefaultSplitAttributes(final SplitAttributes defaultSplitAttributes) {
        defaultSplitAttributes.getClass();
        this.defaultSplitAttributes = defaultSplitAttributes;
        return this;
    }
    
    public final SplitPairRule$Builder setFinishPrimaryWithSecondary(final SplitRule$FinishBehavior finishPrimaryWithSecondary) {
        finishPrimaryWithSecondary.getClass();
        this.finishPrimaryWithSecondary = finishPrimaryWithSecondary;
        return this;
    }
    
    public final SplitPairRule$Builder setFinishSecondaryWithPrimary(final SplitRule$FinishBehavior finishSecondaryWithPrimary) {
        finishSecondaryWithPrimary.getClass();
        this.finishSecondaryWithPrimary = finishSecondaryWithPrimary;
        return this;
    }
    
    public final SplitPairRule$Builder setTag(final String tag) {
        this.tag = tag;
        return this;
    }
}
