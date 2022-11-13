import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuv
{
    public final atjm a;
    public final atjm b;
    public final atjm c;
    public final atjm d;
    public final atjm e;
    public final atjm f;
    public final atjm g;
    public final atjm h;
    public final atjm i;
    public final atjm j;
    private final Map k;
    private final atjm l;
    private final atjm m;
    private final atjm n;
    private final atjm o;
    private final atjm p;
    private final atjm q;
    private final atjm r;
    private final atjm s;
    
    public iuv() {
        this.k = new HashMap();
        this.a = atjm.e();
        this.l = atjm.e();
        this.m = atjm.e();
        this.n = atjm.e();
        this.b = atjm.e();
        this.o = atjm.e();
        this.p = atjm.e();
        this.c = atjm.e();
        this.d = atjm.e();
        this.e = atjm.e();
        this.f = atjm.e();
        this.g = atjm.e();
        this.q = atjm.e();
        this.r = atjm.e();
        this.h = atjm.e();
        this.i = atjm.e();
        this.s = atjm.e();
        this.j = atjm.e();
    }
    
    public final void a(final iuu iuu) {
        final asiq asiq = new asiq();
        asiq.c(((asht)this.a).aH((asjm)new itf(iuu, 14)));
        final atjm l = this.l;
        iuu.getClass();
        asiq.c(((asht)l).aH((asjm)new iut(iuu, 9)));
        asiq.c(((asht)this.m).aH((asjm)new itf(iuu, 15)));
        asiq.c(((asht)this.n).aH((asjm)new itf(iuu, 16)));
        asiq.c(((asht)this.b).aH((asjm)new itf(iuu, 17)));
        asiq.c(((asht)this.o).aH((asjm)new itf(iuu, 18)));
        asiq.c(((asht)this.p).aH((asjm)new itf(iuu, 19)));
        asiq.c(((asht)this.c).aH((asjm)new itf(iuu, 20)));
        asiq.c(((asht)this.d).aH((asjm)new iut(iuu, 1)));
        asiq.c(((asht)this.e).aH((asjm)new iut(iuu, 0)));
        asiq.c(((asht)this.f).aH((asjm)new iut(iuu, 2)));
        asiq.c(((asht)this.g).aH((asjm)new iut(iuu, 3)));
        asiq.c(((asht)this.q).aH((asjm)new iut(iuu, 4)));
        asiq.c(((asht)this.r).aH((asjm)new iut(iuu, 5)));
        asiq.c(((asht)this.h).aH((asjm)new iut(iuu, 6)));
        asiq.c(((asht)this.i).aH((asjm)new iut(iuu, 7)));
        asiq.c(((asht)this.s).aH((asjm)new ise(12)));
        asiq.c(((asht)this.j).aH((asjm)new iut(iuu, 8)));
        this.k.put(iuu, asiq);
    }
    
    public final void b(final iuu iuu) {
        iuu.getClass();
        final asiq asiq = this.k.remove(iuu);
        if (asiq != null) {
            asiq.dispose();
        }
    }
    
    public final void c(final ControlsState controlsState) {
        this.n.tu((Object)controlsState);
    }
    
    public final void d(final iux iux) {
        this.s.tu((Object)iux);
    }
    
    final void e(final boolean b) {
        this.r.tu((Object)b);
    }
    
    public final void f(final fkr fkr) {
        this.l.tu((Object)fkr);
    }
    
    public final void g(final boolean b) {
        this.o.tu((Object)b);
    }
    
    final void h(final boolean b) {
        this.q.tu((Object)b);
    }
    
    public final void i(final ControlsOverlayStyle controlsOverlayStyle) {
        this.m.tu((Object)controlsOverlayStyle);
    }
    
    final void j(final boolean b) {
        this.p.tu((Object)b);
    }
}
