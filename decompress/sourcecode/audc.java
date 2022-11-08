import org.chromium.net.UploadDataProvider;
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

public final class audc implements audl
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public audc(final atyo a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public audc(final audc a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public audc(final audd a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public audc(final aude a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public audc(final audi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public audc(final audk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        boolean b2 = true;
        switch (b) {
            default: {
                if (((audi)this.a).d.g.compareAndSet(1, 4)) {
                    final audi audi = (audi)this.a;
                    final auee a = audi.a;
                    final audk d = audi.d;
                    a.onResponseStarted((UrlRequest)d, (UrlResponseInfo)d.o);
                    return;
                }
                break;
            }
            case 6: {
                if (((audk)this.a).g.get() == 8) {
                    return;
                }
                final URL url = new URL(((audk)this.a).m);
                final HttpURLConnection q = ((audk)this.a).q;
                if (q != null) {
                    q.disconnect();
                    ((audk)this.a).q = null;
                }
                (((audk)this.a).q = (HttpURLConnection)url.openConnection()).setInstanceFollowRedirects(false);
                if (!((audk)this.a).e.containsKey("User-Agent")) {
                    final audk audk = (audk)this.a;
                    audk.e.put("User-Agent", audk.d);
                }
                for (final Map.Entry<String, V> entry : ((audk)this.a).e.entrySet()) {
                    ((audk)this.a).q.setRequestProperty(entry.getKey(), (String)entry.getValue());
                }
                final audk audk2 = (audk)this.a;
                if (audk2.i == null) {
                    audk2.i = "GET";
                }
                audk2.q.setRequestMethod(audk2.i);
                final audk audk3 = (audk)this.a;
                final aued j = audk3.j;
                if (j != null) {
                    audk3.t = new aude(audk3, audk3.k, audk3.c, audk3.q, j);
                    final audk audk4 = (audk)this.a;
                    final aude t = audk4.t;
                    if (audk4.f.size() != 1) {
                        b2 = false;
                    }
                    t.a((audl)new audd(t, b2, 0));
                    return;
                }
                audk3.l = 10;
                ((audk)this.a).q.connect();
                ((audk)this.a).m();
                return;
            }
            case 5: {
                ((UploadDataProvider)((audk)this.a).j).close();
                return;
            }
            case 4: {
                if (((audk)this.a).q == null) {
                    return;
                }
                final ArrayList list = new ArrayList();
                String headerField = "http/1.1";
                int n = 0;
                while (true) {
                    final String headerFieldKey = ((audk)this.a).q.getHeaderFieldKey(n);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = ((audk)this.a).q.getHeaderField(n);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        list.add(new AbstractMap.SimpleEntry(headerFieldKey, ((audk)this.a).q.getHeaderField(n)));
                    }
                    ++n;
                }
                final int responseCode = ((audk)this.a).q.getResponseCode();
                final audk audk5;
                audk5.o = new audw((List)new ArrayList((audk5 = (audk)this.a).f), responseCode, ((audk)this.a).q.getResponseMessage(), (List)Collections.unmodifiableList((List<?>)list), false, headerField, "", 0L);
                if (responseCode >= 300 && responseCode < 400) {
                    final List list2 = ((audk)this.a).o.getAllHeaders().get("location");
                    if (list2 != null) {
                        final Object a2 = this.a;
                        final String s = (String)list2.get(0);
                        final audk audk6 = (audk)a2;
                        audk6.o(1, 2, new atyo(audk6, s, 11));
                        return;
                    }
                }
                ((audk)this.a).k();
                if (responseCode >= 400) {
                    final InputStream errorStream = ((audk)this.a).q.getErrorStream();
                    final Object a3 = this.a;
                    ReadableByteChannel a4;
                    if (errorStream == null) {
                        a4 = null;
                    }
                    else {
                        a4 = aucx.a(errorStream);
                    }
                    ((audk)a3).n = a4;
                    ((audk)this.a).b.c();
                    return;
                }
                final audk audk7 = (audk)this.a;
                audk7.n = aucx.a(audk7.q.getInputStream());
                ((audk)this.a).b.c();
                return;
            }
            case 3: {
                final atyo atyo = (atyo)this.a;
                final ReadableByteChannel n2 = ((audk)atyo.a).n;
                int read;
                if (n2 == null) {
                    read = -1;
                }
                else {
                    read = n2.read((ByteBuffer)atyo.b);
                }
                final atyo atyo2 = (atyo)this.a;
                final Object a5 = atyo2.a;
                final Object b3 = atyo2.b;
                if (read != -1) {
                    final audk audk8 = (audk)a5;
                    final audi b4 = audk8.b;
                    b4.a((audl)new audh(b4, (UrlResponseInfo)audk8.o, (ByteBuffer)b3, 0));
                    return;
                }
                final audk audk9 = (audk)a5;
                final ReadableByteChannel n3 = audk9.n;
                if (n3 != null) {
                    n3.close();
                }
                if (audk9.g.compareAndSet(5, 7)) {
                    audk9.l();
                    final audi b5 = audk9.b;
                    b5.b.execute(new atyo(b5, (UrlResponseInfo)audk9.o, 15));
                }
                return;
            }
            case 2: {
                final aude aude = (aude)this.a;
                if (aude.g == null) {
                    aude.i.l = 10;
                    aude.f.setDoOutput(true);
                    aude.f.connect();
                    aude.i.l = 12;
                    aude.h = aude.f.getOutputStream();
                    aude.g = Channels.newChannel(aude.h);
                }
                ((aude)this.a).a.set(0);
                ((aude)this.a).a((audl)new audc(this, 0, null));
                return;
            }
            case 1: {
                final aude b6 = ((audd)this.a).b;
                b6.b.read((UploadDataSink)b6, b6.c);
                return;
            }
            case 0: {
                final Object a6 = ((audc)this.a).a;
                final aude aude2 = (aude)a6;
                aude2.b.read((UploadDataSink)a6, aude2.c);
                break;
            }
        }
    }
}
