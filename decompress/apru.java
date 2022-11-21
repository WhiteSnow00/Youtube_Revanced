// 
// Decompiled by Procyon v0.6.0
// 

public final class apru implements vhc
{
    public static final vhd a;
    public final aprv b;
    private final vgx c;
    
    static {
        a = new aprt();
    }
    
    public apru(final aprv b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new aprs(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getViewCountModel().a());
        afhi.j(this.getShortViewCountModel().a());
        afhi.j(this.getExtraShortViewCountModel().a());
        afhi.j(this.getLiveStreamDateModel().a());
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
        return o instanceof apru && this.b.equals(((apru)o).b);
    }
    
    public ajws getExtraShortViewCount() {
        ajws ajws;
        if ((ajws = this.b.h) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getExtraShortViewCountModel() {
        ajws ajws;
        if ((ajws = this.b.h) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    public ajws getLiveStreamDate() {
        ajws ajws;
        if ((ajws = this.b.j) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public Integer getLiveStreamDateLength() {
        return this.b.k;
    }
    
    public ajwp getLiveStreamDateModel() {
        ajws ajws;
        if ((ajws = this.b.j) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    public ajws getShortViewCount() {
        ajws ajws;
        if ((ajws = this.b.f) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public Integer getShortViewCountLength() {
        return this.b.g;
    }
    
    public ajwp getShortViewCountModel() {
        ajws ajws;
        if ((ajws = this.b.f) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return apru.a;
    }
    
    public String getUnlabeledConcurrentViewers() {
        return this.b.i;
    }
    
    public ajws getViewCount() {
        ajws ajws;
        if ((ajws = this.b.d) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public Integer getViewCountLength() {
        return this.b.e;
    }
    
    public ajwp getViewCountModel() {
        ajws ajws;
        if ((ajws = this.b.d) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ViewCountEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
