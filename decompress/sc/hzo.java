// 
// Decompiled by Procyon v0.6.0
// 

public final class hzo
{
    public ajsk a;
    
    public hzo(final ajsk ajsk) {
        this.c(ajsk);
    }
    
    public final apog a() {
        ajsl ajsl;
        if ((ajsl = this.a.h) == null) {
            ajsl = ajsl.a;
        }
        apog apog;
        if ((apog = ajsl.e) == null) {
            apog = apog.a;
        }
        return apog;
    }
    
    public final void b(final apog e) {
        final ahbb ahbb = (ahbb)((ahbh)this.a).toBuilder();
        ajsl ajsl;
        if ((ajsl = this.a.h) == null) {
            ajsl = ajsl.a;
        }
        final ahaz builder = ((ahbh)ajsl).toBuilder();
        builder.copyOnWrite();
        final ajsl ajsl2 = (ajsl)builder.instance;
        e.getClass();
        ajsl2.e = e;
        ajsl2.b |= 0x40;
        ((ahaz)ahbb).copyOnWrite();
        final ajsk ajsk = (ajsk)ahbb.instance;
        final ajsl h = (ajsl)builder.build();
        h.getClass();
        ajsk.h = h;
        ajsk.b |= 0x80;
        this.a = (ajsk)((ahaz)ahbb).build();
    }
    
    public final void c(final ajsk a) {
        this.a = a;
        ajsl ajsl;
        if ((ajsl = a.h) == null) {
            ajsl = ajsl.a;
        }
        adkp.Q((ajsl.b & 0x40) != 0x0);
    }
    
    public final byte[] d() {
        return this.a().E.I();
    }
    
    public final int e() {
        apoh apoh;
        if ((apoh = this.a().y) == null) {
            apoh = apoh.a;
        }
        int ap;
        if ((ap = aqsx.ap(apoh.b)) == 0) {
            ap = 1;
        }
        return ap;
    }
}
