import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvy extends afvk
{
    private List c;
    
    public afvy(final affy affy, final boolean b) {
        super(affy, b, true);
        List<Object> c;
        if (affy.isEmpty()) {
            c = Collections.emptyList();
        }
        else {
            c = agpx.Q(affy.size());
        }
        for (int i = 0; i < affy.size(); ++i) {
            c.add(null);
        }
        this.c = c;
        this.n();
    }
    
    public final void d(final int n, final Object o) {
        final List c = this.c;
        if (c != null) {
            c.set(n, new adgg(o));
        }
    }
    
    public final void m() {
        final List c = this.c;
        if (c != null) {
            final ArrayList q = agpx.Q(c.size());
            for (final adgg adgg : c) {
                Object a;
                if (adgg != null) {
                    a = adgg.a;
                }
                else {
                    a = null;
                }
                q.add(a);
            }
            ((afvd)this).set(Collections.unmodifiableList((List<?>)q));
        }
    }
    
    public final void o(final int n) {
        super.o(n);
        this.c = null;
    }
}
