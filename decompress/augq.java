import java.nio.channels.ReadableByteChannel;
import java.io.InputStream;
import java.util.Iterator;
import org.chromium.net.UploadDataSink;
import java.nio.channels.Channels;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augq implements augy
{
    final Object a;
    private final int b;
    
    public augq(final ashw a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public augq(final augq a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public augq(final augr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public augq(final augs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augq(final augv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augq(final augx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final int b = this.b;
        boolean b2 = true;
        switch (b) {
            default: {
                if (((augv)this.a).d.g.compareAndSet(1, 4)) {
                    final augv augv = (augv)this.a;
                    final auhr a = augv.a;
                    final augx d = augv.d;
                    a.onResponseStarted((UrlRequest)d, d.o);
                    return;
                }
                break;
            }
            case 6: {
                if (((augx)this.a).g.get() == 8) {
                    return;
                }
                final URL url = new URL(((augx)this.a).m);
                final HttpURLConnection q = ((augx)this.a).q;
                if (q != null) {
                    q.disconnect();
                    ((augx)this.a).q = null;
                }
                (((augx)this.a).q = (HttpURLConnection)url.openConnection()).setInstanceFollowRedirects(false);
                if (!((augx)this.a).e.containsKey("User-Agent")) {
                    final augx augx = (augx)this.a;
                    augx.e.put("User-Agent", augx.d);
                }
                for (final Map.Entry<String, V> entry : ((augx)this.a).e.entrySet()) {
                    ((augx)this.a).q.setRequestProperty(entry.getKey(), (String)entry.getValue());
                }
                final augx augx2 = (augx)this.a;
                if (augx2.i == null) {
                    augx2.i = "GET";
                }
                augx2.q.setRequestMethod(augx2.i);
                final augx augx3 = (augx)this.a;
                final auhq j = augx3.j;
                if (j != null) {
                    augx3.t = new augs(augx3, augx3.k, augx3.c, augx3.q, j);
                    final augx augx4 = (augx)this.a;
                    final augs t = augx4.t;
                    if (augx4.f.size() != 1) {
                        b2 = false;
                    }
                    t.a(new augr(t, b2, 0));
                    return;
                }
                augx3.l = 10;
                ((augx)this.a).q.connect();
                ((augx)this.a).m();
                return;
            }
            case 5: {
                ((augx)this.a).j.close();
                return;
            }
            case 4: {
                if (((augx)this.a).q == null) {
                    return;
                }
                final ArrayList list = new ArrayList();
                String headerField = "http/1.1";
                int n = 0;
                while (true) {
                    final String headerFieldKey = ((augx)this.a).q.getHeaderFieldKey(n);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = ((augx)this.a).q.getHeaderField(n);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        list.add(new AbstractMap.SimpleEntry(headerFieldKey, ((augx)this.a).q.getHeaderField(n)));
                    }
                    ++n;
                }
                final int responseCode = ((augx)this.a).q.getResponseCode();
                final augx augx5;
                augx5.o = new auhj(new ArrayList((augx5 = (augx)this.a).f), responseCode, ((augx)this.a).q.getResponseMessage(), Collections.unmodifiableList((List<?>)list), false, headerField, "", 0L);
                if (responseCode >= 300 && responseCode < 400) {
                    final List list2 = ((augx)this.a).o.getAllHeaders().get("location");
                    if (list2 != null) {
                        final Object a2 = this.a;
                        final String s = (String)list2.get(0);
                        final augx augx6 = (augx)a2;
                        augx6.o(1, 2, (Runnable)new ashw(augx6, s, 13));
                        return;
                    }
                }
                ((augx)this.a).k();
                if (responseCode >= 400) {
                    final InputStream errorStream = ((augx)this.a).q.getErrorStream();
                    final Object a3 = this.a;
                    ReadableByteChannel a4;
                    if (errorStream == null) {
                        a4 = null;
                    }
                    else {
                        a4 = augl.a(errorStream);
                    }
                    ((augx)a3).n = a4;
                    ((augx)this.a).b.c();
                    return;
                }
                final augx augx7 = (augx)this.a;
                augx7.n = augl.a(augx7.q.getInputStream());
                ((augx)this.a).b.c();
                return;
            }
            case 3: {
                final ashw ashw = (ashw)this.a;
                final ReadableByteChannel n2 = ((augx)ashw.b).n;
                int read;
                if (n2 == null) {
                    read = -1;
                }
                else {
                    read = n2.read((ByteBuffer)ashw.a);
                }
                final ashw ashw2 = (ashw)this.a;
                final Object b3 = ashw2.b;
                final Object a5 = ashw2.a;
                if (read != -1) {
                    final augx augx8 = (augx)b3;
                    final augv b4 = augx8.b;
                    b4.a(new augu(b4, augx8.o, (ByteBuffer)a5, 0));
                    return;
                }
                final augx augx9 = (augx)b3;
                final ReadableByteChannel n3 = augx9.n;
                if (n3 != null) {
                    n3.close();
                }
                if (augx9.g.compareAndSet(5, 7)) {
                    augx9.l();
                    final augv b5 = augx9.b;
                    b5.b.execute((Runnable)new ashw(b5, (UrlResponseInfo)augx9.o, 17));
                }
                return;
            }
            case 2: {
                final augs augs = (augs)this.a;
                if (augs.g == null) {
                    augs.i.l = 10;
                    augs.f.setDoOutput(true);
                    augs.f.connect();
                    augs.i.l = 12;
                    augs.h = augs.f.getOutputStream();
                    augs.g = Channels.newChannel(augs.h);
                }
                ((augs)this.a).a.set(0);
                ((augs)this.a).a(new augq(this, 0, null));
                return;
            }
            case 1: {
                final augs b6 = ((augr)this.a).b;
                b6.b.read((UploadDataSink)b6, b6.c);
                return;
            }
            case 0: {
                final Object a6 = ((augq)this.a).a;
                final augs augs2 = (augs)a6;
                augs2.b.read((UploadDataSink)a6, augs2.c);
                break;
            }
        }
    }
}
