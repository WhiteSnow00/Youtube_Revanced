import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajes implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final ajeu c;
    
    static {
        a = new ajer();
    }
    
    public ajes(final ajeu c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        afds.j((Iterable)this.getThumbnailModel().a());
        final ajep playlistCollageThumbnailModel = this.getPlaylistCollageThumbnailModel();
        final afds afds2 = new afds();
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)playlistCollageThumbnailModel.b.c).iterator();
        while (iterator.hasNext()) {
            afcm.h(aoro.b(iterator.next()).J(playlistCollageThumbnailModel.a));
        }
        final afif d = afcm.g().D();
        while (((Iterator)d).hasNext()) {
            afds2.j((Iterable)((aoro)((Iterator)d).next()).a());
        }
        final afcm afcm2 = new afcm();
        final Iterator<Object> iterator2 = ((List<Object>)playlistCollageThumbnailModel.b.d).iterator();
        while (iterator2.hasNext()) {
            afcm2.h(aoro.b(iterator2.next()).J(playlistCollageThumbnailModel.a));
        }
        final afif d2 = afcm2.g().D();
        while (((Iterator)d2).hasNext()) {
            afds2.j((Iterable)((aoro)((Iterator)d2).next()).a());
        }
        afds.j((Iterable)afds2.g());
        final afif d3 = ((afcr)this.getBadgesModels()).D();
        while (((Iterator)d3).hasNext()) {
            final ahyc ahyc = (ahyc)((Iterator)d3).next();
            afds.j((Iterable)ahyc.a());
        }
        afds.j((Iterable)this.getChannelAvatarModel().a());
        return afds.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajes && this.c.equals(((ajes)o).c);
    }
    
    public List getBadges() {
        return (List)this.c.u;
    }
    
    public List getBadgesModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.c.u).iterator();
        while (iterator.hasNext()) {
            afcm.h(ahyc.b((ahyd)iterator.next()).n());
        }
        return (List)afcm.g();
    }
    
    public aorm getChannelAvatar() {
        aorm aorm;
        if ((aorm = this.c.v) == null) {
            aorm = aorm.a;
        }
        return aorm;
    }
    
    public aoro getChannelAvatarModel() {
        aorm aorm;
        if ((aorm = this.c.v) == null) {
            aorm = aorm.a;
        }
        return aoro.b(aorm).J(this.b);
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
    
    public ajet getPlaylistCollageThumbnail() {
        final ajeu c = this.c;
        ajet a;
        if (c.d == 19) {
            a = (ajet)c.e;
        }
        else {
            a = ajet.a;
        }
        return a;
    }
    
    public ajep getPlaylistCollageThumbnailModel() {
        final ajeu c = this.c;
        ajet a;
        if (c.d == 19) {
            a = (ajet)c.e;
        }
        else {
            a = ajet.a;
        }
        return new aglk(a.toBuilder()).u(this.b);
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
    
    public aorm getThumbnail() {
        final ajeu c = this.c;
        aorm a;
        if (c.d == 8) {
            a = (aorm)c.e;
        }
        else {
            a = aorm.a;
        }
        return a;
    }
    
    public aoro getThumbnailModel() {
        final ajeu c = this.c;
        aorm a;
        if (c.d == 8) {
            a = (aorm)c.e;
        }
        else {
            a = aorm.a;
        }
        return aoro.b(a).J(this.b);
    }
    
    public String getTitle() {
        return this.c.h;
    }
    
    public vdu getType() {
        return ajes.a;
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
