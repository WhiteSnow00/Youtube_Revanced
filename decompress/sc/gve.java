import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gve implements tet
{
    public final SfvAudioItemPlaybackController a;
    public final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand b;
    public final PlaybackStartDescriptor c;
    public final ahab d;
    
    public gve(final SfvAudioItemPlaybackController a, final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand b, final PlaybackStartDescriptor c, final ahab d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final Object o) {
        final SfvAudioItemPlaybackController a = this.a;
        final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand b = this.b;
        final PlaybackStartDescriptor c = this.c;
        final ahab d = this.d;
        final akrb akrb = (akrb)o;
        if (a.n == null) {
            return;
        }
        aoej aoej;
        if ((aoej = akrb.k) == null) {
            aoej = aoej.a;
        }
        if ((aoej.b & 0x1) != 0x0) {
            aoej aoej2;
            if ((aoej2 = akrb.k) == null) {
                aoej2 = aoej.a;
            }
            a.o = SfvAudioItemPlaybackController.l(aoej2);
        }
        else {
            final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand n = a.n;
            if (n != null && !((List)n.e).isEmpty()) {
                a.o = a.g((List)a.n.e);
            }
            else {
                aoek aoek;
                if ((aoek = akrb.d) == null) {
                    aoek = aoek.a;
                }
                aoej aoej3;
                if ((aoej3 = aoek.c) == null) {
                    aoej3 = aoej.a;
                }
                aoej o2;
                if ((aoej3.b & 0x1) != 0x0) {
                    aoek aoek2;
                    if ((aoek2 = akrb.d) == null) {
                        aoek2 = aoek.a;
                    }
                    aoej aoej4;
                    if ((aoej4 = aoek2.c) == null) {
                        aoej4 = aoej.a;
                    }
                    o2 = SfvAudioItemPlaybackController.l(aoej4);
                }
                else {
                    o2 = SfvAudioItemPlaybackController.b;
                }
                a.o = o2;
            }
        }
        if (((List)akrb.f).isEmpty()) {
            zlm.b(zll.b, zlk.x, "Received empty audioRemixSourcesList.");
            a.o = SfvAudioItemPlaybackController.b;
        }
        else {
            final long a2 = ahey.a(ahey.d(((aoei)akrb.f.get(0)).d));
            if (a.o.c >= a2) {
                zlm.b(zll.b, zlk.x, "Received invalid start point in sfvAudioItemPlaybackController.");
                final ahaz builder = ((ahbh)a.o).toBuilder();
                builder.copyOnWrite();
                final aoej aoej5 = (aoej)builder.instance;
                aoej5.b |= 0x1;
                aoej5.c = 0L;
                a.o = (aoej)builder.build();
            }
            final aoej o3 = a.o;
            final long c2 = o3.c;
            ahan ahan;
            if ((ahan = o3.d) == null) {
                ahan = ahan.a;
            }
            if (c2 + ahey.a(ahan) > a2) {
                zlm.b(zll.b, zlk.x, "Start point and duration combo is invalid.");
                final ahaz builder2 = ((ahbh)a.o).toBuilder();
                final ahan b2 = ahey.b(a2 - a.o.c);
                builder2.copyOnWrite();
                final aoej aoej6 = (aoej)builder2.instance;
                b2.getClass();
                aoej6.d = b2;
                aoej6.b |= 0x2;
                a.o = (aoej)builder2.build();
            }
        }
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        final ahbf watchEndpoint = WatchEndpointOuterClass.watchEndpoint;
        final ahaz builder3 = apsk.a.createBuilder();
        final String c3 = b.c;
        builder3.copyOnWrite();
        final apsk apsk = (apsk)builder3.instance;
        c3.getClass();
        apsk.b |= 0x1;
        apsk.d = c3;
        final String i = akrb.i;
        builder3.copyOnWrite();
        final apsk apsk2 = (apsk)builder3.instance;
        i.getClass();
        apsk2.b |= 0x800;
        apsk2.m = i;
        ahbb.e((ahaq)watchEndpoint, (Object)builder3.build());
        final aiqj a3 = (aiqj)((ahaz)ahbb).build();
        final abjp e = c.e();
        e.a = a3;
        e.l = a.o.c;
        e.q = akrb.i;
        e.p = b.c;
        final PlaybackStartDescriptor a4 = e.a();
        a.i(d, a.o);
        a.d.d(a4);
    }
}
