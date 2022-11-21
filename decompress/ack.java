import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class ack
{
    aco a;
    public float b;
    final ArrayList c;
    boolean d;
    public acj e;
    
    public ack() {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
    }
    
    public ack(final cdr cdr, final byte[] array, final byte[] array2) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
        this.e = new acj(this, cdr, null, null);
    }
    
    public static final boolean l(final aco aco) {
        return aco.l <= 1;
    }
    
    public final aco a(final boolean[] array, final aco aco) {
        final int a = this.e.a;
        int i = 0;
        aco aco2 = null;
        float n = 0.0f;
        while (i < a) {
            final float b = this.e.b(i);
            aco aco3 = aco2;
            float n2 = n;
            Label_0142: {
                if (b < 0.0f) {
                    final aco d = this.e.d(i);
                    if (array != null) {
                        aco3 = aco2;
                        n2 = n;
                        if (array[d.c]) {
                            break Label_0142;
                        }
                    }
                    aco3 = aco2;
                    n2 = n;
                    if (d != aco) {
                        final int n3 = d.n;
                        if (n3 != 3) {
                            aco3 = aco2;
                            n2 = n;
                            if (n3 != 4) {
                                break Label_0142;
                            }
                        }
                        aco3 = aco2;
                        n2 = n;
                        if (b < n) {
                            n2 = b;
                            aco3 = d;
                        }
                    }
                }
            }
            ++i;
            aco2 = aco3;
            n = n2;
        }
        return aco2;
    }
    
    final void b(final aco a) {
        final aco a2 = this.a;
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
        final acj e = this.e;
        for (int e2 = e.e, n2 = 0; e2 != -1 && n2 < e.a; e2 = e.c[e2], ++n2) {
            final float[] d = e.d;
            d[e2] /= n;
        }
    }
    
    public final void c(final acl acl, final aco aco, final boolean b) {
        if (aco != null) {
            if (aco.g) {
                this.b += aco.f * this.e.a(aco);
                this.e.c(aco, b);
                if (b) {
                    aco.b(this);
                }
                if (this.e.a == 0) {
                    this.d = true;
                    acl.c = true;
                }
            }
        }
    }
    
    public void d(final acl acl, final ack ack, final boolean b) {
        final acj e = this.e;
        final float a = e.a(ack.a);
        e.c(ack.a, b);
        final acj e2 = ack.e;
        for (int a2 = e2.a, i = 0; i < a2; ++i) {
            final aco d = e2.d(i);
            e.e(d, e2.a(d) * a, b);
        }
        this.b += ack.b * a;
        if (b) {
            ack.a.b(this);
        }
        if (this.a != null && this.e.a == 0) {
            this.d = true;
            acl.c = true;
        }
    }
    
    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }
    
    public final void f(final acl acl, final int n) {
        this.e.g(acl.p(n), 1.0f);
        this.e.g(acl.p(n), -1.0f);
    }
    
    public final void g(final aco aco, final aco aco2, final aco aco3, final aco aco4, float n) {
        this.e.g(aco, -1.0f);
        this.e.g(aco2, 1.0f);
        this.e.g(aco3, n);
        n = -n;
        this.e.g(aco4, n);
    }
    
    public final void h(final aco aco, final aco aco2, final aco aco3, int n) {
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
                this.e.g(aco, 1.0f);
                this.e.g(aco2, -1.0f);
                this.e.g(aco3, -1.0f);
                return;
            }
        }
        this.e.g(aco, -1.0f);
        this.e.g(aco2, 1.0f);
        this.e.g(aco3, 1.0f);
    }
    
    public final void i(final aco aco, final aco aco2, final aco aco3, int n) {
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
                this.e.g(aco, 1.0f);
                this.e.g(aco2, -1.0f);
                this.e.g(aco3, 1.0f);
                return;
            }
        }
        this.e.g(aco, -1.0f);
        this.e.g(aco2, 1.0f);
        this.e.g(aco3, -1.0f);
    }
    
    public final void j(final aco aco, final aco aco2, final aco aco3, final aco aco4, final float n) {
        this.e.g(aco3, 0.5f);
        this.e.g(aco4, 0.5f);
        this.e.g(aco, -0.5f);
        this.e.g(aco2, -0.5f);
        this.b = -n;
    }
    
    public aco k(final boolean[] array) {
        return this.a(array, null);
    }
    
    @Override
    public String toString() {
        final aco a = this.a;
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
            final aco d = this.e.d(i);
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
