import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class jah extends CountDownTimer
{
    final jai a;
    
    public jah(final jai a, final long n) {
        this.a = a;
        super(n, 1000L);
    }
    
    public final void onFinish() {
        final jai a = this.a;
        a.d = 0L;
        a.a(scz.g);
    }
    
    public final void onTick(final long d) {
        this.a.d = d;
    }
}
