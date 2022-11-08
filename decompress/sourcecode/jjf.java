// 
// Decompiled by Procyon v0.6.0
// 

public final class jjf implements achj
{
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public jjf(final achf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jjf(final acps a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jjf(final exx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jjf(final jjh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jjf(final juk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jjf(final wcu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private final void f() {
        if (!((tdv)((juk)this.a).f).isEmpty()) {
            final juk juk = (juk)this.a;
            juk.d.q((achk)juk.e);
            return;
        }
        final juk juk2 = (juk)this.a;
        if (juk2.d.i((achk)juk2.e) == -1) {
            final juk juk3 = (juk)this.a;
            juk3.d.n(1, (achk)juk3.e);
        }
    }
    
    private final void g() {
        final wcu wcu = (wcu)this.a;
        if (!wcu.j) {
            wcu.M();
        }
    }
    
    public final void e(final int n, final int n2) {
        final int b = this.b;
        if (b != 0) {
            boolean b2 = true;
            if (b != 1) {
                if (b == 2) {
                    this.f();
                    return;
                }
                if (b == 3) {
                    this.g();
                    return;
                }
                if (b != 4) {
                    ((acps)this.a).notifyDataSetChanged();
                    return;
                }
                final Object a = this.a;
                final int b3 = ((achf)a).b;
                final boolean b4 = n < b3;
                if (n2 >= b3) {
                    b2 = false;
                }
                if (!b4 && !b2) {
                    return;
                }
                if (b4 && b2 && n + 1 <= b3 && n2 + 1 <= b3) {
                    ((achd)a).A(n, n2);
                    return;
                }
                ((achd)a).u();
            }
            else {
                ((exx)this.a).d();
                ((exx)this.a).f();
            }
        }
    }
    
    public final void qH() {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    this.f();
                    return;
                }
                if (b == 3) {
                    this.g();
                    return;
                }
                if (b != 4) {
                    ((acps)this.a).notifyDataSetChanged();
                    return;
                }
                ((achd)this.a).u();
            }
            else {
                ((exx)this.a).d();
                ((exx)this.a).f();
            }
        }
    }
    
    public final void qI(final int n, int min) {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    this.f();
                    return;
                }
                if (b == 3) {
                    this.g();
                    return;
                }
                if (b != 4) {
                    ((acps)this.a).notifyDataSetChanged();
                    return;
                }
                final Object a = this.a;
                final int b2 = ((achf)a).b;
                if (n >= b2) {
                    return;
                }
                min = Math.min(min + n, b2);
                ((achd)a).w(n, min - n);
            }
            else {
                ((exx)this.a).d();
                ((exx)this.a).f();
            }
        }
    }
    
    public final void qJ(int n, int b) {
        final int b2 = this.b;
        if (b2 == 0) {
            ((jjh)this.a).b.postDelayed((Runnable)new qo(this, n, (achj)this, 13), 300L);
            return;
        }
        if (b2 == 1) {
            ((exx)this.a).d();
            ((exx)this.a).f();
            return;
        }
        if (b2 == 2) {
            this.f();
            return;
        }
        if (b2 == 3) {
            this.g();
            return;
        }
        if (b2 != 4) {
            ((acps)this.a).notifyDataSetChanged();
            return;
        }
        final int b3 = ((achf)this.a).b;
        if (n < b3) {
            final int n2 = Math.min(n + b, b3) - n;
            final achf achf = (achf)this.a;
            final int b4 = achf.b;
            final int n3 = ((tdv)achf.a).size() - b;
            final Object a = this.a;
            b = Math.max(b4, n3 + n2);
            ((achf)a).b = b;
            ((achd)this.a).x(n, n2);
            ((achf)this.a).b = b4;
            n = Math.min(n3, b4) + n2;
            final Object a2 = this.a;
            b = ((achf)a2).b;
            if (n > b) {
                ((achd)a2).y(b, n - b);
            }
        }
    }
    
    public final void ta(int n, int n2) {
        final int b = this.b;
        if (b == 0) {
            ((jjh)this.a).b.postDelayed((Runnable)new qo(this, n, (achj)this, 14), 300L);
            return;
        }
        if (b == 1) {
            ((exx)this.a).d();
            ((exx)this.a).f();
            return;
        }
        if (b == 2) {
            this.f();
            return;
        }
        if (b == 3) {
            this.g();
            return;
        }
        if (b != 4) {
            ((acps)this.a).notifyDataSetChanged();
            return;
        }
        final int b2 = ((achf)this.a).b;
        if (n < b2) {
            final int n3 = Math.min(n2 + n, b2) - n;
            final achf achf = (achf)this.a;
            final int b3 = achf.b;
            n2 = ((tdv)achf.a).size();
            if (b3 < n2 + n3) {
                final achf achf2 = (achf)this.a;
                achf2.b -= n3;
            }
            ((achd)this.a).y(n, n3);
            final Object a = this.a;
            ((achf)a).b = b3;
            n = b3 - n3;
            if (n2 > n) {
                n2 = Math.min(n2, b3);
                ((achd)a).x(n, n2 - n);
            }
        }
    }
}
