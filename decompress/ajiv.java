import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiv implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final ajix c;
    
    static {
        a = new ajiu();
    }
    
    public ajiv(final ajix c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajit(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getThumbnailModel().a());
        final ajis playlistCollageThumbnailModel = this.getPlaylistCollageThumbnailModel();
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
        final aflv d3 = ((afgh)this.getBadgesModels()).D();
        while (((Iterator)d3).hasNext()) {
            final aibt aibt = (aibt)((Iterator)d3).next();
            afhi.j(aibt.a());
        }
        afhi.j(this.getChannelAvatarModel().a());
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
        return o instanceof ajiv && this.c.equals(((ajiv)o).c);
    }
    
    public List getBadges() {
        return (List)this.c.u;
    }
    
    public List getBadgesModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.u).iterator();
        while (iterator.hasNext()) {
            afgc.h(aibt.b(iterator.next()).y());
        }
        return afgc.g();
    }
    
    public aowb getChannelAvatar() {
        aowb aowb;
        if ((aowb = this.c.v) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getChannelAvatarModel() {
        aowb aowb;
        if ((aowb = this.c.v) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.b);
    }
    
    public String getChannelOwner() {
        return this.c.i;
    }
    
    public Boolean getIsPlaylist() {
        return this.c.m;
    }
    
    public String getLastSyncedTimeText() {
        return this.c.q;
    }
    
    public Integer getPlaybackPositionSeconds() {
        return this.c.l;
    }
    
    public ajiw getPlaylistCollageThumbnail() {
        final ajix c = this.c;
        ajiw a;
        if (c.d == 19) {
            a = (ajiw)c.e;
        }
        else {
            a = ajiw.a;
        }
        return a;
    }
    
    public ajis getPlaylistCollageThumbnailModel() {
        final ajix c = this.c;
        ajiw a;
        if (c.d == 19) {
            a = (ajiw)c.e;
        }
        else {
            a = ajiw.a;
        }
        return new agpd(a.toBuilder()).B(this.b);
    }
    
    public String getPlaylistId() {
        return this.c.n;
    }
    
    public Integer getPlaylistVideoCount() {
        return this.c.p;
    }
    
    public String getPlaylistVideoCountText() {
        return this.c.o;
    }
    
    public String getPublishedTimeText() {
        return this.c.t;
    }
    
    public aowb getThumbnail() {
        final ajix c = this.c;
        aowb a;
        if (c.d == 8) {
            a = (aowb)c.e;
        }
        else {
            a = aowb.a;
        }
        return a;
    }
    
    public aowd getThumbnailModel() {
        final ajix c = this.c;
        aowb a;
        if (c.d == 8) {
            a = (aowb)c.e;
        }
        else {
            a = aowb.a;
        }
        return aowd.b(a).p(this.b);
    }
    
    public String getTitle() {
        return this.c.h;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajiv.a;
    }
    
    public Integer getUiType() {
        return this.c.r;
    }
    
    public String getVideoId() {
        return this.c.g;
    }
    
    public String getVideoLengthAccessibilityText() {
        return this.c.k;
    }
    
    public Integer getVideoLengthSeconds() {
        return this.c.j;
    }
    
    public String getViewCountText() {
        return this.c.s;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("DownloadedVideoWithContextEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
