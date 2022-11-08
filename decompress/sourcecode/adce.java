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

public final class adce implements adcg
{
    public final String a;
    public final AtomicInteger b;
    private final Executor c;
    private ListenableFuture d;
    
    public adce(final String a, final Executor c) {
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
        return afva.m(null);
    }
    
    private static void h(final List list) {
        final Process exec = Runtime.getRuntime().exec(list.toArray(new String[list.size()]));
        if (exec.waitFor() == 0) {
            return;
        }
        final String s = new String(afna.d(exec.getErrorStream()));
        final String string = list.toString();
        final StringBuilder sb = new StringBuilder("Could not execute ");
        sb.append(string);
        sb.append(" because: ");
        sb.append(s);
        throw new IOException(sb.toString());
    }
    
    public final ListenableFuture a(final adcb adcb) {
        return afva.r((afrx)new adcd(this, (aeyr)new ysm(adcb, 18), 2), this.c);
    }
    
    public final ListenableFuture b(final adcb adcb, final adcn adcn) {
        return afrp.e(afva.r((afrx)new adcd(this, adcb, 0), this.c), (aexg)new abiy(adcb, adcn, 3), (Executor)afsl.a);
    }
    
    public final ListenableFuture c(final adcb adcb, final Object o, final adcm adcm) {
        return afrp.e(afva.r((afrx)new adcd(adcm, o, 3), this.c), (aexg)new abiy(this, adcb, 4), (Executor)afsl.a);
    }
    
    public final void e(final aeyr aeyr) {
        this.d = afva.r((afrx)new qpp(aeyr, 11), this.c);
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
