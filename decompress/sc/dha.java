import java.util.concurrent.locks.Lock;
import java.util.Queue;
import java.util.Map;
import android.util.Log;
import java.io.PrintStream;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dha implements dgw
{
    private final File a;
    private dcq b;
    private final dml c;
    private final dml d;
    
    @Deprecated
    protected dha(final File a) {
        this.d = new dml((byte[])null);
        this.a = a;
        this.c = new dml();
    }
    
    private final dcq c() {
        monitorenter(this);
        try {
            if (this.b == null) {
                final File a = this.a;
                final File file = new File(a, "journal.bkp");
                if (file.exists()) {
                    final File file2 = new File(a, "journal");
                    if (file2.exists()) {
                        file.delete();
                    }
                    else {
                        dcq.d(file, file2, false);
                    }
                }
                final dcq dcq = new dcq(a);
                dcq b = null;
                Label_0345: {
                    if (dcq.b.exists()) {
                        try {
                            dcq.b();
                            dcq.a(dcq.c);
                            final Iterator iterator = dcq.g.values().iterator();
                            while (true) {
                                b = dcq;
                                if (!iterator.hasNext()) {
                                    break Label_0345;
                                }
                                final dcp dcp = (dcp)iterator.next();
                                if (dcp.g == null) {
                                    for (int i = 0; i < dcq.d; i = 1) {
                                        dcq.e += dcp.b[0];
                                    }
                                }
                                else {
                                    dcp.g = null;
                                    for (int j = 0; j < dcq.d; j = 1) {
                                        dcq.a(dcp.c());
                                        dcq.a(dcp.d());
                                    }
                                    iterator.remove();
                                }
                            }
                        }
                        catch (final IOException ex) {
                            final PrintStream out = System.out;
                            final String string = a.toString();
                            final String message = ex.getMessage();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("DiskLruCache ");
                            sb.append(string);
                            sb.append(" is corrupt: ");
                            sb.append(message);
                            sb.append(", removing");
                            out.println(sb.toString());
                            dcq.close();
                            dct.b(dcq.a);
                        }
                    }
                    a.mkdirs();
                    b = new dcq(a);
                    b.c();
                }
                this.b = b;
            }
            final dcq b2 = this.b;
            monitorexit(this);
            return b2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final File a(final ddk ddk) {
        final String k = this.c.k(ddk);
        final File file = null;
        Label_0053: {
            File file2;
            try {
                final cyb j = this.c().j(k);
                file2 = file;
                if (j != null) {
                    file2 = ((File[])j.a)[0];
                }
            }
            catch (final IOException ex) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    break Label_0053;
                }
                file2 = file;
            }
            return file2;
        }
        final IOException ex;
        Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", (Throwable)ex);
        return null;
    }
    
    @Override
    public final void b(ddk ddk, final aln aln) {
        final String k = this.c.k(ddk);
        Object o = this.d;
        monitorenter(o);
        try {
            if ((ddk = (ddk)((Map<Object, Object>)((dml)o).a).get(k)) == null) {
                final Object b = ((dml)o).b;
                ddk = (ddk)((cya)b).a;
                synchronized (ddk) {
                    final Object o2 = ((Queue<arfe>)((cya)b).a).poll();
                    monitorexit(ddk);
                    ddk = (ddk)o2;
                    if (o2 == null) {
                        ddk = (ddk)new arfe((byte[])null, (char[])null);
                    }
                    ((Map<String, ddk>)((dml)o).a).put(k, ddk);
                }
            }
            while (true) {
                ++((arfe)ddk).b;
                monitorexit(o);
                ((Lock)((arfe)ddk).a).lock();
                while (true) {
                    try {
                        try {
                            final dcq c = this.c();
                            if (c.j(k) == null) {
                                ddk = (ddk)c.i(k);
                                if (ddk != null) {
                                    try {
                                        synchronized (((rsi)ddk).d) {
                                            o = ((rsi)ddk).c;
                                            if (((dcp)o).g == ddk) {
                                                if (!((dcp)o).e) {
                                                    ((boolean[])((rsi)ddk).b)[0] = true;
                                                }
                                                o = ((dcp)o).d();
                                                ((dcq)((rsi)ddk).d).a.mkdirs();
                                                monitorexit(((rsi)ddk).d);
                                                if (((ddc)aln.b).a(aln.c, (File)o, (ddp)aln.a)) {
                                                    ((dcq)((rsi)ddk).d).h((rsi)ddk, true);
                                                    ((rsi)ddk).a = true;
                                                }
                                            }
                                            throw new IllegalStateException();
                                        }
                                    }
                                    finally {
                                        ((rsi)ddk).b();
                                    }
                                }
                                final StringBuilder sb = new StringBuilder("Had two simultaneous puts for: ");
                                sb.append(k);
                                throw new IllegalStateException(sb.toString());
                            }
                            final dml dml = this.d;
                            dml.l(k);
                            return;
                        }
                        finally {}
                    }
                    catch (final IOException ex) {
                        if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                            Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", (Throwable)ex);
                        }
                    }
                    final dml dml = this.d;
                    continue;
                }
            }
            this.d.l(k);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
