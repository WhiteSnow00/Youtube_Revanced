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

public final class gmi extends twj implements fof
{
    public static final afft a;
    public final abpu b;
    public final fam c;
    public final fjv d;
    public final asid e;
    public long f;
    public boolean g;
    public int h;
    public fkr i;
    public boolean j;
    String k;
    public float l;
    public int m;
    private final vlq s;
    private final Executor t;
    private final qv u;
    
    static {
        a = afft.t((Object)8, (Object)4);
    }
    
    public gmi(final twt twt, final abpu b, final fam c, final fjv d, final Executor t, final asid e, final vlq s, final qv u, final msr msr, final vai vai, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(twt, msr, vai, (byte[])null, (byte[])null);
        this.h = 0;
        this.m = 1;
        this.i = fkr.a;
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
        final afeq a = watchNextResponseModel.e.a();
        for (int size = ((List)a).size(), i = 0; i < size; ++i) {
            final Object value = ((List)a).get(i);
            if (value instanceof aoir) {
                for (final anuv anuv : ((aoir)value).c) {
                    if (((ahbc)anuv).ry((ahaq)SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer)) {
                        ajut ajut;
                        if ((ajut = ((aoiq)((ahbc)anuv).rx((ahaq)SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer)).c) == null) {
                            ajut = ajut.a;
                        }
                        return acak.b(ajut).toString();
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
    
    public final WatchNextResponseModel e(final aiqj aiqj) {
        WatchNextResponseModel watchNextResponseModel2;
        final WatchNextResponseModel watchNextResponseModel = watchNextResponseModel2 = null;
        if (aiqj != null) {
            if (!((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                watchNextResponseModel2 = watchNextResponseModel;
            }
            else {
                final apsk apsk = (apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint);
                apsn apsn;
                if ((apsn = apsk.r) == null) {
                    apsn = apsn.a;
                }
                apsm a;
                if (apsn.b == 128400768) {
                    a = (apsm)apsn.c;
                }
                else {
                    a = apsm.a;
                }
                watchNextResponseModel2 = watchNextResponseModel;
                if ((a.b & 0x1) != 0x0) {
                    final vlq s = this.s;
                    apsn apsn2;
                    if ((apsn2 = apsk.r) == null) {
                        apsn2 = apsn.a;
                    }
                    apsm a2;
                    if (apsn2.b == 128400768) {
                        a2 = (apsm)apsn2.c;
                    }
                    else {
                        a2 = apsm.a;
                    }
                    final alem alem = (alem)s.a(a2.c.I(), (MessageLite)alem.a);
                    if (alem == null) {
                        return null;
                    }
                    watchNextResponseModel2 = new WatchNextResponseModel(alem);
                }
            }
        }
        return watchNextResponseModel2;
    }
    
    protected final Optional f() {
        if (!this.i.i()) {
            return Optional.empty();
        }
        if (gmi.a.contains((Object)this.h)) {
            return Optional.empty();
        }
        return Optional.ofNullable((Object)this.k);
    }
    
    public final void g() {
        super.r.Q((Callable)new sms((twj)this, 8));
        super.r.Q((Callable)new sms((twj)this, 9));
        if (this.u.b) {
            this.qG();
        }
        else {
            this.lV();
        }
        this.u.c((fof)this);
        this.r.Q((Callable)new csi(this, 16));
        this.r.Q((Callable)new csi(this, 17));
        this.r.Q((Callable)new csi(this, 18));
        this.r.Q((Callable)new csi(this, 19));
        this.r.Q((Callable)new csi(this, 20));
        this.r.Q((Callable)new gqw(this, 1));
    }
    
    public final void h(final String s) {
        this.k = aezr.c(s);
    }
    
    public final int i() {
        return this.m;
    }
    
    protected final void j(final String s, final float n, final int n2, final long n3) {
        final gmh gmh = new gmh(this, s, n, n2, n3);
        if (tbi.h()) {
            gmh.run();
            return;
        }
        this.t.execute(gmh);
    }
    
    public final void lV() {
        this.g = true;
    }
    
    public final void qG() {
        this.g = false;
    }
}
