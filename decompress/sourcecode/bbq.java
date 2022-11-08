import java.util.Collections;
import java.util.Map;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbq implements bbk
{
    private final Context a;
    private final List b;
    private final bbk c;
    private bbk d;
    private bbk e;
    private bbk f;
    private bbk g;
    private bbk h;
    private bbk i;
    private bbk j;
    private bbk k;
    
    public bbq(final Context context, final bbk c) {
        this.a = context.getApplicationContext();
        this.c = c;
        this.b = new ArrayList();
    }
    
    private final bbk g() {
        if (this.e == null) {
            this.h(this.e = (bbk)new bbb(this.a));
        }
        return this.e;
    }
    
    private final void h(final bbk bbk) {
        for (int i = 0; i < this.b.size(); ++i) {
            bbk.e((bcn)this.b.get(i));
        }
    }
    
    private static final void i(final bbk bbk, final bcn bcn) {
        if (bbk != null) {
            bbk.e(bcn);
        }
    }
    
    public final int a(final byte[] array, final int n, final int n2) {
        final bbk k = this.k;
        dk.d((Object)k);
        return k.a(array, n, n2);
    }
    
    public final long b(final bbo bbo) {
        dk.h(this.k == null);
        final String scheme = bbo.a.getScheme();
        if (baw.ag(bbo.a)) {
            final String path = bbo.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = this.g();
            }
            else {
                if (this.d == null) {
                    this.h(this.d = (bbk)new bby());
                }
                this.k = this.d;
            }
        }
        else if ("asset".equals(scheme)) {
            this.k = this.g();
        }
        else if ("content".equals(scheme)) {
            if (this.f == null) {
                this.h(this.f = (bbk)new bbg(this.a));
            }
            this.k = this.f;
        }
        else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    this.h(this.g = (bbk)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                }
                catch (final Exception ex) {
                    throw new RuntimeException("Error instantiating RTMP extension", ex);
                }
                catch (final ClassNotFoundException ex2) {
                    bao.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        }
        else if ("udp".equals(scheme)) {
            if (this.h == null) {
                this.h(this.h = (bbk)new bcp());
            }
            this.k = this.h;
        }
        else if ("data".equals(scheme)) {
            if (this.i == null) {
                this.h(this.i = (bbk)new bbh());
            }
            this.k = this.i;
        }
        else {
            bbk k;
            if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                k = this.c;
            }
            else {
                if (this.j == null) {
                    this.h(this.j = (bbk)new bci(this.a));
                }
                k = this.j;
            }
            this.k = k;
        }
        return this.k.b(bbo);
    }
    
    public final Uri c() {
        final bbk k = this.k;
        if (k == null) {
            return null;
        }
        return k.c();
    }
    
    public final Map d() {
        final bbk k = this.k;
        Map<Object, Object> map;
        if (k == null) {
            map = Collections.emptyMap();
        }
        else {
            map = k.d();
        }
        return map;
    }
    
    public final void e(final bcn bcn) {
        dk.d((Object)bcn);
        this.c.e(bcn);
        this.b.add(bcn);
        i(this.d, bcn);
        i(this.e, bcn);
        i(this.f, bcn);
        i(this.g, bcn);
        i(this.h, bcn);
        i(this.i, bcn);
        i(this.j, bcn);
    }
    
    public final void f() {
        final bbk k = this.k;
        if (k != null) {
            try {
                k.f();
            }
            finally {
                this.k = null;
            }
        }
    }
}
