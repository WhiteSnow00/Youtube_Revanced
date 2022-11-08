// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.Collection;
import android.app.Activity;
import java.util.Set;

final class EmbeddingAdapter$translateActivityPredicates$1 extends atni implements atml
{
    final /* synthetic */ Set $activityFilters;
    
    public EmbeddingAdapter$translateActivityPredicates$1(final Set $activityFilters) {
        this.$activityFilters = $activityFilters;
        super(1);
    }
    
    public final Boolean invoke(final Activity activity) {
        activity.getClass();
        final Set $activityFilters = this.$activityFilters;
        final boolean b = $activityFilters instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && $activityFilters.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator iterator = $activityFilters.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!((ActivityFilter)iterator.next()).matchesActivity(activity));
            b3 = true;
        }
        return b3;
    }
}
