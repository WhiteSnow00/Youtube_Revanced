// 
// Decompiled by Procyon v0.6.0
// 

public final class amam implements vfu
{
    public static final vfv a;
    public final aman b;
    private final vfp c;
    
    static {
        a = new amal();
    }
    
    public amam(final aman b, final vfp c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        final affr affr = new affr();
        final aman b = this.b;
        if ((b.c & 0x4) != 0x0) {
            affr.h(b.e);
        }
        if (this.b.g.size() > 0) {
            affr.j((Iterable)this.b.g);
        }
        return affr.g();
    }
    
    public final amak c() {
        return new amak((ahbb)((ahbh)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amam && ((ahbh)this.b).equals((Object)((amam)o).b);
    }
    
    public final ancy f() {
        final vfn b = this.c.b(this.b.e);
        boolean b2 = true;
        if (b != null) {
            b2 = (b instanceof ancy && b2);
        }
        adkp.R(b2, (Object)"entityFromStore is not instance of PlaybackDataEntityModel, key=playbackData");
        return (ancy)b;
    }
    
    public Long getAddedTimestampMillis() {
        return this.b.f;
    }
    
    public ahab getClickTrackingParams() {
        return this.b.i;
    }
    
    public Boolean getPendingApproval() {
        return this.b.h;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amam.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainVideoDownloadStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
