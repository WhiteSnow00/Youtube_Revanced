import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map;
import java.util.HashMap;
import android.view.View;
import android.widget.AdapterView;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import j$.util.Optional;
import java.util.Iterator;
import android.content.Context;
import com.google.protobuf.MessageLite;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acsd extends acsn implements AdapterView$OnItemClickListener, acay
{
    public acsc ae;
    private amgs af;
    private acle ag;
    private acpk ah;
    private arkg ai;
    private acbm aj;
    private wyw ak;
    private Integer al;
    private vgo am;
    private boolean an;
    private ListView ao;
    private aeea ap;
    
    public static acsd aM(final amgs amgs, final acpk ah, final wyv wyv, final Integer al, final vgo am, final boolean an, final arkg ai, final acbm aj, final aeea ap) {
        final acsd acsd = new acsd();
        acsd.am = am;
        acsd.an = an;
        acsd.ai = ai;
        acsd.aj = aj;
        acsd.ap = ap;
        if (amgs != null) {
            final Bundle bundle = new Bundle();
            adyf.aA(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)amgs);
            ((br)acsd).ag(bundle);
        }
        ah.getClass();
        acsd.ah = ah;
        acsd.al = al;
        ((br)acsd).am(true);
        if (wyv != null) {
            acsd.ak = wyv.pF();
        }
        return acsd;
    }
    
    private final void aN(final akdi akdi, final ttg ttg) {
        if (akdi != null && (akdi.b & 0x1) != 0x0) {
            final acpk ah = this.ah;
            if (ah != null) {
                akdh akdh;
                if ((akdh = akdh.b(akdi.c)) == null) {
                    akdh = akdh.a;
                }
                final int a = ah.a(akdh);
                if (a != 0) {
                    final Integer al = this.al;
                    if (al != null) {
                        ttg.a((Object)tpe.k(((br)this).nT(), a, (int)al));
                        return;
                    }
                    ttg.a((Object)agx.a(((br)this).nT(), a));
                    return;
                }
            }
        }
        ttg.a((Object)null);
    }
    
    public final void W() {
        super.W();
        final aeea ap = this.ap;
        if (ap != null) {
            ap.as((acay)this);
        }
    }
    
    public final void Y() {
        super.Y();
        if (((br)this).od().isInPictureInPictureMode()) {
            ((bi)this).dismiss();
        }
    }
    
    protected final acrw aK() {
        this.ag = new acle();
        final amgs af = this.af;
        if (af != null) {
            for (final amgp amgp : af.c) {
                final aezp al = this.aL(amgp);
                if (al.h()) {
                    this.ag.add(al.c());
                    if (!this.an) {
                        continue;
                    }
                    final aun mk = ((br)this).mK();
                    final vgo am = this.am;
                    final acle ag = this.ag;
                    aald.p(amgp, (Object)null, mk, am, ag, ((tfz)ag).size() - 1, (aezf)new abkr(this, 11));
                }
            }
        }
        if (((tfz)this.ag).isEmpty()) {
            zlm.b(zll.b, zlk.y, "Bottom Sheet Menu is empty. No menu items were supported.");
        }
        return new acrw((Context)((br)this).od(), (acjn)this.ag);
    }
    
    public final aezp aL(final amgp amgp) {
        if ((amgp.b & 0x2000) != 0x0) {
            final arkg ai = this.ai;
            if (ai != null) {
                final acbm aj = this.aj;
                if (aj != null) {
                    final wyw ak = this.ak;
                    if (ak != null) {
                        ajmo ajmo;
                        if ((ajmo = amgp.p) == null) {
                            ajmo = ajmo.a;
                        }
                        return aezp.k((Object)new acrx(ai, aj, ak, ajmo));
                    }
                }
            }
            zlm.b(zll.b, zlk.y, "ElementTransformer, ElementPresenter and InteractionLogger cannot be null");
            return (aezp)aeyo.a;
        }
        final akdi f = vyg.f(amgp);
        final CharSequence h = vyg.h(amgp);
        boolean b = true;
        if (h == null) {
            if (f != null && (f.b & 0x1) != 0x0) {
                final zll b2 = zll.b;
                final zlk y = zlk.y;
                akdh akdh;
                if ((akdh = akdh.b(f.c)) == null) {
                    akdh = akdh.a;
                }
                final int sy = akdh.sy;
                final StringBuilder sb = new StringBuilder("Text missing for BottomSheetMenuItem with iconType: ");
                sb.append(sy);
                zlm.b(b2, y, sb.toString());
            }
            else {
                zlm.b(zll.b, zlk.y, "Text missing for BottomSheetMenuItem.");
            }
            return (aezp)aeyo.a;
        }
        final ahab c = vyg.c(amgp);
        if (this.ak != null && !c.H()) {
            this.ak.t((wzz)new wyt(c), (alhi)null);
        }
        final acrz acrz = new acrz(h.toString(), amgp);
        if (vyg.j(amgp) == 2) {
            b = false;
        }
        ((acry)acrz).d(b);
        this.aN(f, (ttg)new zhf(acrz, 16));
        this.aN(vyg.g(amgp), (ttg)new zhf(acrz, 17));
        return aezp.k((Object)acrz);
    }
    
    protected final Optional aU() {
        final bu od = ((br)this).od();
        final acrw ak = this.aK();
        if (od != null && ak.getCount() != 0) {
            (this.ao = (ListView)new acss((Context)od)).setAdapter((ListAdapter)this.aK());
            this.ao.setOnItemClickListener((AdapterView$OnItemClickListener)this);
            this.ao.setDivider((Drawable)null);
            this.ao.setDividerHeight(0);
            return Optional.of((Object)this.ao);
        }
        return Optional.empty();
    }
    
    protected final Optional aV() {
        return Optional.empty();
    }
    
    protected final Optional aW() {
        return Optional.empty();
    }
    
    public final void nu() {
        this.bc();
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final ListView ao = this.ao;
        if (ao == null) {
            return;
        }
        final qkq qkq = (qkq)ao.getAdapter().getItem(n);
        if (qkq instanceof acrz) {
            final amgp k = ((acrz)qkq).k;
            final acsc ae = this.ae;
            if (ae != null) {
                if (k != null) {
                    aiqj aiqj;
                    if (vyg.e(k) != null) {
                        aiqj = vyg.e(k);
                    }
                    else {
                        aiqj = vyg.d(k);
                    }
                    final HashMap hashMap = new HashMap();
                    final acsb acsb = (acsb)ae;
                    final Map b = acsb.b;
                    if (b != null) {
                        hashMap.putAll(b);
                    }
                    if (aiqj != null) {
                        final wyw pf = acsb.c.pF();
                        if (pf != null) {
                            pf.J(3, (wzz)new wyt(aiqj.c), wyx.f(aiqj, (Map)hashMap));
                        }
                        acsb.a.c(aiqj, (Map)hashMap);
                    }
                }
            }
        }
        this.bc();
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        final aeea ap = this.ap;
        if (ap != null) {
            ap.ap((acay)this);
        }
        m = ((br)this).m;
        if (m != null && m.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            try {
                this.af = (amgs)adyf.av(m, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)amgs.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahca ahca) {
                ttr.d("Error decoding menu", (Throwable)ahca);
                this.af = amgs.a;
            }
        }
    }
}
