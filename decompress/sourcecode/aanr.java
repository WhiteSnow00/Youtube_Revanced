import com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aanr extends aaqq
{
    public final ViewGroup i;
    public final Handler j;
    public aanq k;
    
    public aanr(final ViewGroup i, final Context context, final Handler j, final aasb aasb, final atjj atjj, final float n, final boolean b) {
        super(n, n, aasa.a(n, n, aaqq.m), aasb, atjj);
        this.i = i;
        (this.j = j).post((Runnable)new aanp(this, b, context, n, i));
    }
    
    public final void o(final foi foi) {
    }
    
    public final void rK() {
        this.j.post((Runnable)new aano(this, 0));
        super.rK();
    }
    
    public final void rM(final boolean l) {
        ((aaqh)this).l = l;
        this.j.post((Runnable)new a(this, l, 12));
    }
}
