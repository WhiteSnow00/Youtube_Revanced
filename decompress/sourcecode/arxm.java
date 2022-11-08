import org.chromium.net.UrlResponseInfo$HeaderBlock;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.UrlResponseInfo;
import java.util.Iterator;
import java.util.logging.Level;
import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.BidirectionalStream$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxm extends BidirectionalStream$Callback
{
    final /* synthetic */ arxo a;
    private List b;
    
    public arxm(final arxo a) {
        this.a = a;
    }
    
    private final void a(final List list, final boolean b) {
        final ArrayList list2 = new ArrayList();
        for (final Map.Entry<String, V> entry : list) {
            list2.add(entry.getKey());
            list2.add(entry.getValue());
        }
        final byte[][] array = new byte[list2.size()][];
        for (int i = 0; i < list2.size(); i += 2) {
            array[i] = ((String)list2.get(i)).getBytes(Charset.forName("UTF-8"));
            final int n = i + 1;
            array[n] = ((String)list2.get(n)).getBytes(Charset.forName("UTF-8"));
        }
        final arug c = artc.c(asfi.b(array));
        final asas o = this.a.o;
        final arub m = asas.m;
        final Object r = o.r;
        monitorenter(r);
        try {
            final asas o2 = this.a.o;
            Label_0885: {
                if (b) {
                    final Status n2 = o2.n;
                    Status status;
                    if ((status = n2) == null) {
                        status = n2;
                        if (!o2.q) {
                            o2.n = asas.i(c);
                            final Status n3 = o2.n;
                            if ((status = n3) != null) {
                                o2.o = c;
                                status = n3;
                            }
                        }
                    }
                    if (status != null) {
                        o2.l(o2.n = status.a("trailers: ".concat(c.toString())), false, o2.o);
                        break Label_0885;
                    }
                    final Status status2 = (Status)c.b(arte.b);
                    Status status3;
                    if (status2 != null) {
                        status3 = status2.withDescription((String)c.b(arte.a));
                    }
                    else if (o2.q) {
                        status3 = Status.c.withDescription("missing GRPC status in response");
                    }
                    else {
                        final Integer n4 = (Integer)c.b(asas.m);
                        Status status4;
                        if (n4 != null) {
                            status4 = asap.a(n4);
                        }
                        else {
                            status4 = Status.k.withDescription("missing HTTP status code");
                        }
                        status3 = status4.a("missing GRPC status, inferred error from HTTP status code");
                    }
                    asas.h(c);
                    if (((arxu)o2).l) {
                        arxr.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[] { status3, c });
                        break Label_0885;
                    }
                    ((arxu)o2).h.d();
                    ((arxu)o2).f(status3, false, c);
                    break Label_0885;
                }
                else {
                    final Status n5 = o2.n;
                    if (n5 != null) {
                        o2.n = n5.a("headers: ".concat(c.toString()));
                        break Label_0885;
                    }
                }
                try {
                    Charset p2;
                    if (o2.q) {
                        o2.n = Status.k.withDescription("Received headers twice");
                        final Status n6 = o2.n;
                        if (n6 == null) {
                            break Label_0885;
                        }
                        o2.n = n6.a("headers: ".concat(c.toString()));
                        o2.o = c;
                        p2 = asas.g(c);
                    }
                    else {
                        final Integer n7 = (Integer)c.b(asas.m);
                        if (n7 != null && n7 >= 100 && n7 < 200) {
                            final Status n8 = o2.n;
                            if (n8 == null) {
                                break Label_0885;
                            }
                            o2.n = n8.a("headers: ".concat(c.toString()));
                            o2.o = c;
                            p2 = asas.g(c);
                        }
                        else {
                            o2.q = true;
                            o2.n = asas.i(c);
                            final Status n9 = o2.n;
                            if (n9 != null) {
                                o2.n = n9.a("headers: ".concat(c.toString()));
                                o2.o = c;
                                p2 = asas.g(c);
                            }
                            else {
                                asas.h(c);
                                agot.E(((arxu)o2).l ^ true, (Object)"Received headers on closed stream");
                                ((arxu)o2).h.a();
                                final String s = (String)c.b(asap.d);
                                final String s2 = (String)c.b(asap.b);
                                Label_0840: {
                                    if (s2 != null) {
                                        final arsi a = ((arxu)o2).j.a(s2);
                                        if (a == null) {
                                            ((arxu)o2).k((Throwable)Status.k.withDescription(String.format("Can't find decompressor for %s", s2)).d());
                                            break Label_0840;
                                        }
                                        if (a != arrt.a) {
                                            final arzh a2 = ((arxu)o2).a;
                                            agot.E(true, (Object)"Already set full stream decompressor");
                                            ((asco)a2).c = a;
                                        }
                                    }
                                    ((arxu)o2).i.c(c);
                                }
                                final Status n10 = o2.n;
                                if (n10 == null) {
                                    break Label_0885;
                                }
                                o2.n = n10.a("headers: ".concat(c.toString()));
                                o2.o = c;
                                p2 = asas.g(c);
                            }
                        }
                    }
                    o2.p = p2;
                    monitorexit(r);
                }
                finally {
                    final Status n11 = o2.n;
                    if (n11 != null) {
                        o2.n = n11.a("headers: ".concat(c.toString()));
                        o2.o = c;
                        o2.p = asas.g(c);
                    }
                }
            }
        }
        finally {
            monitorexit(r);
            while (true) {}
        }
    }
    
    private static final Status b(final UrlResponseInfo urlResponseInfo) {
        return asap.a(urlResponseInfo.getHttpStatusCode());
    }
    
    public final void onCanceled(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo) {
        final asas o = this.a.o;
        final arub m = asas.m;
        synchronized (o.r) {
            Status status = this.a.o.w;
            if (status == null) {
                if (urlResponseInfo != null) {
                    status = b(urlResponseInfo);
                }
                else {
                    status = Status.b.withDescription("stream cancelled without reason");
                }
            }
            monitorexit(o.r);
            this.a.r(status);
        }
    }
    
    public final void onFailed(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final CronetException ex) {
        this.a.r(Status.l.c((Throwable)ex));
    }
    
    public final void onReadCompleted(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer, final boolean x) {
        byteBuffer.flip();
        final asas o = this.a.o;
        final arub m = asas.m;
        final Object r = o.r;
        monitorenter(r);
        try {
            this.a.o.x = x;
            Label_0275: {
                if (byteBuffer.remaining() != 0) {
                    final asas o2 = this.a.o;
                    o2.v += byteBuffer.remaining();
                    final asdc a = asdg.a(byteBuffer);
                    final Status n = o2.n;
                    Status status;
                    arug o3;
                    if (n != null) {
                        o2.n = n.a("DATA-----------------------------\n".concat(asdg.b(a, o2.p)));
                        if (o2.n.getDescription().length() <= 1000) {
                            break Label_0275;
                        }
                        status = o2.n;
                        o3 = o2.o;
                    }
                    else {
                        if (o2.q) {
                            a.f();
                            try {
                                if (((arxu)o2).l) {
                                    arxr.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                                }
                                else {
                                    try {
                                        final arzh a2 = ((arxu)o2).a;
                                        try {
                                            if (!((asco)a2).b() && !((asco)a2).f) {
                                                ((asco)a2).d.h(a);
                                                ((asco)a2).a();
                                            }
                                        }
                                        finally {}
                                    }
                                    finally {
                                        final Throwable t;
                                        ((arxu)o2).k(t);
                                    }
                                }
                            }
                            finally {}
                            break Label_0275;
                        }
                        status = Status.k.withDescription("headers not received before payload");
                        o3 = new arug();
                    }
                    o2.l(status, false, o3);
                }
            }
            monitorexit(r);
            if (x) {
                final List b = this.b;
                if (b != null) {
                    this.a(b, true);
                }
            }
        }
        finally {
            monitorexit(r);
            while (true) {}
        }
    }
    
    public final void onResponseHeadersReceived(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo) {
        this.a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }
    
    public final void onResponseTrailersReceived(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final UrlResponseInfo$HeaderBlock urlResponseInfo$HeaderBlock) {
        final List asList = urlResponseInfo$HeaderBlock.getAsList();
        this.b = asList;
        final asas o = this.a.o;
        final arub m = asas.m;
        synchronized (o.r) {
            final boolean x = this.a.o.x;
            monitorexit(o.r);
            if (x) {
                this.a(asList, true);
            }
        }
    }
    
    public final void onStreamReady(BidirectionalStream r) {
        final asas o = this.a.o;
        final arub m = asas.m;
        r = (BidirectionalStream)o.r;
        monitorenter(r);
        try {
            this.a.o.m();
            final asas o2 = this.a.o;
            o2.t = true;
            for (final arxn arxn : o2.s) {
                o2.z.s((ByteBuffer)arxn.c, arxn.a, arxn.b);
            }
            o2.s.clear();
            monitorexit(r);
        }
        finally {
            monitorexit(r);
            while (true) {}
        }
    }
    
    public final void onSucceeded(BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo) {
        final asas o = this.a.o;
        final arub m = asas.m;
        bidirectionalStream = (BidirectionalStream)o.r;
        synchronized (bidirectionalStream) {
            final List b = this.b;
            int n = 0;
            if (b != null) {
                n = n;
                if (this.a.o.x) {
                    n = 1;
                }
            }
            monitorexit(bidirectionalStream);
            if (n == 0) {
                bidirectionalStream = (BidirectionalStream)this.b;
                if (bidirectionalStream != null) {
                    this.a((List)bidirectionalStream, true);
                }
                else {
                    if (urlResponseInfo == null) {
                        throw new AssertionError((Object)"No response header or trailer");
                    }
                    this.a(urlResponseInfo.getAllHeadersAsList(), true);
                }
            }
            this.a.r(b(urlResponseInfo));
        }
    }
    
    public final void onWriteCompleted(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer, final boolean b) {
        final asas o = this.a.o;
        final arub m = asas.m;
        synchronized (o.r) {
            final arxo a = this.a;
            final asas o2 = a.o;
            final boolean y = o2.y;
            boolean b2 = true;
            if (!y) {
                o2.y = true;
                a.f.b();
            }
            final asas o3 = this.a.o;
            final int position = byteBuffer.position();
            synchronized (((arxu)o3).b) {
                agot.E(((arxu)o3).f, (Object)"onStreamAllocated was not called, but it seems the stream is active");
                final int e = ((arxu)o3).e;
                final int e2 = e - position;
                ((arxu)o3).e = e2;
                if (e < 32768 || e2 >= 32768) {
                    b2 = false;
                }
                monitorexit(((arxu)o3).b);
                if (b2) {
                    ((arxu)o3).b();
                }
            }
        }
    }
}
