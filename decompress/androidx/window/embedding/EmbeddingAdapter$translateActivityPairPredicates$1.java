// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.Collection;
import android.app.Activity;
import java.util.Set;

final class EmbeddingAdapter$translateActivityPairPredicates$1 extends atni implements atmp
{
    final /* synthetic */ Set $splitPairFilters;
    
    public EmbeddingAdapter$translateActivityPairPredicates$1(final Set $splitPairFilters) {
        this.$splitPairFilters = $splitPairFilters;
        super(2);
    }
    
    public final Boolean invoke(final Activity activity, final Activity activity2) {
        activity.getClass();
        activity2.getClass();
        final Set $splitPairFilters = this.$splitPairFilters;
        final boolean b = $splitPairFilters instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && $splitPairFilters.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator iterator = $splitPairFilters.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!((SplitPairFilter)iterator.next()).matchesActivityPair(activity, activity2));
            b3 = true;
        }
        return b3;
    }
}
