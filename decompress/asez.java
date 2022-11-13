import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class asez
{
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final asfc f;
    final boolean g;
    final boolean h;
    
    public asez(final List b, final Collection c, final Collection d, final asfc f, final boolean g, final boolean a, final boolean h, final int e) {
        this.b = b;
        c.getClass();
        this.c = c;
        this.f = f;
        this.d = d;
        this.g = g;
        this.a = a;
        this.h = h;
        this.e = e;
        final boolean b2 = false;
        adkp.R(!a || b == null, "passThrough should imply buffer is null");
        adkp.R(!a || f != null, "passThrough should imply winningSubstream != null");
        adkp.R(!a || (c.size() == 1 && c.contains(f)) || (c.size() == 0 && f.b), "passThrough should imply winningSubstream is drained");
        boolean b3 = false;
        Label_0193: {
            if (g) {
                b3 = b2;
                if (f == null) {
                    break Label_0193;
                }
            }
            b3 = true;
        }
        adkp.R(b3, "cancelled should imply committed");
    }
    
    final asez a(final asfc asfc) {
        adkp.R(this.h ^ true, "hedging frozen");
        adkp.R(this.f == null, "already committed");
        final Collection d = this.d;
        Object o;
        if (d == null) {
            o = Collections.singleton(asfc);
        }
        else {
            final ArrayList list = new ArrayList(d);
            list.add((Object)asfc);
            o = Collections.unmodifiableCollection((Collection<?>)list);
        }
        return new asez(this.b, this.c, (Collection)o, this.f, this.g, this.a, this.h, this.e + 1);
    }
    
    final asez b() {
        if (this.h) {
            return this;
        }
        return new asez(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }
}
