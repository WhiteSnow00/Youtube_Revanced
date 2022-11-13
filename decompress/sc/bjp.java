import java.util.Collections;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bjp
{
    public final ayg d;
    public final afeq e;
    public final long f;
    public final List g;
    public final bjm h;
    
    public bjp(final ayg d, final List list, final bjv bjv, final List list2) {
        dk.f(list.isEmpty() ^ true);
        this.d = d;
        this.e = afeq.o((Collection)list);
        List<Object> g;
        if (list2 == null) {
            g = Collections.emptyList();
        }
        else {
            g = Collections.unmodifiableList((List<?>)list2);
        }
        this.g = g;
        this.h = bjv.i(this);
        this.f = bax.y(bjv.j, 1000000L, bjv.i);
    }
    
    public abstract biw k();
    
    public abstract bjm l();
    
    public abstract String m();
}
