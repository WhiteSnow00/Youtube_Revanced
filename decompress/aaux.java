import android.opengl.Matrix;
import java.util.Iterator;
import android.opengl.GLES20;
import java.util.HashSet;
import j$.util.concurrent.ConcurrentHashMap;
import android.os.Handler;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaux extends aass implements aatw
{
    public final aaxk a;
    public final aatx b;
    public final aavf c;
    public final Set e;
    public final Set f;
    public boolean g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    private final aavf m;
    private final aavf n;
    private final float[] o;
    private final Set p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private final agpb v;
    
    public aaux(final Handler handler, final abwe abwe, final aavc aavc, final float n, final agpb v, final aavk aavk, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final aavf b = aavf.b();
        this.c = b;
        final aavf b2 = aavf.b();
        this.m = b2;
        final aavf b3 = aavf.b();
        this.n = b3;
        this.o = new float[16];
        this.e = (Set)ConcurrentHashMap.newKeySet();
        this.f = new HashSet();
        this.p = new HashSet();
        this.k = 1;
        handler.getClass();
        aavc.getClass();
        this.v = v;
        final aaxk a = new aaxk(abwe, aavk, (byte[])null);
        this.a = a;
        b.f(0.0f, 0.0f, aava.a);
        b.d(b2);
        final aatx b4 = new aatx(handler, b2, b3, aavc, this, a, aavk);
        this.b = b4;
        this.c(n);
        this.m((aatp)b4);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        final Boolean a2 = aavd.a;
    }
    
    private final void w() {
        final double tan = Math.tan(Math.toRadians((this.t + this.s) / 4.0f));
        final double n = aava.a;
        final double n2 = (float)Math.atan(1.0f / this.u);
        Double.isNaN(n);
        final float n3 = (float)(tan * 1.399999976158142 * n);
        final double n4 = n3 + n3;
        final double sin = Math.sin(n2);
        Double.isNaN(n4);
        this.q = (float)Math.abs(sin * n4);
        final double cos = Math.cos(n2);
        Double.isNaN(n4);
        this.r = (float)Math.abs(n4 * cos);
    }
    
    public final void a(final aauv aauv) {
        this.e.add(aauv);
    }
    
    public final void b(final aauw aauw) {
        this.p.add(aauw);
    }
    
    public final void c(final float u) {
        this.u = u;
        this.w();
        this.j();
    }
    
    public final void g(final aauv aauv) {
        this.e.remove(aauv);
    }
    
    public final void h(final aauw aauw) {
        this.p.remove(aauw);
    }
    
    public final void i(final float n) {
        this.b.c(n);
    }
    
    public final void j() {
        final float u = this.u;
        float r;
        float q;
        if (u < 1.0f) {
            r = this.r;
            q = u * r;
            this.h = q;
            this.i = r;
        }
        else {
            q = this.q;
            this.h = q;
            r = q / u;
            this.i = r;
        }
        float n = q;
        float n2 = r;
        if (this.g) {
            n = q * 1.42f;
            this.h = n;
            n2 = r * 1.42f;
            this.i = n2;
        }
        final aatx b = this.b;
        b.k = n;
        b.m = n2;
        if (b.h == vkr.a || b.h == vkr.d) {
            b.g();
        }
        final Iterator iterator = this.p.iterator();
        while (iterator.hasNext()) {
            ((aauw)iterator.next()).b(this.h, this.i);
        }
    }
    
    public final void l(final int n) {
        final aatx b = this.b;
        if (n == b.g.j()) {
            return;
        }
        final vkr a = vkr.a;
        final int n2 = n - 1;
        if (n != 0) {
            if (n2 != 0) {
                if (n2 == 1) {
                    b.g = (aavi)b.f;
                }
            }
            else {
                b.g = (aavi)b.e;
            }
            b.g.g();
            b.j = true;
            return;
        }
        throw null;
    }
    
    public final void p(final foq foq) {
        if (this.j) {
            this.t(foq);
            this.j = false;
        }
        super.p(foq);
        Matrix.invertM(this.o, 0, (float[])foq.b, 0);
        this.v.ah(this.o);
        GLES20.glClear(16640);
        final Boolean a = aavd.a;
    }
    
    public final void r(final agmq agmq) {
        final aauz aauz = (aauz)agmq.f;
        final float s = aauz.a + aauz.c;
        final float t = aauz.b + aauz.d;
        if (!aavd.j(s, this.s, 0.1f) && !aavd.j(t, this.t, 0.1f)) {
            this.s = s;
            this.t = t;
            this.w();
            this.j();
        }
        super.r(agmq);
    }
    
    public final void rQ() {
        this.a.e();
        super.rQ();
    }
    
    public final void t(final foq foq) {
        final Object b = foq.b;
        adme.K(true);
        final float[] array = (float[])b;
        final float n = array[6];
        float n2;
        if (Math.sqrt(1.0f - n * n) >= 0.009999999776482582) {
            n2 = (float)Math.atan2(-array[2], array[10]);
        }
        else {
            n2 = 0.0f;
        }
        final float n3 = (float)Math.toDegrees(-n2);
        final float n4 = (float)Math.toDegrees(-Math.asin(array[6]));
        this.m.c();
        this.m.i(n3, 0.0f, 1.0f);
        this.m.i(n4, 1.0f, 0.0f);
        this.n.c();
        this.n.i(n3, 0.0f, 1.0f);
    }
}
