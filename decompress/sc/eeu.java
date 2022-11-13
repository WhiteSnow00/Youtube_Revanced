import android.view.View;
import android.text.style.ImageSpan;
import android.text.style.ClickableSpan;
import android.text.Layout;
import android.content.Context;
import android.text.TextUtils$TruncateAt;
import android.graphics.Typeface;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eeu extends dst
{
    @dyi(a = 3)
    @dyj(a = dyk.d)
    public int A;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    public int B;
    @dyi(a = 0)
    @dyj(a = dyk.i)
    public float C;
    @dyi(a = 0)
    @dyj(a = dyk.i)
    public float D;
    @dyi(a = 0)
    @dyj(a = dyk.i)
    public float E;
    @dyi(a = 3)
    @dyj(a = dyk.f)
    public boolean F;
    @dyi(a = 13)
    @dyj(a = dyk.b)
    public CharSequence G;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    final ColorStateList H;
    @dyi(a = 3)
    @dyj(a = dyk.j)
    public int I;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    final int J;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean K;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public Typeface L;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    int M;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    final int N;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public elx O;
    @dyi(a = 3)
    @dyj(a = dyk.f)
    public boolean a;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int b;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean c;
    @dyi(a = 13)
    @dyj(a = dyk.b)
    public CharSequence d;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    TextUtils$TruncateAt e;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean f;
    @dyi(a = 0)
    @dyj(a = dyk.i)
    public float g;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    int y;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    public int z;
    
    public eeu() {
        super("Text");
        this.b = 0;
        this.c = true;
        this.z = -16776961;
        this.A = Integer.MAX_VALUE;
        this.B = -7829368;
        this.F = true;
        this.H = efi.a;
        this.I = -1;
        this.J = efi.b;
        this.L = efi.c;
        this.N = efi.d;
    }
    
    private final eet aD() {
        return (eet)super.t;
    }
    
    protected static final eet b() {
        return new eet();
    }
    
    protected final int K() {
        return 30;
    }
    
    protected final Object R(final Context context) {
        return efi.c();
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final elx elx4 = new elx();
        final elx elx5 = new elx();
        final CharSequence g = this.G;
        final TextUtils$TruncateAt e = this.e;
        final boolean f = this.F;
        final int a = this.A;
        final float e2 = this.E;
        final float c = this.C;
        final float d = this.D;
        final int b = this.B;
        final ColorStateList h = this.H;
        final int z = this.z;
        final int i = this.I;
        final float g2 = this.g;
        final int n = this.N;
        final int j = this.J;
        final Typeface l = this.L;
        final int m = this.M;
        final int b2 = this.b;
        final CharSequence d2 = this.d;
        final boolean f2 = this.f;
        final boolean k = this.K;
        final Layout b3 = this.aD().b;
        final Layout d3 = this.aD().d;
        final Integer g3 = this.aD().g;
        final Integer e3 = this.aD().e;
        final Float f3 = this.aD().f;
        efi.g(dsx, dtb, g, e, f, a, e2, c, d, b, h, z, i, g2, n, j, l, m, b2, d2, f2, k, b3, d3, g3, e3, elx, elx2, elx3, elx4, elx5);
        this.aD().h = (CharSequence)elx.a;
        this.aD().i = (Layout)elx2.a;
        this.aD().j = (Float)elx3.a;
        this.aD().a = (ClickableSpan[])elx4.a;
        this.aD().c = (ImageSpan[])elx5.a;
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final elx elx4 = new elx();
        final elx elx5 = new elx();
        efi.h(dsx, dtb, n, n2, dwq, this.G, this.e, this.F, this.A, this.E, this.C, this.D, this.B, this.H, this.z, this.I, this.d, this.g, this.J, this.L, this.M, this.b, elx, elx2, elx3, elx4, elx5);
        this.aD().d = (Layout)elx.a;
        this.aD().b = (Layout)elx2.a;
        this.aD().g = (Integer)elx3.a;
        this.aD().e = (Integer)elx4.a;
        this.aD().f = (Float)elx5.a;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        efi.i(dsx, (eey)o, this.y, this.H, this.c, this.O, this.aD().h, this.aD().i, this.aD().j, this.aD().a, this.aD().c);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        efi.e((eey)o, this.G);
    }
    
    protected final boolean af() {
        return true;
    }
    
    public final boolean aj() {
        return true;
    }
    
    public final boolean ak() {
        return true;
    }
    
    public final boolean al() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 2;
    }
    
    protected final int aq(final int n, final int n2) {
        return efi.a(n, n2, this.G, this.aD().i, this.aD().a);
    }
    
    protected final int ar() {
        return efi.b(this.a, this.aD().a);
    }
    
    protected final void au(final View view, final aom aom) {
        efi.f(view, aom, this.G);
    }
    
    protected final void av(final aom aom, final int n, final int n2, final int n3) {
        efi.d(aom, n, n2, n3, this.G, this.aD().i, this.aD().a);
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst == null || this.getClass() != dst.getClass()) {
            return false;
        }
        final eeu eeu = (eeu)dst;
        if (this.a != eeu.a) {
            return false;
        }
        final int m = this.M;
        Label_0072: {
            if (m != 0) {
                if (m == eeu.M) {
                    break Label_0072;
                }
            }
            else if (eeu.M == 0) {
                break Label_0072;
            }
            return false;
        }
        if (this.b != eeu.b) {
            return false;
        }
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        if (this.c != eeu.c) {
            return false;
        }
        final CharSequence d = this.d;
        Label_0143: {
            if (d != null) {
                if (d.equals(eeu.d)) {
                    break Label_0143;
                }
            }
            else if (eeu.d == null) {
                break Label_0143;
            }
            return false;
        }
        final TextUtils$TruncateAt e = this.e;
        Label_0178: {
            if (e != null) {
                if (e.equals((Object)eeu.e)) {
                    break Label_0178;
                }
            }
            else if (eeu.e == null) {
                break Label_0178;
            }
            return false;
        }
        if (this.f != eeu.f) {
            return false;
        }
        if (Float.compare(this.g, eeu.g) != 0) {
            return false;
        }
        if (this.y != eeu.y) {
            return false;
        }
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        if (Float.compare(Float.MAX_VALUE, Float.MAX_VALUE) != 0) {
            return false;
        }
        if (this.z != eeu.z) {
            return false;
        }
        if (this.A != eeu.A) {
            return false;
        }
        if (this.B != eeu.B) {
            return false;
        }
        if (Float.compare(this.C, eeu.C) != 0) {
            return false;
        }
        if (Float.compare(this.D, eeu.D) != 0) {
            return false;
        }
        if (Float.compare(this.E, eeu.E) != 0) {
            return false;
        }
        if (this.F != eeu.F) {
            return false;
        }
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        final CharSequence g = this.G;
        Label_0387: {
            if (g != null) {
                if (g.equals(eeu.G)) {
                    break Label_0387;
                }
            }
            else if (eeu.G == null) {
                break Label_0387;
            }
            return false;
        }
        final ColorStateList h = this.H;
        Label_0422: {
            if (h != null) {
                if (h.equals(eeu.H)) {
                    break Label_0422;
                }
            }
            else if (eeu.H == null) {
                break Label_0422;
            }
            return false;
        }
        final elx o = this.O;
        Label_0457: {
            if (o != null) {
                if (o.equals((Object)eeu.O)) {
                    break Label_0457;
                }
            }
            else if (eeu.O == null) {
                break Label_0457;
            }
            return false;
        }
        if (this.I != eeu.I) {
            return false;
        }
        if (this.J != eeu.J) {
            return false;
        }
        if (this.K != eeu.K) {
            return false;
        }
        final Typeface l = this.L;
        Label_0531: {
            if (l != null) {
                if (l.equals((Object)eeu.L)) {
                    break Label_0531;
                }
            }
            else if (eeu.L == null) {
                break Label_0531;
            }
            return false;
        }
        final int n = this.N;
        final int n2 = eeu.N;
        if (n != 0) {
            if (n2 == 1) {
                return true;
            }
        }
        else if (n2 == 0) {
            return true;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final eeu eeu = (eeu)super.j();
        eeu.t = (duz)b();
        return eeu;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final eet eet = (eet)duz;
        final eet eet2 = (eet)duz2;
        eet.a = eet2.a;
        eet.b = eet2.b;
        eet.c = eet2.c;
        eet.d = eet2.d;
        eet.e = eet2.e;
        eet.f = eet2.f;
        eet.g = eet2.g;
        eet.h = eet2.h;
        eet.i = eet2.i;
        eet.j = eet2.j;
    }
}
