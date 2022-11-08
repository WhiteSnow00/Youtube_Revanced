import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jai implements abnq, jaj
{
    public final fjp a;
    public final arhr b;
    public final arhr c;
    public final atid d;
    public final float e;
    public final boolean f;
    public boolean g;
    private final arhr h;
    private final arhr i;
    private final ira j;
    private final atid k;
    private final atid l;
    private final asho m;
    private final int n;
    private final int o;
    private final long p;
    private final boolean q;
    private jah r;
    private final uyi s;
    
    public jai(final Context context, final uyi uyi, final uyi s, final asho m, final fjp a, final arhr h, final ira j, final arhr b, final arhr i, final arhr c) {
        this.m = m;
        this.h = h;
        this.b = b;
        this.i = i;
        this.c = c;
        this.a = a;
        this.s = s;
        this.j = j;
        final boolean cd = uyi.cD();
        boolean f = true;
        if (!cd) {
            f = (s.aV() && f);
        }
        this.f = f;
        this.q = s.f(45382992L);
        this.r = jah.a;
        this.n = context.getResources().getDimensionPixelSize(2131170240);
        this.o = context.getResources().getDimensionPixelSize(2131170241);
        this.e = (float)context.getResources().getDimensionPixelOffset(2131166484);
        this.p = context.getResources().getInteger(17694720);
        this.k = atid.aE((Object)jah.a);
        this.d = atid.aE((Object)0.0f);
        this.l = atid.aE((Object)0L);
    }
    
    public static boolean k(final jah jah) {
        return jah != jah.a;
    }
    
    private final void n() {
        this.d(jah.c);
        final Float n = (Float)this.d.aF();
        Float n2;
        if (n == null) {
            n2 = this.e;
        }
        else {
            n2 = aeh.u((float)n, this.e);
        }
        final long p = this.p;
        final float e = this.e;
        final float floatValue = n2;
        final float e2 = this.e;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { n2, this.e });
        ofFloat.setDuration((long)(p * (e - floatValue) / e2));
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(this, 13));
        ofFloat.addListener(tmy.aa((tpd)new jag(this, 1)));
        ofFloat.start();
    }
    
    public final jah a() {
        jah jah;
        if (this.f) {
            jah = this.r;
        }
        else {
            jah = jah.a;
        }
        return jah;
    }
    
    public final asgt b() {
        return ((asgt)this.k).p();
    }
    
    public final asgt c() {
        return ((asgt)this.l).p();
    }
    
    public final void d(final jah r) {
        if (this.f) {
            if (this.r != r) {
                Label_0103: {
                    if (r == jah.d || r == jah.b || r == jah.c) {
                        if (this.g) {
                            if (!this.q) {
                                break Label_0103;
                            }
                            final aaly j = this.j.j();
                            if (j == null) {
                                break Label_0103;
                            }
                            final abim c = j.c();
                            if (c != abim.f && c != abim.e && c != abim.d) {
                                break Label_0103;
                            }
                        }
                        return;
                    }
                }
                this.r = r;
                this.k.tr((Object)r);
            }
        }
    }
    
    public final void f(final long n) {
        if (this.j()) {
            this.l.tr((Object)n);
        }
    }
    
    public final void g(final boolean b, final boolean b2) {
        if (this.f && this.r != jah.a) {
            if (this.r != jah.e) {
                if (b) {
                    this.d(jah.e);
                    Float value;
                    if ((value = (Float)this.d.aF()) == null) {
                        value = 0.0f;
                    }
                    final long p2 = this.p;
                    final float floatValue = value;
                    final float e = this.e;
                    final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { value, 0.0f });
                    ofFloat.setDuration((long)(p2 * floatValue / e));
                    ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(this, 14));
                    ofFloat.addListener(tmy.aa((tpd)new jag(this, 0)));
                    ofFloat.start();
                }
                else {
                    this.d.tr((Object)0.0f);
                    this.d(jah.a);
                }
                if (b2) {
                    ((abno)((arcv)this.i.a()).b).D();
                }
            }
        }
    }
    
    public final boolean h() {
        return this.s.f(45379021L);
    }
    
    final boolean i() {
        return this.s.f(45381958L);
    }
    
    public final boolean j() {
        return k(this.r);
    }
    
    final boolean l(final float n) {
        if (!this.f) {
            return false;
        }
        final jah a = jah.a;
        final int ordinal = this.r.ordinal();
        Label_0140: {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        break Label_0140;
                    }
                    if (ordinal != 5) {
                        return false;
                    }
                }
                if (n >= this.o) {
                    ((agkb)this.h.a()).i();
                    this.g(true, true);
                    return true;
                }
                if (n > 0.0f) {
                    this.d(jah.f);
                    final atid d = this.d;
                    final float e = this.e;
                    d.tr((Object)aeh.u(e - n, e));
                    return false;
                }
                this.d(jah.b);
                this.d.tr((Object)this.e);
                return false;
            }
        }
        if (n < 0.0f && Math.abs(n) >= this.n) {
            ((agkb)this.h.a()).i();
            this.n();
            return true;
        }
        if (n < 0.0f) {
            this.d(jah.d);
            this.d.tr((Object)aeh.u(Math.abs(n), this.e));
            return false;
        }
        this.g(true, true);
        return false;
    }
    
    public final asic[] lX(final abns abns) {
        asic asic;
        if (((uyi)abns.cd().h).bx()) {
            asic = abns.R().am((asix)new iys(this, 18), (asix)iwn.n);
        }
        else {
            asic = abns.Q().R().P(this.m).am((asix)new iys(this, 18), (asix)iwn.n);
        }
        return new asic[] { asic };
    }
    
    final boolean m(final float n) {
        if (!this.f) {
            return false;
        }
        final jah a = jah.a;
        final int ordinal = this.r.ordinal();
        Label_0081: {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        break Label_0081;
                    }
                    if (ordinal != 5) {
                        return false;
                    }
                }
                if (n >= this.o) {
                    ((agkb)this.h.a()).i();
                    this.g(true, true);
                    return true;
                }
                this.n();
                return false;
            }
        }
        if (n < 0.0f && Math.abs(n) >= this.n) {
            ((agkb)this.h.a()).i();
            this.n();
            return true;
        }
        this.g(true, true);
        return false;
    }
}
