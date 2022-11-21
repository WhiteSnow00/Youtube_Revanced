import java.util.List;
import java.io.Closeable;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blk implements blm
{
    public final bbm a;
    public final Map b;
    
    public blk(final bbm a) {
        bad.d(true);
        this.a = a;
        this.b = new HashMap();
    }
    
    public static byte[] a(final bbm bbm, String s, byte[] a, final Map e) {
        final bco bco = new bco((bbn)((bbv)bbm).b());
        final bbq bbq = new bbq();
        bbq.b(s);
        bbq.e = e;
        bbq.c = 2;
        bbq.d = a;
        bbq.i = 1;
        a = (byte[])(Object)bbq.a();
        int n = 0;
        Object a2 = a;
        try {
            bbp bbp;
            while (true) {
                bbp = new bbp((bbn)bco, (bbr)a2);
                try {
                    try {
                        final byte[] ak = baz.ak(bbp);
                        baz.X(bbp);
                        return ak;
                    }
                    finally {}
                }
                catch (final bcg bcg) {
                    final int d = bcg.d;
                    final String s2 = null;
                    Label_0185: {
                        if (d != 307) {
                            s = s2;
                            if (d != 308) {
                                break Label_0185;
                            }
                        }
                        s = s2;
                        if (n < 5) {
                            final Map e2 = bcg.e;
                            s = s2;
                            if (e2 != null) {
                                final List list = e2.get("Location");
                                s = s2;
                                if (list != null) {
                                    s = s2;
                                    if (!list.isEmpty()) {
                                        s = (String)list.get(0);
                                    }
                                }
                            }
                        }
                    }
                    if (s != null) {
                        ++n;
                        final bbq a3 = ((bbr)bbm).a();
                        a3.b(s);
                        a2 = a3.a();
                        baz.X(bbp);
                        continue;
                    }
                    throw bcg;
                }
                break;
            }
            baz.X(bbp);
        }
        catch (final Exception ex) {
            bad.b(bco.b);
            bco.d();
            throw new bln((bbr)(Object)a, bco.a, ex);
        }
    }
}
