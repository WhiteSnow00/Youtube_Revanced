import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dfp implements Iterable
{
    public final List a;
    
    public dfp() {
        this(new ArrayList(2));
    }
    
    public dfp(final List a) {
        this.a = a;
    }
    
    public static dfo b(final dnr dnr) {
        return new dfo(dnr, doz.b);
    }
    
    final int a() {
        return this.a.size();
    }
    
    final dfp c() {
        return new dfp(new ArrayList(this.a));
    }
    
    final boolean d(final dnr dnr) {
        return this.a.contains(b(dnr));
    }
    
    final boolean e() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
