import android.app.Activity;
import com.google.android.apps.youtube.app.application.Shell_UploadActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evz implements aeho
{
    private final Shell_UploadActivity a;
    private final rxr b;
    
    public evz(final Shell_UploadActivity a, final aegi aegi, final rxr b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        final aeht b2 = aehu.b((Activity)a);
        b2.b((Class)rkr.class);
        aegi.d(b2.a());
        aegi.c((aeho)this);
    }
    
    public final void d(final aeby aeby) {
        this.b.h(8, 2, 2);
    }
    
    public final void sR(final Throwable t) {
        this.b.i(8, t);
        this.a.finish();
    }
}
