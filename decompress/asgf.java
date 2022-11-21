import java.util.concurrent.Executor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.Collection;
import java.net.URISyntaxException;
import java.net.URI;
import java.util.ArrayList;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asgf extends arys
{
    static final long a;
    public static final long b;
    private static final Logger n;
    private static final asgw o;
    private static final arxl p;
    private static final arxd q;
    asgw c;
    public asgw d;
    public final List e;
    final arzs f;
    arzl g;
    final String h;
    public String i;
    final arxl j;
    final arxd k;
    public long l;
    final arxw m;
    private final asgc r;
    
    static {
        n = Logger.getLogger(asgf.class.getName());
        a = TimeUnit.MINUTES.toMillis(30L);
        b = TimeUnit.SECONDS.toMillis(1L);
        o = (asgw)asim.c(aset.l);
        p = arxl.b;
        q = arxd.a;
    }
    
    public asgf(final SocketAddress socketAddress, final String s, final asgc r) {
        final asgw o = asgf.o;
        this.c = o;
        this.d = o;
        this.e = new ArrayList();
        final arzs a = arzs.a();
        this.f = a;
        this.g = a.a;
        this.j = asgf.p;
        this.k = asgf.q;
        this.l = asgf.a;
        this.m = arxw.a;
        this.h = b(socketAddress);
        r.getClass();
        this.r = r;
        this.g = new asge(socketAddress, s);
    }
    
    static String b(final SocketAddress socketAddress) {
        try {
            final String value = String.valueOf(socketAddress);
            final StringBuilder sb = new StringBuilder("/");
            sb.append(value);
            return new URI("directaddress", "", sb.toString(), null).toString();
        }
        catch (final URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    public final aryr a() {
        final asdc a = this.r.a();
        final asim c = asim.c(aset.l);
        final afci n = aset.n;
        final ArrayList list = new ArrayList(this.e);
        final arwv arwv = null;
        arwv arwv2 = null;
        Label_0198: {
            try {
                final Method declaredMethod = Class.forName("asbp").getDeclaredMethod("getClientInterceptor", Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
                final Boolean value = true;
                arwv2 = (arwv)declaredMethod.invoke(null, value, value, false, value);
                break Label_0198;
            }
            catch (final InvocationTargetException ex) {
                asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex);
            }
            catch (final IllegalAccessException ex2) {
                asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex2);
            }
            catch (final NoSuchMethodException ex3) {
                asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex3);
            }
            catch (final ClassNotFoundException ex4) {
                asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex4);
            }
            arwv2 = null;
        }
        if (arwv2 != null) {
            list.add(0, arwv2);
        }
        arwv arwv3;
        try {
            arwv3 = (arwv)Class.forName("asbq").getDeclaredMethod("getClientInterceptor", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (final InvocationTargetException ex5) {
            asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex5);
            arwv3 = arwv;
        }
        catch (final IllegalAccessException ex6) {
            asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex6);
            arwv3 = arwv;
        }
        catch (final NoSuchMethodException ex7) {
            asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex7);
            arwv3 = arwv;
        }
        catch (final ClassNotFoundException ex8) {
            asgf.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex8);
            arwv3 = arwv;
        }
        if (arwv3 != null) {
            list.add(0, arwv3);
        }
        return (aryr)new asgh((aryr)new asgb(this, a, (asgw)c, n, (List)list, asis.a));
    }
    
    public final void c(final Executor executor) {
        if (executor != null) {
            this.c = (asgw)new asim(executor, 1);
            return;
        }
        this.c = asgf.o;
    }
}
