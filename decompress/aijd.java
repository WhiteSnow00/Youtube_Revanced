// 
// Decompiled by Procyon v0.6.0
// 

public final class aijd implements vhc
{
    public static final vhd a;
    public final aije b;
    
    static {
        a = new aijc();
    }
    
    public aijd(final aije b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aijb(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aijd && ((ahcz)this.b).equals(((aijd)o).b);
    }
    
    public String getHandleEdit() {
        return this.b.d;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aijd.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ChannelHandleEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
