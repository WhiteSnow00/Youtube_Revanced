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

public final class adjz extends Thread
{
    public volatile boolean a;
    final adka b;
    private final Runnable c;
    
    public adjz(final adka b) {
        this.b = b;
        super("ANRGuard-Thread");
        this.c = (Runnable)new addt(this, 9);
        this.a = true;
    }
    
    @Override
    public final void run() {
        final int a = adjt.a;
        final Thread thread = ((Handler)this.b.c).getLooper().getThread();
        final Object b = this.b.b;
        if (((File)((adjv)b).g.b).exists()) {
            try {
                final ahwd ahwd = (ahwd)((ahcr)((ahbb)((ahcz)ahwd.a).createBuilder()).mergeFrom(afqz.d((File)((adjv)b).g.b), ExtensionRegistryLite.getGeneratedRegistry())).build();
                String.valueOf(ahwd);
                final akps d = akpu.d();
                ((ahcr)d).copyOnWrite();
                akpu.bk((akpu)d.instance, ahwd);
                ((adjv)b).c.d((akpu)((ahcr)d).build());
                ((adjv)b).a();
            }
            catch (final IOException ex) {
                znh.c(zng.b, znf.A, "Unable to flush ANR", (Throwable)ex);
            }
        }
        ((adju)this.b.d).a();
        while (!Thread.interrupted()) {
            this.a = true;
            ((Handler)this.b.c).post(this.c);
            try {
                TimeUnit.MILLISECONDS.sleep(this.b.a);
                ((adju)this.b.d).a();
                if (Debug.isDebuggerConnected()) {
                    ((adjv)this.b.b).a();
                    continue;
                }
                if (this.a) {
                    final adka b2 = this.b;
                    final Object b3 = b2.b;
                    final long a2 = b2.a;
                    final ahwd f = ((adjv)b3).f;
                    ahcr ahcr;
                    if (f == null) {
                        ahcr = ((ahcz)ahwd.a).createBuilder();
                        final long c = ((adjv)b3).b.c();
                        ahcr.copyOnWrite();
                        final ahwd ahwd2 = (ahwd)ahcr.instance;
                        ahwd2.b |= 0x8;
                        ahwd2.f = c - a2;
                    }
                    else {
                        ahcr = ((ahcz)f).toBuilder();
                    }
                    ((adjv)b3).b(ahcr, a2);
                    final int d2 = ((adjv)b3).d;
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
                        ahcr.copyOnWrite();
                        final ahwd ahwd3 = (ahwd)ahcr.instance;
                        e.getClass();
                        ahwd3.b |= 0x4;
                        ahwd3.e = e;
                    }
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    ahcr.copyOnWrite();
                    final ahwd ahwd4 = (ahwd)ahcr.instance;
                    ahwd4.b |= 0x40;
                    ahwd4.i = sdk_INT;
                    final int a3 = tvo.a(((adjv)b3).a);
                    ahcr.copyOnWrite();
                    final ahwd ahwd5 = (ahwd)ahcr.instance;
                    ahwd5.b |= 0x80;
                    ahwd5.j = a3;
                    ((adjv)b3).f = (ahwd)ahcr.build();
                    try {
                        String.valueOf(((adjv)b3).f);
                        final slt g = ((adjv)b3).g;
                        final ahwd f2 = ((adjv)b3).f;
                        if (!g.a) {
                            g.a = true;
                            final File parentFile = ((File)g.b).getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                        }
                        afqz.c(((ahbc)f2).toByteArray(), (File)g.b);
                    }
                    catch (final IOException ex2) {
                        znh.c(zng.b, znf.A, "Unable to record ANR", (Throwable)ex2);
                    }
                    continue;
                }
                final adka b4 = this.b;
                final Object b5 = b4.b;
                final long a4 = b4.a;
                final ahwd f3 = ((adjv)b5).f;
                if (f3 != null) {
                    adjv adjv;
                    if (!((adjv)b5).e) {
                        adjv = (adjv)b5;
                    }
                    else {
                        final ahcr builder = ((ahcz)f3).toBuilder();
                        builder.copyOnWrite();
                        ahwd.a((ahwd)builder.instance);
                        ((adjv)b5).b(builder, a4);
                        final int sdk_INT2 = Build$VERSION.SDK_INT;
                        builder.copyOnWrite();
                        final ahwd ahwd6 = (ahwd)builder.instance;
                        ahwd6.b |= 0x40;
                        ahwd6.i = sdk_INT2;
                        final int a5 = tvo.a(((adjv)b5).a);
                        builder.copyOnWrite();
                        final ahwd ahwd7 = (ahwd)builder.instance;
                        ahwd7.b |= 0x80;
                        ahwd7.j = a5;
                        String.valueOf(((adjv)b5).f = (ahwd)builder.build());
                        final akps d3 = akpu.d();
                        final ahwd f4 = ((adjv)b5).f;
                        ((ahcr)d3).copyOnWrite();
                        akpu.bk((akpu)d3.instance, f4);
                        ((adjv)b5).c.d((akpu)((ahcr)d3).build());
                        adjv = (adjv)b5;
                    }
                    adjv.a();
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
