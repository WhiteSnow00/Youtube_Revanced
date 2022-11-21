// 
// Decompiled by Procyon v0.6.0
// 

public final class aqax implements vhc
{
    public static final vhd a;
    public final aqay b;
    private final vgx c;
    
    static {
        a = new aqaw();
    }
    
    public aqax(final aqay b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new aqav(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getAvatarModel().a());
        return afhi.g();
    }
    
    public final boolean c() {
        return (this.b.c & 0x10) != 0x0;
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqax && this.b.equals(((aqax)o).b);
    }
    
    public aowb getAvatar() {
        aowb aowb;
        if ((aowb = this.b.g) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getAvatarModel() {
        aowb aowb;
        if ((aowb = this.b.g) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.c);
    }
    
    public String getChannelId() {
        return this.b.e;
    }
    
    public String getTitle() {
        return this.b.f;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aqax.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("YtMainChannelEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
