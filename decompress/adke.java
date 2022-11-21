import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Debug;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adke implements Runnable
{
    public final adkg a;
    
    public adke(final adkg a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final adkg a = this.a;
        final long g = ((oco)a.h.d).g();
        final adkc adkc = a.g.get();
        final boolean a2 = adkc.a;
        final long n = g - adkc.b;
        long n2 = a.a;
        boolean b = false;
        if (n > n2) {
            if (Debug.isDebuggerConnected()) {
                a.d.a();
            }
            else {
                final Thread thread = a.e.getLooper().getThread();
                final adjw d = a.d;
                if (d.e == null) {
                    final ahcr builder = ((ahcz)ahwd.a).createBuilder();
                    final long c = ((oco)((adkp)d.c).d).c();
                    builder.copyOnWrite();
                    final ahwd ahwd = (ahwd)builder.instance;
                    ahwd.b |= 0x8;
                    ahwd.f = c - n;
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    builder.copyOnWrite();
                    final ahwd ahwd2 = (ahwd)builder.instance;
                    ahwd2.b |= 0x40;
                    ahwd2.i = sdk_INT;
                    final int a3 = tvo.a((Context)((adkp)d.c).c);
                    builder.copyOnWrite();
                    final ahwd ahwd3 = (ahwd)builder.instance;
                    ahwd3.b |= 0x80;
                    ahwd3.j = a3;
                    final String c2 = adjw.c(thread);
                    builder.copyOnWrite();
                    final ahwd ahwd4 = (ahwd)builder.instance;
                    ahwd4.b |= 0x4;
                    ahwd4.e = c2;
                    d.e = builder;
                    b = true;
                }
                final Object e = d.e;
                final int d2 = (int)Math.min(n, 2147483647L);
                final ahcr ahcr = (ahcr)e;
                ahcr.copyOnWrite();
                final ahwd ahwd5 = (ahwd)ahcr.instance;
                final ahwd a4 = ahwd.a;
                ahwd5.b |= 0x2;
                ahwd5.d = d2;
                if (a2) {
                    final int a5 = adjt.a;
                    final int g2 = (int)Math.min(n, 2147483647L);
                    ahcr.copyOnWrite();
                    final ahwd ahwd6 = (ahwd)ahcr.instance;
                    ahwd6.b |= 0x10;
                    ahwd6.g = g2;
                }
                if (b) {
                    ((toz)a.h.f).e(toz.a, 1);
                }
                final adjw d3 = a.d;
                final Object e2 = d3.e;
                if (e2 != null && d3.b != 0L) {
                    final ahcr ahcr2 = (ahcr)e2;
                    ahwh ahwh;
                    if ((ahwh = ((ahwd)ahcr2.instance).r) == null) {
                        ahwh = ahwh.a;
                    }
                    if ((ahwh.b & 0x10) == 0x0) {
                        ahwh ahwh2;
                        if ((ahwh2 = ((ahwd)ahcr2.instance).r) == null) {
                            ahwh2 = ahwh.a;
                        }
                        final ahcr builder2 = ((ahcz)ahwh2).toBuilder();
                        final long b2 = d3.b;
                        builder2.copyOnWrite();
                        final ahwh ahwh3 = (ahwh)builder2.instance;
                        ahwh3.b |= 0x2;
                        ahwh3.e = b2;
                        final long b3 = d3.b;
                        builder2.copyOnWrite();
                        final ahwh ahwh4 = (ahwh)builder2.instance;
                        ahwh4.b |= 0x10;
                        ahwh4.i = g - b3;
                        ahcr2.copyOnWrite();
                        final ahwd ahwd7 = (ahwd)ahcr2.instance;
                        final ahwh r = (ahwh)builder2.build();
                        r.getClass();
                        ahwd7.r = r;
                        ahwd7.b |= 0x8000;
                    }
                }
                final adjw d4 = a.d;
                final Object e3 = d4.e;
                if (e3 != null) {
                    String.valueOf(((ahcr)e3).build());
                    final int a6 = adjt.a;
                    adme.t((adkp)d4.c, (ahwd)((ahcr)d4.e).build());
                }
                else {
                    final int a7 = adjt.a;
                }
                n2 = a.c;
            }
        }
        else {
            final adjw d5 = a.d;
            final Object e4 = d5.e;
            if (e4 != null) {
                if (d5.a > 0) {
                    final ahcr ahcr3 = (ahcr)e4;
                    ahcr3.copyOnWrite();
                    ahwd.a((ahwd)ahcr3.instance);
                    --d5.a;
                    final wza wza = (wza)((atnb)d5.d).a();
                    final akps d6 = akpu.d();
                    final Object e5 = d5.e;
                    ((ahcr)d6).copyOnWrite();
                    akpu.bk((akpu)d6.instance, (ahwd)((ahcr)e5).build());
                    wza.d((akpu)((ahcr)d6).build());
                }
                d5.a();
                ((toz)a.h.f).e(toz.a, 0);
            }
            final long a8 = a.a;
            final adjw d7 = a.d;
            n2 = a8 - n + 50L;
            d7.b = g + n2;
        }
        a.i.schedule(new adke(a), n2, TimeUnit.MILLISECONDS);
    }
}
