import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentControllerImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvo implements tet
{
    public final ReelBrowseFragmentControllerImpl a;
    
    public gvo(final ReelBrowseFragmentControllerImpl a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        final ReelBrowseFragmentControllerImpl a = this.a;
        final BrowseResponseModel b = (BrowseResponseModel)o;
        if (a.c == null) {
            return;
        }
        a.h(a.b = b);
        a.a.c("br_r");
        if (b.f() != null) {
            final gvp c = a.c;
            final vgu f = b.f();
            final gvm gvm = (gvm)c;
            final ReelBrowseFragmentFeedController af = gvm.af;
            final Context ag = gvm.ag;
            final ahaz builder = ((ahbh)aorf.a).createBuilder();
            final anyv a2 = f.a;
            builder.copyOnWrite();
            final aorf aorf = (aorf)builder.instance;
            aorf.c = a2;
            aorf.b |= 0x1;
            final aorf k = (aorf)builder.build();
            final ahaz builder2 = ((ahbh)aorj.a).createBuilder();
            builder2.copyOnWrite();
            final aorj aorj = (aorj)builder2.instance;
            k.getClass();
            aorj.k = k;
            aorj.b |= 0x2000;
            af.h(ag, (List)afeq.r((Object)new zxn((aorj)builder2.build())), (adqs)null);
            gvm.ai.a();
        }
        else if (b.g() != null) {
            final gvp c2 = a.c;
            final afeq g = b.g();
            final gvm gvm2 = (gvm)c2;
            gvm2.af.h(gvm2.ag, (List)g, (adqs)null);
            gvm2.ai.a();
        }
        a.i(b);
        a.j(b);
        a.k(b);
        a.a.c("ol");
    }
}
