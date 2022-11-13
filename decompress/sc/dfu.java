import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfu extends Exception
{
    private static final StackTraceElement[] a;
    private static final long serialVersionUID = 1L;
    private final List b;
    private ddk c;
    private Class d;
    private String e;
    private int f;
    
    static {
        a = new StackTraceElement[0];
    }
    
    public dfu(final String s) {
        this(s, Collections.emptyList());
    }
    
    public dfu(final String e, final List b) {
        this.e = e;
        this.setStackTrace(dfu.a);
        this.b = b;
    }
    
    private final void c(final Throwable t, final List list) {
        if (t instanceof dfu) {
            final Iterator iterator = ((dfu)t).b.iterator();
            while (iterator.hasNext()) {
                this.c((Throwable)iterator.next(), list);
            }
            return;
        }
        list.add(t);
    }
    
    private static void d(final Throwable t, final Appendable appendable) {
        try {
            appendable.append(t.getClass().toString()).append(": ").append(t.getMessage()).append('\n');
        }
        catch (final IOException ex) {
            throw new RuntimeException(t);
        }
    }
    
    private final void e(final Appendable appendable) {
        d(this, appendable);
        final List b = this.b;
        final dft dft = new dft(appendable);
        try {
            int n;
            for (int size = b.size(), i = 0; i < size; i = n) {
                dft.append("Cause (");
                n = i + 1;
                dft.append(String.valueOf(n));
                dft.append(" of ");
                dft.append(String.valueOf(size));
                dft.append("): ");
                final Throwable t = b.get(i);
                if (t instanceof dfu) {
                    ((dfu)t).e(dft);
                }
                else {
                    d(t, dft);
                }
            }
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final List a() {
        final ArrayList list = new ArrayList();
        this.c(this, list);
        return list;
    }
    
    final void b(final ddk c, final int f, final Class d) {
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }
    
    @Override
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        final Class d = this.d;
        final String s = "";
        String concat;
        if (d != null) {
            concat = ", ".concat(d.toString());
        }
        else {
            concat = "";
        }
        sb.append(concat);
        final int f = this.f;
        String concat2;
        if (f != 0) {
            concat2 = ", ".concat(cka.m(f));
        }
        else {
            concat2 = "";
        }
        sb.append(concat2);
        final ddk c = this.c;
        String concat3 = s;
        if (c != null) {
            concat3 = ", ".concat(c.toString());
        }
        sb.append(concat3);
        final List a = this.a();
        if (a.isEmpty()) {
            return sb.toString();
        }
        if (a.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        }
        else {
            sb.append("\nThere were ");
            sb.append(a.size());
            sb.append(" root causes:");
        }
        for (final Throwable t : a) {
            sb.append('\n');
            sb.append(t.getClass().getName());
            sb.append('(');
            sb.append(t.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }
    
    @Override
    public final void printStackTrace() {
        this.e(System.err);
    }
    
    @Override
    public final void printStackTrace(final PrintStream printStream) {
        this.e(printStream);
    }
    
    @Override
    public final void printStackTrace(final PrintWriter printWriter) {
        this.e(printWriter);
    }
}
