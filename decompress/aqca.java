// 
// Decompiled by Procyon v0.6.0
// 

public final class aqca implements vhc
{
    public static final vhd a;
    public final aqcb b;
    private final vgx c;
    
    static {
        a = new aqbz();
    }
    
    public aqca(final aqcb b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new aqby(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aqcb b = this.b;
        if ((b.c & 0x8) != 0x0) {
            afhi.h(b.f);
        }
        final aqcb b2 = this.b;
        if ((b2.c & 0x2000) != 0x0) {
            afhi.h(b2.p);
        }
        if (this.b.r.size() > 0) {
            afhi.j((Iterable)this.b.r);
        }
        final aqcb b3 = this.b;
        if ((b3.c & 0x8000) != 0x0) {
            afhi.h(b3.s);
        }
        afhi.j(this.getThumbnailModel().a());
        afhi.j(this.getDescriptionModel().a());
        afhi.j(this.getFormattedDescriptionModel().a());
        this.getLocalizedStringsModel();
        afhi.j(aqbw.a());
        return afhi.g();
    }
    
    public final apqb c() {
        final vgv c = this.c.c(this.b.p);
        boolean b = true;
        if (c != null) {
            b = (c instanceof apqb && b);
        }
        adme.U(b, "entityFromStore is not instance of VideoPlaybackPositionEntityModel, key=playbackPosition");
        return (apqb)c;
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqca && this.b.equals(((aqca)o).b);
    }
    
    public final aqax f() {
        final vgv c = this.c.c(this.b.f);
        boolean b = true;
        if (c != null) {
            b = (c instanceof aqax && b);
        }
        adme.U(b, "entityFromStore is not instance of YtMainChannelEntityModel, key=channelOwner");
        return (aqax)c;
    }
    
    public final String g() {
        return this.b.f;
    }
    
    public aqgs getDescription() {
        aqgs aqgs;
        if ((aqgs = this.b.k) == null) {
            aqgs = aqgs.a;
        }
        return aqgs;
    }
    
    public aqgm getDescriptionModel() {
        aqgs aqgs;
        if ((aqgs = this.b.k) == null) {
            aqgs = aqgs.a;
        }
        return aqgm.b(aqgs).n(this.c);
    }
    
    public Long getDislikeCount() {
        return this.b.o;
    }
    
    public ajws getFormattedDescription() {
        ajws ajws;
        if ((ajws = this.b.l) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getFormattedDescriptionModel() {
        ajws ajws;
        if ((ajws = this.b.l) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    public Integer getLengthSeconds() {
        return this.b.i;
    }
    
    public Long getLikeCount() {
        return this.b.n;
    }
    
    public aqbx getLocalizedStrings() {
        aqbx aqbx;
        if ((aqbx = this.b.q) == null) {
            aqbx = aqbx.a;
        }
        return aqbx;
    }
    
    public aqbw getLocalizedStringsModel() {
        aqbx aqbx;
        if ((aqbx = this.b.q) == null) {
            aqbx = aqbx.a;
        }
        return aqbw.b(aqbx).o();
    }
    
    public Long getPublishedTimestampMillis() {
        return this.b.h;
    }
    
    public aowb getThumbnail() {
        aowb aowb;
        if ((aowb = this.b.j) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getThumbnailModel() {
        aowb aowb;
        if ((aowb = this.b.j) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.c);
    }
    
    public String getTitle() {
        return this.b.g;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aqca.a;
    }
    
    public String getVideoId() {
        return this.b.e;
    }
    
    public Long getViewCount() {
        return this.b.m;
    }
    
    public final boolean h() {
        return (this.b.c & 0x80) != 0x0;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("YtMainVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
