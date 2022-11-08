// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.panel.ui.cinematics;

import java.util.Iterator;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import java.util.Set;

public class WatchCinematicContainerVisibilityController implements tfg, lft
{
    public final Set a;
    private final asho b;
    private final xlv c;
    private final lfa d;
    private final atid e;
    private final atid f;
    private final asgt g;
    private final asgt h;
    private final boolean i;
    private final asib j;
    
    public WatchCinematicContainerVisibilityController(final gko gko, final asho b, final xlv c, final kzd kzd, final blt blt, final abcr abcr, final ley ley, final arhr arhr, final WatchCinematicSettingsController watchCinematicSettingsController, final arhr arhr2, final Set a, final uyi uyi, final uyi uyi2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.i = ((uyi.cR() || uyi2.bb()) && gko.a() == gkm.b);
        this.j = new asib();
        final Boolean value = false;
        final atid ae = atid.aE((Object)value);
        this.e = ae;
        this.d = new lfa((aujp)ae);
        final atid ad = atid.aD();
        this.f = ad;
        Object o;
        if (uyi2.f(45381227L)) {
            o = ((c)arhr2.a()).a;
        }
        else {
            o = asgt.K((Object)value);
        }
        final asgt ad2 = asgt.i((aujo)ad, (aujo)kzd.a, (aujo)blt.d, (aujo)asgt.e((aujo)((asgt)((abns)arhr.a()).q().c).R(), (aujo)((abns)arhr.a()).w().R().L((asjc)leo.j), (asit)kwo.q).W((Object)true).p(), (aujo)ae, (aujo)watchCinematicSettingsController.c, (aujo)o, (asjb)lez.a).p().ax().aD();
        this.g = ad2;
        this.h = ad2.Y((asjc)new inw((asgt)abcr.d, ley.c, 12)).p().ax().aD();
    }
    
    public final asgt j() {
        return this.h;
    }
    
    public final void k(final lfs lfs) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((lfz)iterator.next()).b(lfs);
        }
    }
    
    public final void l() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((lfz)iterator.next()).d();
        }
    }
    
    public final void lW(final aum aum) {
        if (!this.i) {
            return;
        }
        this.e.tr((Object)(this.c.g() != null));
        this.f.tr((Object)true);
        this.c.i((xlt)this.d);
        final asgt p = this.g.p().P(this.b);
        this.j.f(new asic[] { p.y((asir)new jbd(this, 17)).t((asir)new jbd(this, 18)).am((asix)new ldk(this, 9), (asix)lei.c), p.L((asjc)leo.k).p().y((asir)new jbd(this, 19)).t((asir)new jbd(this, 19)).am((asix)new ldk(this, 10), (asix)lei.c) });
    }
    
    public final boolean m() {
        return this.i;
    }
    
    public final void my(final aum aum) {
        if (!this.i) {
            return;
        }
        this.f.tr((Object)false);
        this.c.k((xlt)this.d);
        this.j.b();
    }
}
