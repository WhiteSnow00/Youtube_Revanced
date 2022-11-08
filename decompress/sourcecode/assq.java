import com.google.android.gms.feedback.FeedbackOptions;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class assq implements Runnable
{
    final long a;
    final Object b;
    private final /* synthetic */ int c;
    
    public assq(final long a, final atcp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public assq(final Context b, final long a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public assq(final aujq b, final long a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        if (c == 0) {
            ((aujq)this.b).e(this.a);
            return;
        }
        if (c != 1) {
            final Object b = this.b;
            final long a = this.a;
            final atcp atcp = (atcp)b;
            if (atcp.f.compareAndSet(a, Long.MAX_VALUE)) {
                asjg.b(atcp.g);
                final ashh h = atcp.h;
                atcp.h = null;
                h.aJ((ashj)new atay(atcp.a, (AtomicReference)b, 2));
                atcp.d.dispose();
            }
            return;
        }
        final Bundle bundle = new Bundle(1);
        try {
            final mwv mwv = new mwv();
            mwv.c();
            ((Context)this.b).getCacheDir();
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(mwv.a()));
        }
        catch (final Exception ex) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", (Throwable)ex);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        kgk.aZ(mwq.a(mwq.e((Context)this.b).C, FeedbackOptions.a(), bundle, this.a));
    }
}
