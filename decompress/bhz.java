import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhz extends AudioTrack$StreamEventCallback
{
    final dfm a;
    
    public bhz(final dfm a, final byte[] array) {
        this.a = a;
    }
    
    public final void onDataRequest(final AudioTrack audioTrack, final int n) {
        if (!audioTrack.equals(((bia)this.a.c).f)) {
            return;
        }
        final bia bia = (bia)this.a.c;
        final bhh e = bia.e;
        if (e != null && bia.g) {
            e.b();
        }
    }
    
    public final void onTearDown(final AudioTrack audioTrack) {
        if (!audioTrack.equals(((bia)this.a.c).f)) {
            return;
        }
        final bia bia = (bia)this.a.c;
        final bhh e = bia.e;
        if (e != null && bia.g) {
            e.b();
        }
    }
}
