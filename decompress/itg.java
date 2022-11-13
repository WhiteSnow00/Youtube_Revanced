import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itg implements abdi, iss
{
    private static final afeq b;
    public final ajb a;
    private final bu c;
    private final abpq d;
    private final abdk e;
    private final abdk f;
    private final Context g;
    private final ftl h;
    private boolean i;
    private boolean j;
    private String k;
    private ist l;
    private final vai m;
    
    static {
        b = afeq.t((Object)"en_US", (Object)"en_CA", (Object)"es_MX");
    }
    
    public itg(final Context g, final bu c, final abpq d, final abdk e, final abdk f, final ajb a, final ftl h, final vai m, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.h = h;
        this.m = m;
        h.a().a("menu_item_captions", true);
    }
    
    public static String c(final SubtitleTrack subtitleTrack) {
        if (subtitleTrack != null && !subtitleTrack.t() && !subtitleTrack.n()) {
            return subtitleTrack.toString();
        }
        return null;
    }
    
    private final void f() {
        final ist l = this.l;
        if (l == null) {
            return;
        }
        final Context g = this.g;
        final bu c = this.c;
        final boolean j = this.j;
        int n;
        if (itg.b.contains((Object)((Context)c).getResources().getConfiguration().locale.toString())) {
            if (j) {
                n = 2131233515;
            }
            else {
                n = 2131233709;
            }
        }
        else if (j) {
            n = 2131232993;
        }
        else {
            n = 2131232994;
        }
        ((qkq)l).e = tpe.k(g, n, 2130970924);
    }
    
    public final ist a() {
        if (this.l == null) {
            (this.l = new ist(this.c.getString(2132019902), new iso(this, 10))).g(true);
            this.l.f(this.k);
            this.f();
        }
        final ist l = this.l;
        l.getClass();
        return l;
    }
    
    public final void d() {
        this.d.G((tcc)new hbr(this, 12));
    }
    
    public final void g(final boolean i) {
        this.i = i;
        if (this.m.f(45380854L)) {
            this.h.a().e(i ^ true);
        }
    }
    
    public final void j(final SubtitleTrack subtitleTrack) {
        if (subtitleTrack != null && subtitleTrack.r()) {
            return;
        }
        this.e.aS(subtitleTrack);
        this.f.aS(subtitleTrack);
        String k;
        if (!this.i) {
            k = this.c.getString(2132019906);
        }
        else if (subtitleTrack != null && subtitleTrack.s()) {
            k = this.c.getString(2132019903, new Object[] { c(subtitleTrack) });
        }
        else {
            k = c(subtitleTrack);
        }
        if (adkp.ae(this.k, k)) {
            return;
        }
        this.k = k;
        this.h.a().d("menu_item_captions", this.k);
        final ist l = this.l;
        if (l != null) {
            l.f(this.k);
        }
    }
    
    public final void l(final abdh abdh) {
        this.e.aT(abdh);
        this.f.aT(abdh);
    }
    
    public final void oO() {
        this.l = null;
    }
    
    public final boolean oP() {
        return false;
    }
    
    public final String oQ() {
        return "menu_item_captions";
    }
    
    public final void q(final List list) {
        this.e.aU(list);
        this.e.aV(this.c);
    }
    
    public final void rc(final boolean j) {
        if (j == this.j) {
            return;
        }
        this.j = j;
        this.f();
        this.h.a().c("menu_item_captions", this.j);
    }
}
