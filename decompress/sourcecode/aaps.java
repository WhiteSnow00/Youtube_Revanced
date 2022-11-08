import com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaps extends aaqq
{
    public final ViewGroup i;
    public final Handler j;
    public aapr k;
    
    public aaps(final Context context, final ViewGroup i, final float n, final float n2, final aasb aasb, final atjj atjj) {
        super(n, n2, aasa.a(1.0f, 1.0f, aaqq.m), aasb, atjj);
        this.i = i;
        ((aann)this).sT(n, n2, 0.0f);
        (this.j = new Handler(Looper.getMainLooper())).post((Runnable)new aaqv(this, context, n, n2, i, 1));
    }
    
    public final void rK() {
        if (this.k != null) {
            this.j.post((Runnable)new aano(this, 9));
        }
        super.rK();
    }
    
    public final void rM(final boolean l) {
        ((aaqh)this).l = l;
        if (this.k != null) {
            this.j.post((Runnable)new a(this, l, 13));
        }
    }
}
