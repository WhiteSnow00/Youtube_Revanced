import j$.time.Duration;
import java.util.function.Consumer;
import android.content.res.AssetFileDescriptor;
import java.util.concurrent.Callable;
import java.util.function.Function;
import android.net.Uri;
import java.util.HashMap;
import android.os.Looper;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.RuntimeStreamReader;
import java.util.Map;
import android.os.Handler;
import j$.util.Optional;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyq implements atyi
{
    public boolean a;
    public boolean b;
    public final AtomicBoolean c;
    public final Context d;
    public Optional e;
    public Optional f;
    public final Handler g;
    public final Map h;
    public RuntimeStreamReader i;
    public final oak j;
    private final Container l;
    
    public atyq(final Context d) {
        this.a = false;
        this.b = false;
        this.c = new AtomicBoolean(false);
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = new Handler(Looper.getMainLooper());
        this.h = new HashMap();
        this.d = d;
        final Container a = Container.a(433558852);
        this.l = a;
        this.j = a.c((oai)new aeuo(11));
    }
    
    public static final aqpp j(final atyr atyr) {
        final agza builder = ((agzi)aqpp.a).createBuilder();
        final agyc x = agyc.x(atyr.a);
        builder.copyOnWrite();
        ((aqpp)builder.instance).b = x;
        return (aqpp)builder.build();
    }
    
    @Override
    public final void a(final atys atys) {
        this.g(atys.getMessage(), atys.a, "atyq", "onMediaSourceException", atys);
    }
    
    public final atyr b(final Uri uri) {
        final atyr a = atyr.a();
        if (this.b) {
            this.e((Callable)new yxq(this, a, this.l.b((oaj)new xtg(16), (Function)new xwu(this, uri, a, 2)), 13));
        }
        else {
            agot.u(uri.getScheme() != null);
            final String scheme = uri.getScheme();
            scheme.getClass();
            qjt qjt;
            if (scheme.equals("file")) {
                qjt = qjt.b;
            }
            else {
                qjt = qjt.a;
            }
            final AssetFileDescriptor a2 = qju.a(this.d, uri, "r", qjt);
            final agza builder = ((agzi)aqpl.a).createBuilder();
            final long startOffset = a2.getStartOffset();
            builder.copyOnWrite();
            final aqpl aqpl = (aqpl)builder.instance;
            aqpl.b |= 0x2;
            aqpl.d = startOffset;
            final long length = a2.getLength();
            builder.copyOnWrite();
            final aqpl aqpl2 = (aqpl)builder.instance;
            aqpl2.b |= 0x4;
            aqpl2.e = length;
            final int detachFd = a2.getParcelFileDescriptor().detachFd();
            builder.copyOnWrite();
            final aqpl aqpl3 = (aqpl)builder.instance;
            aqpl3.b |= 0x1;
            aqpl3.c = detachFd;
            this.e((Callable)new yxq(this, a, (aqpl)builder.build(), 14));
        }
        return a;
    }
    
    public final void c() {
        this.e(new atym(this, 2));
        this.h.clear();
    }
    
    public final void d(final boolean b) {
        this.e(new atyk(this, b, 0));
        this.c.set(b);
    }
    
    public final void e(final Callable callable) {
        try {
            final aqpy aqpy = callable.call();
            if ((aqpy.b & 0x1) != 0x0) {
                aqpg aqpg;
                if ((aqpg = aqpy.c) == null) {
                    aqpg = aqpg.c();
                }
                this.f(aqpg);
            }
        }
        catch (final Exception ex) {
            this.g(ex.getMessage(), amdq.g, "atyq", "handleIfError", ex);
        }
    }
    
    public final void f(final aqpg aqpg) {
        final amds a = aqpg.a();
        this.g(aqpg.d(), a.a(), a.e(), a.f(), null);
    }
    
    public final void g(final String s, final amdq amdq, final String s2, final String s3, final Exception ex) {
        this.f.ifPresent((Consumer)new igu(amdq, s2, s3, 11));
        this.e.ifPresent((Consumer)new wwz(this, s, ex, amdq, 4));
    }
    
    public final void h() {
        this.e(new atym(this, 1));
    }
    
    public final void i(final Duration duration) {
        this.e((Callable)new aejg(this, duration, 9));
    }
}
