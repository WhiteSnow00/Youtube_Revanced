import android.hardware.SensorEventListener;
import javax.microedition.khronos.egl.EGLConfig;
import android.os.SystemClock;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import com.google.vr.sdk.base.FieldOfView;
import com.google.vr.sdk.base.Eye;
import android.opengl.Matrix;
import android.os.Vibrator;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.content.Context;
import java.util.Queue;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.GvrView$StereoRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapn implements GvrView$StereoRenderer, aats
{
    public static final GvrViewerParams a;
    public final aase b;
    public final Queue c;
    public atke d;
    public aatw e;
    public aapm f;
    public aarc g;
    public aarg h;
    public boolean i;
    boolean j;
    public volatile boolean k;
    public int l;
    private final aarq m;
    private final float[] n;
    private final float[] o;
    private final float[] p;
    private final float[] q;
    private final float[] r;
    private boolean s;
    private aatp t;
    private float u;
    private int v;
    private int w;
    
    static {
        a = new GvrViewerParams();
    }
    
    public aapn(final Context context) {
        final float[] n = new float[16];
        this.n = n;
        this.o = new float[16];
        this.p = new float[16];
        this.q = new float[16];
        this.c = new ConcurrentLinkedQueue();
        this.r = new float[3];
        this.d = (atke)wuo.c;
        this.v = 16;
        this.w = 9;
        context.getClass();
        this.m = new aarq(context);
        this.b = new aase(aeye.a, (Vibrator)context.getSystemService("vibrator"), context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0);
        Matrix.setLookAtM(n, 0, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }
    
    private final void e() {
        while (!this.c.isEmpty()) {
            this.c.remove().run();
        }
    }
    
    private final void f(final aatr aatr) {
        final aatw e = this.e;
        if (e != null) {
            ((aaqz)e).s(aatr);
        }
    }
    
    private final void g() {
        if (aatt.i(this.u, this.b.a())) {
            return;
        }
        final float a = this.b.a();
        this.u = a;
        final float n = (float)Math.tan(a / 2.0f);
        final int v = this.v;
        final int w = this.w;
        float n2;
        if (v > w) {
            n2 = n;
        }
        else {
            n2 = v * n / w;
        }
        float n3 = n;
        if (v >= w) {
            n3 = n * w / v;
        }
        Matrix.frustumM(this.o, 0, -n2 * 0.1f, n2 * 0.1f, -n3 * 0.1f, n3 * 0.1f, 0.1f, 20000.0f);
        this.t = new aatp(n2, n3, n2, n3);
    }
    
    public final void a() {
        this.m.b();
    }
    
    public final void b(final Runnable runnable) {
        throw null;
    }
    
    public final void c(final boolean s) {
        this.s = s;
        this.d();
    }
    
    public final void d() {
        final int l = this.l;
        boolean b = l == 3 || (this.j && l == 2);
        Label_0067: {
            if (!this.s) {
                if (b) {
                    break Label_0067;
                }
                b = false;
            }
            final aarq m = this.m;
            if (m.c) {
                m.b();
            }
            if (!b) {
                return;
            }
        }
        if (!this.s) {
            final aarq i = this.m;
            if (!i.c) {
                i.k = -1L;
                i.e = 0.0f;
                i.f = 0.0f;
                i.g = 0.0f;
                i.h = 0;
                i.i = -1.0f;
                Object n = i.n;
                synchronized (n) {
                    i.o.reset();
                    monitorexit(n);
                    if (i.b == null) {
                        i.b = (SensorEventListener)new aarp(i);
                    }
                    n = new Thread((Runnable)new aaog(i, 12), "glOrientationSensor");
                    i.a(true);
                    i.c = true;
                    ((Thread)n).start();
                    this.m.j = true;
                }
            }
        }
    }
    
    public final void onDrawEye(final Eye eye) {
        eye.getClass();
        if (this.g != null) {
            Matrix.multiplyMM(this.q, 0, eye.getEyeView(), 0, this.n, 0);
            float[] array;
            aatp t;
            if (eye.getType() != 0) {
                array = eye.getPerspective(0.1f, 20000.0f);
                final FieldOfView fov = eye.getFov();
                t = new aatp(fov.getLeft(), fov.getTop(), fov.getRight(), fov.getBottom());
            }
            else {
                array = this.o;
                t = this.t;
            }
            float[] array2;
            if (this.s) {
                array2 = this.q;
            }
            else {
                array2 = this.p;
            }
            final agkz agkz = new agkz(array2, array, t, eye, (GvrViewerParams)this.d.a());
            try {
                this.g.r(agkz);
            }
            catch (final aatr aatr) {
                this.f(aatr);
            }
        }
    }
    
    public final void onFinishFrame(final Viewport viewport) {
        viewport.getClass();
        try {
            aatt.f();
        }
        catch (final aatr aatr) {
            this.f(aatr);
        }
    }
    
    public final void onNewFrame(final HeadTransform headTransform) {
        this.e();
        headTransform.getClass();
        if (this.g != null || this.h != null) {
            this.g();
            if (this.s) {
                headTransform.getHeadView(this.p, 0);
            }
            else if (!this.j && this.l == 2) {
                Matrix.setIdentityM(this.p, 0);
            }
            else {
                final aarq m = this.m;
                final float[] r = this.r;
                r[0] = aeuz.j(m.e, -1.5707964f, 1.5707964f);
                r[1] = m.f;
                float g;
                if (m.j) {
                    g = m.g;
                }
                else {
                    g = 0.0f;
                }
                r[2] = g;
                if (this.i) {
                    this.i = false;
                    final aase b = this.b;
                    final float[] r2 = this.r;
                    final float n = r2[0];
                    final float w = r2[1];
                    final float j = aeuz.j(n, -1.5707964f, 1.5707964f);
                    b.t = -j;
                    b.u = -w;
                    b.v = j;
                    b.w = w;
                }
                final aase b2 = this.b;
                final float[] r3 = this.r;
                final float v = r3[0];
                final float w2 = r3[1];
                final float x = r3[2];
                final int l = this.l;
                final long a = b2.a.a();
                final long a2 = b2.A;
                final boolean k = b2.k;
                final float n2 = (a - a2) * 1.0E-9f;
                final boolean b3 = !k && n2 < 10.0f && (!aatt.k(b2.y) || !aatt.k(b2.z));
                if (b3) {
                    final float n3 = (float)Math.exp((b2.B - b2.A) * 1.0E-9f * -3.8f);
                    final float n4 = (float)Math.exp(n2 * -3.8f);
                    final float t = b2.t;
                    final float y = b2.y;
                    final float n5 = (1.0f - n4) / 3.8f - (1.0f - n3) / 3.8f;
                    b2.t = t + y * n5;
                    b2.u += b2.z * n5;
                    b2.B = a;
                }
                final long a3 = b2.a.a();
                final long s = b2.s;
                float i = 0.0f;
                Label_0466: {
                    if (!aatt.k(2.0f)) {
                        final float n6 = (a3 - s) * 1.0E-9f;
                        if (n6 < 2.0f) {
                            i = aeuz.j(1.0f - n6 / 2.0f, 0.0f, 1.0f);
                            break Label_0466;
                        }
                    }
                    i = 0.0f;
                }
                final float t2 = b2.t;
                final float v2 = b2.v;
                b2.t = t2 + (v2 - v) * i;
                if (!b3 && i == 0.0f) {
                    final float n7 = Math.min(Math.abs(v - v2), (float)Math.toRadians(1.0)) * 0.1f;
                    if (Math.abs(b2.t) < n7) {
                        b2.t = 0.0f;
                    }
                    else {
                        final float t3 = b2.t;
                        b2.t = t3 - Math.signum(t3) * n7;
                    }
                }
                b2.v = v;
                b2.w = w2;
                b2.x = x;
                if (l == 2) {
                    final float n8 = b2.u + w2;
                    if (n8 > 0.62831855f) {
                        b2.u = 0.62831855f - w2;
                        if (b2.z > 0.0f) {
                            b2.z = 0.0f;
                        }
                    }
                    else if (n8 < -0.62831855f) {
                        b2.u = -0.62831855f - w2;
                        if (b2.z < 0.0f) {
                            b2.z = 0.0f;
                        }
                    }
                    b2.b(0.9424779f);
                }
                else {
                    b2.b(1.5707964f);
                }
                if (!b2.c && !b2.k) {
                    final float e = b2.e;
                    if ((e > 2.26894f || e < 0.78538996f) && a > b2.o) {
                        if (b2.j) {
                            b2.r = true;
                            b2.f(b2.q);
                            b2.j = false;
                        }
                        final long o = b2.o;
                        final float e2 = b2.e;
                        final float n9 = (a - o) * 1.0E-9f;
                        float max = e2;
                        if (e2 > 2.26894f) {
                            max = Math.max(e2 - n9 / 0.1f * 0.087249994f, 2.26893f);
                            b2.e = max;
                        }
                        if (max < 0.78538996f) {
                            b2.e = Math.min(max + n9 / 0.1f * 0.087249994f, 0.7854f);
                        }
                        b2.o = a;
                    }
                }
                final aase b4 = this.b;
                final float v3 = b4.v;
                final float t4 = b4.t;
                final float w3 = b4.w;
                final float u = b4.u;
                final float x2 = b4.x;
                final float n10 = (float)Math.cos(v3);
                Matrix.setIdentityM(this.p, 0);
                Matrix.rotateM(this.p, 0, (float)Math.toDegrees(x2 * n10), 0.0f, 0.0f, 1.0f);
                Matrix.rotateM(this.p, 0, (float)Math.toDegrees(t4 + v3), 1.0f, 0.0f, 0.0f);
                Matrix.rotateM(this.p, 0, (float)Math.toDegrees(w3 + u), 0.0f, 1.0f, 0.0f);
            }
            if (Double.isNaN(this.p[0])) {
                ttr.b("New frame error: head view has NaN value");
                return;
            }
            final long uptimeMillis = SystemClock.uptimeMillis();
            final aarg h = this.h;
            Label_1280: {
                if (h != null) {
                    final float[] p = this.p;
                    if (uptimeMillis >= h.g + 1000L) {
                        h.g = uptimeMillis;
                        aatt.m(h.b[h.f++ % 10], p);
                        if (h.f >= 10) {
                            for (int n11 = 0; n11 < 3; ++n11) {
                                final float[] c = h.c;
                                final float[] array = h.b[0];
                                c[n11] = array[n11];
                                h.d[n11] = array[n11];
                            }
                            for (int n12 = 1; n12 < 10; ++n12) {
                                for (int n13 = 0; n13 < 3; ++n13) {
                                    final float[] array2 = h.b[n12];
                                    final float n14 = array2[n13];
                                    final float[] c2 = h.c;
                                    if (n14 < c2[n13]) {
                                        c2[n13] = n14;
                                    }
                                    final float n15 = array2[n13];
                                    final float[] d = h.d;
                                    if (n15 > d[n13]) {
                                        d[n13] = n15;
                                    }
                                }
                            }
                            int n16 = 0;
                            while (n16 < 3) {
                                if (h.d[n16] - h.c[n16] > aarg.a) {
                                    if (!h.h) {
                                        h.h = true;
                                        h.e.a(true);
                                    }
                                    break Label_1280;
                                }
                                else {
                                    ++n16;
                                }
                            }
                            if (h.h) {
                                h.h = false;
                                h.e.a(false);
                            }
                        }
                    }
                }
            }
            final aarc g2 = this.g;
            if (g2 != null) {
                final fon fon = new fon(this.p, uptimeMillis, (byte[])null);
                if (g2.d) {
                    g2.d = false;
                    g2.o(fon);
                }
                g2.rR(g2.q(fon), fon);
                g2.p(fon);
            }
        }
    }
    
    public final void onRendererShutdown() {
        final aarc g = this.g;
        if (g != null) {
            g.rQ();
            this.g = null;
        }
        this.m.b();
    }
    
    public final void onSurfaceChanged(final int v, final int w) {
        this.v = v;
        this.w = w;
        try {
            final aapm f = this.f;
            if (f != null) {
                ((aaqz)f).d.a();
            }
        }
        catch (final aatr aatr) {
            this.f(aatr);
        }
        this.u = -1.0f;
        this.g();
    }
    
    public final void onSurfaceCreated(EGLConfig eglConfig) {
        this.k = true;
        try {
            eglConfig = (EGLConfig)this.f;
            if (eglConfig != null) {
                ((aaqz)eglConfig).g.getClass();
                try {
                    ((aaqz)eglConfig).d.a();
                    ((aaqz)eglConfig).i = new aatn(((aaqz)eglConfig).o, ((aaqz)eglConfig).A, (aats)((aaqz)eglConfig).f, ((aaqz)eglConfig).s / (float)((aaqz)eglConfig).t, ((aaqz)eglConfig).B, ((aaqz)eglConfig).b(), (byte[])null, (byte[])null, (byte[])null);
                    ((aaqz)eglConfig).j = ((aaqz)eglConfig).i.b;
                    final aasm j = ((aaqz)eglConfig).j;
                    final aarb d = ((aaqz)eglConfig).d;
                    j.l(d.c(), d.d(), d.a, ((aaqz)eglConfig).x);
                    if (((aaqz)eglConfig).r) {
                        ((aaqz)eglConfig).d();
                    }
                    ((aaqz)eglConfig).g.c(((aaqz)eglConfig).r);
                    final aapn g = ((aaqz)eglConfig).g;
                    g.h = ((aaqz)eglConfig).h;
                    final aatn i = ((aaqz)eglConfig).i;
                    i.getClass();
                    g.g = (aarc)i;
                    ((aaqz)eglConfig).n(((aaqz)eglConfig).u, ((aaqz)eglConfig).v);
                    if (((aaqz)eglConfig).q) {
                        ((aaqz)eglConfig).l();
                    }
                    ((aaqz)eglConfig).i.l(((aaqz)eglConfig).y);
                    final aatn k = ((aaqz)eglConfig).i;
                    eglConfig = (EGLConfig)((aaqz)eglConfig).n;
                    k.b.i((zdv)eglConfig);
                }
                catch (final aatr aatr) {
                    ((aaqz)eglConfig).s(aatr);
                }
            }
        }
        catch (final aatr aatr2) {
            this.f(aatr2);
        }
        this.e();
    }
}
