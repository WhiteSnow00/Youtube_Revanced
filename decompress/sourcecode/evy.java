import android.content.Intent;
import android.app.Activity;
import com.google.android.apps.youtube.app.application.Shell_SettingsActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evy implements aeho
{
    public final bx a;
    private final Shell_SettingsActivity b;
    private final rxr c;
    private final tdg d;
    
    public evy(final bx a, final Shell_SettingsActivity b, final aegi aegi, final rxr c, final tdg d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final aeht b2 = aehu.b((Activity)b);
        b2.b((Class)rkr.class);
        aegi.d(b2.a());
        aegi.c((aeho)this);
    }
    
    public final void d(final aeby aeby) {
        this.c.h(10, 2, 2);
        final Intent h = ((evt)this.b).h();
        aehb.a(h, aeby.i());
        ((evt)this.b).k(h);
    }
    
    public final void sR(final Throwable t) {
        this.d.r("Shell.SettingsActivityPeer", t, 10, (Activity)this.b);
    }
}
