import java.util.Arrays;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Map;
import android.net.Uri;
import java.util.Iterator;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aabb implements bbk
{
    byte[][] a;
    final ArrayList b;
    private final bbk c;
    private final atjj d;
    private long e;
    private long f;
    private bbo g;
    private String h;
    private int i;
    private String j;
    private long k;
    private int l;
    private boolean m;
    private aacp n;
    private aach o;
    private zul p;
    private aahk q;
    private aahi r;
    private final byte[] s;
    
    public aabb(final bbk c, final atjj d) {
        this.l = -1;
        this.m = false;
        this.b = new ArrayList();
        this.q = new aahk();
        this.r = (aahi)new aahh(false);
        this.s = new byte[4096];
        this.c = c;
        this.d = d;
    }
    
    private final void g(final byte[] array, final int n, final int n2) {
        int n3 = n;
        while (true) {
            final int n4 = n2 + n - n3;
            if (n4 <= 0) {
                break;
            }
            final int n5 = (int)(this.f % 4096L);
            final int min = Math.min(n4, 4096 - n5);
            System.arraycopy(array, n3, this.s, n5, min);
            this.r.c(this.s, n5, min);
            this.f += min;
            if (this.r.a() == 4096) {
                final byte[] d = this.r.d();
                final aahi r = this.r;
                if (r instanceof Serializable) {
                    this.r = aahk.a(this.m);
                }
                else {
                    r.b();
                }
                final int n6 = (int)((this.f - 1L) / 4096L);
                final byte[][] a = this.a;
                final int length = a.length;
                a[n6 % length] = d;
                if ((n6 + 1) % length == 0) {
                    this.h(n6);
                }
            }
            n3 += min;
        }
    }
    
    private final void h(final int n) {
        this.q.c();
        final int length = this.a.length;
        final int c = n / length;
        for (int i = 0; i < n % length + 1; ++i) {
            this.q.b(this.a[i]);
        }
        final zyu zyu = new zyu();
        zyu.e = this.h;
        zyu.a = this.i;
        zyu.f = this.j;
        zyu.b = this.l;
        zyu.c = c;
        zyu.b(this.q.d());
        this.b.add(zyu.a());
        if (this.b.size() >= 256) {
            this.i();
        }
    }
    
    private final void i() {
        this.o.e(this.b);
        this.b.clear();
    }
    
    public final int a(final byte[] array, int a, int a2) {
        if (this.l == -1) {
            return this.c.a(array, a, a2);
        }
        final bbo g = this.g;
        if (g == null) {
            throw new IOException("Null dataspec on read.");
        }
        final long f = g.f;
        final long e = this.e;
        long n = f - e;
        if (n > 0L) {
            final byte[] array2 = new byte[4096];
            while (n > 0L) {
                final int a3 = this.c.a(array2, 0, (int)Math.min(n, array.length));
                if (a3 == -1) {
                    return -1;
                }
                final long n2 = a3;
                this.e += n2;
                this.g(array2, 0, a3);
                n -= n2;
            }
        }
        else {
            final long f2 = this.f;
            if (e < f2) {
                a = this.c.a(array, a, Math.min(a2, (int)(f2 - e)));
                if (a == -1) {
                    return -1;
                }
                this.e += a;
                return a;
            }
        }
        a2 = this.c.a(array, a, a2);
        if (a2 == -1) {
            return -1;
        }
        this.e += a2;
        this.g(array, a, a2);
        return a2;
    }
    
    public final long b(bbo b) {
        this.g = b;
        if (b == null) {
            throw new IOException("Null dataspec on open.");
        }
        if (b.i == null) {
            throw new IOException("Null dataspec key on open.");
        }
        this.e = b.f;
        final aack a = ((zzu)this.d.a()).a();
        this.n = a.l();
        this.o = a.h();
        this.p = a.d();
        this.h = xyl.B(b.i);
        this.i = whx.L(xyl.A(b.i));
        this.l = -1;
        final zzl e = this.n.e(this.h);
        if (e == null) {
            return this.c.b(b);
        }
        final zzo o = e.o;
        if (o == null) {
            return this.c.b(b);
        }
        if ((this.l = aadj.c(o.f)) == -1) {
            return this.c.b(b);
        }
        final zul p = this.p;
        final String h = this.h;
        final zyn zyn = null;
        final zze m = p.m(h, (foi)null);
        zzd zzd2;
        if (m != null) {
            final zzd a2 = m.a;
            zzd zzd = null;
            Label_0238: {
                if (a2 != null) {
                    zzd = a2;
                    if (a2.a() == this.i) {
                        break Label_0238;
                    }
                }
                zzd = null;
            }
            final zzd b2 = m.b;
            zzd2 = zzd;
            if (b2 != null) {
                zzd2 = zzd;
                if (b2.a() == this.i) {
                    zzd2 = b2;
                }
            }
        }
        else {
            zzd2 = null;
        }
        if (zzd2 != null) {
            final ajsj a3 = zzd2.b.a;
            ajsl ajsl;
            if ((a3.c & 0x100000) != 0x0) {
                if ((ajsl = a3.y) == null) {
                    ajsl = ajsl.a;
                }
            }
            else {
                ajsl = null;
            }
            if (ajsl != null) {
                final int co = aqql.cO(ajsl.b);
                if (co != 0) {
                    if (co == 3) {
                        this.k = zzd2.b();
                        this.j = zzd2.l;
                        final int l = this.l;
                        final int n = 1 << l;
                        this.a = new byte[n][];
                        Object b3 = zyn;
                        if (l > 0) {
                            b3 = this.o.b(this.h, this.i, l);
                        }
                        final zyv b4 = this.o.b(this.h, this.i, 0);
                        final boolean aa = aadj.aa(o.f);
                        this.m = aa;
                        if (aa) {
                            this.q = new aahk(true);
                            this.r = aahk.a(true);
                        }
                        long f = 0L;
                        this.f = 0L;
                        if (b3 != null) {
                            f = (((zyn)b3).a + 1) * (long)(n * 4096);
                            this.f = f;
                        }
                        Label_0665: {
                            if (b4 != null) {
                                final zyn zyn2 = (zyn)b4;
                                this.f = zyn2.a * 4096L;
                                final byte[] c = zyn2.c;
                                if (c != null) {
                                    try {
                                        final aahi r = (aahi)new ObjectInputStream(new ByteArrayInputStream(c)).readObject();
                                        this.r = r;
                                        f = r.a() + this.f;
                                        this.f = f;
                                        break Label_0665;
                                    }
                                    catch (final IOException ex) {
                                        throw new IOException("Failed to reconstitute offline content verification state.", ex);
                                    }
                                    catch (final ClassNotFoundException ex2) {
                                        throw new IllegalStateException(ex2);
                                    }
                                }
                                this.r.b();
                                f = this.f + 4096L;
                                this.f = f;
                            }
                        }
                        final int n2 = (int)(f / 4096L);
                        final int length = this.a.length;
                        final int n3 = n2 / length * length;
                        for (final zyv zyv : this.o.g(this.h, this.i, n3, n2)) {
                            this.a[zyv.a() - n3] = zyv.g();
                        }
                        final long f2 = b.f;
                        final long f3 = this.f;
                        if (f2 <= f3) {
                            return this.c.b(b);
                        }
                        final long n4 = f2 - f3;
                        if (b.g < n4) {
                            trn.b("[Offline] Can't hash offline gap");
                            this.f = b.f;
                            return this.c.b(b);
                        }
                        b = b.b(-n4);
                        this.e = b.f;
                        final long b5 = this.c.b(b);
                        if (b5 == -1L) {
                            return -1L;
                        }
                        return b5 - n4;
                    }
                }
            }
            this.l = -1;
            return this.c.b(b);
        }
        final String h2 = this.h;
        final int i = this.i;
        final StringBuilder sb = new StringBuilder("[Offline] stream to hash not in store: ");
        sb.append(h2);
        sb.append(" ");
        sb.append(i);
        trn.b(sb.toString());
        throw new IOException("stream not in OfflineStreamStore");
    }
    
    public final Uri c() {
        return this.c.c();
    }
    
    public final void e(final bcn bcn) {
        this.c.e(bcn);
    }
    
    public final void f() {
        this.c.f();
        this.g = null;
        final int l = this.l;
        if (l == -1) {
            return;
        }
        if (l > 0) {
            this.o.f(this.h, this.i);
        }
        final long f = this.f;
        if (f == this.k) {
            final int n = (int)((f - 1L) / 4096L);
            if (this.r.a() != 0) {
                final byte[][] a = this.a;
                a[n % a.length] = this.r.d();
            }
            if (this.f % (this.a.length * 4096) != 0L) {
                this.h(n);
            }
            this.i();
            return;
        }
        this.i();
        final int n2 = (int)(this.f / 4096L);
        final int length = this.a.length;
        final int n3 = n2 / length * length;
        final ArrayList list = new ArrayList<zyv>(length);
        for (int i = n3; i < n2; ++i) {
            final zyu zyu = new zyu();
            zyu.e = this.h;
            zyu.a = this.i;
            zyu.f = this.j;
            zyu.b = 0;
            zyu.c = i;
            zyu.b(this.a[i - n3]);
            list.add(zyu.a());
        }
        this.o.e(list);
        final int a2 = this.r.a();
        if (a2 > 0) {
            if (!(this.r instanceof Serializable)) {
                final boolean m = this.m;
                final int c = aahk.c;
                (this.r = (aahi)new aahj(m)).c(this.s, 0, a2);
            }
            final aahi r = this.r;
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(r);
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            final long f2 = this.f;
            final zyu zyu2 = new zyu();
            zyu2.e = this.h;
            zyu2.a = this.i;
            zyu2.f = this.j;
            zyu2.b = 0;
            zyu2.c = (int)(f2 / 4096L);
            zyu2.h = Arrays.copyOf(byteArray, byteArray.length);
            this.o.d(zyu2.a());
        }
    }
}
