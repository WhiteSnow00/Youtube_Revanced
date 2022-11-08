import android.os.Bundle;
import java.util.List;
import java.util.Collections;
import android.util.Log;
import java.util.Collection;
import android.util.Pair;
import java.util.ArrayList;
import com.google.android.gms.googlehelp.GoogleHelp;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myr implements Runnable
{
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final nan d;
    
    public myr(final Context a, final GoogleHelp b, final nan d, final long c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final void run() {
        List<Pair> list;
        try {
            final mwv mwv = new mwv();
            mwv.c();
            if ((list = this.d.at()) == null) {
                list = new ArrayList<Pair>(1);
            }
            try {
                list.add(Pair.create((Object)"gms:feedback:async_feedback_psd_collection_time_ms", (Object)String.valueOf(mwv.a())));
            }
            catch (final UnsupportedOperationException ex) {
                final ArrayList list2 = new ArrayList<Pair>(list);
                list2.add(Pair.create((Object)"gms:feedback:async_feedback_psd_collection_time_ms", (Object)String.valueOf(mwv.a())));
                list = (List<Pair>)list2;
            }
        }
        catch (final Exception ex2) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", (Throwable)ex2);
            list = Collections.singletonList(Pair.create((Object)"gms:feedback:async_feedback_psd_failure", (Object)"exception"));
        }
        final mzf b = myp.b(this.a);
        final GoogleHelp b2 = this.b;
        final Bundle r = meo.r((List)list);
        final long c = this.c;
        final mpv c2 = ((mpr)b).C;
        final myu myu = new myu(c2, r, c, b2);
        c2.a((mqq)myu);
        kgk.aZ((mpy)myu);
    }
}
