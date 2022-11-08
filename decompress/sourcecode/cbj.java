import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbj extends du
{
    final /* synthetic */ cbn d;
    
    public cbj(final cbn d) {
        this.d = d;
    }
    
    public final void a(final MediaMetadataCompat mediaMetadataCompat) {
        final cbn d = this.d;
        MediaDescriptionCompat b;
        if (mediaMetadataCompat == null) {
            b = null;
        }
        else {
            b = mediaMetadataCompat.b();
        }
        d.D = b;
        this.d.oC();
        this.d.oB(false);
    }
    
    public final void b(final PlaybackStateCompat c) {
        final cbn d = this.d;
        d.C = c;
        d.oB(false);
    }
    
    public final void c() {
        final cbn d = this.d;
        final eg v = d.V;
        if (v != null) {
            v.o((du)d.B);
            this.d.V = null;
        }
    }
}
