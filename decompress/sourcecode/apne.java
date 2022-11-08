// 
// Decompiled by Procyon v0.6.0
// 

public final class apne implements vdt
{
    public static final vdu a;
    public final apnf b;
    private final vdo c;
    
    static {
        a = new apnd();
    }
    
    public apne(final apnf b, final vdo c) {
        this.b = b;
        this.c = c;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        afds.j((Iterable)this.getViewCountModel().a());
        afds.j((Iterable)this.getShortViewCountModel().a());
        afds.j((Iterable)this.getExtraShortViewCountModel().a());
        afds.j((Iterable)this.getLiveStreamDateModel().a());
        return afds.g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apne && this.b.equals((Object)((apne)o).b);
    }
    
    public ajsq getExtraShortViewCount() {
        ajsq ajsq;
        if ((ajsq = this.b.h) == null) {
            ajsq = ajsq.a;
        }
        return ajsq;
    }
    
    public ajsn getExtraShortViewCountModel() {
        ajsq ajsq;
        if ((ajsq = this.b.h) == null) {
            ajsq = ajsq.a;
        }
        return ajsn.b(ajsq).E(this.c);
    }
    
    public ajsq getLiveStreamDate() {
        ajsq ajsq;
        if ((ajsq = this.b.j) == null) {
            ajsq = ajsq.a;
        }
        return ajsq;
    }
    
    public Integer getLiveStreamDateLength() {
        return this.b.k;
    }
    
    public ajsn getLiveStreamDateModel() {
        ajsq ajsq;
        if ((ajsq = this.b.j) == null) {
            ajsq = ajsq.a;
        }
        return ajsn.b(ajsq).E(this.c);
    }
    
    public ajsq getShortViewCount() {
        ajsq ajsq;
        if ((ajsq = this.b.f) == null) {
            ajsq = ajsq.a;
        }
        return ajsq;
    }
    
    public Integer getShortViewCountLength() {
        return this.b.g;
    }
    
    public ajsn getShortViewCountModel() {
        ajsq ajsq;
        if ((ajsq = this.b.f) == null) {
            ajsq = ajsq.a;
        }
        return ajsn.b(ajsq).E(this.c);
    }
    
    public vdu getType() {
        return apne.a;
    }
    
    public String getUnlabeledConcurrentViewers() {
        return this.b.i;
    }
    
    public ajsq getViewCount() {
        ajsq ajsq;
        if ((ajsq = this.b.d) == null) {
            ajsq = ajsq.a;
        }
        return ajsq;
    }
    
    public Integer getViewCountLength() {
        return this.b.e;
    }
    
    public ajsn getViewCountModel() {
        ajsq ajsq;
        if ((ajsq = this.b.d) == null) {
            ajsq = ajsq.a;
        }
        return ajsn.b(ajsq).E(this.c);
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
