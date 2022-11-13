import java.util.Iterator;
import java.util.Map;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvm extends RuntimeException
{
    dun a;
    public final HashMap b;
    private final ArrayList c;
    private final dsx d;
    private final ComponentTree e;
    
    public dvm(final ComponentTree componentTree, final Throwable t) {
        this(null, componentTree, t);
    }
    
    private dvm(final dsx d, final ComponentTree e, final Throwable t) {
        this.c = new ArrayList();
        this.b = new HashMap();
        this.initCause(t);
        this.setStackTrace(new StackTraceElement[0]);
        this.d = d;
        this.e = e;
    }
    
    public dvm(final dsx dsx, final Throwable t) {
        this(dsx, null, t);
    }
    
    final void a(final dst dst) {
        this.c.add(dst);
    }
    
    @Override
    public final String getMessage() {
        Throwable t;
        for (t = this.getCause(); t.getCause() != null; t = t.getCause()) {}
        final StringBuilder sb = new StringBuilder("Real Cause => ");
        sb.append(t.getClass().getCanonicalName());
        sb.append(": ");
        sb.append(t.getMessage());
        sb.append("\nLitho Context:\n");
        if (!this.c.isEmpty()) {
            sb.append("  layout_stack: ");
            int size = this.c.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                sb.append(((dst)this.c.get(n)).q());
                if ((size = n) == 0) {
                    continue;
                }
                sb.append(" -> ");
                size = n;
            }
            sb.append("\n");
        }
        final dsx d = this.d;
        if (d != null && d.i() != null) {
            sb.append("  log_tag: ");
            sb.append(this.d.i());
            sb.append("\n");
        }
        else {
            final ComponentTree e = this.e;
            if (e != null && e.A != null) {
                sb.append("  log_tag: ");
                sb.append(this.e.A);
                sb.append("\n");
            }
        }
        ComponentTree componentTree;
        if ((componentTree = this.e) == null) {
            final dsx d2 = this.d;
            if (d2 != null) {
                componentTree = d2.h;
            }
            else {
                componentTree = null;
            }
        }
        if (componentTree != null) {
            sb.append("  tree_root: ");
            sb.append(componentTree.a().q());
            sb.append("\n");
        }
        final dsx d3 = this.d;
        if (d3 != null && d3.e != null) {
            sb.append("  component_scope: ");
            sb.append(this.d.e.q());
            sb.append("\n");
        }
        sb.append("  thread_name: ");
        sb.append(Thread.currentThread().getName());
        sb.append("\n");
        final dsx d4 = this.d;
        if (d4 != null && d4.g(dtu.class) != null) {
            throw null;
        }
        for (final Map.Entry<String, V> entry : this.b.entrySet()) {
            sb.append("  ");
            sb.append(entry.getKey());
            sb.append(": ");
            sb.append((String)entry.getValue());
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
