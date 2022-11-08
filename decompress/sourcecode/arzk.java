import java.util.List;
import android.util.Log;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import io.grpc.Status;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzk implements Runnable
{
    final /* synthetic */ Object a = a;
    final /* synthetic */ Object b = b;
    final /* synthetic */ Object c = c;
    private final /* synthetic */ int d;
    
    public arzk(final arzo c, final Status b, final arug a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzk(final arzp c, final aqzg a, final arug b, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzk(final asbr c, final arto b, final arrx a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzk(final audi c, final UrlResponseInfo b, final CronetException a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzk(final CronetUrlRequest b, final audw c, final String a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int d = this.d;
        if (d == 0) {
            ((arzp)this.c).b.l((aqzg)this.a, (arug)this.b);
            return;
        }
        int i = 0;
        if (d == 1) {
            final Object b = this.b;
            final Object c = this.c;
            final Object a = this.a;
            while (i < ((List)c).size()) {
                final arwr arwr = (arwr)((List)c).get(i);
                synchronized (arwr) {
                    arwr.h((Status)a);
                    monitorexit(arwr);
                    ++i;
                    continue;
                }
                break;
            }
            final arwg arwg = (arwg)b;
            arwg.h();
            arwg.i();
            return;
        }
        if (d != 2) {
            if (d != 3) {
                if (d != 4) {
                    if (d != 5) {
                        final Object b2 = this.b;
                        final Object a2 = this.a;
                        final Object c2 = this.c;
                        final aukh aukh = (aukh)b2;
                        aukh.b("EglBase.create shared context");
                        aukh.g = auju.d((aujw)a2, (int[])c2);
                        return;
                    }
                    try {
                        final Object c3 = this.c;
                        ((audi)c3).a.onFailed((UrlRequest)((audi)c3).d, (UrlResponseInfo)this.b, (CronetException)this.a);
                        ((audi)this.c).b();
                        return;
                    }
                    catch (final Exception ex) {
                        Log.e(audk.a, "Exception in onFailed method", (Throwable)ex);
                        return;
                    }
                }
                ((CronetUrlRequest)this.b).b();
                final Object c4 = ((CronetUrlRequest)this.b).c;
                synchronized (c4) {
                    final Object b3 = this.b;
                    if (((CronetUrlRequest)b3).j()) {
                        return;
                    }
                    ((CronetUrlRequest)b3).b = true;
                    monitorexit(c4);
                    try {
                        final Object b4 = this.b;
                        ((CronetUrlRequest)b4).d.onRedirectReceived((UrlRequest)b4, (UrlResponseInfo)this.c, (String)this.a);
                        return;
                    }
                    catch (final Exception c4) {
                        ((CronetUrlRequest)this.b).e((Exception)c4);
                        return;
                    }
                }
            }
            final Object c5 = this.c;
            final asbz b5 = ((asbr)c5).b;
            if (c5 == b5.s) {
                b5.m((arto)this.b);
                final Object a3 = this.a;
                if (a3 != arrx.e) {
                    ((asbr)this.c).b.H.b(2, "Entering {0} state with picker: {1}", new Object[] { a3, this.b });
                    ((asbr)this.c).b.p.a((arrx)this.a);
                }
            }
            return;
        }
        ((arzo)this.c).c.a((Status)this.b, (arug)this.a);
    }
}
