import java.util.List;
import java.io.Closeable;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blg implements bli
{
    public final bbj a;
    public final Map b;
    
    public blg(final bbj a) {
        dk.f(true);
        this.a = a;
        this.b = new HashMap();
    }
    
    public static byte[] a(final bbj bbj, String s, byte[] a, final Map e) {
        final bcl bcl = new bcl((bbk)((bbs)bbj).b());
        final bbn bbn = new bbn();
        bbn.b(s);
        bbn.e = e;
        bbn.c = 2;
        bbn.d = a;
        bbn.i = 1;
        a = (byte[])(Object)bbn.a();
        int n = 0;
        Object a2 = a;
        try {
            bbm bbm;
            while (true) {
                bbm = new bbm((bbk)bcl, (bbo)a2);
                try {
                    try {
                        final byte[] ak = baw.ak(bbm);
                        baw.X(bbm);
                        return ak;
                    }
                    finally {}
                }
                catch (final bcd bcd) {
                    final int d = bcd.d;
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
                            final Map e2 = bcd.e;
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
                        final bbn a3 = ((bbo)bbj).a();
                        a3.b(s);
                        a2 = a3.a();
                        baw.X(bbm);
                        continue;
                    }
                    throw bcd;
                }
                break;
            }
            baw.X(bbm);
        }
        catch (final Exception ex) {
            dk.d((Object)bcl.b);
            bcl.d();
            throw new blj((bbo)(Object)a, bcl.a, (Throwable)ex);
        }
    }
}
