import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import android.accounts.Account;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acys implements Callable
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final int g;
    
    public acys(final acyt b, final String c, final Account d, final int a, final tui e, final xbt f, final int g) {
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    public acys(final iqk e, final ListenableFuture f, final ListenableFuture b, final ListenableFuture c, final ind d, final int a, final int g) {
        this.g = g;
        this.e = e;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    @Override
    public final Object call() {
        if (this.g != 0) {
            final Object e = this.e;
            final Object f = this.f;
            final Object b = this.b;
            final Object c = this.c;
            final Object d = this.d;
            final int a = this.a;
            final iqj iqj = (iqj)afxr.t((Future)f);
            return ((iqk)e).c(iqj.a, iqj.b, (boolean)iqj.d, (boolean)iqj.c, (boolean)afxr.t((Future)b), (boolean)afxr.t((Future)c), (ind)d, a);
        }
        final Object b2 = this.b;
        final Object c2 = this.c;
        final Object d2 = this.d;
        final int a2 = this.a;
        final Object e2 = this.e;
        final Object f2 = this.f;
        try {
            synchronized (((acyt)b2).a) {
                final URL url = new URL((String)c2);
                if (!aexq.c(d2, ((acyt)b2).d.get())) {
                    ((acyt)b2).a();
                }
                final long d3 = ((acyt)b2).b.d();
                final long n = (long)((acyt)b2).f.n(45358824L).aM() * 1000L + d3;
                final ahcr builder = alow.a.createBuilder();
                builder.copyOnWrite();
                final alow alow = (alow)builder.instance;
                alow.b |= 0x4;
                alow.e = true;
                if (a2 != 0) {
                    builder.copyOnWrite();
                    final alow alow2 = (alow)builder.instance;
                    alow2.c = a2 - 1;
                    alow2.b |= 0x1;
                }
                if (e2 != null && ((acyt)b2).e.containsKey(url.getHost()) && d3 < ((acyt)b2).e.get(url.getHost())) {
                    builder.copyOnWrite();
                    final alow alow3 = (alow)builder.instance;
                    alow3.b |= 0x2;
                    alow3.d = true;
                    ((acyt)b2).e.put(url.getHost(), n);
                    acyt.i((xbt)f2, (alow)builder.build());
                    return null;
                }
                acyt.i((xbt)f2, (alow)builder.build());
                ((acyt)b2).g.b((Account)d2, new String[] { (String)c2 });
                ((acyt)b2).e.put(url.getHost(), n);
                ((acyt)b2).d.set(d2);
                return null;
            }
        }
        catch (final mir | IOException | mih mir | IOException | mih) {
            acyt.h("WebLoginHelperException");
        }
        return null;
    }
}
