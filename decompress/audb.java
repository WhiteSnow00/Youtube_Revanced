import j$.util.Objects;
import java.io.Serializable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class audb implements Entry, Comparable, Serializable
{
    private static final long serialVersionUID = 4954918890077093841L;
    
    public abstract Object a();
    
    public abstract Object b();
    
    @Override
    public final int compareTo(final Object o) {
        final audb audb = (audb)o;
        final aunx aunx = new aunx();
        aunx.e(this.a(), audb.a());
        aunx.e(this.b(), audb.b());
        return aunx.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Entry) {
            final Entry entry = (Entry)o;
            if (Objects.equals(this.a(), entry.getKey()) && Objects.equals(this.b(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Object getKey() {
        return this.a();
    }
    
    @Override
    public final Object getValue() {
        return this.b();
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode() ^ this.b().hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a().toString();
        final String string2 = this.b().toString();
        final StringBuilder sb = new StringBuilder("(");
        sb.append(string);
        sb.append(",");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}
