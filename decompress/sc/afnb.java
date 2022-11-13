import java.util.Set;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

final class afnb extends afmq
{
    private final Level a;
    private final Set b;
    private final afma c;
    
    public afnb(final String s, final Level a, final Set b, final afma c) {
        super(s);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void c(final aflo aflo) {
        String a;
        if ((a = (String)aflo.k().d(aflj.a)) == null) {
            a = this.a();
        }
        String substring;
        if ((substring = a) == null) {
            final String b = aflo.f().b();
            final int index = b.indexOf(36, b.lastIndexOf(46));
            substring = b;
            if (index >= 0) {
                substring = b.substring(0, index);
            }
        }
        afnc.e(aflo, afnd.e(substring), this.a, this.b, this.c);
    }
    
    public final boolean d(final Level level) {
        return true;
    }
}
