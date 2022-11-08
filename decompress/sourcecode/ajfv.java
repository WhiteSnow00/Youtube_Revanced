import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfv implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final ajfx c;
    
    static {
        a = new ajfu();
    }
    
    public ajfv(final ajfx c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final ajfx c = this.c;
        if ((c.c & 0x100) != 0x0) {
            afds.h(c.l);
        }
        afds.j((Iterable)this.getPlaylistThumbnailModel().a());
        final ajfs playlistCollageThumbnailModel = this.getPlaylistCollageThumbnailModel();
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
        return o instanceof ajfv && this.c.equals(((ajfv)o).c);
    }
    
    public String getChannelOwnerName() {
        return this.c.i;
    }
    
    public String getLastSyncedTimeText() {
        return this.c.o;
    }
    
    public ajfw getPlaylistCollageThumbnail() {
        final ajfx c = this.c;
        ajfw a;
        if (c.d == 7) {
            a = (ajfw)c.e;
        }
        else {
            a = ajfw.a;
        }
        return a;
    }
    
    public ajfs getPlaylistCollageThumbnailModel() {
        final ajfx c = this.c;
        ajfw a;
        if (c.d == 7) {
            a = (ajfw)c.e;
        }
        else {
            a = ajfw.a;
        }
        return new aglk(a.toBuilder()).H(this.b);
    }
    
    public String getPlaylistId() {
        return this.c.g;
    }
    
    public aorm getPlaylistThumbnail() {
        final ajfx c = this.c;
        aorm a;
        if (c.d == 6) {
            a = (aorm)c.e;
        }
        else {
            a = aorm.a;
        }
        return a;
    }
    
    public aoro getPlaylistThumbnailModel() {
        final ajfx c = this.c;
        aorm a;
        if (c.d == 6) {
            a = (aorm)c.e;
        }
        else {
            a = aorm.a;
        }
        return aoro.b(a).J(this.b);
    }
    
    public String getShareText() {
        return this.c.m;
    }
    
    public String getTitle() {
        return this.c.h;
    }
    
    public vdu getType() {
        return ajfv.a;
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
