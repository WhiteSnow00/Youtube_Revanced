import java.util.Arrays;
import android.os.VibrationEffect;
import android.os.Vibrator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aatu
{
    public long A;
    public long B;
    public final float[] C;
    public final float[] D;
    public int E;
    private final Vibrator F;
    private final boolean G;
    private long H;
    private int I;
    public final afco a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public final float g;
    public final float h;
    public final float i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public long o;
    public final VibrationEffect p;
    public final VibrationEffect q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    
    public aatu(final afco a, final Vibrator f, final boolean g) {
        this.C = new float[5];
        this.D = new float[5];
        this.G = g;
        this.a = a;
        this.F = f;
        this.p = VibrationEffect.createOneShot(10L, 32);
        this.q = VibrationEffect.createOneShot(10L, 96);
        this.g = Math.max(0.2094395f, 0.0872665f) + 1.74533f;
        this.h = 1.74533f - Math.max(0.2094395f, 0.0872665f);
        this.i = 0.8726665f;
        this.d();
    }
    
    public final float a() {
        if (this.b && Math.abs(this.e - 1.74533f) < 0.2094395f) {
            return 1.74533f;
        }
        return this.e;
    }
    
    public final void b(float n) {
        final float v = this.v;
        final float n2 = this.t + v;
        if (n2 > n) {
            this.t = n - v;
            if (this.y > 0.0f) {
                this.y = 0.0f;
            }
        }
        else {
            n = -n;
            if (n2 < n) {
                this.t = n - v;
                if (this.y < 0.0f) {
                    this.y = 0.0f;
                }
            }
        }
    }
    
    public final void c() {
        this.f = this.e;
        this.c = true;
        this.d = true;
        this.k = false;
        this.b = false;
        this.z = 0.0f;
        this.y = 0.0f;
        this.n = 0;
    }
    
    public final void d() {
        this.k = false;
        this.c = false;
        this.d = false;
        this.t = 0.0f;
        this.v = 0.0f;
        this.u = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.e = 1.74533f;
        this.f = 1.74533f;
        this.r = false;
        this.b = false;
        this.n = 0;
        this.j = false;
    }
    
    public final void e(final int l, final int m, int i, int n) {
        final long a = this.a.a();
        final float a2 = this.a();
        final long h = this.H;
        final double tan = Math.tan(a2 / 2.0f);
        final double n2 = n;
        Double.isNaN(n2);
        final float n3 = (float)i;
        final double n4 = n3;
        Double.isNaN(n4);
        final float n5 = (float)Math.atan(tan * n2 / n4);
        i = this.m;
        final int j = this.l;
        final float n6 = -a2;
        final double n7 = this.x;
        final double n8 = (l - j) * n6 / n3;
        final double cos = Math.cos(n7);
        Double.isNaN(n8);
        final double n9 = this.x;
        final double n10 = (m - i) * -(n5 + n5) / n;
        final double sin = Math.sin(n9);
        Double.isNaN(n10);
        final double sin2 = Math.sin(this.x);
        Double.isNaN(n8);
        final double cos2 = Math.cos(this.x);
        Double.isNaN(n10);
        final float t = this.t;
        final float n11 = (float)(n8 * sin2 + n10 * cos2);
        this.t = t + n11;
        final float u = this.u;
        final float n12 = (float)(cos * n8 - sin * n10);
        this.u = u + n12;
        final float n13 = (a - h) * 1.0E-9f;
        if (n13 > 0.0f) {
            final float n14 = n11 / n13;
            final float n15 = n12 / n13;
            final float k = afxr.J(n14, -18.84956f, 18.84956f);
            final float j2 = afxr.J(n15, -18.84956f, 18.84956f);
            final float[] c = this.C;
            i = this.I;
            c[i] = k;
            this.D[i] = j2;
            n = i + 1;
            if ((i = n) >= 5) {
                i = 0;
            }
            this.I = i;
            this.E = Math.min(this.E + 1, 5);
        }
        this.n += Math.abs(this.l - l) + Math.abs(this.m - m);
        this.l = l;
        this.m = m;
        this.H = a;
    }
    
    public final void f(final VibrationEffect vibrationEffect) {
        if (this.G && this.r && vibrationEffect != null) {
            this.F.vibrate(vibrationEffect);
            this.r = false;
        }
    }
    
    public final void g(final int l, final int m) {
        this.k = true;
        this.H = this.a.a();
        this.l = l;
        this.m = m;
        this.z = 0.0f;
        this.y = 0.0f;
        Arrays.fill(this.C, 0.0f);
        Arrays.fill(this.D, 0.0f);
        this.I = 0;
        this.E = 0;
        this.n = 0;
    }
}
