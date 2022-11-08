import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmr
{
    public final Set a;
    public final Set b;
    public boolean c;
    
    public dmr() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.b = new HashSet();
    }
    
    public final boolean a(final dnk dnk) {
        final boolean b = true;
        if (dnk == null) {
            return true;
        }
        final boolean remove = this.a.remove(dnk);
        boolean b2 = b;
        if (!this.b.remove(dnk)) {
            b2 = (remove && b);
        }
        if (b2) {
            dnk.c();
        }
        return b2;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final int size = this.a.size();
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("{numRequests=");
        sb.append(size);
        sb.append(", isPaused=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
