// 
// Decompiled by Procyon v0.6.0
// 

public final class gsv extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public gtk a;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean b;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public long c;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public long d;
    
    public gsv() {
        super("ClipScrubber");
    }
    
    protected final dst c(final dsx dsx) {
        final long c = this.c;
        final long d = this.d;
        final gtk a = this.a;
        final boolean b = this.b;
        final dsm b2 = dsn.b(dsx);
        final gsy gsy = new gsy();
        gsy.c(gsy, dsx, new gta());
        gsy.a.a = a;
        gsy.d.set(0);
        ((dsr)gsy).H(16.0f);
        b2.l(((dsr)gsy).B(4, 16.0f));
        final dwn b3 = dwo.b(dsx);
        final gsw gsw = new gsw();
        gsw.c(gsw, dsx, new gsx());
        ((dsr)gsw).S(100.0f);
        ((dsr)gsw).H(66.0f);
        gsw.a.b = c;
        gsw.d.set(2);
        gsw.a.c = (iw)a;
        gsw.d.set(0);
        gsw.a.a = d;
        gsw.d.set(1);
        b3.ac((dsr)gsw);
        final gsm gsm = new gsm();
        gsm.c(gsm, dsx, new gso());
        gsm.a.a = a;
        gsm.d.set(0);
        ((dsr)gsm).S(100.0f);
        ((dsr)gsm).I(100.0f);
        ((dsr)gsm).N(3);
        ((dsr)gsm).O(9, 10.0f);
        gsm.a.b = b;
        gsm.d.set(1);
        b3.ac((dsr)gsm);
        final gsr gsr = new gsr();
        gsr.c(gsr, dsx, new gst());
        gsr.a.a = a;
        gsr.d.set(0);
        ((dsr)gsr).S(100.0f);
        ((dsr)gsr).I(100.0f);
        ((dsr)gsr).N(3);
        b3.ac((dsr)gsr);
        b2.l((dsr)b3);
        final gsp gsp = new gsp();
        gsp.c(gsp, dsx, new gsq());
        gsp.a.a = a;
        gsp.d.set(0);
        ((dsr)gsp).H(16.0f);
        final gsp gsp2 = (gsp)((dsr)gsp).B(2, 20.0f);
        ((dsr)gsp2).S(100.0f);
        b2.l((dsr)gsp2);
        return ((dsm)((dsr)((dsr)b2).B(4, 24.0f)).B(2, 24.0f)).a;
    }
}
