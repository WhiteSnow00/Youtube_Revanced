import android.util.SparseArray;
import java.util.HashMap;
import java.io.IOException;
import java.io.File;
import java.security.SecureRandom;
import android.os.ConditionVariable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lxc extends Thread
{
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ lwq b;
    final /* synthetic */ lxe c;
    
    public lxc(final lxe c, final ConditionVariable a, final lwq b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super("SimpleCache.initialize()");
    }
    
    @Override
    public final void run() {
        final lxe c = this.c;
        monitorenter(c);
        try {
            this.a.open();
            final long nanoTime = System.nanoTime();
            final lxe c2 = this.c;
            final boolean exists = c2.a.exists();
            boolean b = false;
            Label_0696: {
                if (!exists && !c2.a.mkdirs()) {
                    final String concat = "Failed to create cache directory: ".concat(c2.a.toString());
                    bao.a("SimpleCache", concat);
                    c2.g = new lwk(concat);
                }
                else {
                    final File[] listFiles = c2.a.listFiles();
                    if (listFiles != null) {
                    Label_0259:
                        while (true) {
                            for (final File file : listFiles) {
                                final String name = file.getName();
                                Label_0248: {
                                    if (name.endsWith(".uid")) {
                                        try {
                                            final long long1 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                                            break Label_0259;
                                        }
                                        catch (final NumberFormatException ex) {
                                            bao.a("SimpleCache", "Malformed UID file: ".concat(String.valueOf(String.valueOf(file))));
                                            file.delete();
                                        }
                                        break Label_0248;
                                        long long1 = 0L;
                                        if (long1 == -1L) {
                                            try {
                                                final File a = c2.a;
                                                final long nextLong = new SecureRandom().nextLong();
                                                long abs;
                                                if (nextLong == Long.MIN_VALUE) {
                                                    abs = 0L;
                                                }
                                                else {
                                                    abs = Math.abs(nextLong);
                                                }
                                                final File file2 = new File(a, String.valueOf(Long.toString(abs, 16)).concat(".uid"));
                                                if (!file2.createNewFile()) {
                                                    throw new IOException("Failed to create UID file: ".concat(file2.toString()));
                                                }
                                            }
                                            catch (final IOException ex2) {
                                                final String concat2 = "Failed to create cache UID: ".concat(c2.a.toString());
                                                bao.b("SimpleCache", concat2, (Throwable)ex2);
                                                c2.g = new lwk(concat2, ex2);
                                                break Label_0696;
                                            }
                                        }
                                        try {
                                            final blt j = c2.i;
                                            final Object d = j.d;
                                            final Object e = j.e;
                                            final Object a2 = j.a;
                                            dk.h(((lwt)d).b ^ true);
                                            System.currentTimeMillis();
                                            if (!((lwt)d).b((HashMap)e, (SparseArray)a2)) {
                                                ((HashMap)e).clear();
                                                ((SparseArray)a2).clear();
                                                ((lwt)d).a.c();
                                            }
                                            final yzr a3 = yzr.a;
                                            System.currentTimeMillis();
                                            c2.v(c2.a, true, listFiles);
                                            final blt k = c2.i;
                                            final int size = ((HashMap)k.e).size();
                                            final String[] array = new String[size];
                                            ((HashMap)k.e).keySet().toArray(array);
                                            for (int l = 0; l < size; ++l) {
                                                k.L(array[l]);
                                            }
                                            try {
                                                c2.i.M();
                                            }
                                            catch (final IOException c2) {
                                                bao.b("SimpleCache", "Storing index file failed", (Throwable)c2);
                                            }
                                        }
                                        catch (final IOException ex3) {
                                            final String concat3 = "Failed to initialize cache indices: ".concat(c2.a.toString());
                                            bao.b("SimpleCache", concat3, (Throwable)ex3);
                                            c2.g = new lwk(concat3, ex3);
                                        }
                                        break Label_0696;
                                    }
                                }
                            }
                            final long long1 = -1L;
                            continue Label_0259;
                        }
                    }
                    final String concat4 = "Failed to list cache directory files: ".concat(c2.a.toString());
                    bao.a("SimpleCache", concat4);
                    c2.g = new lwk(concat4);
                }
            }
            final long nanoTime2 = System.nanoTime();
            this.c.b.f();
            final long n = (nanoTime2 - nanoTime) / 1000L;
            final yzr a4 = yzr.a;
            if (this.c.h == null) {
                b = true;
            }
            agot.D(b);
            final lxe c3 = this.c;
            this.b.d();
            c3.h = new wwt(n);
            synchronized (this.c.e) {
                final lxe c4 = this.c;
                c4.c = true;
                final lxd d2 = c4.d;
                if (d2 != null) {
                    d2.a(c4.h);
                }
                monitorexit(this.c.e);
            }
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
}
