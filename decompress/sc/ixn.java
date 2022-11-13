import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixn implements abhr, uyg, kxu
{
    public final String a;
    public final asiq b;
    public final itt c;
    public final ativ d;
    public boolean e;
    private final arkg f;
    private final atiy g;
    private final atiw h;
    private final ashi i;
    private float j;
    
    public ixn(final arkg f, final itt c, final vai vai) {
        this.f = f;
        this.c = c;
        this.a = vai.cS();
        this.b = new asiq();
        this.g = atiy.aE();
        final ativ af = ativ.aF((Object)false);
        this.d = af;
        final atiw al = ((atiw)atiy.aE()).aL();
        this.h = al;
        this.i = ((ashi)al).j(vdh.w((ashi)af)).V();
    }
    
    private final int j() {
        return ((uve)this.f.a()).a().getHeight();
    }
    
    public final uye a() {
        return uye.a;
    }
    
    public final ashi b() {
        return (ashi)this.d;
    }
    
    public final ashi c() {
        return (ashi)this.d;
    }
    
    public final ashi d() {
        return (ashi)this.g;
    }
    
    public final ashi e() {
        return ashi.z();
    }
    
    public final ashi f() {
        return this.i;
    }
    
    public final void h(final float j) {
        if (!((uve)this.f.a()).w()) {
            if (!aezr.f(this.a)) {
                this.d.tu((Object)true);
                final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                final ahbf showEngagementPanelEndpoint = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint;
                final ahaz builder = ((ahbh)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a).createBuilder();
                final String a = this.a;
                builder.copyOnWrite();
                final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)builder.instance;
                a.getClass();
                showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = a;
                ahbb.e((ahaq)showEngagementPanelEndpoint, (Object)builder.build());
                ((uve)this.f.a()).f((aiqj)((ahaz)ahbb).build(), (uut)null, false, false);
                this.j = j;
            }
        }
    }
    
    public final void i(final float n) {
        if (!this.e) {
            return;
        }
        this.h.tu((Object)this.j());
        this.d.tu((Object)false);
        this.g.tu((Object)uyf.a);
    }
    
    public final void pi(final float j) {
        if (!this.e) {
            return;
        }
        final uve uve = (uve)this.f.a();
        final float n = j - this.j;
        final int i = this.j();
        if (n > 0.0f && uve.g().r >= i) {
            return;
        }
        this.h.tu((Object)Math.round(n * 1.5f));
        this.j = j;
    }
}
