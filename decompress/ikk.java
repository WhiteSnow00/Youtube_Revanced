import j$.util.stream.Collectors;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.function.Supplier;
import java.util.function.Function;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikk implements ikl
{
    private final Context a;
    private final hzn b;
    private final aeea c;
    
    public ikk(final Context a, final hzn b, final aeea c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final WatchNextResponseModel a(final PlaybackStartDescriptor playbackStartDescriptor, final afeq afeq) {
        final ieb a = ieb.a(this.a, afeq);
        WatchNextResponseModel watchNextResponseModel;
        if (a.e.isEmpty()) {
            watchNextResponseModel = new WatchNextResponseModel(alem.a);
        }
        else {
            watchNextResponseModel = new WatchNextResponseModel((alem)this.b.D((idz)a.e.get(playbackStartDescriptor.a()), playbackStartDescriptor.i(), playbackStartDescriptor.a(), ahab.x(playbackStartDescriptor.x())).map((Function)new rcl(this, a, playbackStartDescriptor, 1)).orElseGet((Supplier)ihv.c));
        }
        return watchNextResponseModel;
    }
    
    public final WatchNextResponseModel b(final WatchNextResponseModel watchNextResponseModel, final PlaybackStartDescriptor playbackStartDescriptor, final afeq afeq) {
        final ieb a = ieb.a(this.a, afeq);
        final alem a2 = watchNextResponseModel.a;
        final String a3 = a.a;
        aiqj aiqj;
        if ((aiqj = a2.o) == null) {
            aiqj = aiqj.a;
        }
        Object o;
        if (((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
            aiqj aiqj2;
            if ((aiqj2 = a2.o) == null) {
                aiqj2 = aiqj.a;
            }
            final apsk apsk = (apsk)((ahbc)aiqj2).rx((ahaq)WatchEndpointOuterClass.watchEndpoint);
            final ahbb ahbb = (ahbb)((ahbh)a2).toBuilder();
            String e = a3;
            if ((apsk.b & 0x2) != 0x0) {
                e = apsk.e;
            }
            final String d = apsk.d;
            final int f = apsk.f;
            aiqj aiqj3;
            if ((aiqj3 = a2.o) == null) {
                aiqj3 = aiqj.a;
            }
            final aiqj c = aakr.C(e, d, f, aiqj3.c);
            ((ahaz)ahbb).copyOnWrite();
            final alem alem = (alem)ahbb.instance;
            c.getClass();
            alem.o = c;
            alem.b |= 0x1000;
            o = ahbb;
        }
        else {
            o = ((ahbh)a2).toBuilder();
        }
        aiqj aiqj4;
        if ((aiqj4 = ((alem)((ahbb)o).instance).w) == null) {
            aiqj4 = aiqj.a;
        }
        if (vdh.D((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((ahbc)aiqj4).rx((ahaq)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint))) {
            ((ahaz)o).copyOnWrite();
            final alem alem2 = (alem)((ahbb)o).instance;
            alem2.w = null;
            alem2.b &= 0xFFFBFFFF;
        }
        return new WatchNextResponseModel(this.d((alem)((ahaz)o).build(), a, playbackStartDescriptor));
    }
    
    public final WatchNextResponseModel c(final PlaybackStartDescriptor playbackStartDescriptor, final vfn vfn) {
        final Optional a = idz.a(vfn);
        if (a.isPresent()) {
            final Optional d = this.b.D((idz)a.get(), playbackStartDescriptor.i(), -1, ahab.x(playbackStartDescriptor.x()));
            if (d.isPresent()) {
                return new WatchNextResponseModel((alem)d.get());
            }
        }
        return new WatchNextResponseModel(alem.a);
    }
    
    public final alem d(final alem alem, final ieb ieb, final PlaybackStartDescriptor playbackStartDescriptor) {
        alen alen;
        if ((alen = alem.e) == null) {
            alen = alen.a;
        }
        alem alem2 = alem;
        if (alen.b == 51779735) {
            alen alen2;
            if ((alen2 = alem.e) == null) {
                alen2 = alen.a;
            }
            aled a;
            if (alen2.b == 51779735) {
                a = (aled)alen2.c;
            }
            else {
                a = aled.a;
            }
            final ahaz builder = ((ahbh)a).toBuilder();
            final Optional map = Optional.ofNullable((Object)this.b.E(ieb.class, anjb.class, ieb, afev.n("downloaded_playlist_selected_video_index", playbackStartDescriptor.a(), "watch_command_click_tracking_params", ahab.x(playbackStartDescriptor.x())))).map((Function)ifj.k);
            builder.getClass();
            map.ifPresent((Consumer)new iau(builder, 11));
            final ahaz builder2 = ((ahbh)aldz.a).createBuilder();
            final ahxm ai = this.c.aI(playbackStartDescriptor, (List)Collection$_EL.stream((Collection)ieb.e).map((Function)ifj.j).collect(Collectors.toList()));
            builder2.copyOnWrite();
            final aldz aldz = (aldz)builder2.instance;
            ai.getClass();
            aldz.c = ai;
            aldz.b = 46659098;
            final aldz e = (aldz)builder2.build();
            builder.copyOnWrite();
            final aled aled = (aled)builder.instance;
            e.getClass();
            aled.e = e;
            aled.b |= 0x4;
            final ahbb ahbb = (ahbb)((ahbh)alem).toBuilder();
            alen alen3;
            if ((alen3 = alem.e) == null) {
                alen3 = alen.a;
            }
            final ahaz builder3 = ((ahbh)alen3).toBuilder();
            builder3.copyOnWrite();
            final alen alen4 = (alen)builder3.instance;
            final aled c = (aled)builder.build();
            c.getClass();
            alen4.c = c;
            alen4.b = 51779735;
            ((ahaz)ahbb).copyOnWrite();
            final alem alem3 = (alem)ahbb.instance;
            final alen e2 = (alen)builder3.build();
            e2.getClass();
            alem3.e = e2;
            alem3.b |= 0x2;
            alem2 = (alem)((ahaz)ahbb).build();
        }
        return alem2;
    }
    
    public final WatchNextResponseModel e() {
        return new WatchNextResponseModel(alem.a);
    }
}
