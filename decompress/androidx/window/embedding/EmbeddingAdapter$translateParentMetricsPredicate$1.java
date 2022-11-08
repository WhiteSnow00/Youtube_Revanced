// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.view.WindowMetrics;

final class EmbeddingAdapter$translateParentMetricsPredicate$1 extends atni implements atml
{
    final /* synthetic */ SplitRule $splitRule;
    
    public EmbeddingAdapter$translateParentMetricsPredicate$1(final SplitRule $splitRule) {
        this.$splitRule = $splitRule;
        super(1);
    }
    
    public final Boolean invoke(final WindowMetrics windowMetrics) {
        windowMetrics.getClass();
        return this.$splitRule.checkParentMetrics$window_release(windowMetrics);
    }
}
