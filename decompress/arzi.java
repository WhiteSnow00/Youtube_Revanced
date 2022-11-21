import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzi
{
    public final arzh a;
    public final String b;
    public final String c;
    public final arzg d;
    private final arzg e;
    private final boolean f;
    
    public arzi(final arzh a, final String b, final arzg e, final arzg d, final boolean f) {
        new AtomicReferenceArray(2);
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        final int lastIndex = b.lastIndexOf(47);
        String substring;
        if (lastIndex == -1) {
            substring = null;
        }
        else {
            substring = b.substring(0, lastIndex);
        }
        this.c = substring;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
        this.f = f;
    }
    
    public static arzf a() {
        final arzf arzf = new arzf();
        arzf.a = null;
        arzf.b = null;
        return arzf;
    }
    
    public static String c(final String s, final String s2) {
        s.getClass();
        s2.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("/");
        sb.append(s2);
        return sb.toString();
    }
    
    public final InputStream b(final Object o) {
        return new asiw((MessageLite)o, ((asix)this.e).b);
    }
    
    @Override
    public final String toString() {
        final afbg ae = adme.ae(this);
        ae.b("fullMethodName", this.b);
        ae.b("type", this.a);
        ae.g("idempotent", false);
        ae.g("safe", false);
        ae.g("sampledToLocalTracing", this.f);
        ae.b("requestMarshaller", this.e);
        ae.b("responseMarshaller", this.d);
        ae.b("schemaDescriptor", null);
        ae.a = true;
        return ae.toString();
    }
}
