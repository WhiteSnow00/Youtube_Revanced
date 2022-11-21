import android.app.Notification$MediaStyle;
import android.app.Notification$Builder;
import android.support.v4.media.session.MediaSessionCompat$Token;

// 
// Decompiled by Procyon v0.6.0
// 

public class axo extends afv
{
    public int[] a;
    public MediaSessionCompat$Token f;
    
    public axo() {
        this.a = null;
    }
    
    @Override
    public void b(final afi afi) {
        final Notification$Builder b = ((agh)afi).b;
        final Notification$MediaStyle a = axl.a();
        axl.b(a, this.a, this.f);
        axl.d(b, a);
    }
}
