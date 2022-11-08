// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.Collection;
import android.content.Intent;
import java.util.Set;

final class EmbeddingAdapter$translateIntentPredicates$1 extends atni implements atml
{
    final /* synthetic */ Set $activityFilters;
    
    public EmbeddingAdapter$translateIntentPredicates$1(final Set $activityFilters) {
        this.$activityFilters = $activityFilters;
        super(1);
    }
    
    public final Boolean invoke(final Intent intent) {
        intent.getClass();
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
            } while (!((ActivityFilter)iterator.next()).matchesIntent(intent));
            b3 = true;
        }
        return b3;
    }
}
