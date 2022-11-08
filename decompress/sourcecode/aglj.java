import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aglj implements aglo
{
    private final String a;
    private final aglk b;
    
    public aglj(final Set set, final aglk b) {
        this.a = b(set);
        this.b = b;
    }
    
    private static String b(final Set set) {
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final agll agll = (agll)iterator.next();
            sb.append(agll.a);
            sb.append('/');
            sb.append(agll.b);
            if (iterator.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        final String a = this.a;
        final String b = b(this.b.a());
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" ");
        sb.append(b);
        return sb.toString();
    }
}
