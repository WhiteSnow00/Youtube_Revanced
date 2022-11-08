import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.nio.charset.Charset;
import java.io.IOException;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import java.io.InterruptedIOException;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwp implements bbk
{
    private final lwm a;
    private final bbk b;
    private final bbk c;
    private final bbk d;
    private final yyt e;
    private final boolean f;
    private final boolean g;
    private Uri h;
    private bbo i;
    private bbo j;
    private bbk k;
    private long l;
    private long m;
    private long n;
    private lwr o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    
    public lwp(final lwm a, final bbk d, final bbk b, final bbi bbi, final int n, final yyt e) {
        this.a = a;
        this.b = b;
        final boolean b2 = false;
        this.f = (0x1 == (n & 0x1));
        boolean g = b2;
        if ((n & 0x2) != 0x0) {
            g = true;
        }
        this.g = g;
        this.d = d;
        Object c;
        if (bbi != null) {
            c = new bcm(d, bbi);
        }
        else {
            c = null;
        }
        this.c = (bbk)c;
        this.e = e;
    }
    
    private final void g() {
        final bbk k = this.k;
        if (k != null) {
            try {
                k.f();
                this.j = null;
                this.k = null;
                final lwr o = this.o;
                if (o != null) {
                    this.a.m(o);
                    this.o = null;
                }
            }
            finally {
                this.j = null;
                this.k = null;
                final lwr o2 = this.o;
                if (o2 != null) {
                    this.a.m(o2);
                    this.o = null;
                }
            }
        }
    }
    
    private final void h(final Throwable t) {
        if (!this.k() && !(t instanceof lwk)) {
            return;
        }
        this.p = true;
    }
    
    private final void i(final boolean b) {
        final String i = this.i.i;
        final boolean q = this.q;
        final Uri uri = null;
        lwr lwr = null;
        Label_0084: {
            if (q) {
                lwr = null;
            }
            else {
                if (this.f) {
                    try {
                        lwr = this.a.b(i, this.m);
                        break Label_0084;
                    }
                    catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                lwr = this.a.c(i, this.m);
            }
        }
        lwr o;
        bbk k;
        bbo j;
        if (lwr == null) {
            final bbk d = this.d;
            final bbn a = this.i.a();
            a.f = this.m;
            a.g = this.n;
            final bbo a2 = a.a();
            o = lwr;
            k = d;
            j = a2;
        }
        else if (lwr.d) {
            final Uri fromFile = Uri.fromFile(lwr.e);
            final long b2 = lwr.b;
            final long f = this.m - b2;
            final long n = lwr.c - f;
            final long n2 = this.n;
            long min = n;
            if (n2 != -1L) {
                min = Math.min(n, n2);
            }
            final bbn a3 = this.i.a();
            a3.a = fromFile;
            a3.b = b2;
            a3.f = f;
            a3.g = min;
            j = a3.a();
            final bbk b3 = this.b;
            o = lwr;
            k = b3;
        }
        else {
            long g;
            if (lwr.c()) {
                g = this.n;
            }
            else {
                final long c = lwr.c;
                final long n3 = this.n;
                g = c;
                if (n3 != -1L) {
                    g = Math.min(c, n3);
                }
            }
            final bbn a4 = this.i.a();
            a4.f = this.m;
            a4.g = g;
            j = a4.a();
            final bbk c2 = this.c;
            if (c2 != null) {
                o = lwr;
                k = c2;
            }
            else {
                final bbk d2 = this.d;
                this.a.m(lwr);
                o = null;
                k = d2;
            }
        }
        final boolean q2 = this.q;
        long s = Long.MAX_VALUE;
        if (!q2) {
            s = s;
            if (k == this.d) {
                s = this.m + 102400L;
            }
        }
        this.s = s;
        if (b) {
            dk.h(this.k == this.d);
            if (k == this.d) {
                return;
            }
            try {
                this.g();
            }
            finally {
                if (o.b()) {
                    this.a.m(o);
                }
            }
        }
        if (o != null && o.b()) {
            this.o = o;
        }
        this.k = k;
        this.j = j;
        this.l = 0L;
        final long b4 = k.b(j);
        final a a5 = new a();
        if (this.j.h == -1L && b4 != -1L) {
            this.n = b4;
            com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a.f(a5, this.m + b4);
        }
        if (this.l()) {
            this.h = this.k.c();
            Uri h = uri;
            if (!this.i.a.equals((Object)this.h)) {
                h = this.h;
            }
            if (h == null) {
                ((List<String>)a5.a).add("exo_redir");
                ((Map<Object, Object>)a5.b).remove("exo_redir");
            }
            else {
                a5.d("exo_redir", (Object)h.toString());
            }
        }
        if (this.m()) {
            this.a.r(i, a5);
        }
    }
    
    private final void j() {
        this.n = 0L;
        if (this.m()) {
            final a a = new a();
            com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a.f(a, this.m);
            this.a.r(this.i.i, a);
        }
    }
    
    private final boolean k() {
        return this.k == this.b;
    }
    
    private final boolean l() {
        return !this.k();
    }
    
    private final boolean m() {
        return this.k == this.c;
    }
    
    public final int a(final byte[] array, int a, final int n) {
        if (n == 0) {
            return 0;
        }
        if (this.n == 0L) {
            return -1;
        }
        try {
            if (this.m >= this.s) {
                this.i(true);
            }
            final int a2 = this.k.a(array, a, n);
            if (a2 != -1) {
                if (this.k()) {
                    this.r += a2;
                }
                final long m = this.m;
                final long n2 = a2;
                this.m = m + n2;
                this.l += n2;
                final long n3 = this.n;
                if (n3 != -1L) {
                    this.n = n3 - n2;
                }
            }
            else {
                if (this.l()) {
                    final long h = this.j.h;
                    if (h == -1L || this.l < h) {
                        this.j();
                        return a2;
                    }
                }
                final long n4 = this.n;
                if (n4 > 0L || n4 == -1L) {
                    this.g();
                    this.i(false);
                    a = this.a(array, a, n);
                    return a;
                }
            }
            return a2;
        }
        catch (final IOException ex) {
            if (this.j.h == -1L && bbl.sH(ex)) {
                this.j();
                return -1;
            }
            this.h(ex);
            throw ex;
        }
        finally {
            final Throwable t;
            this.h(t);
        }
    }
    
    public final long b(final bbo bbo) {
        try {
            String h;
            if ((h = bbo.i) == null) {
                h = bbo.a.toString();
            }
            final bbn a = bbo.a();
            a.h = h;
            final bbo a2 = a.a();
            this.i = a2;
            final lwm a3 = this.a;
            final Uri a4 = a2.a;
            final lwv d = a3.d(h);
            final boolean containsKey = ((lww)d).b.containsKey("exo_redir");
            final Uri uri = null;
            String s;
            if (containsKey) {
                s = new String(((lww)d).b.get("exo_redir"), Charset.forName("UTF-8"));
            }
            else {
                s = null;
            }
            Uri parse;
            if (s == null) {
                parse = uri;
            }
            else {
                parse = Uri.parse(s);
            }
            if (parse == null) {
                parse = a4;
            }
            this.h = parse;
            this.m = bbo.g;
            final boolean g = this.g;
            boolean q = true;
            int n;
            if (g && this.p) {
                n = 0;
            }
            else if (bbo.h == -1L) {
                n = 1;
            }
            else {
                n = -1;
            }
            if (n == -1) {
                q = false;
            }
            this.q = q;
            if (q) {
                final yyt e = this.e;
                if (e != null) {
                    e.b(n);
                }
            }
            long n2;
            if (this.q) {
                this.n = -1L;
                n2 = -1L;
            }
            else {
                final long m = meo.m(this.a.d(h));
                this.n = m;
                n2 = m;
                if (m != -1L) {
                    n2 = m - bbo.g;
                    this.n = n2;
                    if (n2 < 0L) {
                        throw new bbl(2008);
                    }
                }
            }
            final long h2 = bbo.h;
            long n3 = n2;
            if (h2 != -1L) {
                long min;
                if (n2 == -1L) {
                    min = h2;
                }
                else {
                    min = Math.min(n2, h2);
                }
                this.n = min;
                n3 = min;
            }
            if (n3 > 0L || n3 == -1L) {
                this.i(false);
            }
            long n4 = bbo.h;
            if (n4 == -1L) {
                n4 = this.n;
            }
            return n4;
        }
        finally {
            final Throwable t;
            this.h(t);
        }
    }
    
    public final Uri c() {
        return this.h;
    }
    
    public final Map d() {
        Map<Object, Object> map;
        if (this.l()) {
            map = this.d.d();
        }
        else {
            map = Collections.emptyMap();
        }
        return map;
    }
    
    public final void e(final bcn bcn) {
        this.b.e(bcn);
        this.d.e(bcn);
    }
    
    public final void f() {
        this.i = null;
        this.h = null;
        if (this.e != null && this.r > 0L) {
            try {
                this.a.a();
            }
            catch (final Exception ex) {
                this.e.a(ex);
            }
            this.e.c(this.r);
            this.r = 0L;
        }
        try {
            this.g();
        }
        catch (final IOException ex2) {
            this.h(ex2);
            throw ex2;
        }
    }
}
