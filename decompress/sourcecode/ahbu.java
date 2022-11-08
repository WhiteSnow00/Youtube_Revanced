import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbu implements Entry, Comparable
{
    public final Comparable a;
    public Object b;
    final /* synthetic */ ahbx c;
    
    public ahbu(final ahbx c, final Comparable a, final Object b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    private static final boolean a(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            if (o2 == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)o;
        return a(this.a, entry.getKey()) && a(this.b, entry.getValue());
    }
    
    @Override
    public final Object getValue() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        final Comparable a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final Object setValue(final Object b) {
        this.c.g();
        final Object b2 = this.b;
        this.b = b;
        return b2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        return sb.toString();
    }
}
