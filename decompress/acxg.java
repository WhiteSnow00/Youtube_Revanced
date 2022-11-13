import android.webkit.ValueCallback;
import android.webkit.CookieManager;
import j$.util.DesugarCollections;
import java.util.HashMap;
import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxg implements acxb
{
    private static final String h;
    public final Object a;
    public final oby b;
    public final Executor c;
    public final AtomicReference d;
    final Map e;
    public final vai f;
    final mal g;
    private final AccountId i;
    private final Executor j;
    private final aekp k;
    
    static {
        h = acxb.class.getSimpleName();
    }
    
    public acxg(final Context context, final AccountId i, final aekp k, final vai f, final oby b, final Executor c, final Executor j, final byte[] array) {
        this.a = new Object();
        this.d = new AtomicReference();
        this.i = i;
        this.k = k;
        this.f = f;
        this.b = b;
        this.c = c;
        this.j = j;
        this.g = mal.c(context);
        this.e = DesugarCollections.synchronizedMap((Map)new HashMap());
    }
    
    public static final void g(final String s, final ttg ttg) {
        if (ttg != null) {
            ttg.a((Object)s);
        }
    }
    
    public static final void h(final String s) {
        if (s != null) {
            final zll a = zll.a;
            final zlk y = zlk.y;
            final String h = acxg.h;
            final StringBuilder sb = new StringBuilder("GenericWebView::");
            sb.append(h);
            sb.append(" ");
            sb.append(s);
            zlm.b(a, y, sb.toString());
        }
    }
    
    public static final void i(final xan xan, final almw r) {
        if (xan != null) {
            final ahaz builder = ((ahbh)almj.a).createBuilder();
            builder.copyOnWrite();
            final almj almj = (almj)builder.instance;
            r.getClass();
            almj.R = r;
            almj.d |= 0x1000;
            xan.a((almj)builder.build());
        }
    }
    
    private static boolean j(final Throwable t) {
        return t != null && (t.getClass().getName().contains("MissingWebViewPackageException") || j(t.getCause()));
    }
    
    private final void k(final String s, final int n, final xan xan, final ttg ttg, final Executor executor) {
        final aekp k = this.k;
        teu.k(aftq.e(afsw.e(aftq.e(((ahdc)((aezv)k.b).a).t(this.i), aeun.a((aezf)new aekn(k, 0, (byte[])null)), (Executor)afum.a), (Class)IllegalArgumentException.class, aeun.a((aezf)abvp.u), (Executor)afum.a), aeun.a((aezf)aeko.b), (Executor)afum.a), (Executor)afum.a, (tes)new achh(s, ttg, 2), (tet)new acxe(this, s, n, xan, ttg, executor));
    }
    
    public final void a() {
        try {
            final CookieManager instance = CookieManager.getInstance();
            instance.removeAllCookies((ValueCallback)null);
            instance.flush();
            this.e.clear();
        }
        catch (final RuntimeException ex) {
            if (j(ex)) {
                h("MissingWebViewPackageException");
            }
        }
    }
    
    public final void b(final zme zme) {
        throw new IllegalArgumentException("Account scoped callsite should not pass Identity.");
    }
    
    public final void c(final String s) {
        this.k(s, 0, null, null, this.c);
    }
    
    public final void d(final String s, final zme zme) {
        throw new IllegalArgumentException("Account scoped callsite should not pass Identity.");
    }
    
    public final void e(final String s, final int n, final xan xan, final ttg ttg) {
        this.k(s, n, xan, ttg, this.j);
    }
    
    public final void f(final String s, final zme zme, final int n, final xan xan, final ttg ttg) {
        throw new IllegalArgumentException("Account scoped callsite should pass Identity.");
    }
}
