// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;

public final class SplitPlaceholderRule$Builder
{
    private SplitAttributes defaultSplitAttributes;
    private final Set filters;
    private SplitRule$FinishBehavior finishPrimaryWithPlaceholder;
    private boolean isSticky;
    private final int minHeight;
    private final int minSmallestWidth;
    private final int minWidth;
    private final Intent placeholderIntent;
    private String tag;
    
    public SplitPlaceholderRule$Builder(final Set filters, final Intent placeholderIntent, final int minWidth, final int minHeight, final int minSmallestWidth) {
        filters.getClass();
        placeholderIntent.getClass();
        this.filters = filters;
        this.placeholderIntent = placeholderIntent;
        this.minWidth = minWidth;
        this.minHeight = minHeight;
        this.minSmallestWidth = minSmallestWidth;
        this.finishPrimaryWithPlaceholder = SplitRule$FinishBehavior.ALWAYS;
        this.defaultSplitAttributes = new SplitAttributes$Builder().build();
    }
    
    public final SplitPlaceholderRule build() {
        return new SplitPlaceholderRule(this.tag, this.filters, this.placeholderIntent, this.isSticky, this.finishPrimaryWithPlaceholder, this.minWidth, this.minHeight, this.minSmallestWidth, this.defaultSplitAttributes);
    }
    
    public final SplitPlaceholderRule$Builder setDefaultSplitAttributes(final SplitAttributes defaultSplitAttributes) {
        defaultSplitAttributes.getClass();
        this.defaultSplitAttributes = defaultSplitAttributes;
        return this;
    }
    
    public final SplitPlaceholderRule$Builder setFinishPrimaryWithPlaceholder(final SplitRule$FinishBehavior finishPrimaryWithPlaceholder) {
        finishPrimaryWithPlaceholder.getClass();
        this.finishPrimaryWithPlaceholder = finishPrimaryWithPlaceholder;
        return this;
    }
    
    public final SplitPlaceholderRule$Builder setSticky(final boolean isSticky) {
        this.isSticky = isSticky;
        return this;
    }
    
    public final SplitPlaceholderRule$Builder setTag(final String tag) {
        this.tag = tag;
        return this;
    }
}
