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

public final class abug implements Callable
{
    private final bbn a;
    private final abuc b;
    private final Uri c;
    
    public abug(final bbn a, final Uri c, final abuc b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final Object call() {
        final bbr bbr = new bbr(this.c, 0L, -1L, null);
        final bbg bbg = new bbg();
        final bcp bcp = new bcp(this.a, (bbl)bbg);
        bcp.b(bbr);
        while (bcp.a(new byte[8192], 0, 8192) > 0) {}
        bcp.f();
        final ByteArrayOutputStream a = bbg.a;
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
        final bat bat = new bat(byteArray);
        final abuf abuf = new abuf();
        final aris aris = new aris(bat.a);
        final ariq ariq = new ariq();
        ariq.t(aris, aris.c(), (dpu)abuh.b);
        long n = 1L;
        long a2 = 0L;
    Label_0175:
        while (ariq.hasNext()) {
            final dpy v = ariq.v();
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
                    for (final dpy dpy : ((ariq)v).i()) {
                        if (dpy instanceof dqr) {
                            final dqr dqr = (dqr)dpy;
                            if (dqr == null) {
                                continue Label_0175;
                            }
                            final long c = dqr.c;
                            if (c > 0L) {
                                n = c;
                                continue Label_0175;
                            }
                            continue Label_0175;
                        }
                    }
                    final dqr dqr = null;
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
                    bat.G((int)v.a() + 8);
                    this.b.a(abuf, bat, TimeUnit.SECONDS.toMillis(a2 / n), (int)v.b() - 8);
                }
                else {
                    bat.G((int)v.a() + 8);
                    bat.q();
                    final String u = bat.u();
                    bat.u();
                    bat.q();
                    bat.q();
                    bat.q();
                    bat.q();
                    final yrv yrv = new yrv(twd.i(u), yrv.f(bat));
                    if (yrv.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
                        abuf.c = yrv;
                    }
                    else {
                        if (!yrv.a.equals("http://youtube.com/streaming/metadata/streamer/092019")) {
                            continue;
                        }
                        abuf.d = yrv;
                    }
                }
            }
            else {
                final List x = ((ariq)v).x(drt.class);
                if (x.isEmpty()) {
                    continue;
                }
                final List x2 = ((ariq)x.get(0)).x(drs.class);
                if (x2.isEmpty()) {
                    continue;
                }
                a2 = ((drs)x2.get(0)).a;
            }
        }
        ariq.close();
        if (abuf.c == null) {
            throw azb.a("Missing emsg", null);
        }
        if (abuf.b != null) {
            return new adix(abuf);
        }
        throw azb.a("Missing segment time", null);
    }
}
