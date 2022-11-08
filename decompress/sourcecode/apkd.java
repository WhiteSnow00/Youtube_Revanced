// 
// Decompiled by Procyon v0.6.0
// 

public final class apkd implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final apke c;
    
    static {
        a = new apkc();
    }
    
    public apkd(final apke c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final apke c = this.c;
        if ((c.b & 0x4) != 0x0) {
            afds.h(c.e);
        }
        afds.j((Iterable)this.getThumbnailDetailsModel().a());
        return afds.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apkd && this.c.equals(((apkd)o).c);
    }
    
    public Integer getPercentDurationWatched() {
        return this.c.k;
    }
    
    public aorm getThumbnailDetails() {
        aorm aorm;
        if ((aorm = this.c.j) == null) {
            aorm = aorm.a;
        }
        return aorm;
    }
    
    public aoro getThumbnailDetailsModel() {
        aorm aorm;
        if ((aorm = this.c.j) == null) {
            aorm = aorm.a;
        }
        return aoro.b(aorm).J(this.b);
    }
    
    public Long getTimePublished() {
        return this.c.h;
    }
    
    public String getTitle() {
        return this.c.f;
    }
    
    public vdu getType() {
        return apkd.a;
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
