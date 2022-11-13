import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbh implements abps, jbi
{
    public final fjv a;
    public final arkg b;
    public final arkg c;
    public final ativ d;
    public final float e;
    public final boolean f;
    public boolean g;
    private final arkg h;
    private final arkg i;
    private final irz j;
    private final ativ k;
    private final ativ l;
    private final asid m;
    private final int n;
    private final int o;
    private final long p;
    private final boolean q;
    private jbg r;
    private final vai s;
    
    public jbh(final Context context, final vai vai, final vai s, final asid m, final fjv a, final arkg h, final irz j, final arkg b, final arkg i, final arkg c) {
        this.m = m;
        this.h = h;
        this.b = b;
        this.i = i;
        this.c = c;
        this.a = a;
        this.s = s;
        this.j = j;
        final boolean cf = vai.cF();
        boolean f = true;
        if (!cf) {
            f = (s.aW() && f);
        }
        this.f = f;
        this.q = s.f(45382992L);
        this.r = jbg.a;
        this.n = context.getResources().getDimensionPixelSize(2131170241);
        this.o = context.getResources().getDimensionPixelSize(2131170242);
        this.e = (float)context.getResources().getDimensionPixelOffset(2131166483);
        this.p = context.getResources().getInteger(17694720);
        this.k = ativ.aF((Object)jbg.a);
        this.d = ativ.aF((Object)0.0f);
        this.l = ativ.aF((Object)0L);
    }
    
    public static boolean k(final jbg jbg) {
        return jbg != jbg.a;
    }
    
    private final void n() {
        this.d(jbg.c);
        final Float n = (Float)this.d.aG();
        Float n2;
        if (n == null) {
            n2 = this.e;
        }
        else {
            n2 = aei.u((float)n, this.e);
        }
        final float n3 = this.p * (this.e - n2) / this.e;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { n2, this.e });
        ofFloat.setDuration((long)n3);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(this, 13));
        ofFloat.addListener(tpe.aa((tri)new jbf(this, 1)));
        ofFloat.start();
    }
    
    public final jbg a() {
        jbg jbg;
        if (this.f) {
            jbg = this.r;
        }
        else {
            jbg = jbg.a;
        }
        return jbg;
    }
    
    public final ashi b() {
        return ((ashi)this.k).p();
    }
    
    public final ashi c() {
        return ((ashi)this.l).p();
    }
    
    public final void d(final jbg r) {
        if (this.f) {
            if (this.r != r) {
                Label_0103: {
                    if (r == jbg.d || r == jbg.b || r == jbg.c) {
                        if (this.g) {
                            if (!this.q) {
                                break Label_0103;
                            }
                            final aans j = this.j.j();
                            if (j == null) {
                                break Label_0103;
                            }
                            final abke c = j.c();
                            if (c != abke.f && c != abke.e && c != abke.d) {
                                break Label_0103;
                            }
                        }
                        return;
                    }
                }
                this.r = r;
                this.k.tu((Object)r);
            }
        }
    }
    
    public final void f(final long n) {
        if (this.j()) {
            this.l.tu((Object)n);
        }
    }
    
    public final void g(final boolean b, final boolean b2) {
        if (this.f && this.r != jbg.a) {
            if (this.r != jbg.e) {
                if (b) {
                    this.d(jbg.e);
                    Float value;
                    if ((value = (Float)this.d.aG()) == null) {
                        value = 0.0f;
                    }
                    final float n = this.p * value / this.e;
                    final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { value, 0.0f });
                    ofFloat.setDuration((long)n);
                    ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(this, 14));
                    ofFloat.addListener(tpe.aa((tri)new jbf(this, 0)));
                    ofFloat.start();
                }
                else {
                    this.d.tu((Object)0.0f);
                    this.d(jbg.a);
                }
                if (b2) {
                    ((abpq)((arfk)this.i.a()).b).C();
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
        final jbg a = jbg.a;
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
                    ((agmc)this.h.a()).i();
                    this.g(true, true);
                    return true;
                }
                if (n > 0.0f) {
                    this.d(jbg.f);
                    final ativ d = this.d;
                    final float e = this.e;
                    d.tu((Object)aei.u(e - n, e));
                    return false;
                }
                this.d(jbg.b);
                this.d.tu((Object)this.e);
                return false;
            }
        }
        if (n < 0.0f && Math.abs(n) >= this.n) {
            ((agmc)this.h.a()).i();
            this.n();
            return true;
        }
        if (n < 0.0f) {
            this.d(jbg.d);
            this.d.tu((Object)aei.u(Math.abs(n), this.e));
            return false;
        }
        this.g(true, true);
        return false;
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an((asjm)new izs(this, 17), (asjm)ixp.m);
        }
        else {
            asir = abpu.P().R().P(this.m).an((asjm)new izs(this, 17), (asjm)ixp.m);
        }
        return new asir[] { asir };
    }
    
    final boolean m(final float n) {
        if (!this.f) {
            return false;
        }
        final jbg a = jbg.a;
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
                    ((agmc)this.h.a()).i();
                    this.g(true, true);
                    return true;
                }
                this.n();
                return false;
            }
        }
        if (n < 0.0f && Math.abs(n) >= this.n) {
            ((agmc)this.h.a()).i();
            this.n();
            return true;
        }
        this.g(true, true);
        return false;
    }
}
