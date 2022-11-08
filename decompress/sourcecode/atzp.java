import j$.util.Objects;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atzp implements Comparable, Serializable
{
    private static final long serialVersionUID = 1L;
    
    public static atzp d(final Object o, final Object o2, final Object o3) {
        return new atzn(o, o2, o3);
    }
    
    public abstract Object a();
    
    public abstract Object b();
    
    public abstract Object c();
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof atzp) {
            final atzp atzp = (atzp)o;
            if (Objects.equals(this.a(), atzp.a()) && Objects.equals(this.b(), atzp.b()) && Objects.equals(this.c(), atzp.c())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a();
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = this.a().hashCode();
        }
        int hashCode3;
        if (this.b() == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = this.b().hashCode();
        }
        if (this.c() != null) {
            hashCode = this.c().hashCode();
        }
        return hashCode2 ^ hashCode3 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a());
        final String value2 = String.valueOf(this.b());
        final String value3 = String.valueOf(this.c());
        final StringBuilder sb = new StringBuilder("(");
        sb.append(value);
        sb.append(",");
        sb.append(value2);
        sb.append(",");
        sb.append(value3);
        sb.append(")");
        return sb.toString();
    }
}
