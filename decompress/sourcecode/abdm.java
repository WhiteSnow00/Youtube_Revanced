import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdm extends tcv implements abnq
{
    public final abns d;
    public final asib e;
    private final aioe f;
    private final WillAutonavInformer g;
    private final abob h;
    private final abpj i;
    
    public abdm(final aioe f, final WillAutonavInformer g, final abns d, final abob h, final abpj i, final byte[] array, final byte[] array2) {
        this.e = new asib();
        this.f = f;
        this.g = g;
        this.d = d;
        this.h = h;
        this.i = i;
    }
    
    private final boolean d(final abmp abmp) {
        final abmj a = this.h.a();
        if (a == null) {
            return false;
        }
        final abmh abmh = (abmh)a;
        final PlaybackStartDescriptor a2 = abmh.a.a(abmp);
        PlaybackStartDescriptor playbackStartDescriptor;
        if (abmh.j(abmp) && a2 != null) {
            a2.n(abmp.f);
            playbackStartDescriptor = a2;
        }
        else {
            playbackStartDescriptor = null;
        }
        return playbackStartDescriptor != null && aaiy.g(this.f, playbackStartDescriptor.b, this.i.u());
    }
    
    public final void b() {
        this.e.b();
    }
    
    public final void c() {
        final boolean k = this.g.k();
        boolean c = false;
        if (!k) {
            this.c = false;
            return;
        }
        if (this.d(abmp.c) || this.d(abmp.d)) {
            c = true;
        }
        this.c = c;
        if (this.c) {
            this.a();
        }
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = abns.O().j(aajj.t(abns.bN(), 16777216L)).j(aajj.r(1)).am((asix)new abbr(this, 13), (asix)abdi.c);
        asic asic;
        if (((uyi)abns.cd().h).bx()) {
            asic = abns.R().am((asix)new abbr(this, 14), (asix)abdi.c);
        }
        else {
            asic = abns.Q().j(aajj.t(abns.bN(), 16777216L)).j(aajj.r(1)).am((asix)new abbr(this, 14), (asix)abdi.c);
        }
        return new asic[] { am, asic };
    }
}
