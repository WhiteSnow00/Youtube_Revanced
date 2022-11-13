import android.os.Build$VERSION;
import android.os.Debug;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adij extends Thread
{
    public volatile boolean a;
    final adik b;
    private final Runnable c;
    
    public adij(final adik b) {
        this.b = b;
        super("ANRGuard-Thread");
        this.c = (Runnable)new adap(this, 9);
        this.a = true;
    }
    
    @Override
    public final void run() {
        final int a = adid.a;
        final Thread thread = ((Handler)this.b.c).getLooper().getThread();
        final Object b = this.b.b;
        if (((File)((adif)b).g.b).exists()) {
            try {
                final ahuk ahuk = (ahuk)((ahaz)((agzj)((ahbh)ahuk.a).createBuilder()).mergeFrom(afpj.d((File)((adif)b).g.b), ExtensionRegistryLite.getGeneratedRegistry())).build();
                String.valueOf(ahuk);
                final aknr d = aknt.d();
                ((ahaz)d).copyOnWrite();
                aknt.bk((aknt)d.instance, ahuk);
                ((adif)b).c.d((aknt)((ahaz)d).build());
                ((adif)b).a();
            }
            catch (final IOException ex) {
                zlm.c(zll.b, zlk.A, "Unable to flush ANR", (Throwable)ex);
            }
        }
        ((adie)this.b.d).a();
        while (!Thread.interrupted()) {
            this.a = true;
            ((Handler)this.b.c).post(this.c);
            try {
                TimeUnit.MILLISECONDS.sleep(this.b.a);
                ((adie)this.b.d).a();
                if (Debug.isDebuggerConnected()) {
                    ((adif)this.b.b).a();
                    continue;
                }
                if (this.a) {
                    final adik b2 = this.b;
                    final Object b3 = b2.b;
                    final long a2 = b2.a;
                    final ahuk f = ((adif)b3).f;
                    ahaz ahaz;
                    if (f == null) {
                        ahaz = ((ahbh)ahuk.a).createBuilder();
                        final long c = ((adif)b3).b.c();
                        ahaz.copyOnWrite();
                        final ahuk ahuk2 = (ahuk)ahaz.instance;
                        ahuk2.b |= 0x8;
                        ahuk2.f = c - a2;
                    }
                    else {
                        ahaz = ((ahbh)f).toBuilder();
                    }
                    ((adif)b3).b(ahaz, a2);
                    final int d2 = ((adif)b3).d;
                    if (d2 > 0) {
                        final StringBuilder sb = new StringBuilder();
                        final StackTraceElement[] stackTrace = thread.getStackTrace();
                        for (int length = stackTrace.length, i = 0; i < length; ++i) {
                            sb.append(stackTrace[i]);
                            sb.append("\n");
                        }
                        String e;
                        final String s = e = sb.toString();
                        if (sb.length() > d2) {
                            e = s.substring(0, d2);
                        }
                        ahaz.copyOnWrite();
                        final ahuk ahuk3 = (ahuk)ahaz.instance;
                        e.getClass();
                        ahuk3.b |= 0x4;
                        ahuk3.e = e;
                    }
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    ahaz.copyOnWrite();
                    final ahuk ahuk4 = (ahuk)ahaz.instance;
                    ahuk4.b |= 0x40;
                    ahuk4.i = sdk_INT;
                    final int a3 = tum.a(((adif)b3).a);
                    ahaz.copyOnWrite();
                    final ahuk ahuk5 = (ahuk)ahaz.instance;
                    ahuk5.b |= 0x80;
                    ahuk5.j = a3;
                    ((adif)b3).f = (ahuk)ahaz.build();
                    try {
                        String.valueOf(((adif)b3).f);
                        final skt g = ((adif)b3).g;
                        final ahuk f2 = ((adif)b3).f;
                        if (!g.a) {
                            g.a = true;
                            final File parentFile = ((File)g.b).getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                        }
                        afpj.c(((agzk)f2).toByteArray(), (File)g.b);
                    }
                    catch (final IOException ex2) {
                        zlm.c(zll.b, zlk.A, "Unable to record ANR", (Throwable)ex2);
                    }
                    continue;
                }
                final adik b4 = this.b;
                final Object b5 = b4.b;
                final long a4 = b4.a;
                final ahuk f3 = ((adif)b5).f;
                if (f3 != null) {
                    adif adif;
                    if (!((adif)b5).e) {
                        adif = (adif)b5;
                    }
                    else {
                        final ahaz builder = ((ahbh)f3).toBuilder();
                        builder.copyOnWrite();
                        ahuk.a((ahuk)builder.instance);
                        ((adif)b5).b(builder, a4);
                        final int sdk_INT2 = Build$VERSION.SDK_INT;
                        builder.copyOnWrite();
                        final ahuk ahuk6 = (ahuk)builder.instance;
                        ahuk6.b |= 0x40;
                        ahuk6.i = sdk_INT2;
                        final int a5 = tum.a(((adif)b5).a);
                        builder.copyOnWrite();
                        final ahuk ahuk7 = (ahuk)builder.instance;
                        ahuk7.b |= 0x80;
                        ahuk7.j = a5;
                        String.valueOf(((adif)b5).f = (ahuk)builder.build());
                        final aknr d3 = aknt.d();
                        final ahuk f4 = ((adif)b5).f;
                        ((ahaz)d3).copyOnWrite();
                        aknt.bk((aknt)d3.instance, f4);
                        ((adif)b5).c.d((aknt)((ahaz)d3).build());
                        adif = (adif)b5;
                    }
                    adif.a();
                    continue;
                }
                continue;
            }
            catch (final InterruptedException ex3) {
                continue;
            }
            break;
        }
    }
}
