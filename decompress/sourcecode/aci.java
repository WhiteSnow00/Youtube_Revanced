import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class aci
{
    acm a;
    public float b;
    final ArrayList c;
    boolean d;
    public ach e;
    
    public aci() {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
    }
    
    public aci(final cdn cdn, final byte[] array, final byte[] array2) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
        this.e = new ach(this, cdn, null, null);
    }
    
    public static final boolean l(final acm acm) {
        return acm.l <= 1;
    }
    
    public final acm a(final boolean[] array, final acm acm) {
        final int a = this.e.a;
        acm acm2 = null;
        int i = 0;
        float n = 0.0f;
        while (i < a) {
            final float b = this.e.b(i);
            acm acm3 = acm2;
            float n2 = n;
            Label_0147: {
                if (b < 0.0f) {
                    final acm d = this.e.d(i);
                    if (array != null) {
                        acm3 = acm2;
                        n2 = n;
                        if (array[d.c]) {
                            break Label_0147;
                        }
                    }
                    acm3 = acm2;
                    n2 = n;
                    if (d != acm) {
                        final int n3 = d.n;
                        if (n3 != 3) {
                            acm3 = acm2;
                            n2 = n;
                            if (n3 != 4) {
                                break Label_0147;
                            }
                        }
                        acm3 = acm2;
                        n2 = n;
                        if (b < n) {
                            n2 = b;
                            acm3 = d;
                        }
                    }
                }
            }
            ++i;
            acm2 = acm3;
            n = n2;
        }
        return acm2;
    }
    
    final void b(final acm a) {
        final acm a2 = this.a;
        if (a2 != null) {
            this.e.g(a2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        final float n = -this.e.c(a, true);
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        final ach e = this.e;
        for (int e2 = e.e, n2 = 0; e2 != -1 && n2 < e.a; e2 = e.c[e2], ++n2) {
            final float[] d = e.d;
            d[e2] /= n;
        }
    }
    
    public final void c(final acj acj, final acm acm, final boolean b) {
        if (acm != null) {
            if (acm.g) {
                this.b += acm.f * this.e.a(acm);
                this.e.c(acm, b);
                if (b) {
                    acm.b(this);
                }
                if (this.e.a == 0) {
                    this.d = true;
                    acj.c = true;
                }
            }
        }
    }
    
    public void d(final acj acj, final aci aci, final boolean b) {
        final ach e = this.e;
        final float a = e.a(aci.a);
        e.c(aci.a, b);
        final ach e2 = aci.e;
        for (int a2 = e2.a, i = 0; i < a2; ++i) {
            final acm d = e2.d(i);
            e.e(d, e2.a(d) * a, b);
        }
        this.b += aci.b * a;
        if (b) {
            aci.a.b(this);
        }
        if (this.a != null && this.e.a == 0) {
            this.d = true;
            acj.c = true;
        }
    }
    
    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }
    
    public final void f(final acj acj, final int n) {
        this.e.g(acj.p(n), 1.0f);
        this.e.g(acj.p(n), -1.0f);
    }
    
    public final void g(final acm acm, final acm acm2, final acm acm3, final acm acm4, final float n) {
        this.e.g(acm, -1.0f);
        this.e.g(acm2, 1.0f);
        this.e.g(acm3, n);
        this.e.g(acm4, -n);
    }
    
    public final void h(final acm acm, final acm acm2, final acm acm3, int n) {
        if (n != 0) {
            boolean b;
            if (n < 0) {
                n = -n;
                b = true;
            }
            else {
                b = false;
            }
            this.b = (float)n;
            if (b) {
                this.e.g(acm, 1.0f);
                this.e.g(acm2, -1.0f);
                this.e.g(acm3, -1.0f);
                return;
            }
        }
        this.e.g(acm, -1.0f);
        this.e.g(acm2, 1.0f);
        this.e.g(acm3, 1.0f);
    }
    
    public final void i(final acm acm, final acm acm2, final acm acm3, int n) {
        if (n != 0) {
            boolean b;
            if (n < 0) {
                n = -n;
                b = true;
            }
            else {
                b = false;
            }
            this.b = (float)n;
            if (b) {
                this.e.g(acm, 1.0f);
                this.e.g(acm2, -1.0f);
                this.e.g(acm3, 1.0f);
                return;
            }
        }
        this.e.g(acm, -1.0f);
        this.e.g(acm2, 1.0f);
        this.e.g(acm3, -1.0f);
    }
    
    public final void j(final acm acm, final acm acm2, final acm acm3, final acm acm4, final float n) {
        this.e.g(acm3, 0.5f);
        this.e.g(acm4, 0.5f);
        this.e.g(acm, -0.5f);
        this.e.g(acm2, -0.5f);
        this.b = -n;
    }
    
    public acm k(final boolean[] array) {
        return this.a(array, null);
    }
    
    @Override
    public String toString() {
        final acm a = this.a;
        String concat;
        if (a == null) {
            concat = "0";
        }
        else {
            concat = "".concat(a.toString());
        }
        String s = concat.concat(" = ");
        final float b = this.b;
        int i = 0;
        int n;
        if (b != 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(b);
            s = sb.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.e.a) {
            final acm d = this.e.d(i);
            if (d != null) {
                final float b2 = this.e.b(i);
                if (b2 != 0.0f) {
                    final String string = d.toString();
                    String s2 = null;
                    float n2 = 0.0f;
                    Label_0205: {
                        if (n == 0) {
                            s2 = s;
                            n2 = b2;
                            if (b2 >= 0.0f) {
                                break Label_0205;
                            }
                            s2 = s.concat("- ");
                        }
                        else {
                            if (b2 > 0.0f) {
                                s2 = s.concat(" + ");
                                n2 = b2;
                                break Label_0205;
                            }
                            s2 = s.concat(" - ");
                        }
                        n2 = -b2;
                    }
                    if (n2 == 1.0f) {
                        s = s2.concat(string);
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(s2);
                        sb2.append(n2);
                        sb2.append(" ");
                        sb2.append(string);
                        s = sb2.toString();
                    }
                    n = 1;
                }
            }
            ++i;
        }
        String concat2 = s;
        if (n == 0) {
            concat2 = s.concat("0.0");
        }
        return concat2;
    }
}
