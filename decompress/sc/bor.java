import android.net.Uri;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bor extends bms implements bol
{
    private final ayu a;
    private final ayq b;
    private final bbk c;
    private final bks d;
    private final bri e;
    private final int f;
    private boolean g;
    private long h;
    private boolean i;
    private boolean j;
    private bco k;
    private final pvh l;
    
    public bor(final ayu a, final bbk c, final pvh l, final bks d, final bri e, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        final ayq b = a.b;
        dk.d((Object)b);
        this.b = b;
        this.a = a;
        this.c = c;
        this.l = l;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = true;
        this.h = -9223372036854775807L;
    }
    
    private final void d() {
        Object o;
        final bpc bpc = (bpc)(o = new bpc(this.h, this.i, (boolean)(0 != 0), this.j, this.a));
        if (this.g) {
            o = new bop((azm)bpc);
        }
        this.y((azm)o);
    }
    
    public final void b(final long n, final boolean i, final boolean j) {
        long h = n;
        if (n == -9223372036854775807L) {
            h = this.h;
        }
        if (!this.g && this.h == h && this.i == i && this.j == j) {
            return;
        }
        this.h = h;
        this.i = i;
        this.j = j;
        this.g = false;
        this.d();
    }
    
    public final ayu sP() {
        return this.a;
    }
    
    public final void sQ() {
    }
    
    protected final void sR(final bco k) {
        this.k = k;
        this.d.c();
        final bks d = this.d;
        final Looper myLooper = Looper.myLooper();
        dk.d((Object)myLooper);
        d.e(myLooper, this.q());
        this.d();
    }
    
    public final void sS(final bnv bnv) {
        final boo boo = (boo)bnv;
        if (boo.l) {
            final bov[] k = boo.k;
            for (int length = k.length, i = 0; i < length; ++i) {
                k[i].u();
            }
        }
        boo.e.e((brm)boo);
        boo.h.removeCallbacksAndMessages((Object)null);
        boo.i = null;
        boo.s = true;
    }
    
    protected final void sT() {
        this.d.d();
    }
    
    public final bnv sU(final ayy ayy, final brf brf, final long n) {
        final bbl a = this.c.a();
        final bco k = this.k;
        if (k != null) {
            a.e(k);
        }
        final Uri a2 = this.b.a;
        final pvh l = this.l;
        this.q();
        return (bnv)new boo(a2, a, (boj)new bmu((btn)l.a), this.d, this.F(ayy), this.e, this.C(ayy), this, brf, this.f, null, null, null, null);
    }
}
