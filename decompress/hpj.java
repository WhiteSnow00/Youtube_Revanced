import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpj
{
    public final boolean a;
    public final afeq b;
    public final antb c;
    
    public hpj() {
    }
    
    public hpj(final boolean a, final afeq b, final antb c) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null topBarButtons");
    }
    
    public static hpj a(final boolean b, final afeq afeq, final antb antb) {
        return new hpj(b, afeq, antb);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hpj) {
            final hpj hpj = (hpj)o;
            if (this.a == hpj.a && agpi.V((List)this.b, (Object)hpj.b)) {
                final antb c = this.c;
                final antb c2 = hpj.c;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                }
                else if (!((ahbh)c).equals((Object)c2)) {
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
        final antb c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((ahbh)c).hashCode();
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
