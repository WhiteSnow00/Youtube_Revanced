import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.net.Uri;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabl implements acjs, thj
{
    public final Object a;
    public final vfn b;
    public final zoa c;
    public final thg d;
    public final Executor e;
    final Map f;
    public ListenableFuture g;
    public aabk h;
    private final adff i;
    private Boolean j;
    private final boolean k;
    private final boolean l;
    private final ahar m;
    private final aaec n;
    
    public aabl(final vfn b, final zoa c, final thg d, final Executor e, final aaec n, final adff i, final boolean k, final boolean l, final ahar m, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Object();
        this.j = null;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.n = n;
        this.f = new HashMap();
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    private final String h(final znz znz, final String s) {
        synchronized (this) {
            final String s2 = this.f.get(s);
            monitorexit(this);
            if (s2 != null || this.f()) {
                return s2;
            }
            final vfm a = this.b.a(znz);
            final aaec n = this.n;
            final ArrayList list = new ArrayList();
            vfw.ao((vft)zzb.a, 1, s, n, (List)list);
            final afgh afgh = (afgh)a.m(vfw.ar(n, (List)list)).ac();
            if (afgh.isEmpty()) {
                return null;
            }
            final alxc alxc = (alxc)a.g((String)afgh.get(0)).j(alxc.class).af();
            if (alxc != null) {
                if (alxc.c()) {
                    final String localImageUrl = alxc.getLocalImageUrl();
                    synchronized (this) {
                        this.f.put(s, localImageUrl);
                        return localImageUrl;
                    }
                }
            }
            return null;
        }
    }
    
    private final boolean i() {
        return !this.c.c().z();
    }
    
    @Override
    public final String a(final String s) {
        final znz c = this.c.c();
        if (c.z()) {
            return null;
        }
        String h;
        String s3;
        final String s2 = s3 = (h = this.h(c, s));
        try {
            if (this.l && (s3 = s2) == null) {
                h = s2;
                final Uri parse = Uri.parse(s);
                h = s2;
                s3 = s2;
                if (this.m.i(parse)) {
                    h = s2;
                    final ahar m = this.m;
                    h = s2;
                    h = s2;
                    final ahax ahax = new ahax();
                    h = s2;
                    final String string = m.j(ahax, parse).toString();
                    h = s2;
                    s3 = s2;
                    if (!s.equals(string)) {
                        h = s2;
                        final String h2 = this.h(c, string);
                        if ((s3 = h2) != null) {
                            h = h2;
                            monitorenter(this);
                            try {
                                this.f.put(s, h2);
                            }
                            finally {
                                monitorexit(this);
                                h = h2;
                            }
                        }
                    }
                }
            }
        }
        catch (final ozh ozh) {
            tut.d("Failed to remove FIFE options during offline lookup!", (Throwable)ozh);
            s3 = h;
        }
        return s3;
    }
    
    @Override
    public final void b(final String s, final String s2) {
        synchronized (this) {
            if (this.i()) {
                this.f.put(s, s2);
            }
        }
    }
    
    @Override
    public final void c(final String s) {
        synchronized (this) {
            if (this.i()) {
                Collection$_EL.removeIf((Collection)this.f.entrySet(), (Predicate)new aabj(s, 0));
            }
        }
    }
    
    public final void d(final znz znz) {
        this.e.execute(aewf.h((Runnable)new zwj(this, znz, 12)));
    }
    
    public final boolean f() {
        final boolean k = this.k;
        boolean b = false;
        if (!k) {
            return false;
        }
        if (this.j == null) {
            if (this.i.e() != 2) {
                b = true;
            }
            this.j = b;
        }
        return this.j;
    }
    
    public final void g() {
        synchronized (this) {
            this.f.clear();
        }
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zop zop = (zop)o;
                this.g();
            }
            else {
                final zon zon = (zon)o;
                this.d(this.c.c());
            }
        }
        else {
            array = new Class[] { zon.class, zop.class };
        }
        return array;
    }
}
