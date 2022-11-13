// 
// Decompiled by Procyon v0.6.0
// 

public final class ancy implements vfu
{
    public static final vfv a;
    public final vfp b;
    public final ancz c;
    
    static {
        a = new ancx();
    }
    
    public ancy(final ancz c, final vfp b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.g();
    }
    
    public final afft b() {
        final affr affr = new affr();
        final ancz c = this.c;
        if ((c.c & 0x20) != 0x0) {
            affr.h(c.i);
        }
        if (this.c.j.size() > 0) {
            affr.j((Iterable)this.c.j);
        }
        final ancz c2 = this.c;
        if ((c2.c & 0x40) != 0x0) {
            affr.h(c2.k);
        }
        final ancz c3 = this.c;
        if ((c3.c & 0x80) != 0x0) {
            affr.h(c3.m);
        }
        return affr.g();
    }
    
    public final ajjv c() {
        final vfn b = this.b.b(this.c.k);
        boolean b2 = true;
        if (b != null) {
            b2 = (b instanceof ajjv && b2);
        }
        adkp.R(b2, (Object)"entityFromStore is not instance of DrmLicenseEntityModel, key=drmLicense");
        return (ajjv)b;
    }
    
    public final byte[] d() {
        return ((agzk)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ancy && ((ahbh)this.c).equals((Object)((ancy)o).c);
    }
    
    public final amwb f() {
        final vfn b = this.b.b(this.c.m);
        boolean b2 = true;
        if (b != null) {
            b2 = (b instanceof amwb && b2);
        }
        adkp.R(b2, (Object)"entityFromStore is not instance of OfflineVideoPolicyEntityModel, key=offlineVideoPolicy");
        return (amwb)b;
    }
    
    public final ancw g() {
        return new ancw((ahbb)((ahbh)this.c).toBuilder());
    }
    
    public ahab getPlayerResponseBytes() {
        return this.c.e;
    }
    
    public String getPlayerResponseJson() {
        return this.c.f;
    }
    
    public Long getPlayerResponseTimestamp() {
        return this.c.g;
    }
    
    public Long getStreamDownloadTimestampSeconds() {
        return this.c.h;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ancy.a;
    }
    
    public final aoxc h() {
        final vfn b = this.b.b(this.c.i);
        boolean b2 = true;
        if (b != null) {
            b2 = (b instanceof aoxc && b2);
        }
        adkp.R(b2, (Object)"entityFromStore is not instance of TransferEntityModel, key=transfer");
        return (aoxc)b;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.c).hashCode() ^ 0xF6181;
    }
    
    public final boolean i() {
        return (this.c.c & 0x2) != 0x0;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("PlaybackDataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
