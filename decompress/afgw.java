import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class afgw
{
    public final Map a;
    
    public afgw() {
        this.a = afek.e();
    }
    
    public Collection a() {
        return new ArrayList();
    }
    
    public final void b(final Object o, final Object o2) {
        adzw.F(o, o2);
        Collection a;
        if ((a = this.a.get(o)) == null) {
            final Map a2 = this.a;
            a = this.a();
            a2.put(o, a);
        }
        a.add(o2);
    }
}
