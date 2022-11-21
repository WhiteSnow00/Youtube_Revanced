import android.widget.Button;
import android.widget.ListAdapter;
import java.util.Map;
import java.util.Collection;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.Iterator;
import android.text.Spanned;
import com.google.protos.youtube.api.innertube.ModifyReportFormCommandOuterClass$ModifyReportFormCommand;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.opengl.Matrix;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.Eye;
import java.util.Set;
import java.util.concurrent.Executor;
import android.widget.ImageView;
import android.widget.TextView;
import android.database.DataSetObserver;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmq
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public agmq(final aefs aefs, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final aecx f = new aecx(aefs, 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        final atnb c = arol.c((atnb)new abzh((atnb)f, 19));
        this.e = c;
        final atnb c2 = arol.c((atnb)new abzo((atnb)f, c, 8, (int[])null));
        this.b = c2;
        final atnb c3 = arol.c((atnb)new abzh((atnb)f, 17));
        this.c = c3;
        final atnb c4 = arol.c((atnb)new abrl(c2, c3, (atnb)f, 10, (byte[][])null));
        this.a = c4;
        this.d = arol.c((atnb)new abzh(c4, 18));
    }
    
    public agmq(final agjs a, final agmr b, final mqe c, final agmy d, final agmy e, final agnb f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public agmq(final Context context, final veh a, final aheu f, final acyy b, final agjn agjn, final kkq kkq, final aefs aefs, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = a;
        this.f = f;
        this.b = b;
        final acoj c = new acoj(context);
        this.c = c;
        final cfp onCheckedChangeListener = new cfp(this, 18, null, null, null);
        final acoj acoj = c;
        c.e.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)onCheckedChangeListener);
        final ex ex = new ex(context);
        ex.c(true);
        ex.p((View)c);
        ex.h(2132017611, (DialogInterface$OnClickListener)gyt.l);
        ex.k(2132018941, (DialogInterface$OnClickListener)new xhc(this, 11, (byte[])null, (byte[])null, (byte[])null));
        final ey b2 = ex.b();
        this.e = b2;
        final acog onShowListener = new acog(this, context, aefs, kkq, null, null, null, null);
        final ey ey = b2;
        b2.setOnShowListener((DialogInterface$OnShowListener)onShowListener);
        final far onCancelListener = new far(kkq, 15, (byte[])null);
        final ey ey2 = b2;
        b2.setOnCancelListener((DialogInterface$OnCancelListener)onCancelListener);
        final fas onDismissListener = new fas(kkq, 14, (byte[])null);
        final ey ey3 = b2;
        b2.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
        final acoo d = new acoo(context, agjn, null);
        this.d = d;
        final acoh acoh = new acoh(this, null, null, null);
        final acoo acoo = d;
        d.registerDataSetObserver((DataSetObserver)acoh);
    }
    
    public agmq(final Context e, final veh a, final xab b, final agjn d, final kkq f, final aefs c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        this.f = f;
        this.c = c;
    }
    
    public agmq(final View view) {
        this.d = view.findViewById(2131429586);
        this.b = view.findViewById(2131429585);
        this.c = view.findViewById(2131429582);
        this.f = view.findViewById(2131429584);
        this.a = view.findViewById(2131429588);
        this.e = view.findViewById(2131429580);
    }
    
    public agmq(final arna d, final arna b, final admj f, final tdu e, final Executor a, final adgg c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.b = b;
        this.f = f;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    public agmq(final atnb d, final atnb e, final atnb b, final atnb c, final atnb a, final atnb f) {
        this.d = d;
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
        f.getClass();
        this.f = f;
    }
    
    public agmq(final thg f, final Set c, final auna e, final auna b, final auna a, final auna d) {
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public agmq(final float[] e, final float[] b, final aauz f, final Eye c, final GvrViewerParams a) {
        b.getClass();
        this.b = b;
        this.e = e;
        final float[] d = new float[16];
        this.d = d;
        Matrix.multiplyMM((float[])d, 0, b, 0, e, 0);
        this.f = f;
        this.c = c;
        this.a = a;
    }
    
    public static final void F(final aaoj aaoj, final acav acav) {
        acav.ab().tt(aaoj);
    }
    
    public static final void G(final PlayerResponseModel playerResponseModel, final acav acav) {
        acav.at().tt(new aaoz(playerResponseModel, acav.aa()));
    }
    
    public static final void H(final aaos aaos, final acav acav) {
        acav.au().tt(aaos);
    }
    
    public static void K(final aisc aisc, final agmq agmq) {
        if (aisc != null) {
            if (((ahcu)aisc).ry((ahci)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand)) {
                int cz;
                if ((cz = aqvq.cZ(((ModifyReportFormCommandOuterClass$ModifyReportFormCommand)((ahcu)aisc).rx((ahci)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand)).b)) == 0) {
                    cz = 1;
                }
                --cz;
                final ajws ajws = null;
                aies aies = null;
                if (cz != 1) {
                    if (cz == 2) {
                        agmq.e();
                        return;
                    }
                    if (cz == 3) {
                        agmq.i();
                        return;
                    }
                    if (cz == 4) {
                        final aheu aheu = (aheu)agmq.f;
                        aiet aiet;
                        if ((aiet = ((anxo)aheu.a).g) == null) {
                            aiet = aiet.a;
                        }
                        if ((0x1 & aiet.b) != 0x0) {
                            aiet aiet2;
                            if ((aiet2 = ((anxo)aheu.a).g) == null) {
                                aiet2 = aiet.a;
                            }
                            if ((aies = aiet2.c) == null) {
                                aies = aies.a;
                            }
                        }
                        agmq.g(aies);
                    }
                }
                else {
                    final aidt r = ((aheu)agmq.f).R();
                    if (r != null) {
                        final Object c = agmq.c;
                        ajws ajws2 = ajws;
                        if ((0x1 & r.b) != 0x0 && (ajws2 = r.c) == null) {
                            ajws2 = ajws.a;
                        }
                        final Spanned a = ven.a(ajws2, (veh)agmq.a, false);
                        final acoj acoj = (acoj)c;
                        acoj.d.setVisibility(0);
                        acoj.e.setContentDescription((CharSequence)a);
                        acoj.e.setVisibility(0);
                        acoj.f.setText((CharSequence)a);
                        acoj.f.setVisibility(0);
                    }
                }
            }
        }
    }
    
    public final void A(final aapt aapt) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().s(aapt);
        }
        ((thg)this.f).d((Object)aapt);
    }
    
    public final void B(final acav acav, final aapq aapq, final int n) {
        for (final acat acat : this.c) {
            if (acat.D()) {
                acat.e(aapq);
            }
        }
        if (n == 4) {
            acav.af().tt(aapq);
        }
    }
    
    public final void C(final ablo ablo, final acav acav, final int n) {
        if (n == 4) {
            final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
            while (iterator.hasNext()) {
                iterator.next().p(ablo);
            }
        }
        acav.aq().tt(ablo);
    }
    
    public final void D(final acav acav, final aapq aapq, final int n) {
        for (final acat acat : this.c) {
            if (!acat.D()) {
                acat.e(aapq);
            }
        }
        if (n == 4) {
            acav.aF().tt(aapq);
        }
    }
    
    public final void E(final aapt aapt, final int n, final acav acav) {
        if (n == 2 || n == 4) {
            final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
            while (iterator.hasNext()) {
                iterator.next().s(aapt);
            }
        }
        if (n != 3 && n != 4) {
            return;
        }
        if (acav != null) {
            acav.aH().tt(aapt);
            return;
        }
        ((thg)this.f).d((Object)aapt);
    }
    
    public final abpo I(final abpy abpy) {
        final aske aske = (aske)((atnb)this.d).a();
        aske.getClass();
        final aske aske2 = (aske)((atnb)this.e).a();
        aske2.getClass();
        final abqc abqc = (abqc)((atnb)this.b).a();
        abqc.getClass();
        final abls abls = (abls)((atnb)this.c).a();
        abls.getClass();
        final abmo abmo = (abmo)((atnb)this.a).a();
        abmo.getClass();
        final absv absv = (absv)((atnb)this.f).a();
        absv.getClass();
        return new abpo(aske, aske2, abqc, abls, abmo, absv, abpy, (byte[])null);
    }
    
    public final int J() {
        return ((Eye)this.c).getType();
    }
    
    public final String a() {
        final String g = ((agjs)this.a).g();
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(g.getBytes()), 11);
        }
        catch (final NoSuchAlgorithmException ex) {
            return "[HASH-ERROR]";
        }
    }
    
    public final void b() {
        try {
            ((Executor)this.a).execute((Runnable)new addt(this, 15, (byte[])null));
            final Map d = ((admj)this.f).d(aafv.o);
            if (!d.isEmpty()) {
                final adre adre = (adre)((arna)this.d).a();
                final Collection values = d.values();
                if (!values.isEmpty()) {
                    for (final adoj adoj : values) {
                        final arxs a = adoa.a(adoj.k);
                        if ((adoj.b & 0x800) != 0x0) {
                            a.b = adoj.n.I();
                        }
                        final Object k = adre.k;
                        final afbh w = adme.w(adoj);
                        if (w.h()) {
                            a.d = w.c();
                        }
                        ((adnx)((arna)adre.i).a()).z(a.l());
                        ((adnc)adre.h).c(adoj.k);
                    }
                    ((adnc)adre.h).a(values);
                }
            }
            if (!((admj)this.f).d(aafv.p).isEmpty()) {
                final adlk adlk = (adlk)((arna)this.b).a();
                tfx.j(agra.W((afvp)new qrs(adlk, 14), adlk.e), adlk.c, (tfv)new xnk(adlk, 13));
            }
        }
        catch (final admk admk) {
            ((adgg)this.c).D("Failed to resume uploads.", (Throwable)admk);
            tut.f("PendingUploadsChecker", "Failed to resume uploads.", (Throwable)admk);
        }
    }
    
    public final void c(final anaf anaf, final Map map) {
        if ((anaf.b & 0x20) != 0x0) {
            final Object a = this.a;
            aisc aisc;
            if ((aisc = anaf.g) == null) {
                aisc = aisc.a;
            }
            ((veh)a).c(aisc, map);
        }
    }
    
    public final void d(anxo anxo, Object adapter) {
        if (tqf.F((Context)this.e).isFinishing()) {
            return;
        }
        final agmq agmq = new agmq((Context)this.e, (veh)this.a, new aheu(anxo), new acyy(this, adapter, null, null), (agjn)this.d, (kkq)this.f, (aefs)this.c, null, null, null, null, null, null, null);
        if (((ey)agmq.e).isShowing()) {
            return;
        }
        final Object c = agmq.c;
        final aheu aheu = (aheu)agmq.f;
        anxo = (anxo)aheu.a;
        ajws ajws;
        if ((anxo.b & 0x2) != 0x0) {
            if ((ajws = anxo.d) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        final Spanned b = acbu.b(ajws);
        final anai anai = (anai)aheu.b;
        ajws ajws2;
        if ((anai.b & 0x1) != 0x0) {
            if ((ajws2 = anai.d) == null) {
                ajws2 = ajws.a;
            }
        }
        else {
            ajws2 = null;
        }
        ((acoj)c).a.setText((CharSequence)adme.af(b, acbu.b(ajws2)));
        final Object c2 = agmq.c;
        adapter = agmq.d;
        ((acoj)c2).b.setAdapter((ListAdapter)adapter);
        final Object f = agmq.f;
        final Object a = agmq.a;
        anxo = (anxo)((aheu)f).a;
        ajws ajws3;
        if ((anxo.b & 0x8) != 0x0) {
            if ((ajws3 = anxo.e) == null) {
                ajws3 = ajws.a;
            }
        }
        else {
            ajws3 = null;
        }
        final Spanned a2 = ven.a(ajws3, (veh)a, false);
        if (a2 != null) {
            final acoj acoj = (acoj)agmq.c;
            acoj.c.setText((CharSequence)a2);
            acoj.c.setVisibility(0);
        }
        ((acoo)agmq.d).setNotifyOnChange(false);
        ((acoo)agmq.d).clear();
        adapter = agmq.d;
        ((acoo)adapter).addAll((Collection)((anai)((aheu)agmq.f).b).c);
        ((acoo)agmq.d).setNotifyOnChange(true);
        ((ey)agmq.e).show();
        agmq.f();
    }
    
    public final void e() {
        final acoj acoj = (acoj)this.c;
        acoj.d.setVisibility(8);
        acoj.e.setChecked(false);
        acoj.e.setVisibility(8);
        acoj.f.setVisibility(8);
    }
    
    public final void f() {
        this.i();
        this.h(false);
        this.e();
    }
    
    public final void g(final aies aies) {
        if (aies != null) {
            final Button b = ((ey)this.e).b(-1);
            ajws ajws;
            if ((aies.b & 0x200) != 0x0) {
                if ((ajws = aies.i) == null) {
                    ajws = ajws.a;
                }
            }
            else {
                ajws = null;
            }
            b.setText((CharSequence)acbu.b(ajws));
        }
    }
    
    public final void h(final boolean enabled) {
        ((ey)this.e).b(-1).setEnabled(enabled);
    }
    
    public final void i() {
        final aheu aheu = (aheu)this.f;
        aiet aiet;
        if ((aiet = ((anxo)aheu.a).f) == null) {
            aiet = aiet.a;
        }
        final int b = aiet.b;
        Object o = null;
        aies aies;
        if ((b & 0x1) != 0x0) {
            aiet aiet2;
            if ((aiet2 = ((anxo)aheu.a).f) == null) {
                aiet2 = aiet.a;
            }
            if ((aies = aiet2.c) == null) {
                aies = aies.a;
            }
        }
        else {
            aies = null;
        }
        final aiet e = ((anai)aheu.b).e;
        aiet a;
        if (e == null) {
            a = aiet.a;
        }
        else {
            a = e;
        }
        if ((a.b & 0x1) != 0x0) {
            aiet a2;
            if ((a2 = e) == null) {
                a2 = aiet.a;
            }
            if ((o = a2.c) == null) {
                o = aies.a;
            }
        }
        this.g((aies)adme.af(aies, o));
    }
    
    public final void j() {
        ((auna)this.d).tt(aapv.a);
        ((auna)this.a).tt(aapv.a);
    }
    
    public final void k(final acav acav) {
        ((auna)this.a).tt(new aapv(acav));
    }
    
    public final void l(final zdk zdk, final acav acav) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().l(zdk, acav.aa());
        }
        acav.ah().tt(zdk);
    }
    
    public final void m(final aanv aanv, final acav acav) {
        acav.aj().tt(aanv);
        for (final acat acat : this.c) {
            if (aanv.c()) {
                acat.g(aanv.b(), acav.aa());
            }
            else {
                acat.j(aanv.b(), acav.aa());
            }
        }
    }
    
    public final void n(final String s) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().o(s);
        }
    }
    
    public final void o(final acav acav) {
        ((auna)this.d).tt(new aapv(acav));
    }
    
    public final void p(final abjz abjz, final acav acav) {
        for (acat acat : this.c) {}
        acav.ax().tt(abjz);
    }
    
    public final void q(final acav acav) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().m(acav.aa(), acav.g());
        }
        ((thg)this.f).g((Object)acav.i());
        ((auna)this.e).tt(new aapw(acav));
    }
    
    public final void r(final acav acav) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().n(acav.aa());
        }
        acav.at().tw();
        acav.aG().tw();
        acav.aF().tw();
        acav.af().tw();
        acav.ae().tw();
        acav.ah().tw();
        acav.aE().tw();
        acav.aw().tw();
        acav.ad().tw();
        acav.aj().tw();
        acav.am().tw();
        acav.av().tw();
        acav.au().tw();
        acav.ax().tw();
        acav.aA().tw();
        acav.aD().tw();
        acav.aH().tw();
        acav.ag().tw();
        acav.aq().tw();
        acav.as().tw();
        acav.aB().tw();
        acav.aC().tw();
        acav.ai().tw();
        acav.ac().tw();
        acav.az().tw();
        acav.ap().tw();
        acav.ay().tw();
        acav.ab().tw();
        acav.ar().tw();
        acav.ak().tw();
        acav.al().tw();
        acav.ao().tw();
        acav.au().tw();
        acav.an().tw();
        acav.Z().tr(new aanx());
        ((auna)this.b).tt(new aapx(acav));
    }
    
    public final void s() {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }
    
    public final void t(final aapp aapp, final acav acav) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().O(aapp);
        }
        if (acav != null) {
            acav.aE().tt(aapp);
        }
    }
    
    public final void u(final aaoc aaoc, final acav acav) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().c(acav.aa());
        }
        acav.as().tt(aaoc);
    }
    
    public final void v(final aapt aapt, final acav acav) {
        this.E(aapt, 4, acav);
    }
    
    public final void w(final yre yre, final String s) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().h(yre, s);
        }
        ((thg)this.f).d((Object)yre);
    }
    
    public final void x(final aapq aapq) {
        for (final acat acat : this.c) {
            if (acat.D()) {
                acat.e(aapq);
            }
        }
    }
    
    public final void y(final aapp aapp) {
        final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().O(aapp);
        }
        ((thg)this.f).d((Object)aapp);
    }
    
    public final void z(final aapq aapq) {
        for (final acat acat : this.c) {
            if (!acat.D()) {
                acat.e(aapq);
            }
        }
        ((thg)this.f).d((Object)aapq);
    }
}
