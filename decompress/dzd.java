import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dzd
{
    public Map a;
    public ArrayList b;
    public float c;
    public long d;
    
    public dzd() {
        this.a = null;
        this.b = null;
        this.d = 0L;
    }
    
    public abstract float a(final long p0);
    
    public final int d() {
        final Map a = this.a;
        if (a == null) {
            return 0;
        }
        return a.size();
    }
    
    protected final dzd e() {
        if (this.d() <= 1) {
            return this.f("default_input");
        }
        throw new RuntimeException("Trying to get single input of node with multiple inputs!");
    }
    
    protected final dzd f(final String s) {
        final dzd g = this.g(s);
        if (g == null) {
            final Map a = this.a;
            String string;
            if (a != null) {
                final Iterator iterator = a.keySet().iterator();
                String s2 = "";
                while (iterator.hasNext()) {
                    final String s3 = (String)iterator.next();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s2);
                    sb.append("'");
                    sb.append(s3);
                    sb.append("'");
                    final String s4 = s2 = sb.toString();
                    if (!iterator.hasNext()) {
                        s2 = s4.concat(", ");
                    }
                }
                final StringBuilder sb2 = new StringBuilder("[");
                sb2.append(s2);
                sb2.append("]");
                string = sb2.toString();
            }
            else {
                string = "[]";
            }
            final StringBuilder sb3 = new StringBuilder("Tried to get non-existent input '");
            sb3.append(s);
            sb3.append("'. Node only has these inputs: ");
            sb3.append(string);
            throw new RuntimeException(sb3.toString());
        }
        return g;
    }
    
    public final dzd g(final String s) {
        final Map a = this.a;
        if (a == null) {
            return null;
        }
        return (dzd)a.get(s);
    }
    
    public final Collection h() {
        final Map a = this.a;
        if (a == null) {
            return Collections.emptySet();
        }
        return a.values();
    }
}
