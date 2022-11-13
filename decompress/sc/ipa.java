// 
// Decompiled by Procyon v0.6.0
// 

public final class ipa implements idw
{
    public final ipc a;
    
    public ipa(final ipc a) {
        this.a = a;
    }
    
    private final void c(final String s, final String... array) {
        final ipc a = this.a;
        final asht h = a.f.a(a.o.c()).h(s, true);
        final aipx b = this.a.x.b();
        asht q = h;
        if (b != null) {
            q = h;
            if ((b.b & 0x40000) != 0x0) {
                amjm amjm;
                if ((amjm = b.m) == null) {
                    amjm = amjm.a;
                }
                q = h;
                if (amjm.r) {
                    q = h.q(tpe.cl(this.a.A.K()));
                }
            }
        }
        q.K((asjs)ija.m).aD().e().r((asjm)new ihl(s, 9)).D().V((asjg)new gcw(this, array, 7));
    }
    
    public final void a(final String s) {
        if (this.a.y.ax()) {
            this.c(glb.J(s), "downloads_page_downloads_item_section_identifier", "downloads_page_disclaimer_item_section_identifier");
        }
        else {
            this.c(glb.x(s), "downloads_page_downloads_item_section_identifier", "downloads_page_disclaimer_item_section_identifier");
        }
        this.c(glb.M(s), "downloads_page_disclaimer_item_section_identifier");
    }
    
    public final void b() {
    }
}
