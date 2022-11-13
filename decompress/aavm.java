import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.List;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavm implements abdb, aaqy
{
    private final ViewGroup a;
    private final Context b;
    private aave c;
    
    public aavm(final ViewGroup a, final Context b) {
        this.a = a;
        this.b = b;
    }
    
    public final void c(final List list) {
        final aave c = this.c;
        if (c != null) {
            c.i.post((Runnable)new aagj(c, list, 15));
            c.o = true;
            c.A();
        }
    }
    
    public final void e() {
        final aave c = this.c;
        if (c != null) {
            c.i.post((Runnable)new aaog(c, 20));
            c.o = false;
            c.A();
        }
    }
    
    public final void f() {
        final aave c = this.c;
        if (c != null) {
            c.y();
        }
    }
    
    public final void g(final float n) {
        final aave c = this.c;
        if (c != null) {
            c.i.post((Runnable)new hrc(c, n, 9));
        }
    }
    
    public final void h(final int n, final int n2) {
        final aave c = this.c;
        if (c != null) {
            c.i.post((Runnable)new aasq(c, n, 4));
        }
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        final aave c = this.c;
        if (c != null) {
            c.i.post((Runnable)new aagj(c, subtitlesStyle, 16));
        }
    }
    
    public final void rT(final aatn aatn, final aatj aatj) {
        aatj.c((aaru)(this.c = new aave(this.a, this.b, new Handler(Looper.getMainLooper()), aatj.a().a(), aatn.h, aatn.i, aatn, aatj)));
    }
    
    public final void rU() {
        this.c = null;
    }
}
