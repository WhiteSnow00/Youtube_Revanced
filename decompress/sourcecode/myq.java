import java.util.List;
import java.util.Collections;
import java.util.Collection;
import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.feedback.FeedbackOptions;
import android.util.Log;
import android.os.Bundle;
import com.google.android.gms.googlehelp.GoogleHelp;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myq implements Runnable
{
    private final long a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;
    
    public myq(final Context c, final GoogleHelp d, final long a, final int b) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public myq(final Context c, final nan d, final long a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public myq(final Runnable d, final atgt c, final long a, final int b) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        if (b == 0) {
            final Bundle bundle = new Bundle(1);
            try {
                final mwv mwv = new mwv();
                mwv.c();
                ((Context)this.c).getCacheDir();
                bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(mwv.a()));
            }
            catch (final Exception ex) {
                Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", (Throwable)ex);
                bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            }
            final FeedbackOptions a = FeedbackOptions.a();
            final mzf b2 = myp.b((Context)this.c);
            final Object d = this.d;
            final long a2 = this.a;
            final mpv c = ((mpr)b2).C;
            final myw myw = new myw(c, a, bundle, a2, (GoogleHelp)d);
            c.a((mqq)myw);
            kgk.aZ((mpy)myw);
            return;
        }
        if (b != 1) {
            if (!((atgt)this.c).c) {
                final long d2 = atgt.d(TimeUnit.MILLISECONDS);
                final long a3 = this.a;
                if (a3 > d2) {
                    try {
                        Thread.sleep(a3 - d2);
                    }
                    catch (final InterruptedException ex2) {
                        Thread.currentThread().interrupt();
                        aulo.r((Throwable)ex2);
                        return;
                    }
                }
                if (!((atgt)this.c).c) {
                    ((Runnable)this.d).run();
                }
            }
            return;
        }
        List<Pair> list;
        try {
            final mwv mwv2 = new mwv();
            mwv2.c();
            if ((list = ((nan)this.d).at()) == null) {
                list = new ArrayList<Pair>(1);
            }
            try {
                list.add(Pair.create((Object)"gms:feedback:async_feedback_psd_collection_time_ms", (Object)String.valueOf(mwv2.a())));
            }
            catch (final UnsupportedOperationException ex3) {
                final ArrayList list2 = new ArrayList<Pair>(list);
                list2.add(Pair.create((Object)"gms:feedback:async_feedback_psd_collection_time_ms", (Object)String.valueOf(mwv2.a())));
                list = (List<Pair>)list2;
            }
        }
        catch (final Exception ex4) {
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", (Throwable)ex4);
            list = Collections.singletonList(Pair.create((Object)"gms:feedback:async_feedback_psd_failure", (Object)"exception"));
        }
        kgk.aZ(mwq.b(mwq.e((Context)this.c).C, meo.r((List)list), this.a));
    }
}
