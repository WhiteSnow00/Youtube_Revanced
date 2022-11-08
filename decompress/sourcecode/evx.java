import android.app.Activity;
import com.google.android.apps.youtube.app.application.Shell_ResultsActivity;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evx implements aeho
{
    public final c a;
    private final Shell_ResultsActivity b;
    private final rxr c;
    
    public evx(final c a, final Shell_ResultsActivity b, final aegi aegi, final rxr c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        final aeht b2 = aehu.b((Activity)b);
        b2.b((Class)rkr.class);
        aegi.d(b2.a());
        aegi.c((aeho)this);
    }
    
    public final void d(final aeby aeby) {
        this.c.h(6, 2, 2);
    }
    
    public final void sR(final Throwable t) {
        this.c.i(6, t);
        this.b.finish();
    }
}
