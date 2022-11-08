import android.content.Context;
import android.os.Build$VERSION;
import android.os.Debug;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgl extends Thread
{
    public volatile boolean a;
    final /* synthetic */ adgw b;
    private final Runnable c;
    
    public adgl(final adgw b, final byte[] array) {
        this.b = b;
        super("ANRGuard-Thread");
        this.c = (Runnable)new adaj(this, 8);
        this.a = true;
    }
    
    @Override
    public final void run() {
        final int a = adgb.a;
        final Thread thread = ((Handler)this.b.c).getLooper().getThread();
        while (!Thread.interrupted()) {
            this.a = true;
            ((Handler)this.b.c).post(this.c);
            final adgc adgc = ((AtomicReference)this.b.b).get();
            try {
                Thread.sleep(this.b.a);
                if (adgc != null) {
                    adgc.a();
                }
                if (Debug.isDebuggerConnected()) {
                    ((agjt)this.b.d).j();
                }
                else {
                    final boolean a2 = this.a;
                    boolean b = false;
                    if (a2) {
                        final adgw b2 = this.b;
                        final Object d = b2.d;
                        final long a3 = b2.a;
                        final Object a4 = ((agjt)d).a;
                        agza agza;
                        if (a4 == null) {
                            agza = ((agzi)ahsm.a).createBuilder();
                            final long c = ((oas)((adgw)((agjt)d).b).d).c();
                            agza.copyOnWrite();
                            final ahsm ahsm = (ahsm)agza.instance;
                            ahsm.b |= 0x8;
                            ahsm.f = c - a3;
                            b = true;
                        }
                        else {
                            agza = ((agzi)a4).toBuilder();
                        }
                        final int d2 = (int)(((ahsm)agza.instance).d + a3);
                        agza.copyOnWrite();
                        final ahsm ahsm2 = (ahsm)agza.instance;
                        ahsm2.b |= 0x2;
                        ahsm2.d = d2;
                        if (adgc == null || adgc.c()) {
                            final int g = (int)(ahsm2.g + a3);
                            agza.copyOnWrite();
                            final ahsm ahsm3 = (ahsm)agza.instance;
                            ahsm3.b |= 0x10;
                            ahsm3.g = g;
                        }
                        if (adgc == null || adgc.b()) {
                            final int h = (int)(((ahsm)agza.instance).h + a3);
                            agza.copyOnWrite();
                            final ahsm ahsm4 = (ahsm)agza.instance;
                            ahsm4.b |= 0x20;
                            ahsm4.h = h;
                        }
                        final String c2 = adge.c(thread);
                        agza.copyOnWrite();
                        final ahsm ahsm5 = (ahsm)agza.instance;
                        ahsm5.b |= 0x4;
                        ahsm5.e = c2;
                        final int sdk_INT = Build$VERSION.SDK_INT;
                        agza.copyOnWrite();
                        final ahsm ahsm6 = (ahsm)agza.instance;
                        ahsm6.b |= 0x40;
                        ahsm6.i = sdk_INT;
                        final int a5 = tsi.a((Context)((adgw)((agjt)d).b).c);
                        agza.copyOnWrite();
                        final ahsm ahsm7 = (ahsm)agza.instance;
                        ahsm7.b |= 0x80;
                        ahsm7.j = a5;
                        String.valueOf(((agjt)d).a = agza.build());
                        adio.x((adgw)((agjt)d).b, (ahsm)((agjt)d).a);
                        if (!b) {
                            continue;
                        }
                        ((tlu)((adgw)this.b.f).f).e(tlu.a, 1);
                    }
                    else {
                        final Object d3 = this.b.d;
                        if (((agjt)d3).a == null) {
                            continue;
                        }
                        ((agjt)d3).j();
                        ((tlu)((adgw)this.b.f).f).e(tlu.a, 0);
                    }
                }
            }
            catch (final InterruptedException ex) {}
        }
    }
}
