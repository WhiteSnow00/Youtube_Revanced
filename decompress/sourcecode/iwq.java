import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwq implements abfw, uwl, kwr
{
    public final String a;
    public final asib b;
    public final isu c;
    public final atid d;
    public boolean e;
    private final arhr f;
    private final atig g;
    private final atie h;
    private final asgt i;
    private float j;
    
    public iwq(final arhr f, final isu c, final uyi uyi) {
        this.f = f;
        this.c = c;
        this.a = uyi.cO();
        this.b = new asib();
        this.g = atig.aD();
        final atid ae = atid.aE((Object)false);
        this.d = ae;
        final atie ak = ((atie)atig.aD()).aK();
        this.h = ak;
        this.i = ((asgt)ak).j(vem.t((asgt)ae)).V();
    }
    
    private final int j() {
        return ((utk)this.f.a()).a().getHeight();
    }
    
    public final uwj a() {
        return uwj.a;
    }
    
    public final asgt b() {
        return (asgt)this.d;
    }
    
    public final asgt c() {
        return (asgt)this.d;
    }
    
    public final asgt d() {
        return (asgt)this.g;
    }
    
    public final asgt e() {
        return asgt.z();
    }
    
    public final asgt f() {
        return this.i;
    }
    
    @Override
    public final void h(final float j) {
        if (!((utk)this.f.a()).w()) {
            if (!aexs.f(this.a)) {
                this.d.tr((Object)true);
                final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                final agzg showEngagementPanelEndpoint = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint;
                final agza builder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                final String a = this.a;
                builder.copyOnWrite();
                final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)builder.instance;
                a.getClass();
                showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = a;
                agzc.e((agyr)showEngagementPanelEndpoint, builder.build());
                ((utk)this.f.a()).f((aioe)agzc.build(), (usz)null, false, false);
                this.j = j;
            }
        }
    }
    
    @Override
    public final void i(final float n) {
        if (!this.e) {
            return;
        }
        this.h.tr((Object)this.j());
        this.d.tr((Object)false);
        this.g.tr((Object)uwk.a);
    }
    
    @Override
    public final void pg(final float j) {
        if (!this.e) {
            return;
        }
        final utk utk = (utk)this.f.a();
        final float n = j - this.j;
        final int i = this.j();
        if (n > 0.0f && utk.g().r >= i) {
            return;
        }
        this.h.tr((Object)Math.round(n * 1.5f));
        this.j = j;
    }
}
