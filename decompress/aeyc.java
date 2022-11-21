import j$.util.Objects;
import java.util.concurrent.Executor;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class aeyc extends aexy
{
    private static final Map a;
    private static final long serialVersionUID = 4556936364828217687L;
    private final Object b;
    private Map c;
    private aexz d;
    
    static {
        a = Collections.emptyMap();
    }
    
    protected aeyc() {
        this(null);
    }
    
    public aeyc(final aexz d) {
        this.b = new byte[0];
        if (d != null) {
            final Map a = aeyc.a;
            this.d = d;
            final afgj h = afgm.h();
            h.g("Authorization", Collections.singletonList("Bearer ".concat(d.a)));
            h.k(a);
            this.c = h.c();
        }
    }
    
    private final boolean c() {
        return this.c == null;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
    
    @Override
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
    
    @Override
    public final void b(final Executor executor, final auoc auoc) {
        synchronized (this.b) {
            if (this.c()) {
                executor.execute(new afaa(this, auoc, 1, null, null));
                return;
            }
            final Map c = this.c;
            if (c != null) {
                monitorexit(this.b);
                auoc.a(c);
                return;
            }
            throw new NullPointerException("cached requestMetadata");
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aeyc)) {
            return false;
        }
        final aeyc aeyc = (aeyc)o;
        return Objects.equals((Object)this.c, (Object)aeyc.c) && Objects.equals((Object)this.d, (Object)aeyc.d);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.d });
    }
    
    @Override
    public final String toString() {
        final afbg ae = adme.ae(this);
        ae.b("requestMetadata", this.c);
        ae.b("temporaryAccess", this.d);
        return ae.toString();
    }
}
