import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afbv implements Entry
{
    public afbv() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof Entry) {
            final Entry entry = (Entry)o;
            if (adkp.ae(this.getKey(), entry.getKey()) && adkp.ae(this.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public abstract Object getKey();
    
    @Override
    public abstract Object getValue();
    
    @Override
    public final int hashCode() {
        final Object key = this.getKey();
        final Object value = this.getValue();
        int hashCode = 0;
        int hashCode2;
        if (key == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = key.hashCode();
        }
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public Object setValue(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getKey());
        sb.append("=");
        sb.append(this.getValue());
        return sb.toString();
    }
}
