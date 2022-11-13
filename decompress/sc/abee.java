import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abee implements abeg
{
    private final List a;
    
    public abee(final abeg... array) {
        final List<abeg> list = Arrays.asList(array);
        list.getClass();
        this.a = list;
    }
    
    public final void m(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abeg)iterator.next()).m(b);
        }
    }
    
    public final void o(final VideoQuality[] array, final int n, final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abeg)iterator.next()).o(array, n, b);
        }
    }
    
    public final void rk(final abef abef) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abeg)iterator.next()).rk(abef);
        }
    }
}
