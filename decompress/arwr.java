import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwr
{
    public static final arwr a;
    public arxj b;
    public Executor c;
    public List d;
    public Boolean e;
    public Integer f;
    public Integer g;
    public arxu h;
    private Object[][] i;
    
    static {
        a = new arwr();
    }
    
    private arwr() {
        this.d = Collections.emptyList();
        this.i = new Object[0][2];
    }
    
    public arwr(final arwr arwr) {
        this.d = Collections.emptyList();
        this.b = arwr.b;
        this.h = arwr.h;
        this.c = arwr.c;
        this.i = arwr.i;
        this.e = arwr.e;
        this.f = arwr.f;
        this.g = arwr.g;
        this.d = arwr.d;
    }
    
    public final arwr a(final arxj b) {
        final arwr arwr = new arwr(this);
        arwr.b = b;
        return arwr;
    }
    
    public final arwr b(final int n) {
        adme.N(n >= 0, "invalid maxsize %s", n);
        final arwr arwr = new arwr(this);
        arwr.f = n;
        return arwr;
    }
    
    public final arwr c(final int n) {
        adme.N(n >= 0, "invalid maxsize %s", n);
        final arwr arwr = new arwr(this);
        arwr.g = n;
        return arwr;
    }
    
    public final arwr d(final arwq arwq, final Object o) {
        arwq.getClass();
        o.getClass();
        final arwr arwr = new arwr(this);
        int n = 0;
        while (true) {
            final Object[][] i = this.i;
            if (n >= i.length) {
                n = -1;
                break;
            }
            if (arwq.equals(i[n][0])) {
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
        arwr.i = j;
        final Object[][] k = this.i;
        System.arraycopy(k, 0, j, 0, k.length);
        if (n == -1) {
            arwr.i[this.i.length] = new Object[] { arwq, o };
        }
        else {
            arwr.i[n] = new Object[] { arwq, o };
        }
        return arwr;
    }
    
    public final Object e(final arwq arwq) {
        arwq.getClass();
        int n = 0;
        while (true) {
            final Object[][] i = this.i;
            if (n >= i.length) {
                return null;
            }
            if (arwq.equals(i[n][0])) {
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
        final afbg ae = adme.ae(this);
        ae.b("deadline", this.b);
        ae.b("authority", null);
        ae.b("callCredentials", this.h);
        final Executor c = this.c;
        Class<? extends Executor> class1;
        if (c != null) {
            class1 = c.getClass();
        }
        else {
            class1 = null;
        }
        ae.b("executor", class1);
        ae.b("compressorName", null);
        ae.b("customOptions", Arrays.deepToString(this.i));
        ae.g("waitForReady", this.f());
        ae.b("maxInboundMessageSize", this.f);
        ae.b("maxOutboundMessageSize", this.g);
        ae.b("streamTracerFactories", this.d);
        return ae.toString();
    }
}
