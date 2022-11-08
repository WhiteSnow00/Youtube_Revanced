import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class izj extends CountDownTimer
{
    final /* synthetic */ izk a;
    
    public izj(final izk a, final long n) {
        this.a = a;
        super(n, 1000L);
    }
    
    public final void onFinish() {
        final izk a = this.a;
        a.d = 0L;
        a.a(sau.g);
    }
    
    public final void onTick(final long d) {
        this.a.d = d;
    }
}
