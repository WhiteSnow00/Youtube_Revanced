import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esd implements atke
{
    public final Object a;
    private final int b;
    
    public esd(final abll a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final arkg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final eoq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final gkx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final igh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final igk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final iri a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final iup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final iwb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esd(final jfx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        final int b = this.b;
        final boolean b2 = false;
        boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        switch (b) {
            default: {
                boolean b6 = b4;
                if (((jfx)this.a).b() > 0) {
                    b6 = true;
                }
                return b6;
            }
            case 19: {
                final Boolean g = ((jfx)this.a).G;
                boolean b7 = b5;
                if (g != null) {
                    b7 = b5;
                    if (!g) {
                        b7 = true;
                    }
                }
                return b7;
            }
            case 18: {
                final YouTubePlayerViewNotForReflection r = ((iru)((iri)this.a).b()).R;
                r.getClass();
                return ((abue)r).m;
            }
            case 17: {
                return ((iwb)this.a).c;
            }
            case 16: {
                final iup iup = (iup)this.a;
                iup.q.b();
                final toz p = iup.p;
                p.getClass();
                return p;
            }
            case 15: {
                final igk igk = (igk)this.a;
                boolean b8 = b2;
                if (((aabo)igk.b.a()).a().i().a(igk.e) > 0) {
                    b8 = true;
                }
                return b8;
            }
            case 14: {
                return Boolean.FALSE.equals(((igk)this.a).m);
            }
            case 13: {
                final igh igh = (igh)this.a;
                if (((aabo)igh.b.a()).a().i().a(igh.e) > 0) {
                    b3 = true;
                }
                return b3;
            }
            case 12: {
                return Boolean.FALSE.equals(((igh)this.a).m);
            }
            case 11: {
                final abll abll = (abll)this.a;
                return new vre(abll.c, ((zmf)abll.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 10: {
                final abll abll2 = (abll)this.a;
                return new vrd(abll2.c, ((zmf)abll2.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 9: {
                final abll abll3 = (abll)this.a;
                return new vra(abll3.c, ((zmf)abll3.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 8: {
                final Object a = this.a;
                final gkv a2 = gkv.a;
                final int ordinal = ((gkx)a).a().ordinal();
                qsp qsp;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        qsp = qsp.a;
                    }
                    else {
                        qsp = qsp.c;
                    }
                }
                else {
                    qsp = qsp.b;
                }
                return qsp;
            }
            case 7: {
                final Object a3 = this.a;
                final int a4 = ews.a;
                return afft.s((Object)((atke)a3).a());
            }
            case 6: {
                final Object a5 = this.a;
                final int a6 = ews.a;
                return afft.s((Object)((atke)a5).a());
            }
            case 5: {
                return ((esm)this.a).a;
            }
            case 4: {
                return new adjd(((esm)this.a).c);
            }
            case 3: {
                return new adjc(((esm)this.a).az);
            }
            case 2: {
                return ((arkg)this.a).a();
            }
            case 1: {
                return afeq.r((Object)new cyb((eoq)this.a));
            }
            case 0: {
                return ((atke)this.a).a();
            }
        }
    }
}
