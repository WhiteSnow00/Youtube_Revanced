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

public final class dgz implements dgv
{
    private final File a;
    private dcp b;
    private final dmk c;
    private final dmk d;
    
    @Deprecated
    protected dgz(final File a) {
        this.d = new dmk((byte[])null);
        this.a = a;
        this.c = new dmk();
    }
    
    private final dcp c() {
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
                        dcp.d(file, file2, false);
                    }
                }
                final dcp dcp = new dcp(a);
                dcp b = null;
                Label_0329: {
                    if (dcp.b.exists()) {
                        try {
                            dcp.b();
                            dcp.a(dcp.c);
                            final Iterator iterator = dcp.g.values().iterator();
                            while (true) {
                                b = dcp;
                                if (!iterator.hasNext()) {
                                    break Label_0329;
                                }
                                final dco dco = (dco)iterator.next();
                                if (dco.g == null) {
                                    for (int i = 0; i < dcp.d; i = 1) {
                                        dcp.e += dco.b[0];
                                    }
                                }
                                else {
                                    dco.g = null;
                                    for (int j = 0; j < dcp.d; j = 1) {
                                        dcp.a(dco.c());
                                        dcp.a(dco.d());
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
                            dcp.close();
                            dcs.b(dcp.a);
                        }
                    }
                    a.mkdirs();
                    b = new dcp(a);
                    b.c();
                }
                this.b = b;
            }
            final dcp b2 = this.b;
            monitorexit(this);
            return b2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final File a(final ddj ddj) {
        final String k = this.c.k(ddj);
        final File file = null;
        Label_0053: {
            File file2;
            try {
                final cya j = this.c().j(k);
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
    
    public final void b(ddj ddj, final alm alm) {
        final String k = this.c.k(ddj);
        Object o = this.d;
        monitorenter(o);
        try {
            if ((ddj = (ddj)((Map<Object, Object>)((dmk)o).a).get(k)) == null) {
                final Object b = ((dmk)o).b;
                ddj = (ddj)((cxz)b).a;
                synchronized (ddj) {
                    final Object o2 = ((Queue<arcq>)((cxz)b).a).poll();
                    monitorexit(ddj);
                    ddj = (ddj)o2;
                    if (o2 == null) {
                        ddj = (ddj)new arcq((byte[])null, (char[])null);
                    }
                    ((Map<String, ddj>)((dmk)o).a).put(k, ddj);
                }
            }
            while (true) {
                ++((arcq)ddj).b;
                monitorexit(o);
                ((Lock)((arcq)ddj).a).lock();
                while (true) {
                    try {
                        try {
                            final dcp c = this.c();
                            if (c.j(k) == null) {
                                ddj = (ddj)c.i(k);
                                if (ddj != null) {
                                    try {
                                        synchronized (((rqe)ddj).d) {
                                            o = ((rqe)ddj).c;
                                            if (((dco)o).g == ddj) {
                                                if (!((dco)o).e) {
                                                    ((boolean[])((rqe)ddj).b)[0] = true;
                                                }
                                                o = ((dco)o).d();
                                                ((dcp)((rqe)ddj).d).a.mkdirs();
                                                monitorexit(((rqe)ddj).d);
                                                if (((ddb)alm.b).a(alm.c, (File)o, (ddo)alm.a)) {
                                                    ((dcp)((rqe)ddj).d).h((rqe)ddj, true);
                                                    ((rqe)ddj).a = true;
                                                }
                                            }
                                            throw new IllegalStateException();
                                        }
                                    }
                                    finally {
                                        ((rqe)ddj).b();
                                    }
                                }
                                final StringBuilder sb = new StringBuilder("Had two simultaneous puts for: ");
                                sb.append(k);
                                throw new IllegalStateException(sb.toString());
                            }
                            final dmk dmk = this.d;
                            dmk.l(k);
                            return;
                        }
                        finally {}
                    }
                    catch (final IOException ex) {
                        if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                            Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", (Throwable)ex);
                        }
                    }
                    final dmk dmk = this.d;
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
