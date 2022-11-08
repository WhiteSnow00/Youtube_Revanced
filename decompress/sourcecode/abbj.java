import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbj implements abbm
{
    private final List a;
    
    public abbj(final abbm... array) {
        final List<abbm> list = Arrays.asList(array);
        list.getClass();
        this.a = list;
    }
    
    public final void g(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbm)iterator.next()).g(b);
        }
    }
    
    public final void j(final SubtitleTrack subtitleTrack) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbm)iterator.next()).j(subtitleTrack);
        }
    }
    
    public final void l(final abbl abbl) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbm)iterator.next()).l(abbl);
        }
    }
    
    public final void q(final List list) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbm)iterator.next()).q(list);
        }
    }
    
    public final void qW(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbm)iterator.next()).qW(b);
        }
    }
}
