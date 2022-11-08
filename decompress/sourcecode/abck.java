import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abck implements abcm
{
    private final List a;
    
    public abck(final abcm... array) {
        final List<abcm> list = Arrays.asList(array);
        list.getClass();
        this.a = list;
    }
    
    public final void m(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abcm)iterator.next()).m(b);
        }
    }
    
    public final void o(final VideoQuality[] array, final int n, final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abcm)iterator.next()).o(array, n, b);
        }
    }
    
    public final void re(final abcl abcl) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abcm)iterator.next()).re(abcl);
        }
    }
}
