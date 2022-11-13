import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawz implements aaxw
{
    public final List a;
    public final List b;
    
    public aawz(final List a, final List b) {
        final afkf d = ((afeq)a).D();
        while (((Iterator)d).hasNext()) {
            ((xab)((Iterator)d).next()).getClass();
        }
        final afkf d2 = ((afeq)b).D();
        while (((Iterator)d2).hasNext()) {
            ((xab)((Iterator)d2).next()).getClass();
        }
        this.a = a;
        this.b = b;
    }
    
    public static amqg a(final aiqj aiqj) {
        if (aiqj != null) {
            return (amqg)((ahbc)aiqj).rx((ahaq)amqf.b);
        }
        return null;
    }
}
