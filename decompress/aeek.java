import com.google.android.play.core.review.ReviewInfo;
import android.app.PendingIntent;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeek extends aedj
{
    public aeek(final aeel aeel, final noj noj, final byte[] array) {
        new aefs("OnRequestInstallCallback", null);
        super(aeel, noj, (byte[])null);
    }
    
    public final void a(final Bundle bundle) {
        super.a(bundle);
        this.b.d((Object)ReviewInfo.c((PendingIntent)bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
