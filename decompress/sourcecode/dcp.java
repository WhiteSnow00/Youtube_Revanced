import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.EOFException;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.LinkedHashMap;
import java.io.Writer;
import java.io.File;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcp implements Closeable
{
    public final File a;
    public final File b;
    public final File c;
    public final int d;
    public long e;
    public Writer f;
    public final LinkedHashMap g;
    public int h;
    final ThreadPoolExecutor i;
    private final File j;
    private final int k;
    private final long l;
    private long m;
    private final Callable n;
    
    public dcp(final File a) {
        this.e = 0L;
        this.g = new LinkedHashMap(0, 0.75f, true);
        this.m = 0L;
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new dcn());
        this.n = (Callable)new cty(this, 2);
        this.a = a;
        this.k = 1;
        this.b = new File(a, "journal");
        this.c = new File(a, "journal.tmp");
        this.j = new File(a, "journal.bkp");
        this.d = 1;
        this.l = 262144000L;
    }
    
    public static void a(final File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
    
    public static void d(final File file, final File file2, final boolean b) {
        if (b) {
            a(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }
    
    private final void k() {
        if (this.f != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }
    
    private static void l(final Writer writer) {
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    private static void m(final Writer writer) {
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    public final void b() {
        final dcr dcr = new dcr(new FileInputStream(this.b), dcs.a);
        try {
            final String a = dcr.a();
            final String a2 = dcr.a();
            final String a3 = dcr.a();
            final String a4 = dcr.a();
            final String a5 = dcr.a();
            if ("libcore.io.DiskLruCache".equals(a) && "1".equals(a2) && Integer.toString(this.k).equals(a3) && Integer.toString(this.d).equals(a4) && "".equals(a5)) {
                int n = 0;
                try {
                    String[] split;
                    while (true) {
                        final String a6 = dcr.a();
                        final int index = a6.indexOf(32);
                        if (index == -1) {
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(a6)));
                        }
                        final int n2 = index + 1;
                        final int index2 = a6.indexOf(32, n2);
                        Label_0448: {
                            int n3;
                            String substring2;
                            if (index2 == -1) {
                                final String substring = a6.substring(n2);
                                n3 = index;
                                substring2 = substring;
                                if (index == 6) {
                                    if (a6.startsWith("REMOVE")) {
                                        this.g.remove(substring);
                                        break Label_0448;
                                    }
                                    n3 = 6;
                                    substring2 = substring;
                                }
                            }
                            else {
                                substring2 = a6.substring(n2, index2);
                                n3 = index;
                            }
                            dco dco;
                            if ((dco = this.g.get(substring2)) == null) {
                                dco = new dco(this, substring2);
                                this.g.put(substring2, dco);
                            }
                            int n4 = n3;
                            if (index2 != -1 && (n4 = n3) == 5) {
                                if (a6.startsWith("CLEAN")) {
                                    split = a6.substring(index2 + 1).split(" ");
                                    dco.b(dco);
                                    dco.g = null;
                                    if (split.length == dco.f.d) {
                                        int i = 0;
                                        try {
                                            while (i < split.length) {
                                                dco.b[i] = Long.parseLong(split[i]);
                                                ++i;
                                            }
                                            break Label_0448;
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw dco.e(split);
                                        }
                                        break;
                                    }
                                    break;
                                }
                                else {
                                    n4 = 5;
                                }
                            }
                            if (index2 == -1 && n4 == 5 && a6.startsWith("DIRTY")) {
                                dco.g = new rqe(this, dco);
                            }
                            else if (index2 != -1 || n4 != 4 || !a6.startsWith("READ")) {
                                throw new IOException("unexpected journal line: ".concat(String.valueOf(a6)));
                            }
                        }
                        ++n;
                    }
                    throw dco.e(split);
                }
                catch (final EOFException ex2) {
                    this.h = n - this.g.size();
                    if (dcr.b == -1) {
                        this.c();
                    }
                    else {
                        this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), dcs.a));
                    }
                    dcs.a(dcr);
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder("unexpected journal header: [");
            sb.append(a);
            sb.append(", ");
            sb.append(a2);
            sb.append(", ");
            sb.append(a4);
            sb.append(", ");
            sb.append(a5);
            sb.append("]");
            throw new IOException(sb.toString());
        }
        finally {
            dcs.a(dcr);
            while (true) {}
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            final Writer f = this.f;
            if (f != null) {
                l(f);
            }
            Closeable closeable = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), dcs.a));
            try {
                ((Writer)closeable).write("libcore.io.DiskLruCache");
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write("1");
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write(Integer.toString(this.k));
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write(Integer.toString(this.d));
                ((Writer)closeable).write("\n");
                ((Writer)closeable).write("\n");
                for (final dco dco : this.g.values()) {
                    if (dco.g != null) {
                        final String a = dco.a;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(a);
                        sb.append("\n");
                        ((Writer)closeable).write(sb.toString());
                    }
                    else {
                        final String a2 = dco.a;
                        final String a3 = dco.a();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(a2);
                        sb2.append(a3);
                        sb2.append("\n");
                        ((Writer)closeable).write(sb2.toString());
                    }
                }
                l((Writer)closeable);
                if (this.b.exists()) {
                    d(this.b, this.j, true);
                }
                d(this.c, this.b, false);
                this.j.delete();
                closeable = new FileOutputStream(this.b, true);
                this.f = new BufferedWriter(new OutputStreamWriter((OutputStream)closeable, dcs.a));
                monitorexit(this);
            }
            finally {
                l((Writer)closeable);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.f == null) {
                monitorexit(this);
                return;
            }
            final ArrayList list = new ArrayList(this.g.values());
            for (int size = list.size(), i = 0; i < size; ++i) {
                final rqe g = ((dco)list.get(i)).g;
                if (g != null) {
                    g.a();
                }
            }
            this.e();
            l(this.f);
            this.f = null;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e() {
        while (this.e > this.l) {
            this.g(this.g.entrySet().iterator().next().getKey());
        }
    }
    
    public final boolean f() {
        final int h = this.h;
        return h >= 2000 && h >= this.g.size();
    }
    
    public final void g(final String s) {
        monitorenter(this);
        try {
            this.k();
            final dco dco = this.g.get(s);
            if (dco == null || dco.g != null) {
                monitorexit(this);
                return;
            }
            for (int i = 0; i < this.d; i = 1) {
                final File c = dco.c();
                if (c.exists() && !c.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(c))));
                }
                final long e = this.e;
                final long[] b = dco.b;
                this.e = e - b[0];
                b[0] = 0L;
            }
            ++this.h;
            this.f.append((CharSequence)"REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence)s);
            this.f.append('\n');
            this.g.remove(s);
            if (this.f()) {
                this.i.submit((Callable<Object>)this.n);
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h(final rqe rqe, final boolean b) {
        monitorenter(this);
        try {
            final Object c = rqe.c;
            if (((dco)c).g != rqe) {
                throw new IllegalStateException();
            }
            if (b && !((dco)c).e) {
                for (int i = 0; i < this.d; i = 1) {
                    if (!((boolean[])rqe.b)[0]) {
                        rqe.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index 0");
                    }
                    if (!((dco)c).d().exists()) {
                        rqe.a();
                        monitorexit(this);
                        return;
                    }
                }
            }
            for (int j = 0; j < this.d; j = 1) {
                final File d = ((dco)c).d();
                if (b) {
                    if (d.exists()) {
                        final File c2 = ((dco)c).c();
                        d.renameTo(c2);
                        final long n = ((dco)c).b[0];
                        final long length = c2.length();
                        ((dco)c).b[0] = length;
                        this.e = this.e - n + length;
                    }
                }
                else {
                    a(d);
                }
            }
            ++this.h;
            ((dco)c).g = null;
            if (((dco)c).e | b) {
                dco.b((dco)c);
                this.f.append((CharSequence)"CLEAN");
                this.f.append(' ');
                this.f.append((CharSequence)((dco)c).a);
                this.f.append((CharSequence)((dco)c).a());
                this.f.append('\n');
                if (b) {
                    ++this.m;
                }
            }
            else {
                this.g.remove(((dco)c).a);
                this.f.append((CharSequence)"REMOVE");
                this.f.append(' ');
                this.f.append((CharSequence)((dco)c).a);
                this.f.append('\n');
            }
            m(this.f);
            if (this.e <= this.l && !this.f()) {
                monitorexit(this);
                return;
            }
            this.i.submit((Callable<Object>)this.n);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final rqe i(final String s) {
        synchronized (this) {
            this.k();
            dco dco = this.g.get(s);
            if (dco == null) {
                dco = new dco(this, s);
                this.g.put(s, dco);
            }
            else if (dco.g != null) {
                return null;
            }
            final rqe g = new rqe(this, dco);
            dco.g = g;
            this.f.append((CharSequence)"DIRTY");
            this.f.append(' ');
            this.f.append((CharSequence)s);
            this.f.append('\n');
            m(this.f);
            return g;
        }
    }
    
    public final cya j(final String s) {
        monitorenter(this);
        try {
            this.k();
            final dco dco = this.g.get(s);
            if (dco == null) {
                monitorexit(this);
                return null;
            }
            if (!dco.e) {
                monitorexit(this);
                return null;
            }
            final File[] c = dco.c;
            for (int length = c.length, i = 0; i < length; i = 1) {
                if (!c[0].exists()) {
                    monitorexit(this);
                    return null;
                }
            }
            ++this.h;
            this.f.append((CharSequence)"READ");
            this.f.append(' ');
            this.f.append((CharSequence)s);
            this.f.append('\n');
            if (this.f()) {
                this.i.submit((Callable<Object>)this.n);
            }
            final cya cya = new cya(dco.c);
            monitorexit(this);
            return cya;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
