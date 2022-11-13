import java.util.Iterator;
import java.util.logging.Level;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoi extends afmq
{
    private final Collection a;
    
    public agoi(final String s, final Collection a) {
        super(s);
        this.a = a;
    }
    
    public final void c(final aflo aflo) {
        final afkf d = ((afeq)this.a).D();
        while (((Iterator)d).hasNext()) {
            final aflp aflp = (aflp)((Iterator)d).next();
            if (aflo.A() || aflp.d(aflo.n())) {
                aflp.c(aflo);
            }
        }
    }
    
    public final boolean d(final Level level) {
        final afkf d = ((afeq)this.a).D();
        while (((Iterator)d).hasNext()) {
            if (((aflp)((Iterator)d).next()).d(level)) {
                return true;
            }
        }
        return false;
    }
}
