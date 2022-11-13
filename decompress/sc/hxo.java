import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxo implements hxn
{
    private final arkg a;
    private final arkg b;
    private final vai c;
    
    static {
        ttr.a("MDX.RemoteWatchPromptHelper");
    }
    
    public hxo(final vai c, final arkg a, final arkg b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a(final WatchDescriptor watchDescriptor, final cl cl) {
        String.format("isPromptBottomSheet=%b", this.c.r());
        if (this.c.r()) {
            final hxj hxj = new hxj();
            final Bundle bundle = new Bundle();
            bundle.putParcelable("watch", (Parcelable)watchDescriptor);
            hxj.ag(bundle);
            aepz.e((br)hxj, ((zlv)this.b.a()).a(((zmf)this.a.a()).c()));
            hxj.r(cl, (String)null);
            return;
        }
        final hxm hxm = new hxm();
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("watch", (Parcelable)watchDescriptor);
        hxm.ag(bundle2);
        hxm.r(cl, null);
    }
}
