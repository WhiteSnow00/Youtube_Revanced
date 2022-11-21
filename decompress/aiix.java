// 
// Decompiled by Procyon v0.6.0
// 

public final class aiix implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final aiiy c;
    
    static {
        a = new aiiw();
    }
    
    public aiix(final aiiy c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aiiv(((ahcz)this.c).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getAvatarModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiix && ((ahcz)this.c).equals(((aiix)o).c);
    }
    
    public aowb getAvatar() {
        aowb aowb;
        if ((aowb = this.c.f) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getAvatarModel() {
        aowb aowb;
        if ((aowb = this.c.f) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.b);
    }
    
    public String getChannelId() {
        return this.c.d;
    }
    
    public Integer getSubscriberCount() {
        return this.c.h;
    }
    
    public String getTitle() {
        return this.c.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aiix.a;
    }
    
    public Integer getVideoCount() {
        return this.c.g;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("ChannelEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
