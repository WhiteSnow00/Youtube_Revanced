import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfh extends tfa implements abps
{
    public final abpu d;
    public final asiq e;
    private final aiqj f;
    private final WillAutonavInformer g;
    private final abqb h;
    private final abrj i;
    
    public abfh(final aiqj f, final WillAutonavInformer g, final abpu d, final abqb h, final abrj i, final byte[] array) {
        this.e = new asiq();
        this.f = f;
        this.g = g;
        this.d = d;
        this.h = h;
        this.i = i;
    }
    
    private final boolean d(final abop abop) {
        final aboj a = this.h.a();
        if (a == null) {
            return false;
        }
        final aboh aboh = (aboh)a;
        final PlaybackStartDescriptor a2 = aboh.a.a(abop);
        PlaybackStartDescriptor playbackStartDescriptor;
        if (aboh.j(abop) && a2 != null) {
            a2.n(abop.f);
            playbackStartDescriptor = a2;
        }
        else {
            playbackStartDescriptor = null;
        }
        return playbackStartDescriptor != null && aakt.g(this.f, playbackStartDescriptor.b, this.i.v());
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
        if (this.d(abop.c) || this.d(abop.d)) {
            c = true;
        }
        this.c = c;
        if (this.c) {
            this.a();
        }
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = abpu.N().j(aale.s(abpu.bM(), 16777216L)).j(aale.q(1)).an((asjm)new abdd(this, 18), (asjm)abfd.c);
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an((asjm)new abdd(this, 19), (asjm)abfd.c);
        }
        else {
            asir = abpu.P().j(aale.s(abpu.bM(), 16777216L)).j(aale.q(1)).an((asjm)new abdd(this, 19), (asjm)abfd.c);
        }
        return new asir[] { an, asir };
    }
}
