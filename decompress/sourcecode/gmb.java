import java.util.List;
import java.util.concurrent.Callable;
import j$.util.Optional;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmb extends tuh implements foa
{
    public static final afdu a;
    public final abns b;
    public final fai c;
    public final fjp d;
    public final asho e;
    public long f;
    public boolean g;
    public int h;
    public fkk i;
    public boolean j;
    public String k;
    public float l;
    public int m;
    private final vjl s;
    private final Executor t;
    private final qv u;
    
    static {
        a = afdu.t((Object)8, (Object)4);
    }
    
    public gmb(final tus tus, final abns b, final fai c, final fjp d, final Executor t, final asho e, final vjl s, final qv u, final mrm mrm, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(tus, mrm, uyi, (byte[])null, (byte[])null, (byte[])null);
        this.h = 0;
        this.m = 1;
        this.i = fkk.a;
        this.l = 1.0f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.t = t;
        this.e = e;
        this.s = s;
        this.u = u;
    }
    
    public static final String k(final WatchNextResponseModel watchNextResponseModel) {
        if (watchNextResponseModel == null) {
            return "";
        }
        final afcr a = watchNextResponseModel.e.a();
        for (int size = ((List)a).size(), i = 0; i < size; ++i) {
            final Object value = ((List)a).get(i);
            if (value instanceof aogo) {
                for (final anss anss : ((aogo)value).c) {
                    if (((agzd)anss).rs((agyr)SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer)) {
                        ajsq ajsq;
                        if ((ajsq = ((aogn)((agzd)anss).rr((agyr)SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer)).c) == null) {
                            ajsq = ajsq.a;
                        }
                        return abyh.b(ajsq).toString();
                    }
                }
            }
        }
        return "";
    }
    
    public final double a() {
        return this.l;
    }
    
    public final long b() {
        return this.f;
    }
    
    public final WatchNextResponseModel e(final aioe aioe) {
        WatchNextResponseModel watchNextResponseModel2;
        final WatchNextResponseModel watchNextResponseModel = watchNextResponseModel2 = null;
        if (aioe != null) {
            if (!((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                watchNextResponseModel2 = watchNextResponseModel;
            }
            else {
                final apqg apqg = (apqg)((agzd)aioe).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                apqj apqj;
                if ((apqj = apqg.r) == null) {
                    apqj = apqj.a;
                }
                apqi a;
                if (apqj.b == 128400768) {
                    a = (apqi)apqj.c;
                }
                else {
                    a = apqi.a;
                }
                watchNextResponseModel2 = watchNextResponseModel;
                if ((a.b & 0x1) != 0x0) {
                    final vjl s = this.s;
                    apqj apqj2;
                    if ((apqj2 = apqg.r) == null) {
                        apqj2 = apqj.a;
                    }
                    apqi a2;
                    if (apqj2.b == 128400768) {
                        a2 = (apqi)apqj2.c;
                    }
                    else {
                        a2 = apqi.a;
                    }
                    final alcj alcj = (alcj)s.a(a2.c.I(), (MessageLite)alcj.a);
                    if (alcj == null) {
                        return null;
                    }
                    watchNextResponseModel2 = new WatchNextResponseModel(alcj);
                }
            }
        }
        return watchNextResponseModel2;
    }
    
    protected final Optional f() {
        if (!this.i.i()) {
            return Optional.empty();
        }
        if (gmb.a.contains((Object)this.h)) {
            return Optional.empty();
        }
        return Optional.ofNullable((Object)this.k);
    }
    
    public final void g() {
        super.r.A((Callable)new tuf((tuh)this, 0));
        super.r.A((Callable)new tuf((tuh)this, 2));
        if (this.u.b) {
            this.qB();
        }
        else {
            this.lV();
        }
        this.u.c((foa)this);
        this.r.A((Callable)new csh(this, 15));
        this.r.A((Callable)new csh(this, 16));
        this.r.A((Callable)new csh(this, 17));
        this.r.A((Callable)new csh(this, 18));
        this.r.A((Callable)new csh(this, 19));
        this.r.A((Callable)new csh(this, 20));
    }
    
    public final void h(final String s) {
        this.k = aexs.c(s);
    }
    
    public final int i() {
        return this.m;
    }
    
    protected final void j(final String s, final float n, final int n2, final long n3) {
        final gma gma = new gma(this, s, n, n2, n3);
        if (szc.h()) {
            ((Runnable)gma).run();
            return;
        }
        this.t.execute((Runnable)gma);
    }
    
    public final void lV() {
        this.g = true;
    }
    
    public final void qB() {
        this.g = false;
    }
}
