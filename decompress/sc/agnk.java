import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnk implements agnp
{
    private final String a;
    private final agnl b;
    
    public agnk(final Set set, final agnl b) {
        this.a = b(set);
        this.b = b;
    }
    
    private static String b(final Set set) {
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final agnm agnm = (agnm)iterator.next();
            sb.append(agnm.a);
            sb.append('/');
            sb.append(agnm.b);
            if (iterator.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    @Override
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
