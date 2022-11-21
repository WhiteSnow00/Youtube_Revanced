import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.Eye;
import java.util.Iterator;
import android.opengl.Matrix;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aatx extends aauk
{
    private static final float q;
    private int A;
    private int B;
    final aavf a;
    final aavf b;
    final aavf c;
    final aavf d;
    public final aatm e;
    public final aauy f;
    public aavi g;
    public vkr h;
    public boolean i;
    public boolean j;
    public float k;
    public float m;
    public boolean n;
    public boolean o;
    public aaxh p;
    private final aatw r;
    private final aaxk s;
    private final float[] t;
    private aauk u;
    private final AtomicReference v;
    private aavk w;
    private int x;
    private int y;
    private int z;
    
    static {
        q = -aava.a;
    }
    
    public aatx(final Handler handler, final aavf c, final aavf d, final aavc aavc, final aatw r, final aaxk s, final aavk w) {
        this.h = vkr.e;
        this.y = 1;
        this.j = true;
        this.b = aavf.b();
        this.v = new AtomicReference();
        this.c = c;
        this.d = d;
        this.a = aavf.b();
        this.r = r;
        this.s = s;
        this.w = w;
        final aatm aatm = new aatm(handler, aavc);
        this.e = aatm;
        this.f = new aauy(handler);
        aatm.g();
        this.g = (aavi)aatm;
        this.i = true;
        this.j(vkr.e, 1);
        this.t = new float[16];
        this.p = (aaxh)s.g(this.g.j()).a();
    }
    
    private final aate m(final int n) {
        this.p = (aaxh)this.s.g(this.g.j()).a();
        if (this.o) {
            final float n2 = -aava.a;
            final double abs = Math.abs(Math.atan(this.k * 0.5f / n2));
            final float m = this.m;
            final float n3 = (float)(abs + abs);
            float n4;
            if ((n4 = m * n3 / this.k) >= 1.5707964f) {
                n4 = 1.5707964f;
            }
            float n5 = n3;
            if (n3 >= 1.5707964f) {
                n5 = 1.5707964f;
            }
            this.a.f(0.0f, 0.0f, n2);
            adme.K(n2 > 0.0f);
            adme.K(true);
            adme.K(true);
            final float[] array = new float[47880];
            final float[] array2 = new float[31920];
            int i = 0;
            int n6 = 0;
            int n7 = 0;
            final float n8 = n5;
            final float n9 = n2;
            while (i < 399) {
                final float n10 = i / 399.0f;
                final int n11 = i + 1;
                final float n12 = n11 / 399.0f;
                final double n13 = (n10 - 0.5f) * n4;
                final float n14 = (float)Math.cos(n13);
                final float n15 = -n9;
                final double n16 = (-0.5f + n12) * n4;
                final float n17 = (float)Math.cos(n16);
                final float n18 = (float)Math.sin(n13);
                final float n19 = (float)Math.sin(n16);
                final int n20 = 0;
                int n21 = n6;
                final int n22 = n11;
                for (int j = n20; j <= 19; ++j, ++n21, ++n7) {
                    float n23;
                    if (i % 2 == 0) {
                        n23 = (float)j;
                    }
                    else {
                        n23 = (float)(19 - j);
                    }
                    final float n24 = n23 / 19.0f;
                    final float n25 = n15 * n14;
                    final int n26 = n7 + 1;
                    array2[n7] = n24;
                    final int n27 = n26 + 1;
                    array2[n26] = 1.0f - n10;
                    n7 = n27 + 1;
                    array2[n27] = n24;
                    array2[n7] = 1.0f - n12;
                    final double n28 = (0.5f - n24) * n8;
                    final float n29 = (float)Math.sin(n28);
                    final float n30 = (float)Math.cos(n28);
                    int n33;
                    if (i == 0) {
                        final int n31 = n21 + 1;
                        array[n21] = n29 * n25;
                        final int n32 = n31 + 1;
                        array[n31] = n15 * n18;
                        n33 = n32 + 1;
                        array[n32] = n25 * n30;
                    }
                    else {
                        final int n34 = n21 + 1;
                        final int n35 = (j * 4 + 1) * 3;
                        array[n21] = array[n21 - n35];
                        n33 = n34 + 1;
                        array[n34] = array[n34 - n35];
                        array[n33] = array[n33 - n35];
                        ++n33;
                    }
                    final float n36 = n15 * n17;
                    final float n37 = (float)Math.sin(n28);
                    final int n38 = n33 + 1;
                    array[n33] = n37 * n36;
                    n21 = n38 + 1;
                    array[n38] = n15 * n19;
                    array[n21] = n36 * n30;
                }
                i = n22;
                n6 = n21;
            }
            final aave aave = new aave(array, array2, 5);
            final aavi g = this.g;
            return new aate(aave, aave, g, n, this.a, this.s.g(g.j()), this.w);
        }
        final aave a = aave.a(this.k, this.m, aave.a);
        final aavi g2 = this.g;
        return new aate(a, a, g2, n, this.a, this.s.g(g2.j()), this.w);
    }
    
    private final void n(final int n) {
        this.p = (aaxh)this.s.g(this.g.j()).a();
        float q = aatx.q;
        final float[] a = aave.a;
        final float[] array = new float[9600];
        final float[] array2 = new float[6400];
        int n2 = 0;
        while (true) {
            final float n3 = q;
            if (n2 >= 40) {
                break;
            }
            final float n4 = (float)n2;
            final int n5 = n2 + 1;
            final float n6 = n4 / 40.0f;
            final double n7 = n6 * 3.1415927f;
            final float n8 = (float)Math.sin(n7) * n3;
            final float n9 = n5 / 40.0f;
            final double n10 = n9 * 3.1415927f;
            final float n11 = (float)Math.sin(n10) * n3;
            final float n12 = (float)Math.cos(n7);
            final float n13 = (float)Math.cos(n10);
            final int n14 = n2 * 240;
            final int n15 = n2 * 160;
            int i = 0;
            q = n3;
            while (i < 40) {
                final float n16 = i / 39.0f;
                final int n17 = i + i;
                final int n18 = n14 + n17 * 3;
                final int n19 = n17 + 1;
                final int n20 = n14 + n19 * 3;
                final double n21 = (n16 + n16) * 3.1415927f;
                array[n18] = (float)Math.sin(n21) * n8;
                array[n20] = (float)Math.sin(n21) * n11;
                array[n18 + 1] = n12 * n3;
                array[n20 + 1] = n13 * n3;
                array[n18 + 2] = (float)Math.cos(n21) * n8;
                array[n20 + 2] = (float)Math.cos(n21) * n11;
                final int n22 = n15 + (n17 + n17);
                final int n23 = n15 + (n19 + n19);
                array2[n23] = (array2[n22] = 1.0f - n16);
                array2[n22 + 1] = 1.0f - n6;
                array2[n23 + 1] = 1.0f - n9;
                ++i;
            }
            n2 = n5;
        }
        final aave aave = new aave(array, array2, 5);
        final aavi g = this.g;
        this.u = new aate(aave, aave, g, n, this.a, this.s.g(g.j()), this.w);
    }
    
    public final void a(final aavk w) {
        this.w = w;
        final aauk u = this.u;
        if (u != null) {
            u.a(w);
        }
    }
    
    public final void b() {
        final aauk u = this.u;
        if (u != null) {
            u.b();
            this.u = null;
        }
    }
    
    public final void c(final float n) {
        final aauk u = this.u;
        if (u != null) {
            u.c(n);
        }
    }
    
    public final void g() {
        this.j = true;
        this.j(this.h, this.y);
    }
    
    public final void h() {
        aavf aavf = this.c;
        final vkr a = vkr.a;
        final int y = this.y;
        final int n = y - 1;
        if (y != 0) {
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        aavf = this.b;
                    }
                }
                else if (this.n) {
                    aavf = this.d;
                }
                else {
                    aavf = this.b;
                }
            }
            else {
                aavf = this.c;
            }
            this.a.d(aavf);
            return;
        }
        throw null;
    }
    
    public final void i(final zfq zfq) {
        this.v.set(zfq);
        this.j = true;
    }
    
    public final void j(final vkr h, int y) {
        if (h == this.h && y == this.y && !this.j) {
            return;
        }
        final boolean b = false;
        this.j = false;
        this.h = h;
        this.y = y;
        final aauk u = this.u;
        if (u != null) {
            u.rQ();
            this.u.b();
            this.u = null;
        }
        this.h();
        final aavf a = this.a;
        Matrix.setIdentityM(a.b, 0);
        a.h();
        final vkr a2 = vkr.a;
        y = h.ordinal();
        boolean b2 = false;
        Label_0550: {
            if (y != 0) {
                if (y == 1) {
                    this.n(0);
                    b2 = b;
                    break Label_0550;
                }
                if (y == 2) {
                    this.n(1);
                    b2 = b;
                    break Label_0550;
                }
                if (y != 3) {
                    b2 = b;
                    if (y == 4) {
                        break Label_0550;
                    }
                    if (y != 5) {
                        throw new UnsupportedOperationException("VideoScene type not supported");
                    }
                    final zfq zfq = this.v.get();
                    b2 = b;
                    if (zfq == null) {
                        break Label_0550;
                    }
                    this.p = (aaxh)this.s.g(this.g.j()).a();
                    final aevn ae = zfq.c.ae();
                    final Object b3 = ae.b;
                    final Object c = ae.c;
                    y = ae.a;
                    final aave aave = new aave((float[])b3, (float[])c, y);
                    final adgg d = zfq.d;
                    if (d != null) {
                        final aevn ae2 = d.ae();
                        final Object b4 = ae2.b;
                        final Object c2 = ae2.c;
                        y = ae2.a;
                        final aave aave2 = new aave((float[])b4, (float[])c2, y);
                        final aavi g = this.g;
                        this.u = new aate(aave, aave2, g, zfq.b, this.a, this.s.g(g.j()), this.w);
                        b2 = b;
                        break Label_0550;
                    }
                    final aavi g2 = this.g;
                    this.u = new aate(aave, aave, g2, zfq.b, this.a, this.s.g(g2.j()), this.w);
                    b2 = b;
                    break Label_0550;
                }
                else {
                    if (!this.n) {
                        this.u = (aauk)new aatl((atnb)new aaxj(this.s, this.g.j(), 2), this.g, this.w);
                        b2 = b;
                        break Label_0550;
                    }
                    this.a.f(0.0f, 0.0f, aava.a);
                    this.u = this.m(2);
                }
            }
            else {
                b2 = b;
                if (!this.n) {
                    break Label_0550;
                }
                this.a.f(0.0f, 0.0f, aava.a);
                this.u = this.m(0);
            }
            b2 = true;
        }
        if (this.u == null) {
            this.p = (aaxh)this.s.f(this.g.j()).a();
            this.u = (aauk)new aath(this.s.f(this.g.j()), this.g, this.w);
        }
        final Iterator iterator = ((aaux)this.r).f.iterator();
        while (iterator.hasNext()) {
            ((aauu)iterator.next()).a(b2);
        }
        this.p.a(true, (byte[])null, 0L, 0L);
        this.p.b(this.z, this.A, this.x, this.B);
    }
    
    public final void l(final int z, final int a, final int x, final int b) {
        this.z = z;
        this.A = a;
        this.x = x;
        this.B = b;
        this.p.b(z, a, x, b);
    }
    
    public final void p(final foq foq) {
        final aauk u = this.u;
        if (u != null) {
            u.p(foq);
        }
    }
    
    public final void r(final agmq agmq) {
        if (this.j) {
            this.j(this.h, this.y);
        }
        if (this.i) {
            agmq agmq2 = agmq;
            if (vkr.f.equals((Object)this.h)) {
                System.arraycopy(agmq.e, 0, this.t, 0, 16);
                final float[] t = this.t;
                t[12] = 0.0f;
                t[14] = (t[13] = 0.0f);
                agmq2 = new agmq(t, (float[])agmq.b, (aauz)agmq.f, (Eye)agmq.c, (GvrViewerParams)agmq.a);
            }
            final aauk u = this.u;
            if (u != null) {
                u.r(agmq2);
            }
        }
    }
    
    public final void rQ() {
        final aauk u = this.u;
        if (u != null) {
            u.rQ();
        }
        final aatm e = this.e;
        final SurfaceTexture c = e.c;
        if (c != null) {
            c.release();
            e.c = null;
            GLES20.glDeleteTextures(1, new int[] { e.a }, 0);
            final Boolean a = aavd.a;
        }
        final aauy f = this.f;
        GLES20.glDeleteTextures(3, f.a, 0);
        final Boolean a2 = aavd.a;
        for (int i = 0; i < 3; ++i) {
            f.a[i] = 0;
        }
    }
}
