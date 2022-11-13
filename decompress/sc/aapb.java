import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapb implements aapa
{
    public static final String a;
    private final vdr b;
    private final zmf c;
    private boolean d;
    private final vai e;
    
    static {
        a = vgl.h(ajch.b.a(), "sticky_video_quality_key");
    }
    
    public aapb(final vdr b, final zmf c, final vai e) {
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    private final ajcg g() {
        return (ajcg)((vfp)this.b.a(this.c.c())).f(aapb.a).af();
    }
    
    public final Optional a() {
        final ajcg g = this.g();
        if (g != null) {
            final ahaz builder = apsi.a.createBuilder();
            final int d = g.b.d;
            if (d == 2) {
                final int intValue = g.getStickyVideoQualityFixedResolution();
                builder.copyOnWrite();
                final apsi apsi = (apsi)builder.instance;
                apsi.b |= 0x1;
                apsi.c = intValue;
            }
            else {
                if (d != 3) {
                    return Optional.empty();
                }
                final apoc stickyVideoQualitySetting = g.getStickyVideoQualitySetting();
                builder.copyOnWrite();
                final apsi apsi2 = (apsi)builder.instance;
                apsi2.d = stickyVideoQualitySetting.e;
                apsi2.b |= 0x2;
            }
            return Optional.of((Object)builder.build());
        }
        return Optional.empty();
    }
    
    public final void b() {
        final vfw c = ((vfp)this.b.a(this.c.c())).c();
        c.g(aapb.a);
        c.b().U();
    }
    
    public final void c() {
        this.d = true;
    }
    
    public final void d() {
        this.d = true;
    }
    
    public final void e() {
        this.d = false;
    }
    
    public final boolean f(final PlaybackStartDescriptor playbackStartDescriptor, final abjj abjj) {
        if (!this.e.bf()) {
            return false;
        }
        if (playbackStartDescriptor != null && playbackStartDescriptor.s()) {
            return false;
        }
        if (!abjj.t()) {
            if (!abjj.k) {
                Label_0086: {
                    if (!this.d) {
                        if (playbackStartDescriptor != null) {
                            if (playbackStartDescriptor.r()) {
                                break Label_0086;
                            }
                            if (playbackStartDescriptor.q()) {
                                break Label_0086;
                            }
                        }
                        if (!abjv.c.equals((Object)abjj.g())) {
                            return false;
                        }
                    }
                }
                if (this.g() != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
