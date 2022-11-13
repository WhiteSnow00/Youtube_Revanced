// 
// Decompiled by Procyon v0.6.0
// 

public final class ambs implements vfu
{
    public static final vfv a;
    public final ambu b;
    
    static {
        a = new ambr();
    }
    
    public ambs(final ambu b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        final affr affr = new affr();
        this.getActiveSectionInfoModel();
        affr.j((Iterable)new affr().g());
        return affr.g();
    }
    
    public final ambq c() {
        return new ambq(((ahbh)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambs && ((ahbh)this.b).equals((Object)((ambs)o).b);
    }
    
    public final boolean f() {
        return (this.b.c & 0x40) != 0x0;
    }
    
    public final boolean g() {
        return (this.b.c & 0x4) != 0x0;
    }
    
    public Integer getActiveItemIndex() {
        return this.b.f;
    }
    
    public ambt getActiveSectionInfo() {
        ambt ambt;
        if ((ambt = this.b.h) == null) {
            ambt = ambt.a;
        }
        return ambt;
    }
    
    public ambp getActiveSectionInfoModel() {
        ambt ambt;
        if ((ambt = this.b.h) == null) {
            ambt = ambt.a;
        }
        return new ambp((ambt)((ahbh)ambt).toBuilder().build());
    }
    
    public String getActiveSyncId() {
        return this.b.j;
    }
    
    public ambv getCurrentSyncMode() {
        ambv ambv;
        if ((ambv = ambv.b(this.b.i)) == null) {
            ambv = ambv.a;
        }
        return ambv;
    }
    
    public String getPanelId() {
        return this.b.e;
    }
    
    public Boolean getSyncEnabled() {
        return this.b.g;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ambs.a;
    }
    
    public final boolean h() {
        return (this.b.c & 0x10) != 0x0;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MarkersEngagementPanelSyncEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
