import java.io.InputStream;
import android.net.Uri;
import java.io.IOException;
import j$.time.Instant;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyd implements Callable
{
    public final gyf a;
    public final long b;
    public final afeq c;
    public final int d;
    public final int e;
    
    public gyd(final gyf a, final long b, final afeq c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object call() {
        final gyf a = this.a;
        final long b = this.b;
        final afeq c = this.c;
        final int d = this.d;
        final int e = this.e;
        final ubu i = a.i;
        i.getClass();
        final long micros = TimeUnit.MILLISECONDS.toMicros(b);
        final rbe e2 = a.e;
        e2.getClass();
        try {
            final int hashCode = Arrays.hashCode(((afeh)c).toArray());
            final StringBuilder sb = new StringBuilder("hash");
            sb.append(hashCode);
            Object o = sb.toString();
            final Uri m = i.m(((String)o).concat(".audioswap.m4a"));
            Label_0483: {
                try {
                    final Object o2 = ((Context)i.d).getContentResolver().openInputStream(m);
                    if (o2 != null) {
                        ((InputStream)o2).close();
                        break Label_0483;
                    }
                    break Label_0483;
                }
                catch (final IOException ex) {
                    final Uri j = i.m(((String)o).concat(".audioswap.part.m4a"));
                    final File file = new File(j.getPath());
                    o = new FileOutputStream(file);
                    try {
                        Object o2 = new BufferedOutputStream((OutputStream)o);
                        try {
                            final gyf b2 = ((gye)e2).b;
                            final gxp g = b2.g;
                            final long f = b2.f;
                            final ahaz builder = ((ahbh)almj.a).createBuilder();
                            builder.copyOnWrite();
                            final almj almj = (almj)builder.instance;
                            almj.c |= 0x100000;
                            almj.J = f;
                            final almj almj2 = (almj)builder.build();
                            g.l = g.a.b(almx.bd);
                            final xan l = g.l;
                            if (l != null) {
                                try {
                                    l.a(almj2);
                                }
                                finally {}
                            }
                            final afsr a2 = afsr.a;
                            ((gye)e2).a = Instant.now().toEpochMilli();
                            try {
                                i.n((OutputStream)o2, micros, e2, c, d, e);
                                ((BufferedOutputStream)o2).close();
                                ((FileOutputStream)o).close();
                                o = new File(m.getPath());
                                if (file.renameTo((File)o)) {
                                    o = ((gye)e2).b.g;
                                    o2 = ((gxp)o).l;
                                    if (o2 != null) {
                                        ((xan)o2).c("aft");
                                        ((gxp)o).l = null;
                                    }
                                    final long epochMilli = Instant.now().minusMillis(((gye)e2).a).toEpochMilli();
                                    o = new StringBuilder("AudioGenC: Audio mixer finished. LatencyMs: ");
                                    ((StringBuilder)o).append(epochMilli);
                                    ttr.l(((StringBuilder)o).toString());
                                    if (m != null) {
                                        m.getPath();
                                    }
                                    return m;
                                }
                                o = String.valueOf(j);
                                o2 = String.valueOf(m);
                                final StringBuilder sb2 = new StringBuilder("AudioTrackGen: Failed to rename mixed audio from ");
                                sb2.append((String)o);
                                sb2.append(" to ");
                                sb2.append((String)o2);
                                rah.b(sb2.toString());
                                throw new qyh("Failed to rename mixed audio", qyg.g);
                            }
                            finally {}
                        }
                        finally {}
                        try {
                            ((BufferedOutputStream)o2).close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            rlc.h(t, t2);
                        }
                    }
                    finally {
                        try {
                            ((FileOutputStream)o).close();
                        }
                        finally {
                            final Throwable t3;
                            final Throwable t4;
                            rlc.h(t3, t4);
                        }
                    }
                }
            }
        }
        finally {
            final Throwable t5;
            qyh qyh = null;
            if (!(t5 instanceof qyh)) {
                qyh = new qyh(t5, qyg.g);
            }
            throw qyh;
        }
    }
}
