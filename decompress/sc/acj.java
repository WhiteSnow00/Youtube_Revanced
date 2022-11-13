import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acj
{
    acn a;
    public float b;
    final ArrayList c;
    boolean d;
    public aci e;
    
    public acj() {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
    }
    
    public acj(final cdo cdo, final byte[] array, final byte[] array2) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
        this.e = new aci(this, cdo, null, null);
    }
    
    public static final boolean l(final acn acn) {
        return acn.l <= 1;
    }
    
    public final acn a(final boolean[] array, final acn acn) {
        final int a = this.e.a;
        int i = 0;
        acn acn2 = null;
        float n = 0.0f;
        while (i < a) {
            final float b = this.e.b(i);
            acn acn3 = acn2;
            float n2 = n;
            Label_0142: {
                if (b < 0.0f) {
                    final acn d = this.e.d(i);
                    if (array != null) {
                        acn3 = acn2;
                        n2 = n;
                        if (array[d.c]) {
                            break Label_0142;
                        }
                    }
                    acn3 = acn2;
                    n2 = n;
                    if (d != acn) {
                        final int n3 = d.n;
                        if (n3 != 3) {
                            acn3 = acn2;
                            n2 = n;
                            if (n3 != 4) {
                                break Label_0142;
                            }
                        }
                        acn3 = acn2;
                        n2 = n;
                        if (b < n) {
                            n2 = b;
                            acn3 = d;
                        }
                    }
                }
            }
            ++i;
            acn2 = acn3;
            n = n2;
        }
        return acn2;
    }
    
    final void b(final acn a) {
        final acn a2 = this.a;
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
        final aci e = this.e;
        for (int e2 = e.e, n2 = 0; e2 != -1 && n2 < e.a; e2 = e.c[e2], ++n2) {
            final float[] d = e.d;
            d[e2] /= n;
        }
    }
    
    public final void c(final ack ack, final acn acn, final boolean b) {
        if (acn != null) {
            if (acn.g) {
                this.b += acn.f * this.e.a(acn);
                this.e.c(acn, b);
                if (b) {
                    acn.b(this);
                }
                if (this.e.a == 0) {
                    this.d = true;
                    ack.c = true;
                }
            }
        }
    }
    
    public void d(final ack ack, final acj acj, final boolean b) {
        final aci e = this.e;
        final float a = e.a(acj.a);
        e.c(acj.a, b);
        final aci e2 = acj.e;
        for (int a2 = e2.a, i = 0; i < a2; ++i) {
            final acn d = e2.d(i);
            e.e(d, e2.a(d) * a, b);
        }
        this.b += acj.b * a;
        if (b) {
            acj.a.b(this);
        }
        if (this.a != null && this.e.a == 0) {
            this.d = true;
            ack.c = true;
        }
    }
    
    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }
    
    public final void f(final ack ack, final int n) {
        this.e.g(ack.p(n), 1.0f);
        this.e.g(ack.p(n), -1.0f);
    }
    
    public final void g(final acn acn, final acn acn2, final acn acn3, final acn acn4, float n) {
        this.e.g(acn, -1.0f);
        this.e.g(acn2, 1.0f);
        this.e.g(acn3, n);
        n = -n;
        this.e.g(acn4, n);
    }
    
    public final void h(final acn acn, final acn acn2, final acn acn3, int n) {
        if (n != 0) {
            int n2;
            if (n < 0) {
                n2 = -n;
                n = 1;
            }
            else {
                final int n3 = 0;
                n2 = n;
                n = n3;
            }
            this.b = (float)n2;
            if (n != 0) {
                this.e.g(acn, 1.0f);
                this.e.g(acn2, -1.0f);
                this.e.g(acn3, -1.0f);
                return;
            }
        }
        this.e.g(acn, -1.0f);
        this.e.g(acn2, 1.0f);
        this.e.g(acn3, 1.0f);
    }
    
    public final void i(final acn acn, final acn acn2, final acn acn3, int n) {
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
                this.e.g(acn, 1.0f);
                this.e.g(acn2, -1.0f);
                this.e.g(acn3, 1.0f);
                return;
            }
        }
        this.e.g(acn, -1.0f);
        this.e.g(acn2, 1.0f);
        this.e.g(acn3, -1.0f);
    }
    
    public final void j(final acn acn, final acn acn2, final acn acn3, final acn acn4, final float n) {
        this.e.g(acn3, 0.5f);
        this.e.g(acn4, 0.5f);
        this.e.g(acn, -0.5f);
        this.e.g(acn2, -0.5f);
        this.b = -n;
    }
    
    public acn k(final boolean[] array) {
        return this.a(array, null);
    }
    
    @Override
    public String toString() {
        final acn a = this.a;
        String concat;
        if (a == null) {
            concat = "0";
        }
        else {
            concat = "".concat(a.toString());
        }
        final float b = this.b;
        int i = 0;
        String s = concat.concat(" = ");
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
        final int a2 = this.e.a;
        int n2 = n;
        while (i < a2) {
            final acn d = this.e.d(i);
            String s2 = s;
            int n3 = n2;
            if (d != null) {
                final float b2 = this.e.b(i);
                s2 = s;
                n3 = n2;
                if (b2 != 0.0f) {
                    final String string = d.toString();
                    String s3;
                    float n4;
                    if (n2 == 0) {
                        s3 = s;
                        n4 = b2;
                        if (b2 < 0.0f) {
                            n4 = -b2;
                            s3 = s.concat("- ");
                        }
                    }
                    else {
                        String s4;
                        if (b2 > 0.0f) {
                            s4 = " + ";
                            n4 = b2;
                        }
                        else {
                            n4 = -b2;
                            s4 = " - ";
                        }
                        s3 = s.concat(s4);
                    }
                    String s5;
                    if (n4 == 1.0f) {
                        s5 = s3.concat(string);
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(s3);
                        sb2.append(n4);
                        sb2.append(" ");
                        sb2.append(string);
                        s5 = sb2.toString();
                    }
                    n3 = 1;
                    s2 = s5;
                }
            }
            ++i;
            s = s2;
            n2 = n3;
        }
        String concat2 = s;
        if (n2 == 0) {
            concat2 = s.concat("0.0");
        }
        return concat2;
    }
}
