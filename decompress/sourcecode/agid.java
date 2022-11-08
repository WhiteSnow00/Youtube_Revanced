// 
// Decompiled by Procyon v0.6.0
// 

public final class agid implements agih
{
    private final int a;
    private final agig b;
    
    public agid(final int a, final agig b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final Class annotationType() {
        return agih.class;
    }
    
    public final agig b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof agih)) {
            return false;
        }
        final agih agih = (agih)o;
        return this.a == agih.a() && this.b.equals((Object)agih.b());
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xDE0D66) + (this.b.hashCode() ^ 0x79AD669E);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf(tag=");
        sb.append(this.a);
        sb.append("intEncoding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
