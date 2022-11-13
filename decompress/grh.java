import java.util.ArrayList;
import android.util.Log;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grh implements grc
{
    private static final afkk a;
    private final afaq b;
    private final pvh c;
    
    static {
        a = afkk.m("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantConnector");
    }
    
    public grh(final atke atke, final pvh c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = adyf.A((afaq)new beh(atke, 18));
        this.c = c;
    }
    
    public final grl a(final grk grk) {
        if (((oaf)this.b.a()).a() == 3) {
            ((afki)((afki)((afkg)grh.a).c().h(aflj.a, "AQCResolver")).j("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantConnector", "connectAssistant", 36, "ClassicAssistantConnector.java")).r("Assistant already connected, will not bind service");
            final ahaz builder = ((ahbh)grl.a).createBuilder();
            builder.copyOnWrite();
            final grl grl = (grl)builder.instance;
            grl.c = 1;
            grl.b |= 0x1;
            return (grl)builder.build();
        }
        final oaf oaf = (oaf)this.b.a();
        final esp b = ((eps)this.c.a).b;
        final grg f = new grg(b.ce, grk, b.A());
        oaf.b("connect");
        oaf.b("maybeCancelDisconnectServiceTask");
        final aezp c = oaf.c;
        oaf.e.f = (oag)f;
        final int a = oaf.d.a();
        if (a != 2 && a != 3) {
            oaf.g = null;
            oaf.e.b();
            if (oaf.g == null) {
                oaf.g = ((ahbh)obd.a).createBuilder();
            }
            final ahaz g = oaf.g;
            g.copyOnWrite();
            final obd obd = (obd)g.instance;
            final obd a2 = obd.a;
            int i = 0;
            final int b2 = oap.b(0);
            if (b2 == 0) {
                throw null;
            }
            obd.c = b2 - 1;
            obd.b |= 0x1;
            if (!TextUtils.isEmpty((CharSequence)null)) {
                g.copyOnWrite();
                final obd obd2 = (obd)g.instance;
                throw null;
            }
            g.copyOnWrite();
            final obd obd3 = (obd)g.instance;
            obd3.b &= 0xFFFFFFFD;
            obd3.d = obd.a.d;
            final ahaz builder2 = ((ahbh)obc.a).createBuilder();
            final ArrayList o = agpi.O();
            builder2.copyOnWrite();
            final obc obc = (obc)builder2.instance;
            final ahbx b3 = obc.b;
            if (!b3.c()) {
                obc.b = ahbh.mutableCopy(b3);
            }
            agzk.addAll((Iterable)o, (List)obc.b);
            g.copyOnWrite();
            final obd obd4 = (obd)g.instance;
            final obc e = (obc)builder2.build();
            e.getClass();
            obd4.e = e;
            obd4.b |= 0x4;
            g.copyOnWrite();
            final obd obd5 = (obd)g.instance;
            obd5.b |= 0x20;
            obd5.g = 0;
            if (!TextUtils.isEmpty((CharSequence)null)) {
                g.copyOnWrite();
                final obd obd6 = (obd)g.instance;
                throw null;
            }
            g.copyOnWrite();
            final obd obd7 = (obd)g.instance;
            obd7.b |= 0x10;
            obd7.f = "";
            final ahaz builder3 = ((ahbh)obb.a).createBuilder();
            builder3.R((Iterable)oaf.b);
            g.copyOnWrite();
            final obd obd8 = (obd)g.instance;
            final obb h = (obb)builder3.build();
            h.getClass();
            obd8.h = h;
            obd8.b |= 0x40;
            final ahaz builder4 = ((ahbh)obe.a).createBuilder();
            builder4.copyOnWrite();
            final obe obe = (obe)builder4.instance;
            final obd d = (obd)g.build();
            d.getClass();
            obe.d = d;
            obe.b |= 0x2;
            final int[] f2 = oaf.f;
            final int length = f2.length;
            while (i < 2) {
                final int n = f2[i];
                builder4.copyOnWrite();
                final obe obe2 = (obe)builder4.instance;
                if (n == 0) {
                    throw null;
                }
                final ahbp g2 = obe2.g;
                if (!g2.c()) {
                    obe2.g = ahbh.mutableCopy(g2);
                }
                obe2.g.g(n - 1);
                ++i;
            }
            final obe obe3 = (obe)builder4.build();
            final oad d2 = oaf.d;
            ((afki)((afki)((afkg)oad.a).f()).j("com/google/android/libraries/assistant/appintegration/AssistantConnector", "connect", 91, "AssistantConnector.java")).t("#connect with connector: %s", (Object)d2.c);
            oad.b("connect", d2.d = aftq.e((ListenableFuture)d2.c, (aezf)new nyf(obe3, 4), (Executor)afum.a));
        }
        else {
            Log.w("AssistantIntegClient", "#connect(): calling connect when service is connected(ing).");
        }
        final ahaz builder5 = ((ahbh)grl.a).createBuilder();
        builder5.copyOnWrite();
        final grl grl2 = (grl)builder5.instance;
        grl2.c = 1;
        grl2.b |= 0x1;
        return (grl)builder5.build();
    }
}
