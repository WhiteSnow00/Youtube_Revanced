import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdt
{
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final asdv f;
    final boolean g;
    final boolean h;
    
    public asdt(final List b, final Collection c, final Collection d, final asdv f, final boolean g, final boolean a, final boolean h, final int e) {
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
        agot.E(!a || b == null, (Object)"passThrough should imply buffer is null");
        agot.E(!a || f != null, (Object)"passThrough should imply winningSubstream != null");
        agot.E(!a || (c.size() == 1 && c.contains(f)) || (c.size() == 0 && f.b), (Object)"passThrough should imply winningSubstream is drained");
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
        agot.E(b3, (Object)"cancelled should imply committed");
    }
    
    final asdt a(final asdv asdv) {
        agot.E(this.h ^ true, (Object)"hedging frozen");
        agot.E(this.f == null, (Object)"already committed");
        final Collection d = this.d;
        Object o;
        if (d == null) {
            o = Collections.singleton(asdv);
        }
        else {
            final ArrayList list = new ArrayList(d);
            list.add((Object)asdv);
            o = Collections.unmodifiableCollection((Collection<?>)list);
        }
        return new asdt(this.b, this.c, (Collection)o, this.f, this.g, this.a, this.h, this.e + 1);
    }
    
    final asdt b() {
        if (this.h) {
            return this;
        }
        return new asdt(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }
}
