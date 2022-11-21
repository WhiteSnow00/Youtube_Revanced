// 
// Decompiled by Procyon v0.6.0
// 

public final class airy implements vhc
{
    public static final vhd a;
    public final airz b;
    private final vgx c;
    
    static {
        a = new airx();
    }
    
    public airy(final airz b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new airw(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getCommandModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof airy && this.b.equals(((airy)o).b);
    }
    
    public aisc getCommand() {
        aisc aisc;
        if ((aisc = this.b.d) == null) {
            aisc = aisc.a;
        }
        return aisc;
    }
    
    public aisb getCommandModel() {
        aisc aisc;
        if ((aisc = this.b.d) == null) {
            aisc = aisc.a;
        }
        return aisb.b(aisc).F(this.c);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return airy.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CommandEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
