import java.util.Arrays;
import java.util.List;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

// 
// Decompiled by Procyon v0.6.0
// 

public class abch
{
    public final abcg a;
    public final TimelineMarker[] b;
    
    public abch(final abcg a, final List list) {
        a.getClass();
        this.a = a;
        this.b = new TimelineMarker[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            this.b[i] = (TimelineMarker)list.get(i);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof abch)) {
            return false;
        }
        final abch abch = (abch)o;
        return this.a == abch.a && Arrays.equals(this.b, abch.b);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ Arrays.hashCode(this.b);
    }
}
