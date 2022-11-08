import android.net.Uri;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boq extends bmr implements bok
{
    private final ayt a;
    private final ayp b;
    private final bbj c;
    private final bkr d;
    private final brh e;
    private final int f;
    private boolean g;
    private long h;
    private boolean i;
    private boolean j;
    private bcn k;
    private final qpt l;
    
    public boq(final ayt a, final bbj c, final qpt l, final bkr d, final brh e, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        final ayp b = a.b;
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
        final bpb bpb = (bpb)(o = new bpb(this.h, this.i, (boolean)(0 != 0), this.j, this.a));
        if (this.g) {
            o = new boo((azl)bpb);
        }
        this.y((azl)o);
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
    
    public final ayt sJ() {
        return this.a;
    }
    
    public final void sK() {
    }
    
    protected final void sL(final bcn k) {
        this.k = k;
        this.d.c();
        final bkr d = this.d;
        final Looper myLooper = Looper.myLooper();
        dk.d((Object)myLooper);
        d.e(myLooper, this.q());
        this.d();
    }
    
    public final void sM(final bnu bnu) {
        final bon bon = (bon)bnu;
        if (bon.l) {
            final bou[] k = bon.k;
            for (int length = k.length, i = 0; i < length; ++i) {
                k[i].u();
            }
        }
        bon.e.e((brl)bon);
        bon.h.removeCallbacksAndMessages((Object)null);
        bon.i = null;
        bon.s = true;
    }
    
    protected final void sN() {
        this.d.d();
    }
    
    public final bnu sO(final ayx ayx, final bre bre, final long n) {
        final bbk a = this.c.a();
        final bcn k = this.k;
        if (k != null) {
            a.e(k);
        }
        final Uri a2 = this.b.a;
        final qpt l = this.l;
        this.q();
        return (bnu)new bon(a2, a, (boi)new bmt((btm)l.a), this.d, this.F(ayx), this.e, this.C(ayx), (bok)this, bre, this.f, null, null, null, null);
    }
}
