// 
// Decompiled by Procyon v0.6.0
// 

public final class naa
{
    public final aexq a;
    private final aexq b;
    private final aexq c;
    private final aexq d;
    private final aexq e;
    
    public naa() {
    }
    
    public naa(final aexq b, final aexq a, final aexq c, final aexq d, final aexq e) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof naa) {
            final naa naa = (naa)o;
            if (this.b.equals((Object)naa.b) && this.a.equals((Object)naa.a) && this.c.equals((Object)naa.c) && this.d.equals((Object)naa.d) && this.e.equals((Object)naa.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.b.hashCode() ^ 0xF4243) * 1000003 ^ this.a.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.a);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("ValidatedEnforcementDecision{failureReason=");
        sb.append(value);
        sb.append(", enforcementDecision=");
        sb.append(value2);
        sb.append(", enforcementResponse=");
        sb.append(value3);
        sb.append(", responseUuid=");
        sb.append(value4);
        sb.append(", provisionalState=");
        sb.append(value5);
        sb.append("}");
        return sb.toString();
    }
}
