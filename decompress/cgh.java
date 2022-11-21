import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgh
{
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;
    
    public cgh(final String a, final Map b, final Set c, final Set d) {
        b.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cgh)) {
            return false;
        }
        final String a = this.a;
        final cgh cgh = (cgh)o;
        if (!atqz.c(a, cgh.a)) {
            return false;
        }
        if (!atqz.c(this.b, cgh.b)) {
            return false;
        }
        if (!atqz.c(this.c, cgh.c)) {
            return false;
        }
        final Set d = this.d;
        if (d != null) {
            final Set d2 = cgh.d;
            if (d2 != null) {
                return atqz.c(d, d2);
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.a);
        sb.append("', columns=");
        sb.append(this.b);
        sb.append(", foreignKeys=");
        sb.append(this.c);
        sb.append(", indices=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
