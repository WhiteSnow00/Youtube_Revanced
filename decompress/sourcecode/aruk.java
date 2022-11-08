import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aruk
{
    public final aruj a;
    public final String b;
    public final String c;
    public final arui d;
    public final arui e;
    public final boolean f;
    
    public aruk(final aruj a, final String b, final arui d, final arui e, final boolean f) {
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
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.f = f;
    }
    
    public static aruh a() {
        final aruh aruh = new aruh();
        aruh.a = null;
        aruh.b = null;
        return aruh;
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
        return (InputStream)new asfl((MessageLite)o, ((asfm)this.d).b);
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("fullMethodName", (Object)this.b);
        o.b("type", (Object)this.a);
        o.h("idempotent", false);
        o.h("safe", false);
        o.h("sampledToLocalTracing", this.f);
        o.b("requestMarshaller", (Object)this.d);
        o.b("responseMarshaller", (Object)this.e);
        o.b("schemaDescriptor", (Object)null);
        o.d();
        return o.toString();
    }
}
