import android.content.Context;
import android.os.Build$VERSION;
import android.os.Debug;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkd extends Thread
{
    public volatile boolean a;
    final adkp b;
    private final Runnable c;
    
    public adkd(final adkp b, final byte[] array) {
        this.b = b;
        super("ANRGuard-Thread");
        this.c = (Runnable)new addt(this, 10);
        this.a = true;
    }
    
    @Override
    public final void run() {
        final int a = adjt.a;
        final Thread thread = ((Handler)this.b.c).getLooper().getThread();
        while (!Thread.interrupted()) {
            this.a = true;
            ((Handler)this.b.c).post(this.c);
            final adju adju = ((AtomicReference)this.b.b).get();
            try {
                Thread.sleep(this.b.a);
                if (adju != null) {
                    adju.a();
                }
                if (Debug.isDebuggerConnected()) {
                    ((agnl)this.b.d).j();
                }
                else {
                    final boolean a2 = this.a;
                    boolean b = false;
                    if (a2) {
                        final adkp b2 = this.b;
                        final Object d = b2.d;
                        final long a3 = b2.a;
                        final Object a4 = ((agnl)d).a;
                        ahcr ahcr;
                        if (a4 == null) {
                            ahcr = ((ahcz)ahwd.a).createBuilder();
                            final long c = ((oco)((adkp)((agnl)d).b).d).c();
                            ahcr.copyOnWrite();
                            final ahwd ahwd = (ahwd)ahcr.instance;
                            ahwd.b |= 0x8;
                            ahwd.f = c - a3;
                            b = true;
                        }
                        else {
                            ahcr = ((ahcz)a4).toBuilder();
                        }
                        final long n = ((ahwd)ahcr.instance).d;
                        ahcr.copyOnWrite();
                        final ahwd ahwd2 = (ahwd)ahcr.instance;
                        ahwd2.b |= 0x2;
                        ahwd2.d = (int)(n + a3);
                        if (adju == null || adju.c()) {
                            final long n2 = ahwd2.g;
                            ahcr.copyOnWrite();
                            final ahwd ahwd3 = (ahwd)ahcr.instance;
                            ahwd3.b |= 0x10;
                            ahwd3.g = (int)(n2 + a3);
                        }
                        if (adju == null || adju.b()) {
                            final long n3 = ((ahwd)ahcr.instance).h;
                            ahcr.copyOnWrite();
                            final ahwd ahwd4 = (ahwd)ahcr.instance;
                            ahwd4.b |= 0x20;
                            ahwd4.h = (int)(n3 + a3);
                        }
                        final String c2 = adjw.c(thread);
                        ahcr.copyOnWrite();
                        final ahwd ahwd5 = (ahwd)ahcr.instance;
                        ahwd5.b |= 0x4;
                        ahwd5.e = c2;
                        final int sdk_INT = Build$VERSION.SDK_INT;
                        ahcr.copyOnWrite();
                        final ahwd ahwd6 = (ahwd)ahcr.instance;
                        ahwd6.b |= 0x40;
                        ahwd6.i = sdk_INT;
                        final int a5 = tvo.a((Context)((adkp)((agnl)d).b).c);
                        ahcr.copyOnWrite();
                        final ahwd ahwd7 = (ahwd)ahcr.instance;
                        ahwd7.b |= 0x80;
                        ahwd7.j = a5;
                        String.valueOf(((agnl)d).a = ahcr.build());
                        adme.t((adkp)((agnl)d).b, (ahwd)((agnl)d).a);
                        if (!b) {
                            continue;
                        }
                        ((toz)((adkp)this.b.f).f).e(toz.a, 1);
                    }
                    else {
                        final Object d2 = this.b.d;
                        if (((agnl)d2).a == null) {
                            continue;
                        }
                        ((agnl)d2).j();
                        ((toz)((adkp)this.b.f).f).e(toz.a, 0);
                    }
                }
            }
            catch (final InterruptedException ex) {}
        }
    }
}
