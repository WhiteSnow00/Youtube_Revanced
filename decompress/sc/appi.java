// 
// Decompiled by Procyon v0.6.0
// 

public final class appi implements vfu
{
    public static final vfv a;
    public final appj b;
    private final vfp c;
    
    static {
        a = new apph();
    }
    
    public appi(final appj b, final vfp c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vfk a() {
        return new appg(this.b.toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        affr.j((Iterable)this.getViewCountModel().a());
        affr.j((Iterable)this.getShortViewCountModel().a());
        affr.j((Iterable)this.getExtraShortViewCountModel().a());
        affr.j((Iterable)this.getLiveStreamDateModel().a());
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof appi && this.b.equals((Object)((appi)o).b);
    }
    
    public ajut getExtraShortViewCount() {
        ajut ajut;
        if ((ajut = this.b.h) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public ajuq getExtraShortViewCountModel() {
        ajut ajut;
        if ((ajut = this.b.h) == null) {
            ajut = ajut.a;
        }
        return ajuq.b(ajut).j(this.c);
    }
    
    public ajut getLiveStreamDate() {
        ajut ajut;
        if ((ajut = this.b.j) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public Integer getLiveStreamDateLength() {
        return this.b.k;
    }
    
    public ajuq getLiveStreamDateModel() {
        ajut ajut;
        if ((ajut = this.b.j) == null) {
            ajut = ajut.a;
        }
        return ajuq.b(ajut).j(this.c);
    }
    
    public ajut getShortViewCount() {
        ajut ajut;
        if ((ajut = this.b.f) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public Integer getShortViewCountLength() {
        return this.b.g;
    }
    
    public ajuq getShortViewCountModel() {
        ajut ajut;
        if ((ajut = this.b.f) == null) {
            ajut = ajut.a;
        }
        return ajuq.b(ajut).j(this.c);
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return appi.a;
    }
    
    public String getUnlabeledConcurrentViewers() {
        return this.b.i;
    }
    
    public ajut getViewCount() {
        ajut ajut;
        if ((ajut = this.b.d) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public Integer getViewCountLength() {
        return this.b.e;
    }
    
    public ajuq getViewCountModel() {
        ajut ajut;
        if ((ajut = this.b.d) == null) {
            ajut = ajut.a;
        }
        return ajuq.b(ajut).j(this.c);
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
