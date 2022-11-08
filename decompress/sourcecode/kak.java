import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

final class kak implements fnv
{
    private final String a;
    private final long b;
    private final arud c;
    
    public kak(final abno abno, final arud c, final byte[] array, final byte[] array2) {
        this.a = abno.s();
        long c2;
        if (abno.p() == null) {
            c2 = 0L;
        }
        else {
            c2 = abno.p().c();
        }
        this.b = c2;
        this.c = c;
    }
    
    @Override
    public final void a(final PlaybackStartDescriptor playbackStartDescriptor) {
        final String a = this.a;
        if (a != null && a.equals(playbackStartDescriptor.k()) && this.b - playbackStartDescriptor.c() > gkt.ah(this.c)) {
            playbackStartDescriptor.p(this.b);
        }
    }
}
