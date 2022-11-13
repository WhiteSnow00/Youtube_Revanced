import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abes extends tfa implements abps
{
    public final abpu d;
    public final asiq e;
    public vgs f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final aiqj j;
    private final WillAutonavInformer k;
    
    public abes(final aiqj j, final WillAutonavInformer k, final abpu d) {
        this.e = new asiq();
        this.j = j;
        this.k = k;
        this.d = d;
    }
    
    public final void b() {
        this.e.b();
    }
    
    public final void c() {
        final vgs f = this.f;
        if (f == null) {
            this.c = false;
            return;
        }
        final vgp a = f.a(this.g, this.h, this.i, false);
        if (a == null) {
            this.c = false;
            return;
        }
        if (!aakt.f(this.j, a.b()) && (!aakt.f(this.j, a.a()) || !this.k.k())) {
            this.c = false;
            return;
        }
        this.c = true;
        this.a();
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = abpu.N().j(aale.s(abpu.bM(), 16777216L)).j(aale.q(1)).an((asjm)new abdd(this, 11), abba.s);
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an((asjm)new abdd(this, 12), abba.s);
        }
        else {
            asir = abpu.P().j(aale.s(abpu.bM(), 16777216L)).j(aale.q(1)).an((asjm)new abdd(this, 12), abba.s);
        }
        return new asir[] { an, asir };
    }
}
