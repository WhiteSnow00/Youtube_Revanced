import android.os.Message;
import java.util.TreeMap;
import android.os.Handler;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bje implements Handler$Callback
{
    public final bvi a;
    public final Handler b;
    public final TreeMap c;
    public bjh d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final brf h;
    public final pvh i;
    
    public bje(final bjh d, final pvh i, final brf h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.i = i;
        this.h = h;
        this.c = new TreeMap();
        this.b = bax.F((Handler$Callback)this);
        this.a = new bvi();
    }
    
    public final void a() {
        if (!this.e) {
            return;
        }
        this.f = true;
        this.e = false;
        final biv biv = (biv)this.i.a;
        biv.g.removeCallbacks(biv.d);
        biv.l();
    }
    
    public final boolean handleMessage(final Message message) {
        if (this.g) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        final bjc bjc = (bjc)message.obj;
        final long a = bjc.a;
        final long b = bjc.b;
        final TreeMap c = this.c;
        final Long value = b;
        final Long n = c.get(value);
        if (n == null) {
            this.c.put(value, a);
        }
        else if (n > a) {
            this.c.put(value, a);
        }
        return true;
    }
}
