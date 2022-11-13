import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdf implements abdi
{
    private final List a;
    
    public abdf(final abdi... array) {
        final List<abdi> list = Arrays.asList(array);
        list.getClass();
        this.a = list;
    }
    
    public final void g(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abdi)iterator.next()).g(b);
        }
    }
    
    public final void j(final SubtitleTrack subtitleTrack) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abdi)iterator.next()).j(subtitleTrack);
        }
    }
    
    public final void l(final abdh abdh) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abdi)iterator.next()).l(abdh);
        }
    }
    
    public final void q(final List list) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abdi)iterator.next()).q(list);
        }
    }
    
    public final void rc(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abdi)iterator.next()).rc(b);
        }
    }
}
