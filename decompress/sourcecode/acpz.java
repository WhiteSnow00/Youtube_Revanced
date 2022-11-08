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

public final class acpz extends acqj implements AdapterView$OnItemClickListener, abyw
{
    public acpy ae;
    private ameo af;
    private acjb ag;
    private acng ah;
    private arhr ai;
    private abzk aj;
    private wwv ak;
    private Integer al;
    private veo am;
    private boolean an;
    private ListView ao;
    private aeby ap;
    
    public static acpz aM(final ameo ameo, final acng ah, final wwu wwu, final Integer al, final veo am, final boolean an, final arhr ai, final abzk aj, final aeby ap) {
        final acpz acpz = new acpz();
        acpz.am = am;
        acpz.an = an;
        acpz.ai = ai;
        acpz.aj = aj;
        acpz.ap = ap;
        if (ameo != null) {
            final Bundle bundle = new Bundle();
            aeda.av(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)ameo);
            ((br)acpz).ag(bundle);
        }
        ah.getClass();
        acpz.ah = ah;
        acpz.al = al;
        ((br)acpz).am(true);
        if (wwu != null) {
            acpz.ak = wwu.n();
        }
        return acpz;
    }
    
    private final void aN(final akbf akbf, final trb trb) {
        if (akbf != null && (akbf.b & 0x1) != 0x0) {
            final acng ah = this.ah;
            if (ah != null) {
                akbe akbe;
                if ((akbe = akbe.b(akbf.c)) == null) {
                    akbe = akbe.a;
                }
                final int a = ah.a(akbe);
                if (a != 0) {
                    final Integer al = this.al;
                    if (al != null) {
                        trb.a((Object)tmy.k(((br)this).nT(), a, (int)al));
                        return;
                    }
                    trb.a((Object)agw.a(((br)this).nT(), a));
                    return;
                }
            }
        }
        trb.a((Object)null);
    }
    
    public final void W() {
        super.W();
        final aeby ap = this.ap;
        if (ap != null) {
            ap.am((abyw)this);
        }
    }
    
    public final void Y() {
        super.Y();
        if (((br)this).od().isInPictureInPictureMode()) {
            ((bi)this).dismiss();
        }
    }
    
    protected final acps aK() {
        this.ag = new acjb();
        final ameo af = this.af;
        if (af != null) {
            for (final amel amel : af.c) {
                final aexq al = this.aL(amel);
                if (al.h()) {
                    this.ag.add(al.c());
                    if (!this.an) {
                        continue;
                    }
                    final aum mk = ((br)this).mK();
                    final veo am = this.am;
                    final acjb ag = this.ag;
                    actc.j(amel, (Object)null, mk, am, ag, ((tdv)ag).size() - 1, (aexg)new abnf(this, 7));
                }
            }
        }
        if (((tdv)this.ag).isEmpty()) {
            zjp.b(zjo.b, zjn.y, "Bottom Sheet Menu is empty. No menu items were supported.");
        }
        return new acps((Context)((br)this).od(), (achk)this.ag);
    }
    
    public final aexq aL(final amel amel) {
        if ((amel.b & 0x2000) != 0x0) {
            final arhr ai = this.ai;
            if (ai != null) {
                final abzk aj = this.aj;
                if (aj != null) {
                    final wwv ak = this.ak;
                    if (ak != null) {
                        ajkj ajkj;
                        if ((ajkj = amel.p) == null) {
                            ajkj = ajkj.a;
                        }
                        return aexq.k((Object)new acpt(ai, aj, ak, ajkj));
                    }
                }
            }
            zjp.b(zjo.b, zjn.y, "ElementTransformer, ElementPresenter and InteractionLogger cannot be null");
            return aewp.a;
        }
        final akbf d = vwh.d(amel);
        final CharSequence f = vwh.f(amel);
        boolean b = true;
        if (f == null) {
            if (d != null && (d.b & 0x1) != 0x0) {
                final zjo b2 = zjo.b;
                final zjn y = zjn.y;
                akbe akbe;
                if ((akbe = akbe.b(d.c)) == null) {
                    akbe = akbe.a;
                }
                final int sv = akbe.sv;
                final StringBuilder sb = new StringBuilder("Text missing for BottomSheetMenuItem with iconType: ");
                sb.append(sv);
                zjp.b(b2, y, sb.toString());
            }
            else {
                zjp.b(zjo.b, zjn.y, "Text missing for BottomSheetMenuItem.");
            }
            return aewp.a;
        }
        final agyc a = vwh.a(amel);
        if (this.ak != null && !a.H()) {
            this.ak.t((wxz)new wws(a), (alff)null);
        }
        final acpv acpv = new acpv(f.toString(), amel);
        if (vwh.h(amel) == 2) {
            b = false;
        }
        ((acpu)acpv).d(b);
        this.aN(d, (trb)new zfo(acpv, 15));
        this.aN(vwh.e(amel), (trb)new zfo(acpv, 16));
        return aexq.k((Object)acpv);
    }
    
    protected final Optional aU() {
        final bu od = ((br)this).od();
        final acps ak = this.aK();
        if (od != null && ak.getCount() != 0) {
            (this.ao = new acqo((Context)od)).setAdapter((ListAdapter)this.aK());
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
        final qjg qjg = (qjg)ao.getAdapter().getItem(n);
        if (qjg instanceof acpv) {
            final amel k = ((acpv)qjg).k;
            final acpy ae = this.ae;
            if (ae != null) {
                if (k != null) {
                    aioe aioe;
                    if (vwh.c(k) != null) {
                        aioe = vwh.c(k);
                    }
                    else {
                        aioe = vwh.b(k);
                    }
                    final HashMap hashMap = new HashMap();
                    final acpx acpx = (acpx)ae;
                    final Map b = acpx.b;
                    if (b != null) {
                        hashMap.putAll(b);
                    }
                    if (aioe != null) {
                        final wwv n3 = acpx.c.n();
                        if (n3 != null) {
                            n3.J(3, (wxz)new wws(aioe.c), www.f(aioe, (Map)hashMap));
                        }
                        acpx.a.c(aioe, (Map)hashMap);
                    }
                }
            }
        }
        this.bc();
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        final aeby ap = this.ap;
        if (ap != null) {
            ap.aj((abyw)this);
        }
        m = ((br)this).m;
        if (m != null && m.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            try {
                this.af = (ameo)aeda.aq(m, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)ameo.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab) {
                trn.d("Error decoding menu", (Throwable)ahab);
                this.af = ameo.a;
            }
        }
    }
}
