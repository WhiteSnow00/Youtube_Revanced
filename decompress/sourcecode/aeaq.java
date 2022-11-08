import com.google.android.play.core.review.ReviewInfo;
import android.app.PendingIntent;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeaq extends adzp
{
    public aeaq(final aear aear, final nmo nmo, final byte[] array) {
        new aeby("OnRequestInstallCallback", (byte[])null);
        super(aear, nmo, (byte[])null);
    }
    
    public final void a(final Bundle bundle) {
        super.a(bundle);
        this.b.e((Object)ReviewInfo.c((PendingIntent)bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
