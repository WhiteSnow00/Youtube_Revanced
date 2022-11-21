import com.google.android.gms.feedback.FeedbackOptions;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aswb implements Runnable
{
    final long a;
    final Object b;
    private final int c;
    
    public aswb(final long a, final atge b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aswb(final Context b, final long a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aswb(final aunb b, final long a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        if (c == 0) {
            ((aunb)this.b).e(this.a);
            return;
        }
        if (c != 1) {
            final Object b = this.b;
            final long a = this.a;
            final atge atge = (atge)b;
            if (atge.f.compareAndSet(a, Long.MAX_VALUE)) {
                asmr.b(atge.g);
                final asks h = atge.h;
                atge.h = null;
                h.aP(new atem(atge.a, (AtomicReference)b, 2));
                atge.d.dispose();
            }
            return;
        }
        final Bundle bundle = new Bundle(1);
        try {
            final myp myp = new myp();
            myp.c();
            ((Context)this.b).getCacheDir();
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(myp.a()));
        }
        catch (final Exception ex) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", (Throwable)ex);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        kht.aZ(myk.a(myk.e((Context)this.b).C, FeedbackOptions.a(), bundle, this.a));
    }
}
