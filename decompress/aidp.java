// 
// Decompiled by Procyon v0.6.0
// 

public final class aidp implements vhc
{
    public static final vhd a;
    private final aidq b;
    
    static {
        a = new aidn();
    }
    
    public aidp(final aidq b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aido(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aidp && this.b.equals(((aidp)o).b);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aidp.a;
    }
    
    public Boolean getValue() {
        return this.b.d;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("BooleanEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
