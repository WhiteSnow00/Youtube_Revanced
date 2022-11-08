import android.os.Looper;
import java.util.concurrent.CancellationException;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsb extends atsc implements atqg
{
    private volatile atsb _immediate;
    private final Handler c;
    private final String d;
    private final boolean e;
    private final atsb f;
    
    public atsb(final Handler handler, final String s) {
        handler.getClass();
        this(handler, s, false);
    }
    
    private atsb(final Handler c, final String d, final boolean e) {
        this.c = c;
        this.d = d;
        this.e = e;
        atsb immediate;
        if (!e) {
            immediate = null;
        }
        else {
            immediate = this;
        }
        this._immediate = immediate;
        atsb immediate2;
        if ((immediate2 = this._immediate) == null) {
            immediate2 = new atsb(c, d, true);
            this._immediate = immediate2;
        }
        this.f = immediate2;
    }
    
    public final void d(final atli atli, final Runnable runnable) {
        atli.getClass();
        if (!this.c.post(runnable)) {
            final StringBuilder sb = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
            sb.append(this);
            sb.append("' was closed");
            aqqm.t(atli, new CancellationException(sb.toString()));
            atql.b.d(atli, runnable);
        }
    }
    
    public final boolean e(final atli atli) {
        atli.getClass();
        return !this.e || !atnh.c(Looper.myLooper(), this.c.getLooper());
    }
    
    public final boolean equals(final Object o) {
        return o instanceof atsb && ((atsb)o).c == this.c;
    }
    
    public final int hashCode() {
        return System.identityHashCode(this.c);
    }
    
    public final String toString() {
        String s;
        if ((s = this.c()) == null) {
            String s2;
            if ((s2 = this.d) == null) {
                s2 = this.c.toString();
            }
            s = s2;
            if (this.e) {
                s = String.valueOf(s2).concat(".immediate");
            }
        }
        return s;
    }
}
