import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbn extends du
{
    final cbr d;
    
    public cbn(final cbr d) {
        this.d = d;
    }
    
    public final void a(final MediaMetadataCompat mediaMetadataCompat) {
        final cbr d = this.d;
        MediaDescriptionCompat b;
        if (mediaMetadataCompat == null) {
            b = null;
        }
        else {
            b = mediaMetadataCompat.b();
        }
        d.D = b;
        this.d.oA();
        this.d.oz(false);
    }
    
    public final void b(final PlaybackStateCompat c) {
        final cbr d = this.d;
        d.C = c;
        d.oz(false);
    }
    
    public final void c() {
        final cbr d = this.d;
        final eg v = d.V;
        if (v != null) {
            v.o((du)d.B);
            this.d.V = null;
        }
    }
}
