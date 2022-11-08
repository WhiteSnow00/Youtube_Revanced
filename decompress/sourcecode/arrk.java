import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arrk
{
    public static final arrk a;
    public arsh b;
    public Executor c;
    public List d;
    public Boolean e;
    public Integer f;
    public Integer g;
    public aqzg h;
    private Object[][] i;
    
    static {
        a = new arrk();
    }
    
    private arrk() {
        this.d = Collections.emptyList();
        this.i = new Object[0][2];
    }
    
    public arrk(final arrk arrk) {
        this.d = Collections.emptyList();
        this.b = arrk.b;
        this.h = arrk.h;
        this.c = arrk.c;
        this.i = arrk.i;
        this.e = arrk.e;
        this.f = arrk.f;
        this.g = arrk.g;
        this.d = arrk.d;
    }
    
    public final arrk a(final arsh b) {
        final arrk arrk = new arrk(this);
        arrk.b = b;
        return arrk;
    }
    
    public final arrk b(final int n) {
        agot.x(n >= 0, "invalid maxsize %s", n);
        final arrk arrk = new arrk(this);
        arrk.f = n;
        return arrk;
    }
    
    public final arrk c(final int n) {
        agot.x(n >= 0, "invalid maxsize %s", n);
        final arrk arrk = new arrk(this);
        arrk.g = n;
        return arrk;
    }
    
    public final arrk d(final arrj arrj, final Object o) {
        arrj.getClass();
        o.getClass();
        final arrk arrk = new arrk(this);
        int n = 0;
        while (true) {
            final Object[][] i = this.i;
            if (n >= i.length) {
                n = -1;
                break;
            }
            if (arrj.equals(i[n][0])) {
                break;
            }
            ++n;
        }
        final int length = this.i.length;
        int n2;
        if (n == -1) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object[][] j = new Object[length + n2][2];
        arrk.i = j;
        final Object[][] k = this.i;
        System.arraycopy(k, 0, j, 0, k.length);
        if (n == -1) {
            arrk.i[this.i.length] = new Object[] { arrj, o };
        }
        else {
            arrk.i[n] = new Object[] { arrj, o };
        }
        return arrk;
    }
    
    public final Object e(final arrj arrj) {
        arrj.getClass();
        int n = 0;
        while (true) {
            final Object[][] i = this.i;
            if (n >= i.length) {
                return null;
            }
            if (arrj.equals(i[n][0])) {
                return this.i[n][1];
            }
            ++n;
        }
    }
    
    public final boolean f() {
        return Boolean.TRUE.equals(this.e);
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("deadline", (Object)this.b);
        o.b("authority", (Object)null);
        o.b("callCredentials", (Object)this.h);
        final Executor c = this.c;
        Class<? extends Executor> class1;
        if (c != null) {
            class1 = c.getClass();
        }
        else {
            class1 = null;
        }
        o.b("executor", (Object)class1);
        o.b("compressorName", (Object)null);
        o.b("customOptions", (Object)Arrays.deepToString(this.i));
        o.h("waitForReady", this.f());
        o.b("maxInboundMessageSize", (Object)this.f);
        o.b("maxOutboundMessageSize", (Object)this.g);
        o.b("streamTracerFactories", (Object)this.d);
        return o.toString();
    }
}
