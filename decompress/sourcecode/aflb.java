import java.util.Set;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

final class aflb extends afkq
{
    private final Level a;
    private final Set b;
    private final afka c;
    
    public aflb(final String s, final Level a, final Set b, final afka c) {
        super(s);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void c(final afjo afjo) {
        String a;
        if ((a = (String)afjo.k().d(afjj.a)) == null) {
            a = this.a();
        }
        String substring;
        if ((substring = a) == null) {
            final String b = afjo.f().b();
            final int index = b.indexOf(36, b.lastIndexOf(46));
            substring = b;
            if (index >= 0) {
                substring = b.substring(0, index);
            }
        }
        aflc.e(afjo, afld.e(substring), this.a, this.b, this.c);
    }
    
    public final boolean d(final Level level) {
        return true;
    }
}
