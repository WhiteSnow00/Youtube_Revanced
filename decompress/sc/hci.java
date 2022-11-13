import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hci implements ubj
{
    public final Context a;
    public final azf b;
    public final bgc c;
    public boolean d;
    public boolean e;
    public hch f;
    public long g;
    public long h;
    public final hcl i;
    public bej j;
    public final aujg k;
    private final bbk l;
    
    public hci(final Context a, final hcl i, final aujg k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.k = k;
        this.l = (bbk)new bbs(a, bax.T(a, "AudioMPEG"));
        this.i = i;
        this.b = (azf)new hcf();
        this.c = (bgc)new hcg(this);
    }
    
    public final long a() {
        adkp.H(this.e);
        if (!this.d) {
            return 0L;
        }
        return this.j.o();
    }
    
    public final long b() {
        return this.g + this.h;
    }
    
    public final void c() {
        final bej j = this.j;
        if (j != null) {
            j.y(false);
        }
    }
    
    public final void d(final long n) {
        adkp.H(this.e);
        if (!this.d) {
            return;
        }
        this.j.e(n);
    }
    
    public final void e() {
        this.j.e(this.b());
    }
    
    public final void f(final float n) {
        this.j.z(new azc(n));
    }
    
    public final void g(final boolean b) {
        final bej j = this.j;
        if (j == null) {
            return;
        }
        if (b) {
            j.A(1);
            return;
        }
        j.A(0);
    }
    
    public final void h(final boolean a) {
        this.i.a = a;
    }
    
    public final void i(final Uri a) {
        final ayj ayj = new ayj();
        ayj.a = a;
        ayj.c(a.toString());
        this.j.M((bny)new boq(this.l).b(ayj.a()));
        this.j.u();
        this.e();
        this.d = true;
    }
    
    public final void j() {
        adkp.H(this.e);
        if (!this.d) {
            return;
        }
        this.j.y(true);
    }
}
