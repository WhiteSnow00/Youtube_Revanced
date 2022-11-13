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

public final class audt implements auec
{
    final Object a;
    private final int b;
    
    public audt(final asfa a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public audt(final audt a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public audt(final audu a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public audt(final audv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public audt(final audz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public audt(final aueb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final int b = this.b;
        boolean b2 = true;
        switch (b) {
            default: {
                if (((audz)this.a).d.g.compareAndSet(1, 4)) {
                    final audz audz = (audz)this.a;
                    final auev a = audz.a;
                    final aueb d = audz.d;
                    a.onResponseStarted((UrlRequest)d, d.o);
                    return;
                }
                break;
            }
            case 6: {
                if (((aueb)this.a).g.get() == 8) {
                    return;
                }
                final URL url = new URL(((aueb)this.a).m);
                final HttpURLConnection q = ((aueb)this.a).q;
                if (q != null) {
                    q.disconnect();
                    ((aueb)this.a).q = null;
                }
                (((aueb)this.a).q = (HttpURLConnection)url.openConnection()).setInstanceFollowRedirects(false);
                if (!((aueb)this.a).e.containsKey("User-Agent")) {
                    final aueb aueb = (aueb)this.a;
                    aueb.e.put("User-Agent", aueb.d);
                }
                for (final Map.Entry<String, V> entry : ((aueb)this.a).e.entrySet()) {
                    ((aueb)this.a).q.setRequestProperty(entry.getKey(), (String)entry.getValue());
                }
                final aueb aueb2 = (aueb)this.a;
                if (aueb2.i == null) {
                    aueb2.i = "GET";
                }
                aueb2.q.setRequestMethod(aueb2.i);
                final aueb aueb3 = (aueb)this.a;
                final aueu j = aueb3.j;
                if (j != null) {
                    aueb3.t = new audv(aueb3, aueb3.k, aueb3.c, aueb3.q, j);
                    final aueb aueb4 = (aueb)this.a;
                    final audv t = aueb4.t;
                    if (aueb4.f.size() != 1) {
                        b2 = false;
                    }
                    t.a(new audu(t, b2, 0));
                    return;
                }
                aueb3.l = 10;
                ((aueb)this.a).q.connect();
                ((aueb)this.a).m();
                return;
            }
            case 5: {
                ((aueb)this.a).j.close();
                return;
            }
            case 4: {
                if (((aueb)this.a).q == null) {
                    return;
                }
                final ArrayList list = new ArrayList();
                String headerField = "http/1.1";
                int n = 0;
                while (true) {
                    final String headerFieldKey = ((aueb)this.a).q.getHeaderFieldKey(n);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = ((aueb)this.a).q.getHeaderField(n);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        list.add(new AbstractMap.SimpleEntry(headerFieldKey, ((aueb)this.a).q.getHeaderField(n)));
                    }
                    ++n;
                }
                final int responseCode = ((aueb)this.a).q.getResponseCode();
                final aueb aueb5;
                aueb5.o = new auen(new ArrayList((aueb5 = (aueb)this.a).f), responseCode, ((aueb)this.a).q.getResponseMessage(), Collections.unmodifiableList((List<?>)list), false, headerField, "", 0L);
                if (responseCode >= 300 && responseCode < 400) {
                    final List list2 = ((aueb)this.a).o.getAllHeaders().get("location");
                    if (list2 != null) {
                        final Object a2 = this.a;
                        final String s = (String)list2.get(0);
                        final aueb aueb6 = (aueb)a2;
                        aueb6.o(1, 2, new asfa(aueb6, s, 11));
                        return;
                    }
                }
                ((aueb)this.a).k();
                if (responseCode >= 400) {
                    final InputStream errorStream = ((aueb)this.a).q.getErrorStream();
                    final Object a3 = this.a;
                    ReadableByteChannel a4;
                    if (errorStream == null) {
                        a4 = null;
                    }
                    else {
                        a4 = audo.a(errorStream);
                    }
                    ((aueb)a3).n = a4;
                    ((aueb)this.a).b.c();
                    return;
                }
                final aueb aueb7 = (aueb)this.a;
                aueb7.n = audo.a(aueb7.q.getInputStream());
                ((aueb)this.a).b.c();
                return;
            }
            case 3: {
                final asfa asfa = (asfa)this.a;
                final ReadableByteChannel n2 = ((aueb)asfa.a).n;
                int read;
                if (n2 == null) {
                    read = -1;
                }
                else {
                    read = n2.read((ByteBuffer)asfa.b);
                }
                final asfa asfa2 = (asfa)this.a;
                final Object a5 = asfa2.a;
                final Object b3 = asfa2.b;
                if (read != -1) {
                    final aueb aueb8 = (aueb)a5;
                    final audz b4 = aueb8.b;
                    b4.a(new audy(b4, aueb8.o, (ByteBuffer)b3, 0));
                    return;
                }
                final aueb aueb9 = (aueb)a5;
                final ReadableByteChannel n3 = aueb9.n;
                if (n3 != null) {
                    n3.close();
                }
                if (aueb9.g.compareAndSet(5, 7)) {
                    aueb9.l();
                    final audz b5 = aueb9.b;
                    b5.b.execute(new asfa(b5, aueb9.o, 15));
                }
                return;
            }
            case 2: {
                final audv audv = (audv)this.a;
                if (audv.g == null) {
                    audv.i.l = 10;
                    audv.f.setDoOutput(true);
                    audv.f.connect();
                    audv.i.l = 12;
                    audv.h = audv.f.getOutputStream();
                    audv.g = Channels.newChannel(audv.h);
                }
                ((audv)this.a).a.set(0);
                ((audv)this.a).a(new audt(this, 0, null));
                return;
            }
            case 1: {
                final audv b6 = ((audu)this.a).b;
                b6.b.read((UploadDataSink)b6, b6.c);
                return;
            }
            case 0: {
                final Object a6 = ((audt)this.a).a;
                final audv audv2 = (audv)a6;
                audv2.b.read((UploadDataSink)a6, audv2.c);
                break;
            }
        }
    }
}
