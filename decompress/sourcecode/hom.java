import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hom
{
    public final boolean a;
    public final afcr b;
    public final anqy c;
    
    public hom() {
    }
    
    public hom(final boolean a, final afcr b, final anqy c) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null topBarButtons");
    }
    
    public static hom a(final boolean b, final afcr afcr, final anqy anqy) {
        return new hom(b, afcr, anqy);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hom) {
            final hom hom = (hom)o;
            if (this.a == hom.a && adwd.ar((List)this.b, hom.b)) {
                final anqy c = this.c;
                final anqy c2 = hom.c;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                }
                else if (!((agzi)c).equals((Object)c2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final int hashCode = this.b.hashCode();
        final anqy c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((agzi)c).hashCode();
        }
        return ((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("ShortsTopBarModel{shouldShowTopBar=");
        sb.append(a);
        sb.append(", topBarButtons=");
        sb.append(value);
        sb.append(", contextualHeaderRenderer=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
