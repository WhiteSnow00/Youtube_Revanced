import java.util.concurrent.atomic.AtomicReference;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.net.URL;
import java.net.PasswordAuthentication;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import io.grpc.Status;
import java.util.EnumSet;
import io.grpc.Status$Code;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asey
{
    public static Set a(final Map map, final String s) {
        final List e = asbf.e(map, s);
        if (e == null) {
            return null;
        }
        final EnumSet<Status$Code> none = EnumSet.noneOf(Status$Code.class);
        for (final Object next : e) {
            Label_0158: {
                if (next instanceof Double) {
                    final Double n = (Double)next;
                    final int intValue = n.intValue();
                    final double n2 = intValue;
                    final double doubleValue = n;
                    final boolean b = true;
                    agnj.C(n2 == doubleValue, "Status code %s is not integral", next);
                    final Status$Code status$Code = Status.fromCodeValue(intValue).getCode();
                    agnj.C(status$Code.value() == n.intValue() && b, "Status code %s is not valid", next);
                    break Label_0158;
                }
                if (!(next instanceof String)) {
                    break Label_0158;
                }
                try {
                    final Status$Code status$Code = Status$Code.a((String)next);
                    none.add(status$Code);
                    continue;
                }
                catch (final IllegalArgumentException ex) {
                    final String value = String.valueOf(next);
                    final StringBuilder sb = new StringBuilder("Status code ");
                    sb.append(value);
                    sb.append(" is not valid");
                    throw new aeyz(sb.toString(), (Throwable)ex);
                }
            }
            final String value2 = String.valueOf(next);
            final String value3 = String.valueOf(((String)next).getClass());
            final StringBuilder sb2 = new StringBuilder("Can not convert status code ");
            sb2.append(value2);
            sb2.append(" to Status.Code, because its type is ");
            sb2.append(value3);
            throw new aeyz(sb2.toString());
        }
        return Collections.unmodifiableSet((Set<?>)none);
    }
    
    public static final PasswordAuthentication b(final String s, final InetAddress inetAddress, final int n) {
        URL url;
        try {
            url = new URL("https", s, n, "");
        }
        catch (final MalformedURLException ex) {
            asdb.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[] { "https", s });
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(s, inetAddress, n, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }
    
    public static void d(final Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError)t;
        }
        if (t instanceof ThreadDeath) {
            throw (ThreadDeath)t;
        }
        if (!(t instanceof LinkageError)) {
            return;
        }
        throw (LinkageError)t;
    }
}
