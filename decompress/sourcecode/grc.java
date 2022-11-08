import java.util.concurrent.Executor;
import android.os.RemoteException;
import android.util.Log;
import android.os.SystemClock;
import j$.util.Optional;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grc implements gqx
{
    private static final afik a;
    private final aeyr b;
    private final aeyr c;
    
    static {
        a = afik.m("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantRequestSender");
    }
    
    public grc(final atjj atjj, final atjj atjj2) {
        this.b = agnj.E((aeyr)new beg(atjj, 20));
        atjj2.getClass();
        this.c = agnj.E((aeyr)new grk(atjj2, 1));
    }
    
    @Override
    public final ListenableFuture a(final grd grd) {
        Optional optional;
        if (grd.c.isEmpty()) {
            optional = Optional.empty();
        }
        else {
            final plo plo = new plo((byte[])null);
            plo.i(1);
            plo.d = aexq.k(grd.c);
            int c;
            if ((c = guc.c(grd.f)) == 0) {
                c = 3;
            }
            plo.i(c - 1);
            plo.h = aexq.k(grd.g);
            plo.e = aexq.k(grd.i ^ true);
            if ((grd.b & 0x4) != 0x0) {
                plo.j = aexq.k(grd.e);
            }
            optional = Optional.of((Object)plo.h());
        }
        final String c2 = grd.c;
        ListenableFuture listenableFuture;
        if (!optional.isPresent()) {
            final nyz nyz = (nyz)this.b.a();
            final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            nyz.c(nyz.d.b);
            if (nyz.d.a() != 3) {
                throw new IllegalStateException("Check connected state before use.");
            }
            nyz.d();
            final agza builder = ((agzi)nzy.a).createBuilder();
            final agza builder2 = ((agzi)nzt.a).createBuilder();
            builder2.copyOnWrite();
            final nzt nzt = (nzt)builder2.instance;
            nzt.b |= 0x2;
            nzt.d = elapsedRealtimeNanos;
            final nzt c3 = (nzt)builder2.build();
            builder.copyOnWrite();
            final nzy nzy = (nzy)builder.instance;
            c3.getClass();
            nzy.c = c3;
            nzy.b |= 0x1;
            nyz.f(builder);
            try {
                listenableFuture = nyz.e(builder);
            }
            catch (final RemoteException ex) {
                Log.w("AssistantIntegClient", "Sending command to service is failed", (Throwable)ex);
                listenableFuture = afva.m((Object)nzf.b);
            }
        }
        else {
            final nyz nyz2 = (nyz)this.b.a();
            final nzc nzc = (nzc)optional.get();
            final long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            nyz2.c(nyz2.d.b);
            final plo plo2 = new plo(nzc);
            plo2.c = aexq.k(elapsedRealtimeNanos2);
            final nzc h = plo2.h();
            if (nyz2.d.a() != 3) {
                throw new IllegalStateException("Check connected state before use.");
            }
            nyz2.d();
            final agza builder3 = ((agzi)nzy.a).createBuilder();
            final agza builder4 = ((agzi)nzt.a).createBuilder();
            if (h.a.h()) {
                final String c4 = (String)h.a.c();
                builder4.copyOnWrite();
                final nzt nzt2 = (nzt)builder4.instance;
                nzt2.b |= 0x1;
                nzt2.c = c4;
            }
            if (h.b.h()) {
                final boolean booleanValue = (boolean)h.b.c();
                builder4.copyOnWrite();
                final nzt nzt3 = (nzt)builder4.instance;
                nzt3.b |= 0x20;
                nzt3.f = booleanValue;
            }
            if (h.c.h()) {
                final boolean booleanValue2 = (boolean)h.c.c();
                builder4.copyOnWrite();
                final nzt nzt4 = (nzt)builder4.instance;
                nzt4.b |= 0x80;
                nzt4.g = booleanValue2;
            }
            if (h.d.h()) {
                final int intValue = (int)h.d.c();
                builder4.copyOnWrite();
                final nzt nzt5 = (nzt)builder4.instance;
                nzt5.b |= 0x100;
                nzt5.h = intValue;
            }
            if (h.i.h()) {
                final long longValue = (long)h.i.c();
                builder4.copyOnWrite();
                final nzt nzt6 = (nzt)builder4.instance;
                nzt6.b |= 0x2;
                nzt6.d = longValue;
            }
            final int c5 = nzj.c(h.g);
            builder4.copyOnWrite();
            final nzt nzt7 = (nzt)builder4.instance;
            if (c5 == 0) {
                throw null;
            }
            nzt7.e = c5 - 1;
            nzt7.b |= 0x8;
            final nzt c6 = (nzt)builder4.build();
            builder3.copyOnWrite();
            final nzy nzy2 = (nzy)builder3.instance;
            c6.getClass();
            nzy2.c = c6;
            nzy2.b |= 0x1;
            nyz2.f(builder3);
            try {
                listenableFuture = nyz2.e(builder3);
            }
            catch (final RemoteException ex2) {
                Log.w("AssistantIntegClient", "Sending command to service is failed", (Throwable)ex2);
                listenableFuture = afva.m((Object)nzf.b);
            }
        }
        this.b(c2, true);
        tcp.i(listenableFuture, (tco)new exa(this, c2, 13));
        return afld.n(listenableFuture, (afry)new grl(1), (Executor)afsl.a);
    }
    
    public final void b(final String s, final boolean b) {
        ((cya)this.c.a()).p(b);
        ((afii)((afii)((afig)grc.a).c().h(afjj.a, (Object)"AQCResolver")).j("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/ClassicAssistantRequestSender", "updateIsAssistantQuerySubmittedButNotEnded", 82, "ClassicAssistantRequestSender.java")).F((Object)s, b);
    }
}
