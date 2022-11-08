// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Set;

public final class ActivityRule$Builder
{
    private boolean alwaysExpand;
    private final Set filters;
    private String tag;
    
    public ActivityRule$Builder(final Set filters) {
        filters.getClass();
        this.filters = filters;
    }
    
    public final ActivityRule build() {
        return new ActivityRule(this.tag, this.filters, this.alwaysExpand);
    }
    
    public final ActivityRule$Builder setAlwaysExpand(final boolean alwaysExpand) {
        this.alwaysExpand = alwaysExpand;
        return this;
    }
    
    public final ActivityRule$Builder setTag(final String tag) {
        tag.getClass();
        this.tag = tag;
        return this;
    }
}
