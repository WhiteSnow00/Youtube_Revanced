// 
// Decompiled by Procyon v0.6.0
// 

public final class agke implements agki
{
    private final int a;
    private final agkh b;
    
    public agke(final int a, final agkh b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final Class annotationType() {
        return agki.class;
    }
    
    public final agkh b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof agki)) {
            return false;
        }
        final agki agki = (agki)o;
        return this.a == agki.a() && this.b.equals((Object)agki.b());
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
