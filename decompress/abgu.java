import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public class abgu extends abgs
{
    public int a;
    
    public abgu(final abhd abhd, final alo alo, final byte[] array, final byte[] array2) {
        super(abhd, alo, null, null);
        this.a = 0;
    }
    
    public abpx d(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla) {
        return new abpx(abpw.f, playbackStartDescriptor, abla);
    }
    
    public final int n() {
        return this.a;
    }
    
    public final void o(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean p(final int n) {
        return true;
    }
}
