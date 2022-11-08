import java.util.List;
import java.util.Iterator;
import android.os.Handler;
import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import java.util.Locale;
import java.util.concurrent.Executor;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlq implements View$OnClickListener
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public jlq(final jkc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jlq(final jlt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jlq(final jqe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        switch (this.b) {
            default: {
                final jqi jqi = (jqi)this.a;
                final anxs b = jqi.b;
                agnj.A((Object)b);
                final AlertDialog$Builder f = jqi.f(b);
                final AlertDialog c = jqi.c;
                if ((c != null || f != null) && c == null) {
                    (jqi.c = f.create()).show();
                }
                return;
            }
            case 19: {
                final jqh jqh = (jqh)this.a;
                final boolean checked = jqh.c.i() ^ true;
                jqh.c.f(checked);
                jqh.d.setChecked(checked);
                final anxs f2 = jqh.f;
                if (f2 != null && (0x100000 & f2.b) != 0x0) {
                    final wwv g = jqh.g;
                    g.getClass();
                    g.J(3, (wxz)new wws(f2.q.I()), (alff)null);
                }
                return;
            }
            case 18: {
                final jqh jqh2 = (jqh)this.a;
                if (jqh2.f != null) {
                    final boolean b2 = jqh2.d.isChecked() ^ true;
                    while (true) {
                        Label_0327: {
                            if (!b2) {
                                break Label_0327;
                            }
                            final anxs f3 = jqh2.f;
                            f3.getClass();
                            if ((f3.b & 0x8000) == 0x0) {
                                break Label_0327;
                            }
                            f3.getClass();
                            anxx anxx;
                            if ((anxx = f3.m) == null) {
                                anxx = anxx.a;
                            }
                            aiva aiva;
                            if (anxx.b == 64099105) {
                                aiva = (aiva)anxx.c;
                            }
                            else {
                                aiva = aiva.a;
                            }
                            final Context a = jqh2.a;
                            final vax b3 = jqh2.b;
                            final wwv g2 = jqh2.g;
                            g2.getClass();
                            jqh2.h = abyv.g(a, aiva, b3, g2, (abyu)new acxs(jqh2, b2, 1), (Object)null, jqh2.i);
                            final anxs f4 = jqh2.f;
                            f4.getClass();
                            if ((0x100000 & f4.b) != 0x0) {
                                final wwv g3 = jqh2.g;
                                g3.getClass();
                                f4.getClass();
                                g3.J(3, (wxz)new wws(f4.q.I()), (alff)null);
                                return;
                            }
                            return;
                        }
                        if (!b2) {
                            final anxs f5 = jqh2.f;
                            f5.getClass();
                            if ((f5.b & 0x10000) != 0x0) {
                                f5.getClass();
                                anxx anxx2;
                                if ((anxx2 = f5.n) == null) {
                                    anxx2 = anxx.a;
                                }
                                if (anxx2.b == 64099105) {
                                    final aiva aiva = (aiva)anxx2.c;
                                    continue;
                                }
                                final aiva aiva = aiva.a;
                                continue;
                            }
                        }
                        break;
                    }
                }
                return;
            }
            case 17: {
                ((jqe)this.a).b.startActivity(new Intent("com.google.android.apps.wellbeing.action.WIND_DOWN"));
                return;
            }
            case 16: {
                ((jqc)this.a).b.getOnBackPressedDispatcher().c();
                return;
            }
            case 15: {
                final jpa jpa = (jpa)this.a;
                tcp.n((aum)jpa.b, jpa.c.b(jpa.d.c()), (trb)jmg.s, (trb)new jnf(jpa, new Intent().setClassName((Context)jpa.b, fvu.i("settings.SettingsActivity")).putExtra(":android:show_fragment", fvu.i("settings.datasaving.DataSavingPrefsFragment")).setFlags(335544320), 3));
                return;
            }
            case 14: {
                final jmr jmr = (jmr)this.a;
                jmr.b.setVisibility(4);
                jmr.c.setVisibility(8);
                final jms a2 = jmr.a;
                if (a2 != null) {
                    a2.h();
                }
                return;
            }
            case 13: {
                final jms a3 = ((jmr)this.a).a;
                if (a3 != null) {
                    ((jmp)a3).f();
                }
                return;
            }
            case 12: {
                final jms a4 = ((jmr)this.a).a;
                if (a4 != null) {
                    final jmp jmp = (jmp)a4;
                    final String u = jmp.u;
                    if (u != null) {
                        if (jmp.n) {
                            jmp.p = true;
                            jmp.m();
                        }
                        jmp.g.J(3, (wxz)new wws(wya.c(137832)), (alff)null);
                        jmp.a.d(u);
                    }
                }
                return;
            }
            case 11: {
                final jms a5 = ((jmk)this.a).a;
                if (a5 != null) {
                    a5.h();
                }
                return;
            }
            case 10: {
                final jms a6 = ((jmk)this.a).a;
                if (a6 != null) {
                    ((jmp)a6).f();
                }
                return;
            }
            case 9: {
                final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)this.a;
                voiceSearchActivity.t();
                voiceSearchActivity.ae = true;
                voiceSearchActivity.h = false;
                voiceSearchActivity.q();
                final acxg i = voiceSearchActivity.i;
                if (i != null) {
                    i.d();
                    voiceSearchActivity.i.a();
                    voiceSearchActivity.c.d();
                    final String v = voiceSearchActivity.R.get(0);
                    final String j = voiceSearchActivity.j();
                    voiceSearchActivity.l();
                    final acxh l = voiceSearchActivity.aq.l(voiceSearchActivity.D, voiceSearchActivity.g(), voiceSearchActivity.ab, j, voiceSearchActivity.V, voiceSearchActivity.B(), voiceSearchActivity.Z, voiceSearchActivity.aa, voiceSearchActivity.T, voiceSearchActivity.j());
                    l.H = voiceSearchActivity.C();
                    l.A = voiceSearchActivity.d();
                    l.c(voiceSearchActivity.f());
                    l.C = voiceSearchActivity.h();
                    l.s = voiceSearchActivity.A();
                    l.z = false;
                    l.b(aexq.k((Object)voiceSearchActivity.i()));
                    l.E = gkt.al(voiceSearchActivity.ap);
                    l.t = voiceSearchActivity.y();
                    l.u = voiceSearchActivity.ae;
                    l.v = v;
                    l.w = voiceSearchActivity.an.cj();
                    l.F = voiceSearchActivity.l;
                    l.x = voiceSearchActivity.ag;
                    l.y = voiceSearchActivity.ah;
                    voiceSearchActivity.i = l.a();
                    final acxg k = voiceSearchActivity.i;
                    final Handler c2 = k.c;
                    final acxf d = k.d;
                    d.getClass();
                    c2.post((Runnable)new abxb(d, 16));
                    k.g.execute(aesm.h((Runnable)new acxc(k)));
                }
                return;
            }
            case 8: {
                final VoiceSearchActivity voiceSearchActivity2 = (VoiceSearchActivity)this.a;
                voiceSearchActivity2.H.setVisibility(4);
                voiceSearchActivity2.I.setVisibility(8);
                if (voiceSearchActivity2.h) {
                    voiceSearchActivity2.r.J(3, (wxz)new wws(wya.c(62943)), (alff)null);
                    voiceSearchActivity2.p(voiceSearchActivity2.f);
                    voiceSearchActivity2.ac = true;
                    voiceSearchActivity2.r();
                    return;
                }
                voiceSearchActivity2.v();
                return;
            }
            case 7: {
                final VoiceSearchActivity voiceSearchActivity3 = (VoiceSearchActivity)this.a;
                voiceSearchActivity3.onBackPressed();
                voiceSearchActivity3.n();
                return;
            }
            case 6: {
                final VoiceSearchActivity voiceSearchActivity4 = (VoiceSearchActivity)this.a;
                voiceSearchActivity4.r();
                voiceSearchActivity4.H.setVisibility(8);
                voiceSearchActivity4.G.setVisibility(8);
                final jmd am = jmd.aM(voiceSearchActivity4.af, voiceSearchActivity4.r);
                voiceSearchActivity4.r.J(3, (wxz)new wws(wya.c(95983)), (alff)null);
                final ct m = voiceSearchActivity4.j.i();
                m.s((br)am, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
                m.d();
                return;
            }
            case 5: {
                final Object a7 = this.a;
                final VoiceSearchActivity voiceSearchActivity5 = (VoiceSearchActivity)a7;
                voiceSearchActivity5.r.J(3, (wxz)new wws(wya.c(137832)), (alff)null);
                final String ai = voiceSearchActivity5.ai;
                if (ai == null) {
                    return;
                }
                if (voiceSearchActivity5.h) {
                    voiceSearchActivity5.ac = true;
                    voiceSearchActivity5.r();
                }
                voiceSearchActivity5.x((br)(voiceSearchActivity5.X = jlt.r(ai)), "VAA_CONSENT_FRAGMENT");
                voiceSearchActivity5.j.O("VaaConsentWebViewRequestKey", (aum)a7, (cp)a7);
                return;
            }
            case 4: {
                final jmd jmd = (jmd)this.a;
                final String ak = jmd.ak;
                final Iterator<Object> iterator = ((List<Object>)jmd.ai.e).iterator();
            Label_1531:
                while (true) {
                    while (iterator.hasNext()) {
                        for (final anyb anyb : iterator.next().c) {
                            anya a8;
                            if (anyb.b == 64166933) {
                                a8 = (anya)anyb.c;
                            }
                            else {
                                a8 = anya.a;
                            }
                            if (a8.c.equals(ak)) {
                                break Label_1531;
                            }
                        }
                        continue;
                        anya a8 = null;
                        if (a8 != null) {
                            if (jmd.af.t()) {
                                final vax ae = jmd.ae;
                                aioe aioe;
                                if ((aioe = a8.g) == null) {
                                    aioe = aioe.a;
                                }
                                ae.a(aioe);
                            }
                            ((aagm)jmd.ar.a).c((aexg)new bwj(a8.e, 20), (Executor)afsl.a).addListener((Runnable)tg.h, (Executor)afsl.a);
                            final agza builder = ((agzi)apnl.a).createBuilder();
                            final String an = jmd.aN();
                            builder.copyOnWrite();
                            ((apnl)builder.instance).b = an;
                            final String e = a8.e;
                            builder.copyOnWrite();
                            final apnl apnl = (apnl)builder.instance;
                            e.getClass();
                            apnl.c = e;
                            final apnl apnl2 = (apnl)builder.build();
                            final wvu ag = jmd.ag;
                            final aklo d2 = aklq.d();
                            ((agza)d2).copyOnWrite();
                            aklq.cu((aklq)d2.instance, apnl2);
                            ag.d((aklq)((agza)d2).build());
                            if (jmd.aj != null) {
                                final String c3 = a8.c;
                                final String e2 = a8.e;
                                String s = c3;
                                String an2 = e2;
                                Label_1924: {
                                    if (e2.isEmpty()) {
                                        an2 = jmd.aN();
                                        final Iterator<Object> iterator3 = ((List<Object>)jmd.ai.e).iterator();
                                        while (iterator3.hasNext()) {
                                            for (final anyb anyb2 : iterator3.next().c) {
                                                anya a9;
                                                if (anyb2.b == 64166933) {
                                                    a9 = (anya)anyb2.c;
                                                }
                                                else {
                                                    a9 = anya.a;
                                                }
                                                if (aeda.y(a9.e, an2)) {
                                                    s = a9.c;
                                                    break Label_1924;
                                                }
                                            }
                                        }
                                        final List h = aeyk.b('-').h((CharSequence)an2);
                                        s = new Locale((String)h.get(0), aeda.x((String)h.get(1))).getDisplayName();
                                    }
                                }
                                jmd.aj.c(s, an2);
                            }
                        }
                        jmd.ah.J(3, (wxz)new wws(wya.c(95981)), (alff)null);
                        jmd.dismiss();
                        return;
                    }
                    anya a8 = null;
                    continue Label_1531;
                }
            }
            case 3: {
                final jmd jmd2 = (jmd)this.a;
                jmd2.ah.J(3, (wxz)new wws(wya.c(95980)), (alff)null);
                jmd2.dismiss();
                return;
            }
            case 2: {
                final jlz jlz = (jlz)this.a;
                final jmp g4 = jlz.g;
                g4.l();
                g4.b.i();
                final jmd am2 = jmd.aM(jlz.i, jlz.b);
                jlz.b.J(3, (wxz)new wws(wya.c(95983)), (alff)null);
                final ct i2 = jlz.c.i();
                i2.s((br)am2, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
                i2.a();
                return;
            }
            case 1: {
                final jkc jkc = (jkc)this.a;
                jkc.b ^= true;
                jkc.f();
                return;
            }
            case 0: {
                ((jlt)this.a).ae.J(3, (wxz)new wws(wya.c(138902)), (alff)null);
                ((jlt)this.a).s(4);
            }
        }
    }
}
