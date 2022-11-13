import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jev implements abkx
{
    public final Object a;
    private final int b;
    
    public jev(final abku a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jev(final hyx a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final abkw a(final PlaybackStartDescriptor playbackStartDescriptor) {
        final int b = this.b;
        if (b == 0) {
            return (abkw)((hyx)this.a).b();
        }
        if (b != 1) {
            return (abkw)this.a;
        }
        return (abkw)((hyx)this.a).b();
    }
}
