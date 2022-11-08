import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itx
{
    public final atir a;
    public final atir b;
    public final atir c;
    public final atir d;
    public final atir e;
    public final atir f;
    public final atir g;
    public final atir h;
    public final atir i;
    public final atir j;
    private final Map k;
    private final atir l;
    private final atir m;
    private final atir n;
    private final atir o;
    private final atir p;
    private final atir q;
    private final atir r;
    private final atir s;
    
    public itx() {
        this.k = new HashMap();
        this.a = atir.e();
        this.l = atir.e();
        this.m = atir.e();
        this.n = atir.e();
        this.b = atir.e();
        this.o = atir.e();
        this.p = atir.e();
        this.c = atir.e();
        this.d = atir.e();
        this.e = atir.e();
        this.f = atir.e();
        this.g = atir.e();
        this.q = atir.e();
        this.r = atir.e();
        this.h = atir.e();
        this.i = atir.e();
        this.s = atir.e();
        this.j = atir.e();
    }
    
    public final void a(final itw itw) {
        final asib asib = new asib();
        asib.c(((ashe)this.a).aB((asix)new isg(itw, 15)));
        final atir l = this.l;
        itw.getClass();
        asib.c(((ashe)l).aB((asix)new itv(itw, 10)));
        asib.c(((ashe)this.m).aB((asix)new isg(itw, 16)));
        asib.c(((ashe)this.n).aB((asix)new isg(itw, 17)));
        asib.c(((ashe)this.b).aB((asix)new isg(itw, 18)));
        asib.c(((ashe)this.o).aB((asix)new isg(itw, 19)));
        asib.c(((ashe)this.p).aB((asix)new isg(itw, 20)));
        asib.c(((ashe)this.c).aB((asix)new itv(itw, 1)));
        asib.c(((ashe)this.d).aB((asix)new itv(itw, 0)));
        asib.c(((ashe)this.e).aB((asix)new itv(itw, 2)));
        asib.c(((ashe)this.f).aB((asix)new itv(itw, 3)));
        asib.c(((ashe)this.g).aB((asix)new itv(itw, 4)));
        asib.c(((ashe)this.q).aB((asix)new itv(itw, 5)));
        asib.c(((ashe)this.r).aB((asix)new itv(itw, 6)));
        asib.c(((ashe)this.h).aB((asix)new itv(itw, 7)));
        asib.c(((ashe)this.i).aB((asix)new itv(itw, 8)));
        asib.c(((ashe)this.s).aB((asix)new irb(13)));
        asib.c(((ashe)this.j).aB((asix)new itv(itw, 9)));
        this.k.put(itw, asib);
    }
    
    public final void b(final itw itw) {
        itw.getClass();
        final asib asib = this.k.remove(itw);
        if (asib != null) {
            asib.dispose();
        }
    }
    
    public final void c(final ControlsState controlsState) {
        this.n.tr((Object)controlsState);
    }
    
    public final void d(final itz itz) {
        this.s.tr((Object)itz);
    }
    
    final void e(final boolean b) {
        this.r.tr((Object)b);
    }
    
    public final void f(final fkk fkk) {
        this.l.tr((Object)fkk);
    }
    
    public final void g(final boolean b) {
        this.o.tr((Object)b);
    }
    
    final void h(final boolean b) {
        this.q.tr((Object)b);
    }
    
    public final void i(final ControlsOverlayStyle controlsOverlayStyle) {
        this.m.tr((Object)controlsOverlayStyle);
    }
    
    final void j(final boolean b) {
        this.p.tr((Object)b);
    }
}
