import java.io.IOException;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwo implements bbi
{
    private final lwm a;
    private final int b;
    private boolean c;
    private bbo d;
    private long e;
    private File f;
    private OutputStream g;
    private FileOutputStream h;
    private long i;
    private long j;
    private lxb k;
    private final boolean l;
    
    public lwo(final lwm a, final int b, final zba zba) {
        dk.i(true, (Object)"fragmentSize must be positive or C.LENGTH_UNSET.");
        dk.d((Object)a);
        this.a = a;
        this.b = b;
        this.c = true;
        this.l = ((yzk)zba).aT();
    }
    
    public lwo(final lwm lwm, final zba zba) {
        this(lwm, 20480, zba);
    }
    
    private final void d() {
        final OutputStream g = this.g;
        if (g != null) {
            Object o = null;
            try {
                g.flush();
                if (this.c) {
                    this.h.getFD().sync();
                }
                baw.X(this.g);
                this.g = null;
                final File f = this.f;
                this.f = null;
                final Object k = this.d.k;
                if (k instanceof yhp) {
                    o = k;
                }
                this.a.k(f, this.i, (yhp)o);
            }
            finally {
                baw.X(this.g);
                this.g = null;
                final File f2 = this.f;
                this.f = null;
                f2.delete();
            }
        }
    }
    
    private final void e() {
        final long h = this.d.h;
        long min = -1L;
        if (h != -1L) {
            min = Math.min(h - this.j, this.e);
        }
        final lwm a = this.a;
        final bbo d = this.d;
        final File e = a.e(d.i, d.f + this.j, min);
        this.f = e;
        if (this.l) {
            if (e == null) {
                this.g = null;
                this.d = null;
                return;
            }
            this.h = new FileOutputStream(e, true);
        }
        else {
            this.h = new FileOutputStream(this.f);
        }
        if (this.b > 0) {
            final lxb k = this.k;
            if (k == null) {
                this.k = new lxb(this.h, this.b);
            }
            else {
                k.a(this.h);
            }
            this.g = this.k;
        }
        else {
            this.g = this.h;
        }
        this.i = 0L;
    }
    
    @Override
    public final void a() {
        if (this.d == null) {
            return;
        }
        try {
            this.d();
        }
        catch (final IOException ex) {
            throw new lwn(ex);
        }
    }
    
    @Override
    public final void b(final bbo d) {
        if (d.h == -1L && d.g(2)) {
            this.d = null;
            return;
        }
        this.d = d;
        long e;
        if (!d.g(4)) {
            e = Long.MAX_VALUE;
        }
        else {
            e = 5242880L;
        }
        this.e = e;
        this.j = 0L;
        try {
            this.e();
        }
        catch (final IOException ex) {
            throw new lwn(ex);
        }
    }
    
    @Override
    public final void c(final byte[] array, final int n, final int n2) {
        if (this.d != null) {
            int i = 0;
            while (i < n2) {
                try {
                    if (this.i == this.e) {
                        this.d();
                        this.e();
                    }
                    if (this.l && this.g == null) {
                        return;
                    }
                    final int n3 = (int)Math.min(n2 - i, this.e - this.i);
                    this.g.write(array, n + i, n3);
                    i += n3;
                    final long j = this.i;
                    final long n4 = n3;
                    this.i = j + n4;
                    this.j += n4;
                    continue;
                }
                catch (final IOException ex) {
                    throw new lwn(ex);
                }
                break;
            }
        }
    }
}
