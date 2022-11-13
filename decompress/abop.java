import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abop
{
    public static final abop a;
    public static final abop b;
    public static final abop c;
    public static final abop d;
    public final aboo e;
    public final PlaybackStartDescriptor f;
    public final abjt g;
    
    static {
        a = new abop(aboo.a);
        b = new abop(aboo.b);
        c = new abop(aboo.c);
        d = new abop(aboo.d);
    }
    
    private abop(final aboo aboo) {
        this(aboo, null, null, null);
    }
    
    public abop(final aboo aboo, final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        this(aboo, playbackStartDescriptor, abjt, null);
    }
    
    public abop(final aboo e, final PlaybackStartDescriptor f, final abjt g, final byte[] array) {
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static final int a(final boolean b) {
        if (b) {
            return 2;
        }
        return 1;
    }
}
