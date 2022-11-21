import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Debug;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkj implements Runnable
{
    public final adkl a;
    
    public adkj(final adkl a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final adkl a = this.a;
        final long g = ((oco)a.i.d).g();
        final adkc adkc = a.h.get();
        final boolean a2 = adkc.a;
        final long n = g - adkc.b;
        long n2 = a.b;
        boolean b = false;
        if (n > n2) {
            final int a3 = adjt.a;
            if (Debug.isDebuggerConnected()) {
                a.e.a();
            }
            else {
                final adjy e = a.e;
                final String k = a.k;
                if (e.e == null) {
                    final ahcr builder = ((ahcz)ahwd.a).createBuilder();
                    final long c = ((oco)e.a.d).c();
                    builder.copyOnWrite();
                    final ahwd ahwd = (ahwd)builder.instance;
                    ahwd.b |= 0x8;
                    ahwd.f = c - n;
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    builder.copyOnWrite();
                    final ahwd ahwd2 = (ahwd)builder.instance;
                    ahwd2.b |= 0x40;
                    ahwd2.i = sdk_INT;
                    final int a4 = tvo.a((Context)e.a.c);
                    builder.copyOnWrite();
                    final ahwd ahwd3 = (ahwd)builder.instance;
                    ahwd3.b |= 0x80;
                    ahwd3.j = a4;
                    e.e = builder;
                    if (k != null) {
                        final ahcr e2 = e.e;
                        e2.copyOnWrite();
                        final ahwd ahwd4 = (ahwd)e2.instance;
                        ahwd4.b |= 0x4;
                        ahwd4.e = k;
                    }
                    b = true;
                }
                final ahcr e3 = e.e;
                final int d = (int)Math.min(n, 2147483647L);
                e3.copyOnWrite();
                final ahwd ahwd5 = (ahwd)e3.instance;
                final ahwd a5 = ahwd.a;
                ahwd5.b |= 0x2;
                ahwd5.d = d;
                if (a2) {
                    final int g2 = (int)Math.min(n, 2147483647L);
                    e3.copyOnWrite();
                    final ahwd ahwd6 = (ahwd)e3.instance;
                    ahwd6.b |= 0x10;
                    ahwd6.g = g2;
                }
                if (b) {
                    ((toz)a.i.f).e(toz.a, 1);
                }
                final adjy e4 = a.e;
                final ahcr e5 = e4.e;
                if (e5 != null && e4.d != 0L) {
                    ahwh ahwh;
                    if ((ahwh = ((ahwd)e5.instance).r) == null) {
                        ahwh = ahwh.a;
                    }
                    if ((ahwh.b & 0x10) == 0x0) {
                        ahwh ahwh2;
                        if ((ahwh2 = ((ahwd)e5.instance).r) == null) {
                            ahwh2 = ahwh.a;
                        }
                        final ahcr builder2 = ((ahcz)ahwh2).toBuilder();
                        final long d2 = e4.d;
                        builder2.copyOnWrite();
                        final ahwh ahwh3 = (ahwh)builder2.instance;
                        ahwh3.b |= 0x2;
                        ahwh3.e = d2;
                        final long d3 = e4.d;
                        builder2.copyOnWrite();
                        final ahwh ahwh4 = (ahwh)builder2.instance;
                        ahwh4.b |= 0x10;
                        ahwh4.i = g - d3;
                        e5.copyOnWrite();
                        final ahwd ahwd7 = (ahwd)e5.instance;
                        final ahwh r = (ahwh)builder2.build();
                        r.getClass();
                        ahwd7.r = r;
                        ahwd7.b |= 0x8000;
                    }
                }
                final adjy e6 = a.e;
                final ahcr e7 = e6.e;
                if (e7 != null) {
                    String.valueOf(e7.build());
                    adme.t(e6.a, (ahwd)e6.e.build());
                }
                n2 = a.d;
            }
        }
        else {
            final int a6 = adjt.a;
            final adjy e8 = a.e;
            final ahcr e9 = e8.e;
            if (e9 != null) {
                if (e8.c > 0) {
                    e9.copyOnWrite();
                    ahwd.a((ahwd)e9.instance);
                    --e8.c;
                    final wza wza = (wza)e8.b.a();
                    final akps d4 = akpu.d();
                    final ahcr e10 = e8.e;
                    ((ahcr)d4).copyOnWrite();
                    akpu.bk((akpu)d4.instance, (ahwd)e10.build());
                    wza.d((akpu)((ahcr)d4).build());
                }
                e8.a();
                ((toz)a.i.f).e(toz.a, 0);
            }
            final long b2 = a.b;
            final adjy e11 = a.e;
            n2 = b2 - n + 50L;
            e11.d = g + n2;
        }
        a.j.schedule(new adkj(a), n2, TimeUnit.MILLISECONDS);
    }
}
