import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgd
{
    public final String a;
    public final boolean b;
    public final List c;
    public List d;
    
    public cgd(final String a, final boolean b, final List c, final List d) {
        c.getClass();
        d.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        List d2 = d;
        if (d.isEmpty()) {
            final int size = c.size();
            final ArrayList list = new ArrayList(size);
            int n = 0;
            while (true) {
                d2 = list;
                if (n >= size) {
                    break;
                }
                list.add((Object)"ASC");
                ++n;
            }
        }
        this.d = d2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cgd)) {
            return false;
        }
        final boolean b = this.b;
        final cgd cgd = (cgd)o;
        if (b != cgd.b) {
            return false;
        }
        if (!atoc.c((Object)this.c, (Object)cgd.c)) {
            return false;
        }
        if (!atoc.c((Object)this.d, (Object)cgd.d)) {
            return false;
        }
        boolean b2;
        if (asfn.q(this.a, "index_")) {
            b2 = asfn.q(cgd.a, "index_");
        }
        else {
            b2 = atoc.c((Object)this.a, (Object)cgd.a);
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        int hashCode;
        if (asfn.q(this.a, "index_")) {
            hashCode = -1184239155;
        }
        else {
            hashCode = this.a.hashCode();
        }
        return ((hashCode * 31 + (this.b ? 1 : 0)) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.a);
        sb.append("', unique=");
        sb.append(this.b);
        sb.append(", columns=");
        sb.append(this.c);
        sb.append(", orders=");
        sb.append(this.d);
        sb.append("'}");
        return sb.toString();
    }
}
