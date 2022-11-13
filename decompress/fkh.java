import java.io.IOException;
import android.content.Context;
import android.webkit.WebView;
import java.util.Set;
import android.util.Base64;
import java.util.Collection;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkh implements afva
{
    final Object a;
    final Object b;
    private final int c;
    
    public fkh(final adrn b, final adse a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkh(final fki b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkh(final fme b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkh(final nqb b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkh(final nqc b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkh(final nyw b, final List a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkh(final nyx b, final aptk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkh(final oyg a, final ddx b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkh(final php a, final pfd b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkh(final quq a, final qul b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkh(final qus a, final qul b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkh(final uij a, final uih b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static void c(final adrn ex, Object o) {
        Label_0187: {
            try {
                try {
                    if (o instanceof adqm) {
                        adds.aa((adqm)o);
                    }
                    if (o instanceof adqi) {
                        final adqi adqi = (adqi)o;
                        final ahaz builder = ((ahbh)agud.a).createBuilder();
                        final ahab x = ahab.x(adqi.a());
                        builder.copyOnWrite();
                        ((agud)builder.instance).b = x;
                        adkp.S(((agud)builder.build()).b.d() <= 1650, "Blob size cannot be greater than %s bytes.", 1650);
                    }
                    final aguh a = adsd.a((adqm)o);
                    try {
                        final adrz c = ((adrn)ex).c;
                        synchronized (c.b) {
                            if (!c.g) {
                                c.d = a;
                                c.g = true;
                                c.b(c.d);
                                return;
                            }
                            o = new IllegalStateException("State has already been initialized.");
                            throw o;
                        }
                    }
                    catch (final IllegalStateException ex) {
                        final afkk afkk = adrn.a;
                        final afkz afkz = ((afkg)afkk).h();
                        final String s = "Received a newer state before initializing from queried state.";
                        final String s2 = "com/google/android/livesharing/internal/LiveSharingSessionImpl";
                        final String s3 = "setInitialState";
                        final char c2 = ':';
                        final String s4 = "LiveSharingSessionImpl.java";
                        final IllegalStateException ex2 = ex;
                        c.i(afkz, s, s2, s3, c2, s4, (Throwable)ex2);
                        return;
                    }
                }
                catch (final IllegalStateException ex) {
                    break Label_0187;
                }
                try {
                    final afkk afkk = adrn.a;
                    final afkz afkz = ((afkg)afkk).h();
                    final String s = "Received a newer state before initializing from queried state.";
                    final String s2 = "com/google/android/livesharing/internal/LiveSharingSessionImpl";
                    final String s3 = "setInitialState";
                    final char c2 = ':';
                    final String s4 = "LiveSharingSessionImpl.java";
                    final IllegalStateException ex2 = ex;
                    c.i(afkz, s, s2, s3, c2, s4, (Throwable)ex2);
                    return;
                }
                catch (final AssertionError assertionError) {}
            }
            catch (final AssertionError assertionError2) {}
        }
        c.i(((afkg)adrm.a).g(), "Invalid initial state POJO.", "com/google/android/livesharing/internal/LiveSharingSessionFactory$2", "lambda$onSuccess$0", '\u00f0', "LiveSharingSessionFactory.java", (Throwable)ex);
    }
    
    public final void b(Object a) {
        final int c = this.c;
        final boolean b = true;
        final boolean b2 = true;
        switch (c) {
            default: {
                ((Optional)a).ifPresent((Consumer)new adjk((adrn)this.b, 4));
                return;
            }
            case 11: {
                final uii c2 = (uii)a;
                final String a2 = uij.a;
                String.valueOf(c2);
                ((uij)this.a).c = c2;
                final Object b3 = this.b;
                final long a3 = c2.a;
                final uih uih = (uih)b3;
                final ahaz a4 = uih.a;
                a4.copyOnWrite();
                final ajbx ajbx = (ajbx)a4.instance;
                final ajbx a5 = ajbx.a;
                ajbx.c = 1;
                ajbx.b |= 0x8;
                final int e = (int)a3;
                a4.copyOnWrite();
                final ajbx ajbx2 = (ajbx)a4.instance;
                ajbx2.b |= 0x40;
                ajbx2.e = e;
                uih.a();
                return;
            }
            case 10: {
                agrb agrb;
                if ((agrb = ((agqu)a).b) == null) {
                    agrb = agrb.a;
                }
                final Object a6 = this.a;
                Object g;
                if ((agrb.b & 0x1) != 0x0) {
                    g = aezp.k((Object)agrb.c);
                }
                else {
                    g = aeyo.a;
                }
                ((qus)a6).g = (aezp)g;
                final Object a7 = this.a;
                final int b4 = agrb.b;
                final qus qus = (qus)a7;
                qus.f = (0x1 == (b4 & 0x1));
                qus.a.addAll((Collection)agrb.e);
                ((qus)this.a).b.add(((qul)this.b).c(agrb.e.size()));
                final qus qus2 = (qus)this.a;
                final auy c3 = qus2.c;
                final afeq o = afeq.o((Collection)qus2.a);
                final int b5 = agrb.b;
                final afeq o2 = afeq.o((Collection)((qus)this.a).b);
                boolean b6 = b2;
                if (0x1 != (b5 & 0x1)) {
                    b6 = false;
                }
                c3.k(quv.b(o, b6, o2));
                qus.b((qus)this.a);
                final qus qus3 = (qus)this.a;
                qus3.e = false;
                qus3.a();
                return;
            }
            case 9: {
                final agqw agqw = (agqw)a;
                synchronized (this) {
                    final List b7 = ((quq)this.a).b;
                    agqo agqo;
                    if ((agqo = agqw.b) == null) {
                        agqo = agqo.a;
                    }
                    b7.addAll((Collection)agqo.d);
                    final List c4 = ((quq)this.a).c;
                    final Object b8 = this.b;
                    agqo agqo2;
                    if ((agqo2 = agqw.b) == null) {
                        agqo2 = agqo.a;
                    }
                    c4.add(((qul)b8).c(agqo2.d.size()));
                    a = this.a;
                    final auy d = ((quq)a).d;
                    final afeq o3 = afeq.o((Collection)((quq)a).b);
                    agqo agqo3;
                    if ((agqo3 = agqw.b) == null) {
                        agqo3 = agqo.a;
                    }
                    d.k(new qur(o3, (aezp)aeyo.a, 0x1 == (agqo3.b & 0x1), afeq.o((Collection)((quq)this.a).c)));
                    final Object a8 = this.a;
                    agqo agqo4;
                    if ((agqo4 = agqw.b) == null) {
                        agqo4 = agqo.a;
                    }
                    final int b9 = agqo4.b;
                    final quq quq = (quq)a8;
                    boolean f = b;
                    if (0x1 != (b9 & 0x1)) {
                        f = false;
                    }
                    quq.f = f;
                    quq.d((quq)a8);
                    ((quq)this.a).e = false;
                    monitorexit(this);
                    ((quq)this.a).b();
                }
            }
            case 8: {
                final Void void1 = (Void)a;
                return;
            }
            case 7: {
                final dia dia = (dia)a;
                if (!((oyg)this.a).f) {
                    final Object a9 = this.a;
                    final oyg oyg = (oyg)a9;
                    final dhz c5 = oyg.h.c(oyg.d, oyg.a, oyg.b, true, dia);
                    final aln b10 = oyg.h.b.b((Object)c5, oyg.a, oyg.b, oyg.c);
                    if (b10 == null) {
                        final String value = String.valueOf(oyg.h.b);
                        final String b11 = c5.b();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(value);
                        sb.append(" returned null LoadData for ");
                        sb.append(b11);
                        oyg.e((Exception)new RuntimeException(sb.toString()));
                        return;
                    }
                    oyg.g = (ddy)b10.b;
                    ((ddy)b10.b).f(oyg.e, (ddx)a9);
                    if (oyg.f) {
                        oyg.lq();
                    }
                }
                return;
            }
            case 6: {
                final Boolean b12 = (Boolean)a;
                final nzl b13 = ((nyx)this.b).b;
                final String encodeToString = Base64.encodeToString(((agzk)this.a).toByteArray(), 2);
                final nzb nzb = (nzb)b13;
                final WebView b14 = nzb.b;
                if (b14 == null) {
                    return;
                }
                b14.post((Runnable)new nmx(nzb, encodeToString, 6));
                return;
            }
            case 5: {
                final Void void2 = (Void)a;
                ((nzu)((nyw)this.b).j.e.a).e(nzt.b);
                ((nzu)((nyw)this.b).j.e.a).d();
                final Object a10 = ((nyw)this.b).j.e.a;
                final String d2 = ((List<String>)this.a).get(0);
                final nyb nyb = (nyb)a10;
                nyb.d = d2;
                ++nyb.e;
                nyb.e(nzt.f);
                nyb.f(nzt.a);
                return;
            }
            case 4: {
                final Set set = (Set)a;
                ((aflf)((aflf)((aflg)nqc.e).l()).j("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment$1", "onSuccess", 260, "StreamlineFragment.java")).r("StreamlinedFragment: webView starts loading url");
                ((nqc)this.b).ag.loadUrl((String)this.a);
                return;
            }
            case 3: {
                final Set set2 = (Set)a;
                ((aflf)((aflf)((aflg)nqb.e).l()).j("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment$1", "onSuccess", 298, "DataUsageNoticeFragment.java")).r("DataUsageNoticeFragment: webview starts loading url.");
                ((nqb)this.b).ai.loadUrl((String)this.a);
                return;
            }
            case 2: {
                ((fme)this.b).c((zyo)a);
                ((fme)this.b).e.remove(this.a);
                return;
            }
            case 1: {
                final Collection collection = (Collection)a;
                final int c6 = fki.c;
                ((fki)this.b).o((String)this.a, 2, collection);
                return;
            }
            case 0: {
                final Collection collection2 = (Collection)a;
                final int c7 = fki.c;
                ((fki)this.b).o((String)this.a, 3, collection2);
            }
        }
    }
    
    public final void rF(final Throwable t) {
        Label_0802: {
            switch (this.c) {
                default: {
                    c.i(((afkg)adrm.a).g(), "Failed to query initial state.", "com/google/android/livesharing/internal/LiveSharingSessionFactory$2", "onFailure", '\u00f7', "LiveSharingSessionFactory.java", t);
                    return;
                }
                case 11: {
                    ttr.f(uij.a, "Failed to fetch CPID", t);
                    ((uij)this.a).c = null;
                    final uih uih = (uih)this.b;
                    final ahaz a = uih.a;
                    a.copyOnWrite();
                    final ajbx ajbx = (ajbx)a.instance;
                    final ajbx a2 = ajbx.a;
                    ajbx.c = 2;
                    ajbx.b |= 0x8;
                    a.copyOnWrite();
                    final ajbx ajbx2 = (ajbx)a.instance;
                    ajbx2.b |= 0x40;
                    ajbx2.e = -1;
                    uih.a();
                    return;
                }
                case 10: {
                    final qui m = ((qus)this.a).h.m(t);
                    ((qus)this.a).b.add(((qul)this.b).e(t));
                    final qus qus = (qus)this.a;
                    qus.c.k(quv.a(afeq.o((Collection)qus.a), m, afeq.o((Collection)((qus)this.a).b)));
                    qus.b((qus)this.a);
                    ((qus)this.a).e = true;
                    return;
                }
                case 9: {
                    final qui i = ((quq)this.a).g.m(t);
                    final agst e = ((qul)this.b).e(t);
                    ((quq)this.a).c.add(e);
                    final que a3 = ((quq)this.a).a;
                    final ahaz builder = ((ahbh)agsq.a).createBuilder();
                    final agsr b = e.b();
                    builder.copyOnWrite();
                    final agsq agsq = (agsq)builder.instance;
                    b.getClass();
                    agsq.c = b;
                    agsq.b |= 0x2;
                    a3.b((agsq)builder.build());
                    final quq quq = (quq)this.a;
                    quq.d.k(new qur(afeq.o((Collection)quq.b), aezp.k((Object)i), true, afeq.o((Collection)((quq)this.a).c)));
                    quq.d((quq)this.a);
                    ((quq)this.a).e = true;
                    return;
                }
                case 7: {
                    break Label_0802;
                }
                case 6: {
                    break Label_0802;
                }
                case 5: {
                    break Label_0802;
                }
                case 4: {
                    break Label_0802;
                }
                case 3: {
                    break Label_0802;
                }
                case 2: {
                    break Label_0802;
                }
                case 1: {
                    break Label_0802;
                }
                case 8:
                case 0: {
                    Label_0820: {
                        break Label_0820;
                        final int a4 = pjs.a;
                        try {
                            final Object a5 = this.a;
                            plv.r((Context)((php)a5).a, (aezp)((php)a5).i, (pfd)this.b, (eg)((php)a5).g);
                            return;
                            ((aflf)((aflf)((aflf)((afkg)nqc.e).h()).i(t)).j("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment$1", "onFailure", 266, "StreamlineFragment.java")).r("StreamlinedFragment: Failed to setup cookies.");
                            ((nqc)this.b).af.a(npx.b(202));
                            return;
                            c.i(((afkg)nyw.a).g(), "Failed to activate effect.", "com/google/android/libraries/ar/faceviewer/components/rendering/RenderingManager$1", "onFailure", '\u010f', "RenderingManager.java", t);
                            return;
                            c.i(((afkg)nyx.a).g(), "Error sending message to web.", "com/google/android/libraries/ar/faceviewer/components/web/WebBridge$1", "onFailure", 'U', "WebBridge.java", t);
                            return;
                            ((aflf)((aflf)((aflf)((aflg)nqb.e).l()).i(t)).j("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment$1", "onFailure", 304, "DataUsageNoticeFragment.java")).r("DataUsageNoticeFragment: Failed to set up cookies.");
                            ((nqb)this.b).ah.a(npx.c(1, 402));
                            return;
                            iftrue(Label_0591:)(!((oyg)this.a).f);
                            return;
                            ttr.n("Failed to finishSpan ".concat((String)this.a), t);
                            return;
                            ttr.d("Unexpected failure on immediate future.", t);
                            return;
                            ttr.n("Failed to takeSnapshot ".concat((String)this.a), t);
                            return;
                            Label_0591: {
                                final ddo a6 = oyh.a;
                            }
                            ((ddx)this.b).e((Exception)new RuntimeException(t));
                            return;
                        }
                        catch (final IOException ex) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
}
