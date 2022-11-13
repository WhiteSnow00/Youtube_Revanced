// 
// Decompiled by Procyon v0.6.0
// 

public final class aihe implements vfu
{
    public static final vfv a;
    private final vfp b;
    private final aihf c;
    
    static {
        a = new aihd();
    }
    
    public aihe(final aihf c, final vfp b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aihc(this.c.toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        affr.j((Iterable)this.getAvatarModel().a());
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aihe && this.c.equals((Object)((aihe)o).c);
    }
    
    public aotp getAvatar() {
        aotp aotp;
        if ((aotp = this.c.f) == null) {
            aotp = aotp.a;
        }
        return aotp;
    }
    
    public aotr getAvatarModel() {
        aotp aotp;
        if ((aotp = this.c.f) == null) {
            aotp = aotp.a;
        }
        return aotr.b(aotp).E(this.b);
    }
    
    public String getChannelId() {
        return this.c.d;
    }
    
    public Integer getSubscriberCount() {
        return this.c.h;
    }
    
    public String getTitle() {
        return this.c.e;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aihe.a;
    }
    
    public Integer getVideoCount() {
        return this.c.g;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("ChannelEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
