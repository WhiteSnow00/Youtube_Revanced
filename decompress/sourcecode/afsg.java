import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afsg extends afrs
{
    private List c;
    
    public afsg(final afci afci, final boolean b) {
        super(afci, b, true);
        List<Object> c;
        if (afci.isEmpty()) {
            c = Collections.emptyList();
        }
        else {
            c = adwd.ao(afci.size());
        }
        for (int i = 0; i < afci.size(); ++i) {
            c.add(null);
        }
        this.c = c;
        this.n();
    }
    
    public final void d(final int n, final Object o) {
        final List c = this.c;
        if (c != null) {
            c.set(n, new adcr(o));
        }
    }
    
    public final void m() {
        final List c = this.c;
        if (c != null) {
            final ArrayList ao = adwd.ao(c.size());
            for (final adcr adcr : c) {
                Object a;
                if (adcr != null) {
                    a = adcr.a;
                }
                else {
                    a = null;
                }
                ao.add(a);
            }
            ((afrl)this).set(Collections.unmodifiableList((List<?>)ao));
        }
    }
    
    public final void o(final int n) {
        super.o(n);
        this.c = null;
    }
}
