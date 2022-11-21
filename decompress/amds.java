// 
// Decompiled by Procyon v0.6.0
// 

public final class amds implements vhc
{
    public static final vhd a;
    public final amdu b;
    
    static {
        a = new amdr();
    }
    
    public amds(final amdu b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        this.getActiveSectionInfoModel();
        afhi.j(new afhi().g());
        return afhi.g();
    }
    
    public final amdq c() {
        return new amdq(((ahcz)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amds && ((ahcz)this.b).equals(((amds)o).b);
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
    
    public amdt getActiveSectionInfo() {
        amdt amdt;
        if ((amdt = this.b.h) == null) {
            amdt = amdt.a;
        }
        return amdt;
    }
    
    public amdp getActiveSectionInfoModel() {
        amdt amdt;
        if ((amdt = this.b.h) == null) {
            amdt = amdt.a;
        }
        return new amdp((amdt)((ahcz)amdt).toBuilder().build());
    }
    
    public String getActiveSyncId() {
        return this.b.j;
    }
    
    public amdv getCurrentSyncMode() {
        amdv amdv;
        if ((amdv = amdv.b(this.b.i)) == null) {
            amdv = amdv.a;
        }
        return amdv;
    }
    
    public String getPanelId() {
        return this.b.e;
    }
    
    public Boolean getSyncEnabled() {
        return this.b.g;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amds.a;
    }
    
    public final boolean h() {
        return (this.b.c & 0x10) != 0x0;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
