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

public final class acyt implements acyo
{
    private static final String h;
    public final Object a;
    public final oco b;
    public final Executor c;
    public final AtomicReference d;
    final Map e;
    public final vbs f;
    final maz g;
    private final AccountId i;
    private final Executor j;
    private final aheu k;
    
    static {
        h = acyo.class.getSimpleName();
    }
    
    public acyt(final Context context, final AccountId i, final aheu k, final vbs f, final oco b, final Executor c, final Executor j, final byte[] array, final byte[] array2) {
        this.a = new Object();
        this.d = new AtomicReference();
        this.i = i;
        this.k = k;
        this.f = f;
        this.b = b;
        this.c = c;
        this.j = j;
        this.g = maz.c(context);
        this.e = DesugarCollections.synchronizedMap((Map)new HashMap());
    }
    
    public static final void g(final String s, final tui tui) {
        if (tui != null) {
            tui.a((Object)s);
        }
    }
    
    public static final void h(final String s) {
        if (s != null) {
            final zng a = zng.a;
            final znf y = znf.y;
            final String h = acyt.h;
            final StringBuilder sb = new StringBuilder("GenericWebView::");
            sb.append(h);
            sb.append(" ");
            sb.append(s);
            znh.b(a, y, sb.toString());
        }
    }
    
    public static final void i(final xbt xbt, final alow r) {
        if (xbt != null) {
            final ahcr builder = aloj.a.createBuilder();
            builder.copyOnWrite();
            final aloj aloj = (aloj)builder.instance;
            r.getClass();
            aloj.R = r;
            aloj.d |= 0x2000;
            xbt.a((aloj)builder.build());
        }
    }
    
    private static boolean j(final Throwable t) {
        return t != null && (t.getClass().getName().contains("MissingWebViewPackageException") || j(t.getCause()));
    }
    
    private final void k(final String s, final int n, final xbt xbt, final tui tui, final Executor executor) {
        final aheu k = this.k;
        tfx.k(afvh.e(afun.e(afvh.e(((agnv)((afbn)k.a).a).q(this.i), aewf.a((afax)new aemg(k, 1, (byte[])null, (byte[])null)), (Executor)afwd.a), (Class)IllegalArgumentException.class, aewf.a((afax)accj.t), (Executor)afwd.a), aewf.a((afax)accj.u), (Executor)afwd.a), (Executor)afwd.a, (tfv)new aciu(s, tui, 2), (tfw)new acyr(this, s, n, xbt, tui, executor));
    }
    
    @Override
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
    
    @Override
    public final void b(final znz znz) {
        throw new IllegalArgumentException("Account scoped callsite should not pass Identity.");
    }
    
    @Override
    public final void c(final String s) {
        this.k(s, 0, null, null, this.c);
    }
    
    @Override
    public final void d(final String s, final znz znz) {
        throw new IllegalArgumentException("Account scoped callsite should not pass Identity.");
    }
    
    @Override
    public final void e(final String s, final int n, final xbt xbt, final tui tui) {
        this.k(s, n, xbt, tui, this.j);
    }
    
    @Override
    public final void f(final String s, final znz znz, final int n, final xbt xbt, final tui tui) {
        throw new IllegalArgumentException("Account scoped callsite should pass Identity.");
    }
}
