import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjy implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final ajka c;
    
    static {
        a = new ajjx();
    }
    
    public ajjy(final ajka c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajjw(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ajka c = this.c;
        if ((c.c & 0x100) != 0x0) {
            afhi.h(c.l);
        }
        afhi.j(this.getPlaylistThumbnailModel().a());
        final ajjv playlistCollageThumbnailModel = this.getPlaylistCollageThumbnailModel();
        final afhi afhi2 = new afhi();
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)playlistCollageThumbnailModel.b.c).iterator();
        while (iterator.hasNext()) {
            afgc.h(aowd.b((aowb)iterator.next()).p(playlistCollageThumbnailModel.a));
        }
        final aflv d = afgc.g().D();
        while (((Iterator)d).hasNext()) {
            afhi2.j(((aowd)((Iterator)d).next()).a());
        }
        final afgc afgc2 = new afgc();
        final Iterator<Object> iterator2 = ((List<Object>)playlistCollageThumbnailModel.b.d).iterator();
        while (iterator2.hasNext()) {
            afgc2.h(aowd.b((aowb)iterator2.next()).p(playlistCollageThumbnailModel.a));
        }
        final aflv d2 = afgc2.g().D();
        while (((Iterator)d2).hasNext()) {
            afhi2.j(((aowd)((Iterator)d2).next()).a());
        }
        afhi.j(afhi2.g());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajjy && this.c.equals(((ajjy)o).c);
    }
    
    public String getChannelOwnerName() {
        return this.c.i;
    }
    
    public String getLastSyncedTimeText() {
        return this.c.o;
    }
    
    public ajjz getPlaylistCollageThumbnail() {
        final ajka c = this.c;
        ajjz a;
        if (c.d == 7) {
            a = (ajjz)c.e;
        }
        else {
            a = ajjz.a;
        }
        return a;
    }
    
    public ajjv getPlaylistCollageThumbnailModel() {
        final ajka c = this.c;
        ajjz a;
        if (c.d == 7) {
            a = (ajjz)c.e;
        }
        else {
            a = ajjz.a;
        }
        return new aefs(a.toBuilder()).C(this.b);
    }
    
    public String getPlaylistId() {
        return this.c.g;
    }
    
    public aowb getPlaylistThumbnail() {
        final ajka c = this.c;
        aowb a;
        if (c.d == 6) {
            a = (aowb)c.e;
        }
        else {
            a = aowb.a;
        }
        return a;
    }
    
    public aowd getPlaylistThumbnailModel() {
        final ajka c = this.c;
        aowb a;
        if (c.d == 6) {
            a = (aowb)c.e;
        }
        else {
            a = aowb.a;
        }
        return aowd.b(a).p(this.b);
    }
    
    public String getShareText() {
        return this.c.m;
    }
    
    public String getTitle() {
        return this.c.h;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajjy.a;
    }
    
    public Integer getUiType() {
        return this.c.n;
    }
    
    public Integer getVideoCount() {
        return this.c.k;
    }
    
    public String getVideoCountText() {
        return this.c.j;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("DownloadsPagePlaylistEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
