import java.io.FilterOutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczp implements tdt
{
    private final arna a;
    
    public aczp(final atnb atnb) {
        this.a = ((aroq)atnb).b();
    }
    
    public final int a(Bundle b) {
        final zkt zkt = (zkt)this.a.a();
        final String s = (String)((afbn)((aczn)zkt.b).f()).a;
        Object o = ((aczn)zkt.b).e();
        try {
            if (!((afbh)o).h() || aqvr.g(s, (String)((afbh)o).c())) {
                tut.g("OnDeviceSuggestIndexFetcher: Add Request for the new index URL: ".concat(s));
                final dbp c = dbp.c();
                o = new aczo(s, (dbi)c, (dbh)c);
                ((tkf)zkt.a).c();
                ((tkf)zkt.a).a((tmy)o);
                try {
                    final byte[] array = (byte[])c.get();
                    final Object e = zkt.e;
                    if (array == null) {
                        return 0;
                    }
                    final List h = afcb.b('/').h(s);
                    afbh afbh;
                    if (h.size() >= 2 && !((String)h.get(h.size() - 1)).isEmpty()) {
                        final String value = String.valueOf(((Context)((agop)e).a).getFilesDir());
                        final String separator = File.separator;
                        o = File.separator;
                        final String s2 = h.get(h.size() - 1);
                        final StringBuilder sb = new StringBuilder();
                        sb.append(value);
                        sb.append(separator);
                        sb.append("ondevicesuggest");
                        sb.append((String)o);
                        sb.append(s2);
                        afbh = afbh.k(sb.toString());
                    }
                    else {
                        afbh = afag.a;
                    }
                    if (!afbh.h()) {
                        tut.b("OnDeviceSuggestIndexStore: Cannot create the file path from the URL: ".concat(s));
                        return 0;
                    }
                    final tmy tmy = null;
                    final tmy tmy2 = null;
                    final NullPointerException ex = b = null;
                    IOException ex6 = null;
                    Label_0801: {
                        final IOException ex7;
                        try {
                            try {
                                b = ex;
                                final File file = new File((String)afbh.c());
                                b = ex;
                                file.getParentFile().mkdirs();
                                b = ex;
                                o = new(java.io.BufferedOutputStream.class)();
                                b = ex;
                                b = ex;
                                final FileOutputStream fileOutputStream = new FileOutputStream(file);
                                b = ex;
                                new BufferedOutputStream(fileOutputStream, 8192);
                                try {
                                    ((FilterOutputStream)o).write(array);
                                    agop.i((OutputStream)o);
                                    try {
                                        b = (NullPointerException)afbh.c();
                                        if (!((agop)e).j((String)b)) {
                                            tut.b("OnDeviceSuggestIndexStore: The new index file may be in wrong format or broken.");
                                            b = (NullPointerException)new File((String)afbh.c());
                                            ((File)b).delete();
                                            return 0;
                                        }
                                        try {
                                            ((aczn)((agop)e).b).j(aqvr.f(s));
                                            b = (NullPointerException)((agop)e).b;
                                            o = afbh.c();
                                            ((aczn)b).m();
                                            ((aczn)((agop)e).b).i(s);
                                            o = afbh.c();
                                            Label_0640: {
                                                try {
                                                    b = (NullPointerException)new File((String)o);
                                                    o = ((File)b).getParentFile();
                                                    if (o == null) {
                                                        break Label_0640;
                                                    }
                                                    o = ((File)o).listFiles();
                                                    for (final File file2 : o) {
                                                        if (!file2.equals(b)) {
                                                            file2.delete();
                                                        }
                                                    }
                                                    break Label_0640;
                                                }
                                                catch (final NullPointerException b) {}
                                                catch (final SecurityException ex2) {}
                                                acws.h("OnDeviceSuggestIndexStore: Failed to delete the old index files.", (Throwable)b);
                                                tut.n("OnDeviceSuggestIndexStore: Failed to delete the old index files.", (Throwable)b);
                                            }
                                            tut.g("OnDeviceSuggestIndexStore: Successfully load the new model from ".concat(s));
                                        }
                                        catch (final aqzd b) {
                                            acws.h("OnDeviceSuggestIndexStore: The index URL is invalid: ".concat(s), (Throwable)b);
                                            tut.b("OnDeviceSuggestIndexStore: The index URL is invalid: ".concat(s));
                                        }
                                        return 0;
                                    }
                                    catch (final SecurityException b) {}
                                    catch (final NullPointerException ex3) {}
                                    acws.h("OnDeviceSuggestIndexStore: Fail to delete the broken new index file.", (Throwable)b);
                                    tut.b("OnDeviceSuggestIndexStore: Fail to delete the broken new index file.");
                                    return 0;
                                }
                                catch (final IOException b) {
                                    goto Label_0735;
                                }
                                catch (final NullPointerException ex4) {}
                                catch (final FileNotFoundException ex5) {}
                                finally {
                                    break Label_0801;
                                }
                            }
                            finally {
                                o = b;
                                ex6 = ex7;
                            }
                        }
                        catch (final IOException ex7) {
                            o = tmy;
                        }
                        catch (final NullPointerException ex7) {
                            o = tmy2;
                        }
                        catch (final FileNotFoundException ex7) {
                            o = tmy2;
                        }
                        acws.h("OnDeviceSuggestIndexStore: Error creating the new index file.", (Throwable)ex7);
                        tut.d("OnDeviceSuggestIndexStore: Error creating the new index file.", (Throwable)ex7);
                        goto Label_0755;
                    }
                    agop.i((OutputStream)o);
                    throw ex6;
                }
                catch (final ExecutionException ex8) {
                    acws.h("OnDeviceSuggestIndexFetcher threw an exception while fetching", (Throwable)ex8);
                    tut.n("OnDeviceSuggestIndexFetcher: The fetching task threw an exception: ", (Throwable)ex8);
                }
                catch (final InterruptedException ex9) {
                    tut.l("OnDeviceSuggestIndexFetcher: The fetching task is interrupted.");
                }
                return 2;
            }
            final String s3 = (String)((afbh)o).c();
        }
        catch (final aqzd aqzd) {
            final String s4 = (String)((afbh)o).c();
            final StringBuilder sb2 = new StringBuilder("OnDeviceSuggestIndexFetcher: The index URL is invalid. Latest: ");
            sb2.append(s);
            sb2.append(", current: ");
            sb2.append(s4);
            tut.l(sb2.toString());
        }
        return 0;
    }
}
