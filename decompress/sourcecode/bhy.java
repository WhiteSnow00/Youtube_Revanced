import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhy extends AudioTrack$StreamEventCallback
{
    final /* synthetic */ dfl a;
    
    public bhy(final dfl a, final byte[] array) {
        this.a = a;
    }
    
    public final void onDataRequest(final AudioTrack audioTrack, final int n) {
        if (!audioTrack.equals(((bhz)this.a.c).f)) {
            return;
        }
        final bhz bhz = (bhz)this.a.c;
        final bhg e = bhz.e;
        if (e != null && bhz.g) {
            e.b();
        }
    }
    
    public final void onTearDown(final AudioTrack audioTrack) {
        if (!audioTrack.equals(((bhz)this.a.c).f)) {
            return;
        }
        final bhz bhz = (bhz)this.a.c;
        final bhg e = bhz.e;
        if (e != null && bhz.g) {
            e.b();
        }
    }
}
