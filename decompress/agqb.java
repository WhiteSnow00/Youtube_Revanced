import java.util.Iterator;
import java.util.logging.Level;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqb extends afog
{
    private final Collection a;
    
    public agqb(final String s, final Collection a) {
        super(s);
        this.a = a;
    }
    
    public final void c(final afne afne) {
        final aflv d = ((afgh)this.a).D();
        while (((Iterator)d).hasNext()) {
            final afnf afnf = (afnf)((Iterator)d).next();
            if (afne.A() || afnf.d(afne.n())) {
                afnf.c(afne);
            }
        }
    }
    
    public final boolean d(final Level level) {
        final aflv d = ((afgh)this.a).D();
        while (((Iterator)d).hasNext()) {
            if (((afnf)((Iterator)d).next()).d(level)) {
                return true;
            }
        }
        return false;
    }
}
