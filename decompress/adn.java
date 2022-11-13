// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adn implements adc
{
    public int c;
    public acs d;
    adk e;
    public final adf f;
    public int g;
    public boolean h;
    public final ade i;
    public final ade j;
    protected int k;
    protected int l;
    
    public adn(final acs d) {
        this.f = new adf(this);
        this.g = 0;
        this.h = false;
        this.i = new ade(this);
        this.j = new ade(this);
        this.l = 1;
        this.d = d;
    }
    
    protected static final void j(final ade ade, final ade ade2, final int e) {
        ade.k.add(ade2);
        ade.e = e;
        ade2.j.add(ade);
    }
    
    protected static final ade k(final acr acr) {
        final acr e = acr.e;
        if (e == null) {
            return null;
        }
        final acs d = e.d;
        final int n = e.i - 1;
        if (n == 1) {
            return d.h.i;
        }
        if (n == 2) {
            return d.i.i;
        }
        if (n == 3) {
            return d.h.j;
        }
        if (n == 4) {
            return d.i.j;
        }
        if (n != 5) {
            return null;
        }
        return d.i.a;
    }
    
    protected static final ade l(final acr acr, int n) {
        final acr e = acr.e;
        if (e == null) {
            return null;
        }
        final acs d = e.d;
        Object o;
        if (n == 0) {
            o = d.h;
        }
        else {
            o = d.i;
        }
        n = e.i - 1;
        if (n == 1 || n == 2) {
            return ((adn)o).i;
        }
        if (n != 3 && n != 4) {
            return null;
        }
        return ((adn)o).j;
    }
    
    public long a() {
        final adf f = this.f;
        if (f.i) {
            return f.f;
        }
        return 0L;
    }
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract boolean e();
    
    public void f() {
        throw null;
    }
    
    protected final int h(int n, int n2) {
        if (n2 == 0) {
            final acs d = this.d;
            final int w = d.w;
            n2 = Math.max(d.v, n);
            if (w > 0) {
                n2 = Math.min(w, n);
            }
            if (n2 != n) {
                n = n2;
            }
        }
        else {
            final acs d2 = this.d;
            final int z = d2.z;
            n2 = Math.max(d2.y, n);
            if (z > 0) {
                n2 = Math.min(z, n);
            }
            if (n2 != n) {
                return n2;
            }
        }
        return n;
    }
    
    protected final void i(final ade ade, final ade ade2, final int g, final adf h) {
        ade.k.add(ade2);
        ade.k.add(this.f);
        ade.g = g;
        ade.h = h;
        ade2.j.add(ade);
        h.j.add(ade);
    }
    
    protected final void m(final acr acr, final acr acr2, int f) {
        final ade k = k(acr);
        final ade i = k(acr2);
        if (k.i) {
            if (i.i) {
                final int n = k.f + acr.b();
                final int n2 = i.f - acr2.b();
                final adf f2 = this.f;
                final boolean j = f2.i;
                final int n3 = n2 - n;
                Label_0374: {
                    if (!j && this.k == 3) {
                        final int c = this.c;
                        if (c != 0) {
                            if (c != 1) {
                                if (c != 2) {
                                    if (c == 3) {
                                        final acs d = this.d;
                                        Object o = d.h;
                                        if (((adj)o).k == 3 && ((adj)o).c == 3) {
                                            final adl l = d.i;
                                            if (l.k == 3 && l.c == 3) {
                                                break Label_0374;
                                            }
                                        }
                                        if (f == 0) {
                                            o = d.i;
                                        }
                                        final adf f3 = ((adn)o).f;
                                        if (f3.i) {
                                            final float x = d.X;
                                            int n4;
                                            if (f == 1) {
                                                n4 = (int)(f3.f / x + 0.5f);
                                            }
                                            else {
                                                n4 = (int)(x * f3.f + 0.5f);
                                            }
                                            ((ade)f2).c(n4);
                                        }
                                    }
                                }
                                else {
                                    final acs d2 = this.d;
                                    final acs u = d2.U;
                                    if (u != null) {
                                        Object o2;
                                        if (f == 0) {
                                            o2 = u.h;
                                        }
                                        else {
                                            o2 = u.i;
                                        }
                                        final adf f4 = ((adn)o2).f;
                                        if (f4.i) {
                                            float n5;
                                            if (f == 0) {
                                                n5 = d2.x;
                                            }
                                            else {
                                                n5 = d2.A;
                                            }
                                            ((ade)f2).c(this.h((int)(f4.f * n5 + 0.5f), f));
                                        }
                                    }
                                }
                            }
                            else {
                                ((ade)this.f).c(Math.min(this.h(f2.m, f), n3));
                            }
                        }
                        else {
                            ((ade)f2).c(this.h(n3, f));
                        }
                    }
                }
                final adf f5 = this.f;
                if (!f5.i) {
                    return;
                }
                final int f6 = f5.f;
                if (f6 == n3) {
                    this.i.c(n);
                    this.j.c(n2);
                    return;
                }
                float n6;
                if (f == 0) {
                    n6 = this.d.ae;
                }
                else {
                    n6 = this.d.af;
                }
                f = n;
                int f7 = n2;
                if (k == i) {
                    f = k.f;
                    f7 = i.f;
                    n6 = 0.5f;
                }
                this.i.c((int)(f + 0.5f + (f7 - f - f6) * n6));
                this.j.c(this.i.f + this.f.f);
            }
        }
    }
}
