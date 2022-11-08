// 
// Decompiled by Procyon v0.6.0
// 

public final class kvn implements uvf
{
    private final atjj a;
    private final ghg b;
    private final arhr c;
    private final arhr d;
    private final uyf e;
    private final uyi f;
    private final uyi g;
    
    public kvn(final atjj a, final ghg b, final uyi f, final arhr c, final arhr d, final uyf e, final uyi g) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
    }
    
    public final void a() {
        if (this.f.cH()) {
            this.b.l();
            return;
        }
        ((kte)this.a.a()).q(false);
    }
    
    public final boolean b(final utk utk) {
        if (utk.a() != null && utk.a().getContext() != null) {
            return gkt.B(this.e) && this.g.cQ() && ((kwe)this.c.a()).f == kwd.b && utk.u();
        }
        zjp.b(zjo.a, zjn.y, "[EngagementPanel] Cannot cannot determine if shouldCloseHiddenPanels because EngagementPanelController has not been initialized.");
        return false;
    }
    
    public final boolean c(final utk utk) {
        if (utk.a() != null && utk.a().getContext() != null) {
            final boolean bq = tmy.bq(utk.a().getContext());
            final kwd f = ((kwe)this.c.a()).f;
            final kwd a = kwd.a;
            return gkt.B(this.e) && ((fjp)this.d.a()).j().equals(fkk.e) && (bq || f == a) && utk.c() != null;
        }
        zjp.b(zjo.a, zjn.y, "[EngagementPanel] Cannot cannot determine if shouldExitFullscreen because EngagementPanelController has not been initialized.");
        return false;
    }
}
