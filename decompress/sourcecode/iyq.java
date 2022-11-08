import java.util.Locale;
import android.support.v7.widget.RecyclerView;
import androidx.cardview.widget.CardView;
import java.util.List;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyq implements sht, fjo
{
    public static final fl h;
    public final Context a;
    public final aceo b;
    public final fjp c;
    public final iyo d;
    public Optional e;
    public Optional f;
    public Optional g;
    
    static {
        h = new fl();
    }
    
    public iyq(final Context a, final aceo b, final fjp c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.d = new iyo(this);
    }
    
    public final void a(final List list) {
        final CardView cardView = (CardView)this.f.orElse((Object)null);
        if (cardView == null) {
            zjp.b(zjo.b, zjn.a, "Showing thumbnails when thumbnailsContainer doesn't exist.");
            return;
        }
        final RecyclerView recyclerView = (RecyclerView)this.g.orElse((Object)null);
        if (recyclerView == null) {
            zjp.b(zjo.b, zjn.a, "Showing thumbnails when thumbnailsGrid doesn't exist.");
            return;
        }
        final aomi aomi = (aomi)this.e.orElse((Object)null);
        final int n = 0;
        if (aomi != null && aomi.equals(aomi.d)) {
            final int size = list.size();
            int n2;
            if (size != 1) {
                n2 = 2;
                if (size != 2) {
                    n2 = n2;
                    if (size != 4) {
                        zjp.b(zjo.b, zjn.a, String.format(Locale.getDefault(), "Unexpected number of thumbnails in SurveyAdRenderer: %d", list.size()));
                        return;
                    }
                }
            }
            else {
                n2 = 1;
            }
            recyclerView.af((nw)new iyp(this.a, n2));
            this.d.b(list);
            int visibility;
            if (!this.c.j().c()) {
                visibility = n;
            }
            else {
                visibility = 8;
            }
            cardView.setVisibility(visibility);
            return;
        }
        final zjo b = zjo.b;
        final zjn a = zjn.a;
        final Locale default1 = Locale.getDefault();
        String name;
        if (aomi == null) {
            name = "null";
        }
        else {
            name = aomi.name();
        }
        zjp.b(b, a, String.format(default1, "SurveyAdRenderer contains thumbnails but the aspect ratio is not 2x3: %s", name));
    }
    
    public final void oK(final fkk fkk) {
        final CardView cardView = (CardView)this.f.orElse((Object)null);
        final RecyclerView recyclerView = (RecyclerView)this.g.orElse((Object)null);
        if (cardView != null && recyclerView != null) {
            final iyo iyo = (iyo)recyclerView.m;
            int visibility;
            final int n = visibility = 8;
            if (iyo != null) {
                visibility = n;
                if (iyo.a() != 0) {
                    if (fkk.c()) {
                        visibility = n;
                    }
                    else {
                        visibility = 0;
                    }
                }
            }
            cardView.setVisibility(visibility);
        }
    }
}
