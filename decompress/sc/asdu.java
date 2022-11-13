import java.io.InputStream;
import java.util.Locale;
import io.grpc.Status;
import java.io.IOException;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdu implements Closeable, asaq
{
    public asdr a;
    public int b;
    public aruq c;
    public asam d;
    public long e;
    public boolean f;
    private final asfr g;
    private final asfz h;
    private int i;
    private boolean j;
    private asam k;
    private boolean l;
    private int m;
    private int n;
    private volatile boolean o;
    private int p;
    
    public asdu(final asdr a, final aruq c, final int b, final asfr g, final asfz h) {
        this.p = 1;
        this.i = 5;
        this.d = new asam();
        this.l = false;
        this.m = -1;
        this.f = false;
        this.o = false;
        this.a = a;
        this.c = c;
        this.b = b;
        this.g = g;
        this.h = h;
    }
    
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        try {
        Label_0739:
            while (this.e > 0L) {
                int n4 = 0;
                Label_0697: {
                    try {
                        if (this.k == null) {
                            this.k = new asam();
                        }
                        int n = 0;
                        while (true) {
                            try {
                                final int n2 = this.i - this.k.a;
                                if (n2 > 0) {
                                    final int a = this.d.a;
                                    if (a != 0) {
                                        final int min = Math.min(n2, a);
                                        n += min;
                                        this.k.h(this.d.g(min));
                                        continue;
                                    }
                                    if (n <= 0) {
                                        break Label_0739;
                                    }
                                    this.a.j(n);
                                    if (this.p == 2) {
                                        this.g.h();
                                        this.n += n;
                                        break Label_0739;
                                    }
                                    break Label_0739;
                                }
                            }
                            finally {
                                break Label_0697;
                            }
                            break;
                        }
                        if (n > 0) {
                            this.a.j(n);
                            if (this.p == 2) {
                                this.g.h();
                                this.n += n;
                            }
                        }
                        final int p = this.p;
                        final int n3 = p - 1;
                        if (p == 0) {
                            throw null;
                        }
                        if (n3 != 0) {
                            if (n3 != 1) {
                                String s;
                                if (p != 1) {
                                    s = "BODY";
                                }
                                else {
                                    s = "HEADER";
                                }
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Invalid state: ");
                                sb.append(s);
                                throw new AssertionError((Object)sb.toString());
                            }
                            this.g.f();
                            this.n = 0;
                            InputStream c2 = null;
                            Label_0420: {
                                if (this.j) {
                                    final aruq c = this.c;
                                    if (c != arug.a) {
                                        try {
                                            c2 = new asdt(c.a(asem.c((asei)this.k)), this.b, this.g);
                                            break Label_0420;
                                        }
                                        catch (final IOException ex) {
                                            throw new RuntimeException(ex);
                                        }
                                    }
                                    throw Status.k.withDescription("Can't decode compressed gRPC message as compression not configured").d();
                                }
                                final asfr g = this.g;
                                final int a2 = this.k.a;
                                g.g();
                                c2 = asem.c((asei)this.k);
                            }
                            this.k = null;
                            this.a.a(new asds(c2));
                            this.p = 1;
                            this.i = 5;
                            --this.e;
                            continue;
                        }
                        else {
                            final int e = this.k.e();
                            if ((e & 0xFE) != 0x0) {
                                throw Status.k.withDescription("gRPC frame header malformed: reserved bits not zero").d();
                            }
                            this.j = (0x1 == (e & 0x1));
                            final asam k = this.k;
                            k.a(4);
                            final int i = k.e() | (k.e() << 24 | k.e() << 16 | k.e() << 8);
                            this.i = i;
                            if (i >= 0 && i <= this.b) {
                                ++this.m;
                                this.g.e();
                                final asfz h = this.h;
                                h.d.a();
                                h.e = h.a.a();
                                this.p = 2;
                                continue;
                            }
                            throw Status.h.withDescription(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", this.b, this.i)).d();
                        }
                    }
                    finally {
                        n4 = 0;
                    }
                }
                if (n4 > 0) {
                    this.a.j(n4);
                    if (this.p == 2) {
                        this.g.h();
                        this.n += n4;
                    }
                }
            }
            if (this.f && this.c()) {
                this.close();
            }
            this.l = false;
        }
        finally {
            this.l = false;
            while (true) {}
        }
    }
    
    public final boolean b() {
        return this.d == null;
    }
    
    public final boolean c() {
        return this.d.a == 0;
    }
    
    @Override
    public final void close() {
        if (this.b()) {
            return;
        }
        final asam k = this.k;
        boolean b = false;
        if (k != null) {
            b = b;
            if (k.a > 0) {
                b = true;
            }
        }
        try {
            final asam d = this.d;
            if (d != null) {
                d.close();
            }
            final asam i = this.k;
            if (i != null) {
                i.close();
            }
            this.d = null;
            this.k = null;
            this.a.e(b);
        }
        finally {
            this.d = null;
            this.k = null;
        }
    }
}
