import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Debug;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adiu implements Runnable
{
    public final adiw a;
    
    public adiu(final adiw a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final adiw a = this.a;
        final long g = ((oby)a.i.d).g();
        final adim adim = a.h.get();
        final boolean a2 = adim.a;
        final long n = g - adim.b;
        long n2 = a.b;
        boolean b = false;
        if (n > n2) {
            final int a3 = adid.a;
            if (Debug.isDebuggerConnected()) {
                a.e.a();
            }
            else {
                final adii e = a.e;
                final String k = a.k;
                if (e.e == null) {
                    final ahaz builder = ((ahbh)ahuk.a).createBuilder();
                    final long c = ((oby)e.a.d).c();
                    builder.copyOnWrite();
                    final ahuk ahuk = (ahuk)builder.instance;
                    ahuk.b |= 0x8;
                    ahuk.f = c - n;
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    builder.copyOnWrite();
                    final ahuk ahuk2 = (ahuk)builder.instance;
                    ahuk2.b |= 0x40;
                    ahuk2.i = sdk_INT;
                    final int a4 = tum.a((Context)e.a.c);
                    builder.copyOnWrite();
                    final ahuk ahuk3 = (ahuk)builder.instance;
                    ahuk3.b |= 0x80;
                    ahuk3.j = a4;
                    e.e = builder;
                    if (k != null) {
                        final ahaz e2 = e.e;
                        e2.copyOnWrite();
                        final ahuk ahuk4 = (ahuk)e2.instance;
                        ahuk4.b |= 0x4;
                        ahuk4.e = k;
                    }
                    b = true;
                }
                final ahaz e3 = e.e;
                final int d = (int)Math.min(n, 2147483647L);
                e3.copyOnWrite();
                final ahuk ahuk5 = (ahuk)e3.instance;
                final ahuk a5 = ahuk.a;
                ahuk5.b |= 0x2;
                ahuk5.d = d;
                if (a2) {
                    final int g2 = (int)Math.min(n, 2147483647L);
                    e3.copyOnWrite();
                    final ahuk ahuk6 = (ahuk)e3.instance;
                    ahuk6.b |= 0x10;
                    ahuk6.g = g2;
                }
                if (b) {
                    ((tnz)a.i.f).e(tnz.a, 1);
                }
                final adii e4 = a.e;
                final ahaz e5 = e4.e;
                if (e5 != null && e4.d != 0L) {
                    ahuo ahuo;
                    if ((ahuo = ((ahuk)e5.instance).r) == null) {
                        ahuo = ahuo.a;
                    }
                    if ((ahuo.b & 0x10) == 0x0) {
                        ahuo ahuo2;
                        if ((ahuo2 = ((ahuk)e5.instance).r) == null) {
                            ahuo2 = ahuo.a;
                        }
                        final ahaz builder2 = ((ahbh)ahuo2).toBuilder();
                        final long d2 = e4.d;
                        builder2.copyOnWrite();
                        final ahuo ahuo3 = (ahuo)builder2.instance;
                        ahuo3.b |= 0x2;
                        ahuo3.e = d2;
                        final long d3 = e4.d;
                        builder2.copyOnWrite();
                        final ahuo ahuo4 = (ahuo)builder2.instance;
                        ahuo4.b |= 0x10;
                        ahuo4.i = g - d3;
                        e5.copyOnWrite();
                        final ahuk ahuk7 = (ahuk)e5.instance;
                        final ahuo r = (ahuo)builder2.build();
                        r.getClass();
                        ahuk7.r = r;
                        ahuk7.b |= 0x8000;
                    }
                }
                final adii e6 = a.e;
                final ahaz e7 = e6.e;
                if (e7 != null) {
                    String.valueOf(e7.build());
                    adkp.C(e6.a, (ahuk)e6.e.build());
                }
                n2 = a.d;
            }
        }
        else {
            final int a6 = adid.a;
            final adii e8 = a.e;
            final ahaz e9 = e8.e;
            if (e9 != null) {
                if (e8.c > 0) {
                    e9.copyOnWrite();
                    ahuk.a((ahuk)e9.instance);
                    --e8.c;
                    final wxx wxx = (wxx)e8.b.a();
                    final aknr d4 = aknt.d();
                    final ahaz e10 = e8.e;
                    ((ahaz)d4).copyOnWrite();
                    aknt.bk((aknt)d4.instance, (ahuk)e10.build());
                    wxx.d((aknt)((ahaz)d4).build());
                }
                e8.a();
                ((tnz)a.i.f).e(tnz.a, 0);
            }
            final long b2 = a.b;
            final adii e11 = a.e;
            n2 = b2 - n + 50L;
            e11.d = g + n2;
        }
        a.j.schedule(new adiu(a), n2, TimeUnit.MILLISECONDS);
    }
}
