import j$.util.Objects;
import java.util.concurrent.Executor;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class aeuk extends aeug
{
    private static final Map a;
    private static final long serialVersionUID = 4556936364828217687L;
    private final Object b;
    private Map c;
    private aeuh d;
    
    static {
        a = Collections.emptyMap();
    }
    
    protected aeuk() {
        this(null);
    }
    
    public aeuk(final aeuh d) {
        this.b = new byte[0];
        if (d != null) {
            final Map a = aeuk.a;
            this.d = d;
            final afct h = afcw.h();
            h.g((Object)"Authorization", (Object)Collections.singletonList("Bearer ".concat(d.a)));
            h.k(a);
            this.c = (Map)h.c();
        }
    }
    
    private final boolean c() {
        return this.c == null;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
    
    public final Map a() {
        synchronized (this.b) {
            if (!this.c()) {
                final Map c = this.c;
                if (c != null) {
                    return c;
                }
                throw new NullPointerException("requestMetadata");
            }
            else {
                synchronized (this.b) {
                    this.c = null;
                    this.d = null;
                    throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
                }
            }
        }
    }
    
    public final void b(final Executor executor, final aukr aukr) {
        synchronized (this.b) {
            if (this.c()) {
                executor.execute((Runnable)new adpd((aeug)this, aukr, 17, (byte[])null, (byte[])null));
                return;
            }
            final Map c = this.c;
            if (c != null) {
                monitorexit(this.b);
                aukr.a(c);
                return;
            }
            throw new NullPointerException("cached requestMetadata");
        }
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof aeuk)) {
            return false;
        }
        final aeuk aeuk = (aeuk)o;
        return Objects.equals((Object)this.c, (Object)aeuk.c) && Objects.equals((Object)this.d, (Object)aeuk.d);
    }
    
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.d });
    }
    
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("requestMetadata", (Object)this.c);
        o.b("temporaryAccess", (Object)this.d);
        return o.toString();
    }
}
