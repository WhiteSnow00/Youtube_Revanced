import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aear
{
    public static final aeby c;
    public aebd a;
    public final String b;
    
    static {
        c = new aeby("ReviewService", (byte[])null);
    }
    
    public aear(final Context context) {
        this.b = context.getPackageName();
        if (aecm.a(context)) {
            this.a = new aebd(context, aear.c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), (aeba)adzy.d, null, null, null);
        }
    }
}
