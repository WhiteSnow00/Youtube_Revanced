import java.util.ArrayList;
import android.util.Log;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gra implements gqv
{
    private static final afik a;
    private final aeyr b;
    private final qpt c;
    
    static {
        a = afik.m("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantConnector");
    }
    
    public gra(final atjj atjj, final qpt c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = agnj.E((aeyr)new beg(atjj, 18));
        this.c = c;
    }
    
    @Override
    public final gre a(final grd grd) {
        if (((nyz)this.b.a()).a() == 3) {
            ((afii)((afii)((afig)gra.a).c().h(afjj.a, (Object)"AQCResolver")).j("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantConnector", "connectAssistant", 36, "ClassicAssistantConnector.java")).r("Assistant already connected, will not bind service");
            final agza builder = gre.a.createBuilder();
            builder.copyOnWrite();
            final gre gre = (gre)builder.instance;
            gre.c = 1;
            gre.b |= 0x1;
            return (gre)builder.build();
        }
        final nyz nyz = (nyz)this.b.a();
        final esm b = ((epq)this.c.a).b;
        final gqz f = new gqz(b.cc, grd, b.A());
        nyz.b("connect");
        nyz.b("maybeCancelDisconnectServiceTask");
        final aexq c = nyz.c;
        nyz.e.f = f;
        final int a = nyz.d.a();
        if (a != 2 && a != 3) {
            nyz.g = null;
            nyz.e.b();
            if (nyz.g == null) {
                nyz.g = ((agzi)nzx.a).createBuilder();
            }
            final agza g = nyz.g;
            int i = 0;
            final int b2 = nzj.b(0);
            g.copyOnWrite();
            final nzx nzx = (nzx)g.instance;
            final nzx a2 = nzx.a;
            if (b2 == 0) {
                throw null;
            }
            nzx.c = b2 - 1;
            nzx.b |= 0x1;
            if (!TextUtils.isEmpty((CharSequence)null)) {
                g.copyOnWrite();
                final nzx nzx2 = (nzx)g.instance;
                throw null;
            }
            g.copyOnWrite();
            final nzx nzx3 = (nzx)g.instance;
            nzx3.b &= 0xFFFFFFFD;
            nzx3.d = nzx.a.d;
            final agza builder2 = ((agzi)nzw.a).createBuilder();
            final ArrayList ak = adwd.ak();
            builder2.copyOnWrite();
            final nzw nzw = (nzw)builder2.instance;
            final agzy b3 = nzw.b;
            if (!b3.c()) {
                nzw.b = agzi.mutableCopy(b3);
            }
            agxl.addAll((Iterable)ak, (List)nzw.b);
            g.copyOnWrite();
            final nzx nzx4 = (nzx)g.instance;
            final nzw e = (nzw)builder2.build();
            e.getClass();
            nzx4.e = e;
            nzx4.b |= 0x4;
            g.copyOnWrite();
            final nzx nzx5 = (nzx)g.instance;
            nzx5.b |= 0x20;
            nzx5.g = 0;
            if (!TextUtils.isEmpty((CharSequence)null)) {
                g.copyOnWrite();
                final nzx nzx6 = (nzx)g.instance;
                throw null;
            }
            g.copyOnWrite();
            final nzx nzx7 = (nzx)g.instance;
            nzx7.b |= 0x10;
            nzx7.f = "";
            final agza builder3 = ((agzi)nzv.a).createBuilder();
            builder3.R((Iterable)nyz.b);
            g.copyOnWrite();
            final nzx nzx8 = (nzx)g.instance;
            final nzv h = (nzv)builder3.build();
            h.getClass();
            nzx8.h = h;
            nzx8.b |= 0x40;
            final agza builder4 = ((agzi)nzy.a).createBuilder();
            builder4.copyOnWrite();
            final nzy nzy = (nzy)builder4.instance;
            final nzx d = (nzx)g.build();
            d.getClass();
            nzy.d = d;
            nzy.b |= 0x2;
            final int[] f2 = nyz.f;
            final int length = f2.length;
            while (i < 2) {
                final int n = f2[i];
                builder4.copyOnWrite();
                final nzy nzy2 = (nzy)builder4.instance;
                if (n == 0) {
                    throw null;
                }
                final agzq g2 = nzy2.g;
                if (!g2.c()) {
                    nzy2.g = agzi.mutableCopy(g2);
                }
                nzy2.g.g(n - 1);
                ++i;
            }
            final nzy nzy3 = (nzy)builder4.build();
            final nyx d2 = nyz.d;
            ((afii)((afii)((afig)nyx.a).f()).j("com/google/android/libraries/assistant/appintegration/AssistantConnector", "connect", 91, "AssistantConnector.java")).t("#connect with connector: %s", (Object)d2.c);
            nyx.b("connect", d2.d = afrp.e((ListenableFuture)d2.c, (aexg)new nyw(nzy3, 2), (Executor)afsl.a));
        }
        else {
            Log.w("AssistantIntegClient", "#connect(): calling connect when service is connected(ing).");
        }
        final agza builder5 = gre.a.createBuilder();
        builder5.copyOnWrite();
        final gre gre2 = (gre)builder5.instance;
        gre2.c = 1;
        gre2.b |= 0x1;
        return (gre)builder5.build();
    }
}
