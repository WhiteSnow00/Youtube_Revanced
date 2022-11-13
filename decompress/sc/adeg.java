import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adeg implements adei
{
    public final String a;
    public final AtomicInteger b;
    private final Executor c;
    private ListenableFuture d;
    
    public adeg(final String a, final Executor c) {
        this.b = new AtomicInteger(0);
        this.a = a;
        this.c = c;
        new File(a);
    }
    
    public static void d(final File file, final File file2) {
        if (!file.exists()) {
            return;
        }
        final ArrayList list = new ArrayList();
        list.add("mv");
        list.add(file.getAbsolutePath());
        list.add(file2.getAbsolutePath());
        h(list);
    }
    
    public static final ListenableFuture g(final List list) {
        if (!list.isEmpty()) {
            final ArrayList list2 = new ArrayList();
            list2.add("rm");
            list2.add("-r");
            final Iterator iterator = list.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final File file = (File)iterator.next();
                if (file.exists()) {
                    list2.add(file.getAbsolutePath());
                    b = true;
                }
            }
            if (b) {
                h(list2);
            }
        }
        return afwm.m((Object)null);
    }
    
    private static void h(final List list) {
        final Process exec = Runtime.getRuntime().exec(list.toArray(new String[list.size()]));
        if (exec.waitFor() == 0) {
            return;
        }
        final String s = new String(afpa.d(exec.getErrorStream()));
        final String string = list.toString();
        final StringBuilder sb = new StringBuilder("Could not execute ");
        sb.append(string);
        sb.append(" because: ");
        sb.append(s);
        throw new IOException(sb.toString());
    }
    
    public final ListenableFuture a(final aded aded) {
        return afwm.r((afty)new adef(this, (afaq)new yuk(aded, 18), 0), this.c);
    }
    
    public final ListenableFuture b(final aded aded, final adep adep) {
        return aftq.e(afwm.r((afty)new adef(this, aded, 1), this.c), (aezf)new abks(aded, adep, 3), (Executor)afum.a);
    }
    
    public final ListenableFuture c(final aded aded, final Object o, final adeo adeo) {
        return aftq.e(afwm.r((afty)new adef(adeo, o, 2), this.c), (aezf)new abks(this, aded, 4), (Executor)afum.a);
    }
    
    public final void e(final afaq afaq) {
        this.d = afwm.r((afty)new qqz(afaq, 11), this.c);
    }
    
    public final void f() {
        final ListenableFuture d = this.d;
        if (d == null || d.isDone()) {
            goto Label_0036;
        }
        try {
            this.d.get();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        catch (final ExecutionException ex2) {
            goto Label_0036;
        }
    }
}
