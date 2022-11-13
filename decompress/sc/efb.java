import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import java.util.Collections;
import android.text.TextUtils$TruncateAt;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import android.text.method.MovementMethod;
import java.util.List;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efb extends dst
{
    public static final int U = 0;
    @dyi(a = 13)
    @dyj(a = dyk.l)
    public Drawable A;
    @dyi(a = 5)
    @dyj(a = dyk.a)
    final List B;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int C;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int D;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    final MovementMethod E;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean F;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int G;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int H;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public ColorStateList I;
    @dyi(a = 3)
    @dyj(a = dyk.j)
    public int J;
    @dyi(a = 5)
    @dyj(a = dyk.a)
    public List K;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public Typeface L;
    public dun M;
    dun N;
    bhv O;
    bhv P;
    bhv Q;
    bhv R;
    bhv S;
    bhv T;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    public int a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    TextUtils$TruncateAt b;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean c;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    int d;
    @dyi(a = 13)
    @dyj(a = dyk.g)
    public Integer e;
    @dyi(a = 13)
    @dyj(a = dyk.b)
    public CharSequence f;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    final ColorStateList g;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int y;
    @dyi(a = 13)
    @dyj(a = dyk.b)
    public CharSequence z;
    
    public efb() {
        super("TextInput");
        this.d = 8388627;
        this.f = efg.d;
        this.g = efg.c;
        this.y = 0;
        this.z = efg.e;
        this.A = efg.f;
        this.B = Collections.emptyList();
        this.C = 1;
        this.D = Integer.MAX_VALUE;
        this.E = efg.h;
        this.F = false;
        this.G = 0;
        this.H = 1;
        this.I = efg.b;
        this.J = -1;
        this.K = Collections.emptyList();
        this.L = efg.g;
    }
    
    private final efa b() {
        return (efa)super.s;
    }
    
    public final void J(final hhg hhg) {
        final bhv o = this.O;
        if (o != null) {
            hhg.j(o);
        }
        final bhv p = this.P;
        if (p != null) {
            hhg.j(p);
        }
        final bhv q = this.Q;
        if (q != null) {
            hhg.j(q);
        }
        final bhv r = this.R;
        if (r != null) {
            hhg.j(r);
        }
        final bhv s = this.S;
        if (s != null) {
            hhg.j(s);
        }
        final bhv t = this.T;
        if (t != null) {
            hhg.j(t);
        }
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return efg.b(context);
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        efg.j(elx, elx2, elx3, this.z);
        this.b().b = (AtomicReference)elx.a;
        this.b().c = (AtomicReference)elx2.a;
        this.b().a = (Integer)elx3.a;
    }
    
    protected final void X(final dsx dsx, final Object o) {
        efg.c(dsx, (efe)o, this.K);
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        efg.g(dsx, n, n2, dwq, this.f, this.A, this.I, this.g, this.e, this.J, this.L, this.H, this.d, this.C, this.y, this.B, this.F, this.b, this.D, this.a, this.b().c);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        efg.h(dsx, (efe)o, this.f, this.A, this.I, this.g, this.e, this.J, this.L, this.H, this.d, this.C, this.G, this.y, this.B, this.F, this.D, this.b, this.E, this.c, this.a, this.b().c, this.b().b);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        efg.e((efe)o, this.b().b);
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        final efa efa = (efa)dwr;
        final efa efa2 = (efa)dwr2;
        efa2.a = efa.a;
        efa2.b = efa.b;
        efa2.c = efa.c;
    }
    
    protected final boolean af() {
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
        efg.d((efe)o);
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        final efb efb = (efb)dst;
        final efb efb2 = (efb)dst2;
        Object z;
        if (efb == null) {
            z = null;
        }
        else {
            z = efb.z;
        }
        final dub dub = new dub(z, (Object)efb2.z);
        Object f;
        if (efb == null) {
            f = null;
        }
        else {
            f = efb.f;
        }
        final dub dub2 = new dub(f, (Object)efb2.f);
        Object a;
        if (efb == null) {
            a = null;
        }
        else {
            a = efb.A;
        }
        final dub dub3 = new dub(a, (Object)efb2.A);
        Object value;
        if (efb == null) {
            value = null;
        }
        else {
            value = 0.0f;
        }
        final Float value2 = 0.0f;
        final dub dub4 = new dub(value, (Object)value2);
        Object o;
        if (efb == null) {
            o = null;
        }
        else {
            o = value2;
        }
        final dub dub5 = new dub(o, (Object)value2);
        final dub dub6 = new dub(o, (Object)value2);
        Object value3;
        if (efb == null) {
            value3 = null;
        }
        else {
            value3 = -7829368;
        }
        final dub dub7 = new dub(value3, (Object)(-7829368));
        Object i;
        if (efb == null) {
            i = null;
        }
        else {
            i = efb.I;
        }
        final dub dub8 = new dub(i, (Object)efb2.I);
        Object g;
        if (efb == null) {
            g = null;
        }
        else {
            g = efb.g;
        }
        final dub dub9 = new dub(g, (Object)efb2.g);
        Object e;
        if (efb == null) {
            e = null;
        }
        else {
            e = efb.e;
        }
        final dub dub10 = new dub(e, (Object)efb2.e);
        Object value4;
        if (efb == null) {
            value4 = null;
        }
        else {
            value4 = efb.J;
        }
        final dub dub11 = new dub(value4, (Object)efb2.J);
        Object l;
        if (efb == null) {
            l = null;
        }
        else {
            l = efb.L;
        }
        final dub dub12 = new dub(l, (Object)efb2.L);
        Object value5;
        if (efb == null) {
            value5 = null;
        }
        else {
            value5 = efb.H;
        }
        final dub dub13 = new dub(value5, (Object)efb2.H);
        Object value6;
        if (efb == null) {
            value6 = null;
        }
        else {
            value6 = efb.d;
        }
        final dub dub14 = new dub(value6, (Object)efb2.d);
        Object value7;
        if (efb == null) {
            value7 = null;
        }
        else {
            value7 = true;
        }
        final dub dub15 = new dub(value7, (Object)true);
        Object value8;
        if (efb == null) {
            value8 = null;
        }
        else {
            value8 = efb.C;
        }
        final dub dub16 = new dub(value8, (Object)efb2.C);
        Object value9;
        if (efb == null) {
            value9 = null;
        }
        else {
            value9 = efb.y;
        }
        final dub dub17 = new dub(value9, (Object)efb2.y);
        Object b;
        if (efb == null) {
            b = null;
        }
        else {
            b = efb.B;
        }
        final dub dub18 = new dub(b, (Object)efb2.B);
        Object b2;
        if (efb == null) {
            b2 = null;
        }
        else {
            b2 = efb.b;
        }
        final dub dub19 = new dub(b2, (Object)efb2.b);
        Object value10;
        if (efb == null) {
            value10 = null;
        }
        else {
            value10 = efb.F;
        }
        final dub dub20 = new dub(value10, (Object)efb2.F);
        Object value11;
        if (efb == null) {
            value11 = null;
        }
        else {
            value11 = 1;
        }
        final dub dub21 = new dub(value11, (Object)1);
        Object value12;
        if (efb == null) {
            value12 = null;
        }
        else {
            value12 = efb.D;
        }
        final dub dub22 = new dub(value12, (Object)efb2.D);
        Object value13;
        if (efb == null) {
            value13 = null;
        }
        else {
            value13 = -1;
        }
        final dub dub23 = new dub(value13, (Object)(-1));
        Object e2;
        if (efb == null) {
            e2 = null;
        }
        else {
            e2 = efb.E;
        }
        final dub dub24 = new dub(e2, (Object)efb2.E);
        Object a2 = null;
        final dub dub25 = new dub((Object)null, (Object)null);
        if (efb != null) {
            a2 = efb.b().a;
        }
        final dub dub26 = new dub(a2, (Object)efb2.b().a);
        Object b3;
        if (efb == null) {
            b3 = null;
        }
        else {
            b3 = efb.b().b;
        }
        final dub dub27 = new dub(b3, (Object)efb2.b().b);
        Object c;
        if (efb == null) {
            c = null;
        }
        else {
            c = efb.b().c;
        }
        return efg.f(dub, dub2, dub3, dub4, dub5, dub6, dub7, dub8, dub9, dub10, dub11, dub12, dub13, dub14, dub15, dub16, dub17, dub18, dub19, dub20, dub21, dub22, dub23, dub24, dub25, dub26, dub27, new dub(c, (Object)efb2.b().c));
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst == null || this.getClass() != dst.getClass()) {
            return false;
        }
        final efb efb = (efb)dst;
        if (this.a != efb.a) {
            return false;
        }
        final TextUtils$TruncateAt b = this.b;
        Label_0075: {
            if (b != null) {
                if (b.equals((Object)efb.b)) {
                    break Label_0075;
                }
            }
            else if (efb.b == null) {
                break Label_0075;
            }
            return false;
        }
        if (this.c != efb.c) {
            return false;
        }
        if (this.d != efb.d) {
            return false;
        }
        final Integer e = this.e;
        Label_0133: {
            if (e != null) {
                if (e.equals(efb.e)) {
                    break Label_0133;
                }
            }
            else if (efb.e == null) {
                break Label_0133;
            }
            return false;
        }
        final CharSequence f = this.f;
        Label_0165: {
            if (f != null) {
                if (f.equals(efb.f)) {
                    break Label_0165;
                }
            }
            else if (efb.f == null) {
                break Label_0165;
            }
            return false;
        }
        final ColorStateList g = this.g;
        Label_0197: {
            if (g != null) {
                if (g.equals(efb.g)) {
                    break Label_0197;
                }
            }
            else if (efb.g == null) {
                break Label_0197;
            }
            return false;
        }
        if (this.y != efb.y) {
            return false;
        }
        final CharSequence z = this.z;
        Label_0242: {
            if (z != null) {
                if (z.equals(efb.z)) {
                    break Label_0242;
                }
            }
            else if (efb.z == null) {
                break Label_0242;
            }
            return false;
        }
        final Drawable a = this.A;
        Label_0274: {
            if (a != null) {
                if (a.equals(efb.A)) {
                    break Label_0274;
                }
            }
            else if (efb.A == null) {
                break Label_0274;
            }
            return false;
        }
        final List b2 = this.B;
        Label_0306: {
            if (b2 != null) {
                if (b2.equals(efb.B)) {
                    break Label_0306;
                }
            }
            else if (efb.B == null) {
                break Label_0306;
            }
            return false;
        }
        if (this.C != efb.C) {
            return false;
        }
        if (this.D != efb.D) {
            return false;
        }
        final MovementMethod e2 = this.E;
        Label_0364: {
            if (e2 != null) {
                if (e2.equals(efb.E)) {
                    break Label_0364;
                }
            }
            else if (efb.E == null) {
                break Label_0364;
            }
            return false;
        }
        if (this.F != efb.F) {
            return false;
        }
        if (this.G != efb.G) {
            return false;
        }
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        if (this.H != efb.H) {
            return false;
        }
        final ColorStateList i = this.I;
        Label_0465: {
            if (i != null) {
                if (i.equals(efb.I)) {
                    break Label_0465;
                }
            }
            else if (efb.I == null) {
                break Label_0465;
            }
            return false;
        }
        if (this.J != efb.J) {
            return false;
        }
        final List k = this.K;
        Label_0510: {
            if (k != null) {
                if (k.equals(efb.K)) {
                    break Label_0510;
                }
            }
            else if (efb.K == null) {
                break Label_0510;
            }
            return false;
        }
        final Typeface l = this.L;
        if (l != null) {
            if (l.equals((Object)efb.L)) {
                return true;
            }
        }
        else if (efb.L == null) {
            return true;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final efb efb = (efb)super.j();
        efb.s = (dwr)new efa();
        return efb;
    }
    
    protected final /* bridge */ dwr o() {
        return (dwr)new efa();
    }
}
