// 
// Decompiled by Procyon v0.6.0
// 

public final class aco extends acv
{
    public int a;
    public boolean b;
    public int c;
    boolean d;
    
    public aco() {
        this.a = 0;
        this.b = true;
        this.c = 0;
        this.d = false;
    }
    
    public final int a() {
        final int a = this.a;
        if (a == 0 || a == 1) {
            return 0;
        }
        if (a != 2 && a != 3) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public final void b(final acj acj, final boolean b) {
        final acq[] r = this.R;
        r[0] = this.J;
        r[2] = this.K;
        r[1] = this.L;
        r[3] = this.M;
        int n = 0;
        acq[] r2;
        while (true) {
            r2 = this.R;
            final int length = r2.length;
            if (n >= 6) {
                break;
            }
            final acq acq = r2[n];
            acq.h = acj.b((Object)acq);
            ++n;
        }
        final int a = this.a;
        if (a >= 0 && a < 4) {
            final acq acq2 = r2[a];
            if (!this.d) {
                this.c();
            }
            if (!this.d) {
                while (true) {
                    for (int i = 0; i < this.as; ++i) {
                        final acr acr = this.ar[i];
                        if (this.b || acr.d()) {
                            final int a2 = this.a;
                            if ((a2 != 0 && a2 != 1) || acr.M() != 3 || acr.J.e == null || acr.L.e == null) {
                                final int a3 = this.a;
                                if ((a3 != 2 && a3 != 3) || acr.N() != 3 || acr.K.e == null || acr.M.e == null) {
                                    continue;
                                }
                            }
                            final boolean b2 = true;
                            final boolean b3 = this.J.f() || this.L.f();
                            final boolean b4 = this.K.f() || this.M.f();
                            int n4 = 0;
                            Label_0534: {
                                if (!b2) {
                                    final int a4 = this.a;
                                    final int n2 = 5;
                                    int n3 = a4;
                                    boolean b5 = b3;
                                    if (a4 == 0) {
                                        n4 = n2;
                                        if (b3) {
                                            break Label_0534;
                                        }
                                        n3 = 0;
                                        b5 = false;
                                    }
                                    boolean b6 = b4;
                                    if (n3 == 2) {
                                        n4 = n2;
                                        if (b4) {
                                            break Label_0534;
                                        }
                                        b6 = false;
                                    }
                                    if (n3 == 1) {
                                        n4 = n2;
                                        if (b5) {
                                            break Label_0534;
                                        }
                                    }
                                    if (n3 == 3 && b6) {
                                        n4 = n2;
                                        break Label_0534;
                                    }
                                }
                                n4 = 4;
                            }
                            for (int j = 0; j < this.as; ++j) {
                                final acr acr2 = this.ar[j];
                                if (this.b || acr2.d()) {
                                    final acm b7 = acj.b((Object)acr2.R[this.a]);
                                    final acq[] r3 = acr2.R;
                                    final int a5 = this.a;
                                    final acq acq3 = r3[a5];
                                    acq3.h = b7;
                                    final acq e = acq3.e;
                                    int f;
                                    if (e != null && e.d == this) {
                                        f = acq3.f;
                                    }
                                    else {
                                        f = 0;
                                    }
                                    if (a5 != 0 && a5 != 2) {
                                        final acm h = acq2.h;
                                        final int c = this.c;
                                        final aci a6 = acj.a();
                                        final acm c2 = acj.c();
                                        c2.e = 0;
                                        a6.h(h, b7, c2, c + f);
                                        acj.e(a6);
                                    }
                                    else {
                                        final acm h2 = acq2.h;
                                        final int c3 = this.c;
                                        final aci a7 = acj.a();
                                        final acm c4 = acj.c();
                                        c4.e = 0;
                                        a7.i(h2, b7, c4, c3 - f);
                                        acj.e(a7);
                                    }
                                    acj.m(acq2.h, b7, this.c + f, n4);
                                }
                            }
                            final int a8 = this.a;
                            if (a8 == 0) {
                                acj.m(this.L.h, this.J.h, 0, 8);
                                acj.m(this.J.h, this.U.L.h, 0, 4);
                                acj.m(this.J.h, this.U.J.h, 0, 0);
                                return;
                            }
                            if (a8 == 1) {
                                acj.m(this.J.h, this.L.h, 0, 8);
                                acj.m(this.J.h, this.U.J.h, 0, 4);
                                acj.m(this.J.h, this.U.L.h, 0, 0);
                                return;
                            }
                            if (a8 == 2) {
                                acj.m(this.M.h, this.K.h, 0, 8);
                                acj.m(this.K.h, this.U.M.h, 0, 4);
                                acj.m(this.K.h, this.U.K.h, 0, 0);
                                return;
                            }
                            if (a8 == 3) {
                                acj.m(this.K.h, this.M.h, 0, 8);
                                acj.m(this.K.h, this.U.K.h, 0, 4);
                                acj.m(this.K.h, this.U.M.h, 0, 0);
                            }
                            return;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
            this.d = false;
            final int a9 = this.a;
            if (a9 == 0 || a9 == 1) {
                acj.f(this.J.h, this.Z);
                acj.f(this.L.h, this.Z);
                return;
            }
            if (a9 != 2 && a9 != 3) {
                return;
            }
            acj.f(this.K.h, this.aa);
            acj.f(this.M.h, this.aa);
        }
    }
    
    public final boolean c() {
        final int n = 0;
        int n2 = 0;
        int n3 = 1;
        int as;
        while (true) {
            as = this.as;
            if (n2 >= as) {
                break;
            }
            final acr acr = this.ar[n2];
            int n4 = 0;
            Label_0113: {
                if (!this.b && !acr.d()) {
                    n4 = n3;
                }
                else {
                    final int a = this.a;
                    if ((a != 0 && a != 1) || acr.e()) {
                        final int a2 = this.a;
                        if (a2 != 2) {
                            n4 = n3;
                            if (a2 != 3) {
                                break Label_0113;
                            }
                        }
                        n4 = n3;
                        if (acr.f()) {
                            break Label_0113;
                        }
                    }
                    n4 = 0;
                }
            }
            ++n2;
            n3 = n4;
        }
        if (n3 != 0 && as > 0) {
            int n5 = 0;
            int n6 = 0;
            for (int i = n; i < this.as; ++i) {
                final acr acr2 = this.ar[i];
                if (this.b || acr2.d()) {
                    int n7 = n5;
                    if (n6 == 0) {
                        final int a3 = this.a;
                        if (a3 == 0) {
                            n7 = acr2.K(2).a();
                        }
                        else if (a3 == 1) {
                            n7 = acr2.K(4).a();
                        }
                        else if (a3 == 2) {
                            n7 = acr2.K(3).a();
                        }
                        else {
                            n7 = n5;
                            if (a3 == 3) {
                                n7 = acr2.K(5).a();
                            }
                        }
                    }
                    final int a4 = this.a;
                    if (a4 == 0) {
                        n5 = Math.min(n7, acr2.K(2).a());
                    }
                    else if (a4 == 1) {
                        n5 = Math.max(n7, acr2.K(4).a());
                    }
                    else if (a4 == 2) {
                        n5 = Math.min(n7, acr2.K(3).a());
                    }
                    else {
                        n5 = n7;
                        if (a4 == 3) {
                            n5 = Math.max(n7, acr2.K(5).a());
                        }
                    }
                    n6 = 1;
                }
            }
            final int n8 = n5 + this.c;
            final int a5 = this.a;
            if (a5 != 0 && a5 != 1) {
                this.w(n8, n8);
            }
            else {
                this.v(n8, n8);
            }
            return this.d = true;
        }
        return false;
    }
    
    @Override
    public final boolean d() {
        return true;
    }
    
    @Override
    public final boolean e() {
        return this.d;
    }
    
    @Override
    public final boolean f() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        final String ai = super.ai;
        final StringBuilder sb = new StringBuilder("[Barrier] ");
        sb.append(ai);
        sb.append(" {");
        String s = sb.toString();
        for (int i = 0; i < this.as; ++i) {
            final acr acr = this.ar[i];
            String concat = s;
            if (i > 0) {
                concat = s.concat(", ");
            }
            s = concat.concat(String.valueOf(acr.ai));
        }
        return s.concat("}");
    }
}
