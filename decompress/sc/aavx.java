import android.util.Range;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import android.opengl.GLES20;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavx
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    long f;
    long g;
    byte[] h;
    long i;
    long j;
    boolean k;
    public final int[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    private final int q;
    private final int r;
    private aauj s;
    private aauh t;
    private final aavw u;
    private final ArrayDeque v;
    private final ArrayDeque w;
    
    public aavx(final aavz aavz) {
        this.u = new aavw();
        this.v = new ArrayDeque();
        this.w = new ArrayDeque();
        this.f = -1L;
        this.g = -1L;
        this.i = -1L;
        this.j = 0L;
        final int[] l = new int[3];
        this.l = l;
        this.n = 3;
        this.o = 3;
        this.m = 500;
        this.p = 3;
        int i = 0;
        l[0] = 0;
        this.q = aavz.f("uColorPrimaryTransform");
        this.r = aavz.f("uLuminanceTransform");
        this.a = aavz.f("uInputLut");
        this.b = aavz.f("uOutputLut");
        this.c = aavz.f("uKneeLut");
        this.d = aavz.f("uLutSize");
        GLES20.glGenTextures(3, l, 0);
        while (i < 3) {
            aatt.g(this.l[i]);
            ++i;
        }
    }
    
    private static void f(final aauh aauh, final aavw aavw, final long n) {
        aauh.f = aavw.b / 4095.0f;
        aauh.g = aavw.c / 4095.0f;
        aauh.h = aavw.d;
        int n2;
        if ((n2 = aavw.g) <= 0) {
            n2 = aavw.f;
        }
        aauh.d = n2 * 0.1f;
        final float e = aauh.e;
        final float l = aatt.l(aauh.d);
        aauh.d = l;
        final float f = aauh.f;
        int i = 0;
        if (f < 1.0f && l >= aauh.e) {
            final float[] j = aauh.i;
            if (j == null || j.length < aauh.h) {
                aauh.i = new float[aauh.h];
            }
            final float g = aauh.g;
            String string = "";
            while (i < aauh.h) {
                final float[] k = aauh.i;
                final float n3 = aauh.g + aavw.e[i] / 1023.0f * (1.0f - g);
                k[i] = n3;
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(n3);
                sb.append(",");
                string = sb.toString();
                ++i;
            }
            return;
        }
        aauh.h = 0;
    }
    
    private final void g(final ByteBuffer byteBuffer, final int n, final int n2) {
        this.a(n, n2);
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexImage2D(3553, 0, 6410, 1, byteBuffer.capacity() / 2, 0, 6410, 5121, (Buffer)byteBuffer);
        final Boolean a = aatt.a;
    }
    
    public final void a(final int n, final int n2) {
        GLES20.glActiveTexture(33988 + n);
        GLES20.glBindTexture(3553, this.l[n]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glUniform1i(n2, n + 4);
        final Boolean a = aatt.a;
    }
    
    public final void b(final boolean b, final byte[] array, final long f, final long n) {
        boolean b2 = b;
        Label_0046: {
            if (this.f <= f) {
                if (!b) {
                    break Label_0046;
                }
                b2 = true;
            }
            this.v.clear();
            this.w.clear();
            this.u.a = false;
            if (b2) {
                this.k = true;
                this.e = 0;
                this.i = -1L;
                this.j = 0L;
                return;
            }
        }
        final long i = this.i;
        if (i != -1L && Math.abs(i - n) > 100000L) {
            this.j = this.i - n;
        }
        this.v.add(array);
        this.w.add(f);
        this.f = f;
    }
    
    public final void c(final aaty aaty) {
        final ByteBuffer e = aaty.e();
        final int n = 0;
        if (e != null && e.hasRemaining()) {
            final int remaining = e.remaining();
            final byte[] array = new byte[remaining + 1];
            array[0] = 0;
            e.get(array, 1, remaining);
            e.position(0);
            e.limit(0);
            this.b(false, array, aaty.c(), aaty.c());
        }
        final long g = aaty.c() - this.j;
        while (true) {
            if (this.w.isEmpty()) {
                break Label_0625;
            }
            if (this.g == g) {
                break Label_0625;
            }
            this.g = g;
            long longValue = 0L;
            byte[] h = null;
            while (!this.w.isEmpty() && g >= this.w.getFirst()) {
                longValue = this.w.removeFirst();
                h = this.v.removeFirst();
            }
            if (h == null || Arrays.equals(h, this.h)) {
                break Label_0625;
            }
            this.h = h;
            final aavw u = this.u;
            u.a = false;
            try {
                final atim atim = new atim(h, (byte[])null);
                atim.o(8);
                final int g2 = atim.g(8);
                final int g3 = atim.g(16);
                final int g4 = atim.g(16);
                if (g2 == 181 && g3 == 60 && g4 == 1) {
                    atim.o(16);
                    if (atim.g(2) <= 1) {
                        atim.g(27);
                        if (atim.g(1) <= 0) {
                            u.f = 0;
                            for (int i = 0; i < 3; ++i) {
                                u.f = Math.max(atim.g(17), u.f);
                            }
                            atim.o(17);
                            u.g = 0;
                            int n2;
                            for (int j = atim.g(4); j > 0; j = n2) {
                                final int g5 = atim.g(7);
                                final int g6 = atim.g(17);
                                n2 = --j;
                                if (g5 >= 75) {
                                    u.g = Math.max(u.g, g6);
                                }
                            }
                            atim.g(10);
                            if (atim.g(1) <= 0) {
                                if (atim.g(1) > 0) {
                                    u.b = atim.g(12);
                                    u.c = atim.g(12);
                                    u.d = atim.g(4);
                                    for (int k = n; k < u.d; ++k) {
                                        u.e[k] = atim.g(10);
                                    }
                                }
                                if (atim.g(1) > 0) {
                                    atim.g(6);
                                }
                                u.a = true;
                                if (this.e == 0) {
                                    this.e(null);
                                }
                                else {
                                    f(this.t, this.u, longValue);
                                    try {
                                        this.s.a(this.t);
                                        this.g(ByteBuffer.wrap(this.s.b()), 2, this.c);
                                        final Boolean a = aatt.a;
                                    }
                                    catch (final Exception ex) {
                                        ex.toString();
                                    }
                                }
                            }
                        }
                    }
                }
                final Boolean a2 = aatt.a;
            }
            catch (final Exception ex2) {
                continue;
            }
            break;
        }
    }
    
    public final void d(final aaty aaty, final int n, final aauo aauo, final boolean b) {
        if (b || this.k) {
            this.e = 0;
            if (n == 3 || (aauo != null && aauo.c() != null)) {
                this.e(aauo);
            }
            GLES20.glUniform1f(this.d, (float)this.e);
            this.k = false;
        }
        this.c(aaty);
    }
    
    public final void e(final aauo aauo) {
        if (this.s == null) {
            this.s = new aauj();
            this.t = new aauh();
        }
        aauh aauh = this.t;
        aauh.j = 1;
        aauh.e = 500.0f;
        aauh.b = 6;
        aauh.c = 1000.0f;
        aauh.d = 0.0f;
        aauh.l = 2;
        aauh.k = 3;
        aauh.f = 0.75f;
        aauh.g = 0.75f;
        aauh.h = 0;
        aauh.e = (float)this.m;
        if (aauo != null) {
            if (aauo.a() != -1) {
                aauh.b = aauo.a();
            }
            if (aauo.b() != -1) {
                final int b = aauo.b();
                int j;
                if (b == 6) {
                    j = 1;
                }
                else if (b == 7) {
                    j = 2;
                }
                else {
                    j = 3;
                }
                aauh.j = j;
            }
            if (aauo.c() != null) {
                final ByteBuffer order = ByteBuffer.wrap(aauo.c(), 17, 8).order(ByteOrder.LITTLE_ENDIAN);
                final short short1 = order.getShort();
                order.getShort();
                final short short2 = order.getShort();
                aauh = this.t;
                float c;
                if (short2 > 0) {
                    c = short2;
                }
                else {
                    c = short1;
                }
                aauh.c = c;
            }
        }
        else {
            aauh.j = this.p;
        }
        aauh.l = this.n;
        aauh.k = this.o;
        final aavw u = this.u;
        if (u.a) {
            f(aauh, u, 0L);
        }
        final aauh t = this.t;
        final int b2 = t.b;
        yag.m(this.n);
        yag.a(t.j);
        yag.a(this.o);
        final float d = t.d;
        final float c2 = t.c;
        try {
            final aauj s = this.s;
            final aauh t2 = this.t;
            final int i = t2.j;
            if (i == 1) {
                s.a = new aauc(2);
            }
            else {
                if (i != 2) {
                    return;
                }
                s.a = new aauc(0);
            }
            final int k = t2.k;
            final int n = k - 1;
            if (k == 0) {
                throw null;
            }
            if (n != 0) {
                if (n != 2) {
                    return;
                }
                s.b = new aauc(1);
            }
            else {
                s.b = new aauc(2);
            }
            final int b3 = t2.b;
            if (b3 == 6) {
                s.c = new aaub(aaub.a);
            }
            else {
                if (b3 != 1) {
                    return;
                }
                s.c = new aaub(aaub.b);
            }
            s.f = ((aaub)s.c).d;
            final int l = t2.l;
            final int n2 = l - 1;
            if (l != 0) {
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 == 2) {
                            s.d = new aaub(aaub.b);
                        }
                    }
                    else {
                        s.d = new aaub(aaub.c);
                    }
                }
                else {
                    s.d = new aaub(aaub.a);
                }
                s.g = ((aaub)s.d).e;
                s.h = new adet((int[])null);
                adet.ax((adet)s.g, (adet)s.f, (adet)s.h);
                s.e = new Range((Comparable)0.0, (Comparable)10000.0);
                final int a = t2.a;
                s.i = new adet(256, new aaue(s));
                double n4;
                if (((aaud)s.b).d()) {
                    final double n3 = t2.e;
                    final double b4 = ((aaud)s.b).b();
                    Double.isNaN(n3);
                    n4 = n3 / b4;
                }
                else {
                    n4 = 1.0;
                }
                final int a2 = t2.a;
                s.j = new adet(1024, new aauf(s, n4));
                s.a(t2);
                final ByteBuffer wrap = ByteBuffer.wrap((byte[])((adet)this.s.i).a);
                final ByteBuffer wrap2 = ByteBuffer.wrap((byte[])((adet)this.s.j).a);
                final ByteBuffer wrap3 = ByteBuffer.wrap(this.s.b());
                final aauj s2 = this.s;
                final Object a3 = ((adet)s2.h).a;
                final Object a4 = ((adet)s2.f).a;
                final int e = wrap.capacity() / 2;
                this.e = e;
                GLES20.glUniform1f(this.d, (float)e);
                this.g(wrap, 0, this.a);
                this.g(wrap3, 2, this.c);
                this.g(wrap2, 1, this.b);
                GLES20.glUniformMatrix3fv(this.q, 1, true, (float[])a3, 0);
                GLES20.glUniform3fv(this.r, 1, (float[])a4, 3);
                final Boolean a5 = aatt.a;
                return;
            }
            throw null;
        }
        catch (final Exception ex) {
            ex.toString();
        }
    }
}
