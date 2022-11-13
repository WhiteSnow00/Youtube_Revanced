import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class afff
{
    public final Map a;
    
    public afff() {
        this.a = afct.e();
    }
    
    public Collection a() {
        return new ArrayList();
    }
    
    public final void b(final Object o, final Object o2) {
        aefb.H(o, o2);
        Collection a;
        if ((a = this.a.get(o)) == null) {
            final Map a2 = this.a;
            a = this.a();
            a2.put(o, a);
        }
        a.add(o2);
    }
}
