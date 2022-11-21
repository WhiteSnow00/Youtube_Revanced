import android.opengl.Matrix;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aatt extends aass
{
    public static final float a;
    public static final float b;
    public static final float c;
    public final aarq[] e;
    public final aarn f;
    public float g;
    public float h;
    private final aarq i;
    private final aarf j;
    private final aasy k;
    private final float[] m;
    private final aats n;
    private final aatj o;
    private float p;
    private float[] q;
    private boolean r;
    
    static {
        a = aavd.a(25.0f);
        b = aavd.a(9.0f);
        c = aavd.a(3.0f);
    }
    
    public aatt(final atnb atnb, final int[] array, final float h, aavf a, final aats n) {
        adme.K(true);
        this.h = h;
        this.n = n;
        this.j = new aarf();
        final aavf a2 = a.a();
        this.k = new aasy(a2, this.h, 1.0f);
        this.f = new aarn(new aasy(a2, this.h, aatt.a));
        final aave a3 = aave.a(1.0f, 1.0f, aave.c);
        final int length = array.length;
        this.e = new aarq[length];
        final float[] q = new float[length];
        this.q = q;
        this.m = new float[length];
        final int n2 = 0;
        q[0] = 1.0f;
        for (int i = 0; i < array.length; ++i) {
            this.e[i] = new aarq(a3, a.a(), aarq.s(aarq.h(array[i]), a3.f), atnb);
        }
        this.g(this.q);
        final aave a4 = aave.a(aavd.a(1.0f), aatt.b, aave.c);
        a = a.a();
        final aarq j = new aarq(a4, a, aarq.s(new float[] { 1.0f, 1.0f, 1.0f, 1.0f }, a4.f), atnb);
        (this.i = j).k(-this.h / 2.0f, 0.0f, 0.0f);
        this.o = new aatj((aati)j, 1.0f, 0.0f);
        final aarq[] e = this.e;
        for (int length2 = e.length, k = n2; k < length2; ++k) {
            this.f.m((aatp)e[k]);
        }
        this.m((aatp)this.f);
        this.m((aatp)this.i);
    }
    
    public final void a() {
        int n = 0;
        float n2 = 0.0f;
        while (true) {
            final aarq[] e = this.e;
            if (n >= e.length) {
                break;
            }
            final float n3 = (this.q[n] / 2.0f + n2 - 0.5f) * this.h;
            this.m[n] = n3;
            e[n].k(n3, 0.0f, 0.0f);
            n2 += this.q[n];
            ++n;
        }
    }
    
    public final void b() {
        int n = 0;
        while (true) {
            final aarq[] e = this.e;
            if (n >= e.length) {
                break;
            }
            e[n].k(-this.m[n], 0.0f, 0.0f);
            ++n;
        }
    }
    
    public final void c(final boolean b) {
        this.f.i(b);
    }
    
    public final void g(final float[] q) {
        final int length = q.length;
        int i = 0;
        float n = 0.0f;
        while (i < length) {
            n += q[i];
            ++i;
        }
        final double n2 = n;
        if (n2 < 1.01 && n2 > 0.99) {
            this.b();
            this.q = q;
            this.a();
            return;
        }
        tut.b("Invalid sized widths!".concat(String.valueOf(Arrays.toString(q))));
    }
    
    public final void h(final float n) {
        final aarq i = this.i;
        final float h = this.h;
        final aavf a = i.a;
        Matrix.setIdentityM(a.c, 0);
        Matrix.translateM(a.c, 0, h * n, 0.0f, 0.0f);
        a.h();
    }
    
    public final boolean i() {
        return !((aatr)this).v() && this.f.b;
    }
    
    public final void o(final foq foq) {
        if (this.f.b) {
            this.n.c(this.k.b(foq).b());
        }
    }
    
    public final void p(final foq foq) {
        if (!((aatr)this).v()) {
            final boolean i = this.i();
            if (this.r && !i) {
                this.n.b();
            }
            this.r = i;
            this.j.b(i, foq.a);
            final float b = aatt.b;
            final float c = aatt.c;
            this.p = (b - c) * this.j.a() + c;
            this.o.a(i ^ true, foq.a);
            if (i) {
                this.h(this.g = this.k.b(foq).b());
                this.n.a(this.g);
            }
            int n = 0;
            while (true) {
                final aarq[] e = this.e;
                if (n >= e.length) {
                    break;
                }
                e[n].sZ(this.q[n] * this.h, this.p, 1.0f);
                ++n;
            }
        }
        super.p(foq);
    }
}
