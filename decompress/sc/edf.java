import android.content.Context;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edf extends dst
{
    public static final int R = 0;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean A;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public oa B;
    @dyi(a = 5)
    @dyj(a = dyk.a)
    public List C;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int D;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean E;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int F;
    @dyi(a = 11)
    @dyj(a = dyk.a)
    public dun G;
    @dyi(a = 13)
    @dyj(a = dyk.g)
    public Integer H;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    public int I;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int J;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int K;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int L;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean M;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public nz N;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public hy O;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public atib P;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public elx Q;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public ebk a;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int b;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    boolean c;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean d;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CharSequence e;
    @dyi(a = 3)
    @dyj(a = dyk.h)
    public int f;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean g;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public nt y;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int z;
    
    public edf() {
        super("Recycler");
        this.b = 0;
        this.c = true;
        this.d = true;
        this.y = eeh.a;
        this.z = 0;
        this.A = true;
        this.C = Collections.emptyList();
        this.D = 0;
        this.E = true;
        this.F = -1;
        this.I = -16777216;
        this.J = 0;
        this.K = 0;
        this.L = 0;
    }
    
    private final ede b() {
        return (ede)super.s;
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object Q(final dun dun, final Object o) {
        final int c = dun.c;
        if (c == -1048037474) {
            coy.e((dsx)dun.d[0], (duk)o);
            return null;
        }
        if (c != 946341036) {
            return null;
        }
        final edc edc = (edc)o;
        eeh.b((dsx)dun.d[0], ((edf)dun.b).b().a);
        return null;
    }
    
    protected final Object R(final Context context) {
        return eeh.a(context);
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        eeh.i(elx);
        this.b().a = (int)elx.a;
    }
    
    protected final void X(final dsx dsx, final Object o) {
        eeh.l((eem)o, this.a, this.P, this.C, this.N, this.E, this.Q, this.B, this.G);
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        eeh.d(dtb, this.a);
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        eeh.e(dsx, n, n2, dwq, this.a);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        eeh.g((eem)o, this.a, this.d, this.z, this.J, this.L, this.b, this.I, this.c, this.A, this.f, this.F, this.D, this.e, this.y);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        eeh.f((eem)o, this.a, this.N);
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        ((ede)dwr2).a = ((ede)dwr).a;
    }
    
    protected final boolean af() {
        return true;
    }
    
    public final boolean ah() {
        return true;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final void aw(final Object o) {
        eeh.k((eem)o, this.a, this.P, this.B, this.C);
    }
    
    public final void ax() {
        eeh.h(this.a);
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        final edf edf = (edf)dst;
        final edf edf2 = (edf)dst2;
        Object a;
        if (edf == null) {
            a = null;
        }
        else {
            a = edf.a;
        }
        final dub dub = new dub(a, (Object)edf2.a);
        Object value;
        if (edf == null) {
            value = null;
        }
        else {
            value = true;
        }
        final dub dub2 = new dub(value, (Object)true);
        Object value2;
        if (edf == null) {
            value2 = null;
        }
        else {
            value2 = edf.d;
        }
        final dub dub3 = new dub(value2, (Object)edf2.d);
        Object value3;
        if (edf == null) {
            value3 = null;
        }
        else {
            value3 = edf.z;
        }
        final dub dub4 = new dub(value3, (Object)edf2.z);
        Object value4;
        if (edf == null) {
            value4 = null;
        }
        else {
            value4 = edf.J;
        }
        final dub dub5 = new dub(value4, (Object)edf2.J);
        Object value5;
        if (edf == null) {
            value5 = null;
        }
        else {
            value5 = edf.L;
        }
        final dub dub6 = new dub(value5, (Object)edf2.L);
        Object value6;
        if (edf == null) {
            value6 = null;
        }
        else {
            value6 = edf.b;
        }
        final dub dub7 = new dub(value6, (Object)edf2.b);
        final dub dub8 = new dub((Object)null, (Object)null);
        Object value7;
        if (edf == null) {
            value7 = null;
        }
        else {
            value7 = edf.I;
        }
        final dub dub9 = new dub(value7, (Object)edf2.I);
        Object value8;
        if (edf == null) {
            value8 = null;
        }
        else {
            value8 = edf.c;
        }
        final dub dub10 = new dub(value8, (Object)edf2.c);
        Object value9;
        if (edf == null) {
            value9 = null;
        }
        else {
            value9 = 0;
        }
        final dub dub11 = new dub(value9, (Object)0);
        Object value10 = null;
        final dub dub12 = new dub((Object)null, (Object)null);
        if (edf != null) {
            value10 = false;
        }
        final Boolean value11 = false;
        final dub dub13 = new dub(value10, (Object)value11);
        Object o;
        if (edf == null) {
            o = null;
        }
        else {
            o = value11;
        }
        final dub dub14 = new dub(o, (Object)value11);
        Object value12;
        if (edf == null) {
            value12 = null;
        }
        else {
            value12 = edf.f;
        }
        final dub dub15 = new dub(value12, (Object)edf2.f);
        Object y;
        if (edf == null) {
            y = null;
        }
        else {
            y = edf.y;
        }
        final dub dub16 = new dub(y, (Object)edf2.y);
        Object value13;
        if (edf == null) {
            value13 = null;
        }
        else {
            value13 = edf.b().a;
        }
        return eeh.c(dub, dub2, dub3, dub4, dub5, dub6, dub7, dub8, dub9, dub10, dub11, dub12, dub13, dub14, dub15, dub16, new dub(value13, (Object)edf2.b().a));
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst == null || this.getClass() != dst.getClass()) {
            return false;
        }
        final edf edf = (edf)dst;
        final ebk a = this.a;
        Label_0062: {
            if (a != null) {
                if (a.equals(edf.a)) {
                    break Label_0062;
                }
            }
            else if (edf.a == null) {
                break Label_0062;
            }
            return false;
        }
        if (this.b != edf.b) {
            return false;
        }
        if (this.c != edf.c) {
            return false;
        }
        if (this.d != edf.d) {
            return false;
        }
        final CharSequence e = this.e;
        Label_0133: {
            if (e != null) {
                if (e.equals(edf.e)) {
                    break Label_0133;
                }
            }
            else if (edf.e == null) {
                break Label_0133;
            }
            return false;
        }
        if (this.f != edf.f) {
            return false;
        }
        final nt y = this.y;
        Label_0178: {
            if (y != null) {
                if (y.equals(edf.y)) {
                    break Label_0178;
                }
            }
            else if (edf.y == null) {
                break Label_0178;
            }
            return false;
        }
        if (this.z != edf.z) {
            return false;
        }
        if (this.A != edf.A) {
            return false;
        }
        final oa b = this.B;
        Label_0236: {
            if (b != null) {
                if (b.equals(edf.B)) {
                    break Label_0236;
                }
            }
            else if (edf.B == null) {
                break Label_0236;
            }
            return false;
        }
        final List c = this.C;
        Label_0268: {
            if (c != null) {
                if (c.equals(edf.C)) {
                    break Label_0268;
                }
            }
            else if (edf.C == null) {
                break Label_0268;
            }
            return false;
        }
        if (this.D != edf.D) {
            return false;
        }
        if (this.E != edf.E) {
            return false;
        }
        final atib p = this.P;
        Label_0326: {
            if (p != null) {
                if (p.equals(edf.P)) {
                    break Label_0326;
                }
            }
            else if (edf.P == null) {
                break Label_0326;
            }
            return false;
        }
        if (this.F != edf.F) {
            return false;
        }
        final dun g = this.G;
        Label_0371: {
            if (g != null) {
                if (g.c(edf.G)) {
                    break Label_0371;
                }
            }
            else if (edf.G == null) {
                break Label_0371;
            }
            return false;
        }
        if (this.I != edf.I) {
            return false;
        }
        if (this.J != edf.J) {
            return false;
        }
        final nz n = this.N;
        Label_0429: {
            if (n != null) {
                if (n.equals(edf.N)) {
                    break Label_0429;
                }
            }
            else if (edf.N == null) {
                break Label_0429;
            }
            return false;
        }
        if (this.L != edf.L) {
            return false;
        }
        final elx q = this.Q;
        if (q != null) {
            if (q.equals((Object)edf.Q)) {
                return true;
            }
        }
        else if (edf.Q == null) {
            return true;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final edf edf = (edf)super.j();
        edf.s = (dwr)new ede();
        return edf;
    }
    
    protected final /* bridge */ dwr o() {
        return (dwr)new ede();
    }
}
