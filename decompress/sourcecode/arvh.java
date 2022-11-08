import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arvh
{
    public final Collection a;
    private final String b;
    
    public arvh(final Collection collection) {
        final ArrayList list = new ArrayList();
        list.addAll(collection);
        this.b = "not_found";
        final HashSet set = new HashSet(list.size());
        for (final aruk aruk : list) {
            aruk.getClass();
            final String c = aruk.c;
            agot.B("not_found".equals(c), "service names %s != %s", (Object)c, (Object)"not_found");
            agot.z(set.add((Object)aruk.b), "duplicate name %s", (Object)aruk.b);
        }
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("name", this.b);
        o.b("schemaDescriptor", null);
        o.b("methods", this.a);
        o.d();
        return o.toString();
    }
}
