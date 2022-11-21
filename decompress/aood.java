// 
// Decompiled by Procyon v0.6.0
// 

public final class aood implements vhc
{
    public static final vhd a;
    private final aooe b;
    
    static {
        a = new aooc();
    }
    
    public aood(final aooe b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aoob(this.b.toBuilder());
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
        return o instanceof aood && this.b.equals(((aood)o).b);
    }
    
    public alww getConnectionState() {
        alww alww;
        if ((alww = alww.b(this.b.d)) == null) {
            alww = alww.a;
        }
        return alww;
    }
    
    public Boolean getHidden() {
        return this.b.e;
    }
    
    public Boolean getMuted() {
        return this.b.f;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aood.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("StreamStatusDataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
