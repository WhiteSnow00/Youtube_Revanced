import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbg implements abbh
{
    private final List a;
    
    public abbg(final abbh... array) {
        final List<abbh> list = Arrays.asList(array);
        list.getClass();
        this.a = list;
    }
    
    public final void c(final List list) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbh)iterator.next()).c(list);
        }
    }
    
    public final void e() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbh)iterator.next()).e();
        }
    }
    
    public final void f() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbh)iterator.next()).f();
        }
    }
    
    public final void g(final float n) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbh)iterator.next()).g(n);
        }
    }
    
    public final void h(final int n, final int n2) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbh)iterator.next()).h(n, 0);
        }
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbh)iterator.next()).i(subtitlesStyle);
        }
    }
}