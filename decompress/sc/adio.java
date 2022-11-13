import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Debug;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adio implements Runnable
{
    public final adiq a;
    
    public adio(final adiq a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final adiq a = this.a;
        final long g = ((oby)a.h.d).g();
        final adim adim = a.g.get();
        final boolean a2 = adim.a;
        final long n = g - adim.b;
        long n2 = a.a;
        boolean b = false;
        if (n > n2) {
            if (Debug.isDebuggerConnected()) {
                a.d.a();
            }
            else {
                final Thread thread = a.e.getLooper().getThread();
                final adig d = a.d;
                if (d.e == null) {
                    final ahaz builder = ((ahbh)ahuk.a).createBuilder();
                    final long c = ((oby)((adiz)d.c).d).c();
                    builder.copyOnWrite();
                    final ahuk ahuk = (ahuk)builder.instance;
                    ahuk.b |= 0x8;
                    ahuk.f = c - n;
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    builder.copyOnWrite();
                    final ahuk ahuk2 = (ahuk)builder.instance;
                    ahuk2.b |= 0x40;
                    ahuk2.i = sdk_INT;
                    final int a3 = tum.a((Context)((adiz)d.c).c);
                    builder.copyOnWrite();
                    final ahuk ahuk3 = (ahuk)builder.instance;
                    ahuk3.b |= 0x80;
                    ahuk3.j = a3;
                    final String c2 = adig.c(thread);
                    builder.copyOnWrite();
                    final ahuk ahuk4 = (ahuk)builder.instance;
                    ahuk4.b |= 0x4;
                    ahuk4.e = c2;
                    d.e = builder;
                    b = true;
                }
                final Object e = d.e;
                final int d2 = (int)Math.min(n, 2147483647L);
                final ahaz ahaz = (ahaz)e;
                ahaz.copyOnWrite();
                final ahuk ahuk5 = (ahuk)ahaz.instance;
                final ahuk a4 = ahuk.a;
                ahuk5.b |= 0x2;
                ahuk5.d = d2;
                if (a2) {
                    final int a5 = adid.a;
                    final int g2 = (int)Math.min(n, 2147483647L);
                    ahaz.copyOnWrite();
                    final ahuk ahuk6 = (ahuk)ahaz.instance;
                    ahuk6.b |= 0x10;
                    ahuk6.g = g2;
                }
                if (b) {
                    ((tnz)a.h.f).e(tnz.a, 1);
                }
                final adig d3 = a.d;
                final Object e2 = d3.e;
                if (e2 != null && d3.b != 0L) {
                    final ahaz ahaz2 = (ahaz)e2;
                    ahuo ahuo;
                    if ((ahuo = ((ahuk)ahaz2.instance).r) == null) {
                        ahuo = ahuo.a;
                    }
                    if ((ahuo.b & 0x10) == 0x0) {
                        ahuo ahuo2;
                        if ((ahuo2 = ((ahuk)ahaz2.instance).r) == null) {
                            ahuo2 = ahuo.a;
                        }
                        final ahaz builder2 = ((ahbh)ahuo2).toBuilder();
                        final long b2 = d3.b;
                        builder2.copyOnWrite();
                        final ahuo ahuo3 = (ahuo)builder2.instance;
                        ahuo3.b |= 0x2;
                        ahuo3.e = b2;
                        final long b3 = d3.b;
                        builder2.copyOnWrite();
                        final ahuo ahuo4 = (ahuo)builder2.instance;
                        ahuo4.b |= 0x10;
                        ahuo4.i = g - b3;
                        ahaz2.copyOnWrite();
                        final ahuk ahuk7 = (ahuk)ahaz2.instance;
                        final ahuo r = (ahuo)builder2.build();
                        r.getClass();
                        ahuk7.r = r;
                        ahuk7.b |= 0x8000;
                    }
                }
                final adig d4 = a.d;
                final Object e3 = d4.e;
                if (e3 != null) {
                    String.valueOf(((ahaz)e3).build());
                    final int a6 = adid.a;
                    adkp.C((adiz)d4.c, (ahuk)((ahaz)d4.e).build());
                }
                else {
                    final int a7 = adid.a;
                }
                n2 = a.c;
            }
        }
        else {
            final adig d5 = a.d;
            final Object e4 = d5.e;
            if (e4 != null) {
                if (d5.a > 0) {
                    final ahaz ahaz3 = (ahaz)e4;
                    ahaz3.copyOnWrite();
                    ahuk.a((ahuk)ahaz3.instance);
                    --d5.a;
                    final wxx wxx = (wxx)((atke)d5.d).a();
                    final aknr d6 = aknt.d();
                    final Object e5 = d5.e;
                    ((ahaz)d6).copyOnWrite();
                    aknt.bk((aknt)d6.instance, (ahuk)((ahaz)e5).build());
                    wxx.d((aknt)((ahaz)d6).build());
                }
                d5.a();
                ((tnz)a.h.f).e(tnz.a, 0);
            }
            final long a8 = a.a;
            final adig d7 = a.d;
            n2 = a8 - n + 50L;
            d7.b = g + n2;
        }
        a.i.schedule(new adio(a), n2, TimeUnit.MILLISECONDS);
    }
}
