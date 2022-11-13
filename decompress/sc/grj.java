import java.util.concurrent.Executor;
import android.os.RemoteException;
import android.util.Log;
import android.os.SystemClock;
import j$.util.Optional;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grj implements gre
{
    private static final afkk a;
    private final afaq b;
    private final afaq c;
    
    static {
        a = afkk.m("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantRequestSender");
    }
    
    public grj(final atke atke, final atke atke2) {
        this.b = adyf.A((afaq)new beh(atke, 20));
        atke2.getClass();
        this.c = adyf.A((afaq)new grr(atke2, 1));
    }
    
    public final ListenableFuture a(final grk grk) {
        Optional optional;
        if (grk.c.isEmpty()) {
            optional = Optional.empty();
        }
        else {
            final pmy pmy = new pmy((byte[])null);
            pmy.i(1);
            pmy.d = aezp.k((Object)grk.c);
            int d;
            if ((d = heb.d(grk.f)) == 0) {
                d = 3;
            }
            pmy.i(d - 1);
            pmy.h = aezp.k((Object)grk.g);
            pmy.e = aezp.k((Object)(grk.i ^ true));
            if ((grk.b & 0x4) != 0x0) {
                pmy.j = aezp.k((Object)grk.e);
            }
            optional = Optional.of((Object)pmy.h());
        }
        final String c = grk.c;
        ListenableFuture listenableFuture;
        if (!optional.isPresent()) {
            final oaf oaf = (oaf)this.b.a();
            final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            oaf.c(oaf.d.b);
            if (oaf.d.a() != 3) {
                throw new IllegalStateException("Check connected state before use.");
            }
            oaf.d();
            final ahaz builder = ((ahbh)obe.a).createBuilder();
            final ahaz builder2 = ((ahbh)oaz.a).createBuilder();
            builder2.copyOnWrite();
            final oaz oaz = (oaz)builder2.instance;
            oaz.b |= 0x2;
            oaz.d = elapsedRealtimeNanos;
            final oaz c2 = (oaz)builder2.build();
            builder.copyOnWrite();
            final obe obe = (obe)builder.instance;
            c2.getClass();
            obe.c = c2;
            obe.b |= 0x1;
            oaf.f(builder);
            try {
                listenableFuture = oaf.e(builder);
            }
            catch (final RemoteException ex) {
                Log.w("AssistantIntegClient", "Sending command to service is failed", (Throwable)ex);
                listenableFuture = afwm.m((Object)oal.b);
            }
        }
        else {
            final oaf oaf2 = (oaf)this.b.a();
            final oai oai = (oai)optional.get();
            final long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            oaf2.c(oaf2.d.b);
            final pmy pmy2 = new pmy(oai);
            pmy2.c = aezp.k((Object)elapsedRealtimeNanos2);
            final oai h = pmy2.h();
            if (oaf2.d.a() != 3) {
                throw new IllegalStateException("Check connected state before use.");
            }
            oaf2.d();
            final ahaz builder3 = ((ahbh)obe.a).createBuilder();
            final ahaz builder4 = ((ahbh)oaz.a).createBuilder();
            if (h.a.h()) {
                final String c3 = (String)h.a.c();
                builder4.copyOnWrite();
                final oaz oaz2 = (oaz)builder4.instance;
                oaz2.b |= 0x1;
                oaz2.c = c3;
            }
            if (h.b.h()) {
                final boolean booleanValue = (boolean)h.b.c();
                builder4.copyOnWrite();
                final oaz oaz3 = (oaz)builder4.instance;
                oaz3.b |= 0x20;
                oaz3.f = booleanValue;
            }
            if (h.c.h()) {
                final boolean booleanValue2 = (boolean)h.c.c();
                builder4.copyOnWrite();
                final oaz oaz4 = (oaz)builder4.instance;
                oaz4.b |= 0x80;
                oaz4.g = booleanValue2;
            }
            if (h.d.h()) {
                final int intValue = (int)h.d.c();
                builder4.copyOnWrite();
                final oaz oaz5 = (oaz)builder4.instance;
                oaz5.b |= 0x100;
                oaz5.h = intValue;
            }
            if (h.i.h()) {
                final long longValue = (long)h.i.c();
                builder4.copyOnWrite();
                final oaz oaz6 = (oaz)builder4.instance;
                oaz6.b |= 0x2;
                oaz6.d = longValue;
            }
            final int c4 = oap.c(h.g);
            builder4.copyOnWrite();
            final oaz oaz7 = (oaz)builder4.instance;
            if (c4 == 0) {
                throw null;
            }
            oaz7.e = c4 - 1;
            oaz7.b |= 0x8;
            final oaz c5 = (oaz)builder4.build();
            builder3.copyOnWrite();
            final obe obe2 = (obe)builder3.instance;
            c5.getClass();
            obe2.c = c5;
            obe2.b |= 0x1;
            oaf2.f(builder3);
            try {
                listenableFuture = oaf2.e(builder3);
            }
            catch (final RemoteException ex2) {
                Log.w("AssistantIntegClient", "Sending command to service is failed", (Throwable)ex2);
                listenableFuture = afwm.m((Object)oal.b);
            }
        }
        this.b(c, true);
        teu.i(listenableFuture, (tet)new exe(this, c, 13));
        return afnd.r(listenableFuture, (aftz)new grs(1), (Executor)afum.a);
    }
    
    public final void b(final String s, final boolean b) {
        ((cyb)this.c.a()).p(b);
        ((afki)((afki)((afkg)grj.a).c().h(aflj.a, "AQCResolver")).j("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantRequestSender", "updateIsAssistantQuerySubmittedButNotEnded", 82, "ClassicAssistantRequestSender.java")).F((Object)s, b);
    }
}
