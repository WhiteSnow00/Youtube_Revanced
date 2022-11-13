import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.LocalMediaGreenScreenControllerViewModel;
import com.google.apps.tiktok.dataservice.SubscriptionMixinViewModel;
import java.util.concurrent.Executor;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel;
import android.content.Context;
import com.google.android.libraries.youtube.metadataeditor.thumbnail.FrameSelectorVideoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class erf implements atke
{
    private final eqy a;
    private final int b;
    private final esz c;
    
    public erf(final eqy a, final esz c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final Object a() {
        final int b = this.b;
        if (b == 0) {
            return new FrameSelectorVideoViewModel((asid)this.a.dP.a());
        }
        if (b == 1) {
            return new FuturesMixinViewModel(this.c.a, (Context)this.a.c.a(), (Executor)this.a.f.a());
        }
        if (b != 2) {
            final oby oby = (oby)this.a.e.a();
            final Object a = this.a.aH.a();
            final afvt afvt = (afvt)this.a.f.a();
            final aent aent = (aent)a;
            return new SubscriptionMixinViewModel((Executor)afvt);
        }
        return new LocalMediaGreenScreenControllerViewModel();
    }
}
