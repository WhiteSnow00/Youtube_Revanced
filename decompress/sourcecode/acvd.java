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

public final class acvd implements acux
{
    private static final String h;
    public final Object a;
    public final oas b;
    public final Executor c;
    public final AtomicReference d;
    final Map e;
    public final uyi f;
    final lzg g;
    private final AccountId i;
    private final Executor j;
    private final aeim k;
    
    static {
        h = acux.class.getSimpleName();
    }
    
    public acvd(final Context context, final AccountId i, final aeim k, final uyi f, final oas b, final Executor c, final Executor j, final byte[] array) {
        this.a = new Object();
        this.d = new AtomicReference();
        this.i = i;
        this.k = k;
        this.f = f;
        this.b = b;
        this.c = c;
        this.j = j;
        this.g = lzg.c(context);
        this.e = DesugarCollections.synchronizedMap((Map)new HashMap());
    }
    
    public static final void g(final String s, final trb trb) {
        if (trb != null) {
            trb.a((Object)s);
        }
    }
    
    public static final void h(final String s) {
        if (s != null) {
            final zjo a = zjo.a;
            final zjn y = zjn.y;
            final String h = acvd.h;
            final StringBuilder sb = new StringBuilder("GenericWebView::");
            sb.append(h);
            sb.append(" ");
            sb.append(s);
            zjp.b(a, y, sb.toString());
        }
    }
    
    public static final void i(final wyn wyn, final alkt r) {
        if (wyn != null) {
            final agza builder = ((agzi)alkg.a).createBuilder();
            builder.copyOnWrite();
            final alkg alkg = (alkg)builder.instance;
            r.getClass();
            alkg.R = r;
            alkg.d |= 0x1000;
            wyn.a((alkg)builder.build());
        }
    }
    
    private static boolean j(final Throwable t) {
        return t != null && (t.getClass().getName().contains("MissingWebViewPackageException") || j(t.getCause()));
    }
    
    private final void k(final String s, final int n, final wyn wyn, final trb trb, final Executor executor) {
        final aeim k = this.k;
        tcp.k(afrp.e(afqv.e(afrp.e(((ahbd)((aexw)k.b).a).w(this.i), aesm.a((aexg)new abnf(k, 18, (byte[])null)), (Executor)afsl.a), (Class)IllegalArgumentException.class, aesm.a((aexg)acrp.p), (Executor)afsl.a), aesm.a((aexg)acrp.q), (Executor)afsl.a), (Executor)afsl.a, (tcn)new acva(s, trb, 0), (tco)new acvb(this, s, n, wyn, trb, executor));
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
    
    public final void c(final String s) {
        this.k(s, 0, null, null, this.c);
    }
    
    public final void e(final String s, final int n, final wyn wyn, final trb trb) {
        this.k(s, n, wyn, trb, this.j);
    }
}
