import android.app.Activity;
import com.google.android.apps.youtube.app.application.Shell_LiveCreationActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evv implements aeho
{
    public final Shell_LiveCreationActivity a;
    public final guc b;
    private final rxr c;
    
    public evv(final Shell_LiveCreationActivity a, final guc b, final aegi aegi, final rxr c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        final aeht b2 = aehu.b((Activity)a);
        b2.b((Class)rkr.class);
        aegi.d(b2.a());
        aegi.c((aeho)this);
    }
    
    public final void d(final aeby aeby) {
        this.c.h(9, 2, 2);
    }
    
    public final void sR(final Throwable t) {
        this.c.i(9, t);
        this.a.finish();
    }
}
