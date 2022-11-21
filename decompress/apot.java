// 
// Decompiled by Procyon v0.6.0
// 

public final class apot implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final apou c;
    
    static {
        a = new apos();
    }
    
    public apot(final apou c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new apor(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final apou c = this.c;
        if ((c.b & 0x4) != 0x0) {
            afhi.h(c.e);
        }
        afhi.j(this.getThumbnailDetailsModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apot && this.c.equals(((apot)o).c);
    }
    
    public Integer getPercentDurationWatched() {
        return this.c.k;
    }
    
    public aowb getThumbnailDetails() {
        aowb aowb;
        if ((aowb = this.c.j) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getThumbnailDetailsModel() {
        aowb aowb;
        if ((aowb = this.c.j) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.b);
    }
    
    public Long getTimePublished() {
        return this.c.h;
    }
    
    public String getTitle() {
        return this.c.f;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return apot.a;
    }
    
    public String getVideoId() {
        return this.c.d;
    }
    
    public Integer getVideoLength() {
        return this.c.i;
    }
    
    public Long getViewCount() {
        return this.c.g;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("VideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
