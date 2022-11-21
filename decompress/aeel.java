import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeel
{
    public static final aefs c;
    public aeex a;
    public final String b;
    
    static {
        c = new aefs("ReviewService", null);
    }
    
    public aeel(final Context context) {
        this.b = context.getPackageName();
        if (aegg.a(context)) {
            this.a = new aeex(context, aeel.c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), aeds.d, null, null);
        }
    }
}
