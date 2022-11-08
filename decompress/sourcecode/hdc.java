import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdc extends iw
{
    final /* synthetic */ MusicSearchSuggestionsController a;
    
    public hdc(final MusicSearchSuggestionsController a) {
        this.a = a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int n) {
        if (n == 1) {
            final Activity i = this.a.i;
            if (i != null) {
                tmy.o(i);
            }
        }
    }
}
