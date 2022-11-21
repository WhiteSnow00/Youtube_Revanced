import java.net.PasswordAuthentication;
import java.util.List;
import java.net.URISyntaxException;
import java.net.SocketAddress;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.logging.Level;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

final class ashd implements arzw
{
    public static final Logger a;
    private static final afci c;
    private static final asij d;
    public final InetSocketAddress b;
    
    static {
        a = Logger.getLogger(ashd.class.getName());
        d = new asij();
        c = (afci)new adcm(4);
    }
    
    public ashd() {
        final afci c = ashd.c;
        final asij d = ashd.d;
        final String getenv = System.getenv("GRPC_PROXY_EXP");
        c.getClass();
        d.getClass();
        if (getenv != null) {
            final String[] split = getenv.split(":", 2);
            int int1;
            if (split.length > 1) {
                int1 = Integer.parseInt(split[1]);
            }
            else {
                int1 = 80;
            }
            ashd.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.b = new InetSocketAddress(split[0], int1);
            return;
        }
        this.b = null;
    }
    
    public static final arzv a(final InetSocketAddress inetSocketAddress) {
        final Object o = null;
        try {
            final String e = aset.e(inetSocketAddress);
            try {
                final URI uri = new URI("https", null, e, inetSocketAddress.getPort(), null, null, null);
                final ProxySelector default1 = ProxySelector.getDefault();
                if (default1 == null) {
                    ashd.a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                final List<Proxy> select = default1.select(uri);
                if (select.size() > 1) {
                    ashd.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                final Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                final InetSocketAddress inetSocketAddress2 = (InetSocketAddress)proxy.address();
                final PasswordAuthentication c = asij.c(aset.e(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                InetSocketAddress inetSocketAddress3 = inetSocketAddress2;
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                final arxs a = arxr.a();
                a.e(inetSocketAddress);
                a.d(inetSocketAddress3);
                if (c == null) {
                    return (arzv)a.c();
                }
                a.d = c.getUserName();
                Object b;
                if (c.getPassword() == null) {
                    b = o;
                }
                else {
                    b = new String(c.getPassword());
                }
                a.b = b;
                return (arzv)a.c();
            }
            catch (final URISyntaxException ex) {
                ashd.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", ex);
                return null;
            }
        }
        finally {
            final Throwable t;
            ashd.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", t);
            return null;
        }
    }
}
