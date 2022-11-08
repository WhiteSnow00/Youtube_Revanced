import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfm
{
    public final Context a;
    public final wwv b;
    public final aqyx c;
    
    public hfm() {
    }
    
    public hfm(final Context a, final wwv b, final aqyx c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hfm) {
            final hfm hfm = (hfm)o;
            if (this.a.equals(hfm.a) && this.b.equals(hfm.b)) {
                final aqyx c = this.c;
                final aqyx c2 = hfm.c;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                }
                else if (!c.equals((Object)c2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final aqyx c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("VideoIngestionUiData{context=");
        sb.append(value);
        sb.append(", interactionLogger=");
        sb.append(value2);
        sb.append(", visualSourceType=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
