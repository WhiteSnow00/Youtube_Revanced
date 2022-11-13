import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hns implements Runnable
{
    public final hnt a;
    public final ReelSequenceController$PendingContinuation b;
    public final akqr c;
    public final long d;
    
    public hns(final hnt a, final ReelSequenceController$PendingContinuation b, final akqr c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        this.a.e.a(this.b, this.c, this.d);
    }
}
