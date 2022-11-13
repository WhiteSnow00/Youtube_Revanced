import java.util.List;
import java.util.Iterator;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import android.net.Uri;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absw implements Callable
{
    private final bbl a;
    private final abss b;
    private final Uri c;
    
    public absw(final bbl a, final Uri c, final abss b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final Object call() {
        final bbp bbp = new bbp(this.c, 0L, -1L, (String)null);
        final bbe bbe = new bbe();
        final bcn bcn = new bcn(this.a, (bbj)bbe);
        bcn.b(bbp);
        while (bcn.a(new byte[8192], 0, 8192) > 0) {}
        bcn.f();
        final ByteArrayOutputStream a = bbe.a;
        byte[] byteArray;
        if (a == null) {
            byteArray = null;
        }
        else {
            byteArray = a.toByteArray();
        }
        if (byteArray == null || byteArray.length == 0) {
            throw new IOException("Received empty segment");
        }
        final bas bas = new bas(byteArray);
        final absv absv = new absv();
        final arfy arfy = new arfy(bas.a);
        final arfw arfw = new arfw();
        arfw.t((arfx)arfy, arfy.c(), (dpr)absx.b);
        long n = 1L;
        long a2 = 0L;
    Label_0175:
        while (arfw.hasNext()) {
            final dpv v = arfw.v();
            final String d = v.d();
            int n2 = 0;
            Label_0313: {
                switch (d.hashCode()) {
                    case 3357449: {
                        if (d.equals("moov")) {
                            n2 = 0;
                            break Label_0313;
                        }
                        break;
                    }
                    case 3357433: {
                        if (d.equals("moof")) {
                            n2 = 1;
                            break Label_0313;
                        }
                        break;
                    }
                    case 3346442: {
                        if (d.equals("mdat")) {
                            n2 = 3;
                            break Label_0313;
                        }
                        break;
                    }
                    case 3117308: {
                        if (d.equals("emsg")) {
                            n2 = 2;
                            break Label_0313;
                        }
                        break;
                    }
                }
                n2 = -1;
            }
            if (n2 == 0) {
                while (true) {
                    for (final dpv dpv : ((arfw)v).i()) {
                        if (dpv instanceof dqo) {
                            final dqo dqo = (dqo)dpv;
                            if (dqo == null) {
                                continue Label_0175;
                            }
                            final long c = dqo.c;
                            if (c > 0L) {
                                n = c;
                                continue Label_0175;
                            }
                            continue Label_0175;
                        }
                    }
                    final dqo dqo = null;
                    continue;
                }
            }
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        continue;
                    }
                    if (this.b == null) {
                        continue;
                    }
                    bas.G((int)v.a() + 8);
                    this.b.a(absv, bas, TimeUnit.SECONDS.toMillis(a2 / n), (int)v.b() - 8);
                }
                else {
                    bas.G((int)v.a() + 8);
                    bas.q();
                    final String u = bas.u();
                    bas.u();
                    bas.q();
                    bas.q();
                    bas.q();
                    bas.q();
                    final yqb yqb = new yqb(tvb.i(u), yqb.f(bas));
                    if (yqb.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
                        absv.c = yqb;
                    }
                    else {
                        if (!yqb.a.equals("http://youtube.com/streaming/metadata/streamer/092019")) {
                            continue;
                        }
                        absv.d = yqb;
                    }
                }
            }
            else {
                final List x = ((arfw)v).x((Class)drq.class);
                if (x.isEmpty()) {
                    continue;
                }
                final List x2 = ((arfw)x.get(0)).x((Class)drp.class);
                if (x2.isEmpty()) {
                    continue;
                }
                a2 = ((drp)x2.get(0)).a;
            }
        }
        arfw.close();
        if (absv.c == null) {
            throw aza.a("Missing emsg", (Throwable)null);
        }
        if (absv.b != null) {
            return new adhi(absv);
        }
        throw aza.a("Missing segment time", (Throwable)null);
    }
}
