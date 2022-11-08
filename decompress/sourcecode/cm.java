import java.util.Iterator;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cm extends avo
{
    public static final avq a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final boolean e;
    public boolean f;
    public boolean g;
    
    static {
        a = (avq)new awe(1);
    }
    
    public cm(final boolean e) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
        this.g = false;
        this.e = e;
    }
    
    final void a(final br br) {
        if (this.g) {
            return;
        }
        if (this.b.containsKey(br.l)) {
            return;
        }
        this.b.put(br.l, br);
        if (cl.W(2)) {
            new StringBuilder("Updating retained Fragments: Added ").append(br);
        }
    }
    
    public final void b(final br br) {
        if (cl.W(3)) {
            new StringBuilder("Clearing non-config state for ").append(br);
        }
        this.c(br.l);
    }
    
    public final void c(final String s) {
        final cm cm = this.c.get(s);
        if (cm != null) {
            cm.d();
            this.c.remove(s);
        }
        final avt avt = this.d.get(s);
        if (avt != null) {
            avt.c();
            this.d.remove(s);
        }
    }
    
    public final void d() {
        if (cl.W(3)) {
            new StringBuilder("onCleared called for ").append(this);
        }
        this.f = true;
    }
    
    final void e(final br br) {
        if (this.g) {
            return;
        }
        if (this.b.remove(br.l) != null && cl.W(2)) {
            new StringBuilder("Updating retained Fragments: Removed ").append(br);
        }
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final cm cm = (cm)o;
                if (this.b.equals(cm.b) && this.c.equals(cm.c) && this.d.equals(cm.d)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean f(final br br) {
        return !this.b.containsKey(br.l) || !this.e || this.f;
    }
    
    public final int hashCode() {
        return (this.b.hashCode() * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        final Iterator iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator iterator2 = this.c.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append((String)iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator iterator3 = this.d.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append((String)iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
