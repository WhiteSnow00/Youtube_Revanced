import java.util.Map;
import java.util.HashMap;
import android.view.View;
import android.widget.AdapterView;
import com.google.protobuf.ExtensionRegistryLite;
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

public final class acto extends actz implements AdapterView$OnItemClickListener, acci
{
    public actn ae;
    private amiv af;
    private acmr ag;
    private acqv ah;
    private arna ai;
    private accx aj;
    private xab ak;
    private Integer al;
    private vhw am;
    private boolean an;
    private ListView ao;
    private aefs ap;
    
    public static acto aM(final amiv amiv, final acqv ah, final xaa xaa, final Integer al, final vhw am, final boolean an, final arna ai, final accx aj, final aefs ap) {
        final acto acto = new acto();
        acto.am = am;
        acto.an = an;
        acto.ai = ai;
        acto.aj = aj;
        acto.ap = ap;
        if (amiv != null) {
            final Bundle bundle = new Bundle();
            adzw.aE(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)amiv);
            ((br)acto).ag(bundle);
        }
        ah.getClass();
        acto.ah = ah;
        acto.al = al;
        ((br)acto).am(true);
        if (xaa != null) {
            acto.ak = xaa.pE();
        }
        return acto;
    }
    
    private final void aN(final akfj akfj, final tui tui) {
        if (akfj != null && (akfj.b & 0x1) != 0x0) {
            final acqv ah = this.ah;
            if (ah != null) {
                akfi akfi;
                if ((akfi = akfi.b(akfj.c)) == null) {
                    akfi = akfi.a;
                }
                final int a = ah.a(akfi);
                if (a != 0) {
                    final Integer al = this.al;
                    if (al != null) {
                        tui.a((Object)tqf.k(((br)this).nQ(), a, (int)al));
                        return;
                    }
                    tui.a((Object)agy.a(((br)this).nQ(), a));
                    return;
                }
            }
        }
        tui.a((Object)null);
    }
    
    @Override
    public final void W() {
        super.W();
        final aefs ap = this.ap;
        if (ap != null) {
            ap.ac((acci)this);
        }
    }
    
    public final void Y() {
        super.Y();
        if (((br)this).oa().isInPictureInPictureMode()) {
            ((bi)this).dismiss();
        }
    }
    
    protected final acth aK() {
        this.ag = new acmr();
        final amiv af = this.af;
        if (af != null) {
            for (final amis amis : af.c) {
                final afbh al = this.aL(amis);
                if (al.h()) {
                    this.ag.add(al.c());
                    if (!this.an) {
                        continue;
                    }
                    final aup n = ((br)this).N();
                    final vhw am = this.am;
                    final acmr ag = this.ag;
                    aamz.s(amis, null, n, am, ag, ag.size() - 1, (afax)new ablz(this, 10));
                }
            }
        }
        if (this.ag.isEmpty()) {
            znh.b(zng.b, znf.y, "Bottom Sheet Menu is empty. No menu items were supported.");
        }
        return new acth((Context)((br)this).oa(), (acla)this.ag);
    }
    
    public final afbh aL(final amis amis) {
        if ((amis.b & 0x2000) != 0x0) {
            final arna ai = this.ai;
            if (ai != null) {
                final accx aj = this.aj;
                if (aj != null) {
                    final xab ak = this.ak;
                    if (ak != null) {
                        ajon ajon;
                        if ((ajon = amis.p) == null) {
                            ajon = ajon.a;
                        }
                        return afbh.k(new acti(ai, aj, ak, ajon));
                    }
                }
            }
            znh.b(zng.b, znf.y, "ElementTransformer, ElementPresenter and InteractionLogger cannot be null");
            return afag.a;
        }
        final akfj o = wbe.o(amis);
        final CharSequence q = wbe.q(amis);
        boolean b = true;
        if (q == null) {
            if (o != null && (o.b & 0x1) != 0x0) {
                final zng b2 = zng.b;
                final znf y = znf.y;
                akfi akfi;
                if ((akfi = akfi.b(o.c)) == null) {
                    akfi = akfi.a;
                }
                final int sb = akfi.sB;
                final StringBuilder sb2 = new StringBuilder("Text missing for BottomSheetMenuItem with iconType: ");
                sb2.append(sb);
                znh.b(b2, y, sb2.toString());
            }
            else {
                znh.b(zng.b, znf.y, "Text missing for BottomSheetMenuItem.");
            }
            return afag.a;
        }
        final ahbt l = wbe.l(amis);
        if (this.ak != null && !l.H()) {
            this.ak.t((xbe)new wzy(l), (alji)null);
        }
        final actk actk = new actk(q.toString(), amis);
        if (wbe.s(amis) == 2) {
            b = false;
        }
        actk.d(b);
        this.aN(o, (tui)new xri(actk, 19));
        this.aN(wbe.p(amis), (tui)new xri(actk, 20));
        return afbh.k(actk);
    }
    
    @Override
    protected final Optional aU() {
        final bu oa = ((br)this).oa();
        final acth ak = this.aK();
        if (oa != null && ak.getCount() != 0) {
            (this.ao = (ListView)new acue((Context)oa)).setAdapter((ListAdapter)this.aK());
            this.ao.setOnItemClickListener((AdapterView$OnItemClickListener)this);
            this.ao.setDivider((Drawable)null);
            this.ao.setDividerHeight(0);
            return Optional.of((Object)this.ao);
        }
        return Optional.empty();
    }
    
    @Override
    protected final Optional aV() {
        return Optional.empty();
    }
    
    @Override
    protected final Optional aW() {
        return Optional.empty();
    }
    
    public final void nr() {
        this.bc();
    }
    
    @Override
    public final void ol(Bundle m) {
        super.ol(m);
        final aefs ap = this.ap;
        if (ap != null) {
            ap.Z((acci)this);
        }
        m = ((br)this).m;
        if (m != null && m.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            try {
                this.af = (amiv)adzw.az(m, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)amiv.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahds ahds) {
                tut.d("Error decoding menu", (Throwable)ahds);
                this.af = amiv.a;
            }
        }
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final ListView ao = this.ao;
        if (ao == null) {
            return;
        }
        final qlk qlk = (qlk)ao.getAdapter().getItem(n);
        if (qlk instanceof actk) {
            final amis k = ((actk)qlk).k;
            final actn ae = this.ae;
            if (ae != null) {
                if (k != null) {
                    aisc aisc;
                    if (wbe.n(k) != null) {
                        aisc = wbe.n(k);
                    }
                    else {
                        aisc = wbe.m(k);
                    }
                    final HashMap hashMap = new HashMap();
                    final actm actm = (actm)ae;
                    final Map b = actm.b;
                    if (b != null) {
                        hashMap.putAll(b);
                    }
                    if (aisc != null) {
                        final xab pe = actm.c.pE();
                        if (pe != null) {
                            pe.J(3, (xbe)new wzy(aisc.c), xac.f(aisc, (Map)hashMap));
                        }
                        actm.a.c(aisc, (Map)hashMap);
                    }
                }
            }
        }
        this.bc();
    }
}
