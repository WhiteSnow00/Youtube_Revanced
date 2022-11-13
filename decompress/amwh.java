// 
// Decompiled by Procyon v0.6.0
// 

public final class amwh implements vfu
{
    public static final vfv a;
    private final amwi b;
    
    static {
        a = new amwg();
    }
    
    public amwh(final amwi b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new amwf(((ahbh)this.b).toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwh && ((ahbh)this.b).equals((Object)((amwh)o).b);
    }
    
    public Long getBytesDownloaded() {
        return this.b.f;
    }
    
    public apme getDownloadState() {
        apme apme;
        if ((apme = apme.b(this.b.e)) == null) {
            apme = apme.a;
        }
        return apme;
    }
    
    public Long getTotalBytes() {
        return this.b.g;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amwh.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OfflineVideoStatusEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
