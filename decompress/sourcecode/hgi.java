import android.widget.ProgressBar;
import java.util.concurrent.Callable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgi extends nq
{
    public hgn a;
    public aexq e;
    private final Context f;
    private final Executor g;
    private final Executor h;
    
    public hgi(final Context f, final Executor g, final Executor h) {
        this.f = f;
        this.g = g;
        this.h = h;
        final hgm a = hgn.a();
        a.b(afcr.q());
        this.a = a.a();
        this.e = aewp.a;
    }
    
    public final int a() {
        return ((afgh)this.a.a).c;
    }
    
    public final boolean b(final int n) {
        return n >= 0 && n < ((afgh)this.a.a).c;
    }
}
