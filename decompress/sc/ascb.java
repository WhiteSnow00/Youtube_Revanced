import org.chromium.net.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.nio.charset.Charset;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ascb extends arzg
{
    private static final arvg A;
    public static final arwf m;
    public Status n;
    public arwk o;
    public Charset p;
    public boolean q;
    public final Object r;
    public final Collection s;
    public boolean t;
    public boolean u;
    public int v;
    public Status w;
    public boolean x;
    public boolean y;
    public final arza z;
    
    static {
        m = arvh.b(":status", A = (arvg)new asca(0));
    }
    
    public ascb(final arza z, final int n, final asfr asfr, final Object r, final asfz asfz) {
        this.z = z;
        super(n, asfr, asfz);
        this.p = aeza.c;
        this.s = new ArrayList();
        this.u = false;
        this.r = r;
    }
    
    public static Charset g(final arwk arwk) {
        final String s = (String)arwk.b(asby.g);
        Label_0038: {
            if (s == null) {
                break Label_0038;
            }
            final String[] split = s.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
                return aeza.c;
            }
            catch (final Exception ex) {
                return aeza.c;
            }
        }
    }
    
    public static void h(final arwk arwk) {
        arwk.d(ascb.m);
        arwk.d(arvi.b);
        arwk.d(arvi.a);
    }
    
    public static final Status i(final arwk arwk) {
        final Integer n = (Integer)arwk.b(ascb.m);
        if (n == null) {
            return Status.k.withDescription("Missing HTTP status code");
        }
        final String s = (String)arwk.b(asby.g);
        if (!asby.h(s)) {
            return asby.a((int)n).a("invalid content-type: ".concat(String.valueOf(s)));
        }
        return null;
    }
    
    public final void j(int v) {
        final BidirectionalStream k = this.z.k;
        k.getClass();
        v = this.v - v;
        this.v = v;
        if (v == 0 && !this.x) {
            k.read(ByteBuffer.allocateDirect(4096));
        }
    }
    
    public final void k(final Throwable t) {
        this.l(Status.b(t), true, new arwk());
    }
    
    public final void l(final Status status, final boolean b, final arwk arwk) {
        final BidirectionalStream k = this.z.k;
        k.getClass();
        k.cancel();
        this.f(status, b, arwk);
    }
    
    public final void m() {
        adkp.Q(super.i != null);
        synchronized (super.b) {
            adkp.R(super.f ^ true, (Object)"Already allocated");
            super.f = true;
            monitorexit(super.b);
            super.b();
        }
    }
}
