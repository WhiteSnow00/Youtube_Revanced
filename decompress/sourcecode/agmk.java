import java.util.Iterator;
import java.util.logging.Level;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmk extends afkq
{
    private final Collection a;
    
    public agmk(final String s, final Collection a) {
        super(s);
        this.a = a;
    }
    
    public final void c(final afjo afjo) {
        final afif d = ((afcr)this.a).D();
        while (((Iterator)d).hasNext()) {
            final afjp afjp = (afjp)((Iterator)d).next();
            if (afjo.A() || afjp.d(afjo.n())) {
                afjp.c(afjo);
            }
        }
    }
    
    public final boolean d(final Level level) {
        final afif d = ((afcr)this.a).D();
        while (((Iterator)d).hasNext()) {
            if (((afjp)((Iterator)d).next()).d(level)) {
                return true;
            }
        }
        return false;
    }
}
