import android.content.Context;
import android.os.Build$VERSION;
import android.os.Debug;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adin extends Thread
{
    public volatile boolean a;
    final adiz b;
    private final Runnable c;
    
    public adin(final adiz b, final byte[] array) {
        this.b = b;
        super("ANRGuard-Thread");
        this.c = (Runnable)new adap(this, 10);
        this.a = true;
    }
    
    @Override
    public final void run() {
        final int a = adid.a;
        final Thread thread = ((Handler)this.b.c).getLooper().getThread();
        while (!Thread.interrupted()) {
            this.a = true;
            ((Handler)this.b.c).post(this.c);
            final adie adie = ((AtomicReference)this.b.b).get();
            try {
                Thread.sleep(this.b.a);
                if (adie != null) {
                    adie.a();
                }
                if (Debug.isDebuggerConnected()) {
                    ((aglu)this.b.d).j();
                }
                else {
                    final boolean a2 = this.a;
                    boolean b = false;
                    if (a2) {
                        final adiz b2 = this.b;
                        final Object d = b2.d;
                        final long a3 = b2.a;
                        final Object a4 = ((aglu)d).a;
                        ahaz ahaz;
                        if (a4 == null) {
                            ahaz = ((ahbh)ahuk.a).createBuilder();
                            final long c = ((oby)((adiz)((aglu)d).b).d).c();
                            ahaz.copyOnWrite();
                            final ahuk ahuk = (ahuk)ahaz.instance;
                            ahuk.b |= 0x8;
                            ahuk.f = c - a3;
                            b = true;
                        }
                        else {
                            ahaz = ((ahbh)a4).toBuilder();
                        }
                        final long n = ((ahuk)ahaz.instance).d;
                        ahaz.copyOnWrite();
                        final ahuk ahuk2 = (ahuk)ahaz.instance;
                        ahuk2.b |= 0x2;
                        ahuk2.d = (int)(n + a3);
                        if (adie == null || adie.c()) {
                            final long n2 = ahuk2.g;
                            ahaz.copyOnWrite();
                            final ahuk ahuk3 = (ahuk)ahaz.instance;
                            ahuk3.b |= 0x10;
                            ahuk3.g = (int)(n2 + a3);
                        }
                        if (adie == null || adie.b()) {
                            final long n3 = ((ahuk)ahaz.instance).h;
                            ahaz.copyOnWrite();
                            final ahuk ahuk4 = (ahuk)ahaz.instance;
                            ahuk4.b |= 0x20;
                            ahuk4.h = (int)(n3 + a3);
                        }
                        final String c2 = adig.c(thread);
                        ahaz.copyOnWrite();
                        final ahuk ahuk5 = (ahuk)ahaz.instance;
                        ahuk5.b |= 0x4;
                        ahuk5.e = c2;
                        final int sdk_INT = Build$VERSION.SDK_INT;
                        ahaz.copyOnWrite();
                        final ahuk ahuk6 = (ahuk)ahaz.instance;
                        ahuk6.b |= 0x40;
                        ahuk6.i = sdk_INT;
                        final int a5 = tum.a((Context)((adiz)((aglu)d).b).c);
                        ahaz.copyOnWrite();
                        final ahuk ahuk7 = (ahuk)ahaz.instance;
                        ahuk7.b |= 0x80;
                        ahuk7.j = a5;
                        String.valueOf(((aglu)d).a = ahaz.build());
                        adkp.C((adiz)((aglu)d).b, (ahuk)((aglu)d).a);
                        if (!b) {
                            continue;
                        }
                        ((tnz)((adiz)this.b.f).f).e(tnz.a, 1);
                    }
                    else {
                        final Object d2 = this.b.d;
                        if (((aglu)d2).a == null) {
                            continue;
                        }
                        ((aglu)d2).j();
                        ((tnz)((adiz)this.b.f).f).e(tnz.a, 0);
                    }
                }
            }
            catch (final InterruptedException ex) {}
        }
    }
}
