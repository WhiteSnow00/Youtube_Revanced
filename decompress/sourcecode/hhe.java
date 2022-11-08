import android.widget.ProgressBar;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class hhe extends CountDownTimer
{
    final /* synthetic */ hhi a;
    
    public hhe(final hhi a, final long n) {
        this.a = a;
        super(n, 10L);
    }
    
    public final void onFinish() {
        this.a.aP();
    }
    
    public final void onTick(final long n) {
        final hhi a = this.a;
        final double n2 = (double)n;
        final double n3 = a.a;
        Double.isNaN(n2);
        Double.isNaN(n3);
        final double n4 = 1.0 - (1.0 - n2 / n3);
        final int integer = a.nZ().getInteger(2131493058);
        final ProgressBar aq = this.a.aq;
        final double n5 = integer;
        Double.isNaN(n5);
        aq.setProgress((int)((1.0 - n4 * n4) * n5));
    }
}
