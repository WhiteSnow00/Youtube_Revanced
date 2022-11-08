import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atkp implements Entry, atnq
{
    private final atks a;
    private final int b;
    
    public atkp(final atks a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof Entry) {
            final Entry entry = (Entry)o;
            if (atnh.c(entry.getKey(), this.getKey()) && atnh.c(entry.getValue(), this.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Object getKey() {
        return this.a.a[this.b];
    }
    
    @Override
    public final Object getValue() {
        final Object[] b = this.a.b;
        b.getClass();
        return b[this.b];
    }
    
    @Override
    public final int hashCode() {
        final Object key = this.getKey();
        int hashCode = 0;
        int hashCode2;
        if (key != null) {
            hashCode2 = key.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object value = this.getValue();
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final Object setValue(final Object o) {
        this.a.f();
        final Object[] j = this.a.j();
        final int b = this.b;
        final Object o2 = j[b];
        j[b] = o;
        return o2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getKey());
        sb.append('=');
        sb.append(this.getValue());
        return sb.toString();
    }
}
