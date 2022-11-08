import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwq
{
    public static final Status a;
    public static final lzh b;
    private static final kgk c;
    private static final kgk d;
    
    static {
        a = new Status(13);
        b = new lzh("Feedback.API", c = (kgk)new mwk(), d = new kgk(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static mpy a(final mpv mpv, final FeedbackOptions feedbackOptions, final Bundle bundle, final long n) {
        final mwo mwo = new mwo(mpv, feedbackOptions, bundle, n);
        mpv.a((mqq)mwo);
        return (mpy)mwo;
    }
    
    public static mpy b(final mpv mpv, final Bundle bundle, final long n) {
        final mwn mwn = new mwn(mpv, bundle, n);
        mpv.a((mqq)mwn);
        return (mpy)mwn;
    }
    
    @Deprecated
    public static mpy c(final mpv mpv, final FeedbackOptions feedbackOptions) {
        final mwm mwm = new mwm(mpv, feedbackOptions);
        mpv.a((mqq)mwm);
        return (mpy)mwm;
    }
    
    @Deprecated
    public static mpy d(final mpv mpv, final FeedbackOptions feedbackOptions) {
        final mwl mwl = new mwl(mpv, feedbackOptions, ((mrh)mpv).a.w, System.nanoTime());
        mpv.a((mqq)mwl);
        return (mpy)mwl;
    }
    
    public static mpr e(final Context context) {
        return new mpr(context);
    }
}
