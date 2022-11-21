import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class afcs extends afdi implements afih
{
    private static final long serialVersionUID = 6588350623831699109L;
    
    protected afcs(final Map map) {
        super(map);
    }
    
    @Override
    public /* bridge */ Collection a() {
        throw null;
    }
    
    @Override
    public final Collection b() {
        return Collections.emptyList();
    }
    
    @Override
    public final Collection c(final Collection collection) {
        return Collections.unmodifiableList((List<?>)collection);
    }
    
    @Override
    public final Collection d(final Object o, final Collection collection) {
        return this.j(o, (List)collection, null);
    }
    
    public final List e(final Object o) {
        Collection a;
        if ((a = super.a.get(o)) == null) {
            a = this.a();
        }
        return (List)this.d(o, a);
    }
    
    public final List f(final Object o) {
        final Collection collection = super.a.remove(o);
        Collection collection2;
        if (collection == null) {
            collection2 = this.b();
        }
        else {
            final Collection a = this.a();
            a.addAll(collection);
            super.b -= collection.size();
            collection.clear();
            collection2 = this.c(a);
        }
        return (List)collection2;
    }
}
