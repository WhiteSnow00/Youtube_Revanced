import java.util.Locale;
import android.support.v7.widget.RecyclerView;
import androidx.cardview.widget.CardView;
import java.util.List;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izp implements sjz, fju
{
    public static final fl h;
    public final Context a;
    public final acgs b;
    public final fjv c;
    public final izn d;
    public Optional e;
    public Optional f;
    public Optional g;
    
    static {
        h = new fl();
    }
    
    public izp(final Context a, final acgs b, final fjv c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.d = new izn(this);
    }
    
    public final void a(final List list) {
        final CardView cardView = (CardView)this.f.orElse((Object)null);
        if (cardView == null) {
            zlm.b(zll.b, zlk.a, "Showing thumbnails when thumbnailsContainer doesn't exist.");
            return;
        }
        final RecyclerView recyclerView = (RecyclerView)this.g.orElse((Object)null);
        if (recyclerView == null) {
            zlm.b(zll.b, zlk.a, "Showing thumbnails when thumbnailsGrid doesn't exist.");
            return;
        }
        final aool aool = (aool)this.e.orElse((Object)null);
        final int n = 0;
        if (aool != null && aool.equals((Object)aool.d)) {
            final int size = list.size();
            int n2;
            if (size != 1) {
                n2 = 2;
                if (size != 2) {
                    n2 = n2;
                    if (size != 4) {
                        zlm.b(zll.b, zlk.a, String.format(Locale.getDefault(), "Unexpected number of thumbnails in SurveyAdRenderer: %d", list.size()));
                        return;
                    }
                }
            }
            else {
                n2 = 1;
            }
            recyclerView.af((nw)new izo(this.a, n2));
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
        final zll b = zll.b;
        final zlk a = zlk.a;
        final Locale default1 = Locale.getDefault();
        String name;
        if (aool == null) {
            name = "null";
        }
        else {
            name = aool.name();
        }
        zlm.b(b, a, String.format(default1, "SurveyAdRenderer contains thumbnails but the aspect ratio is not 2x3: %s", name));
    }
    
    public final void n(final fkr fkr) {
        final CardView cardView = (CardView)this.f.orElse((Object)null);
        final RecyclerView recyclerView = (RecyclerView)this.g.orElse((Object)null);
        if (cardView != null && recyclerView != null) {
            final izn izn = (izn)recyclerView.m;
            int visibility;
            final int n = visibility = 8;
            if (izn != null) {
                visibility = n;
                if (izn.a() != 0) {
                    if (fkr.c()) {
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
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
}
