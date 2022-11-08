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

public final class fkb implements afsz
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public fkb(final adpl b, final adqc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkb(final fkc b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkb(final fly b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkb(final now b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkb(final nox b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkb(final nxp b, final List a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkb(final nxq b, final aprb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fkb(final owx a, final ddw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkb(final pgf a, final pds b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkb(final qte a, final qsz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkb(final qtg a, final qsz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fkb(final ugf a, final ugd b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void rz(final Throwable t) {
        Label_0783: {
            switch (this.c) {
                default: {
                    c.i(((afig)adpk.a).g(), "Failed to query initial state.", "com/google/android/livesharing/internal/LiveSharingSessionFactory$2", "onFailure", '\u00f7', "LiveSharingSessionFactory.java", t);
                    return;
                }
                case 11: {
                    trn.f(ugf.a, "Failed to fetch CPID", t);
                    ((ugf)this.a).c = null;
                    final ugd ugd = (ugd)this.b;
                    final agza a = ugd.a;
                    a.copyOnWrite();
                    final aizt aizt = (aizt)a.instance;
                    final aizt a2 = aizt.a;
                    aizt.c = 2;
                    aizt.b |= 0x8;
                    a.copyOnWrite();
                    final aizt aizt2 = (aizt)a.instance;
                    aizt2.b |= 0x40;
                    aizt2.e = -1;
                    ugd.a();
                    return;
                }
                case 10: {
                    final qsw n = ((qtg)this.a).h.n(t);
                    ((qtg)this.a).b.add(((qsz)this.b).e(t));
                    final qtg qtg = (qtg)this.a;
                    qtg.c.k((Object)qtj.a(afcr.o((Collection)qtg.a), n, afcr.o((Collection)((qtg)this.a).b)));
                    qtg.b((qtg)this.a);
                    ((qtg)this.a).e = true;
                    return;
                }
                case 9: {
                    final qsw n2 = ((qte)this.a).g.n(t);
                    final agqu e = ((qsz)this.b).e(t);
                    ((qte)this.a).c.add(e);
                    final qss a3 = ((qte)this.a).a;
                    final agza builder = ((agzi)agqr.a).createBuilder();
                    final agqs b = e.b();
                    builder.copyOnWrite();
                    final agqr agqr = (agqr)builder.instance;
                    b.getClass();
                    agqr.c = b;
                    agqr.b |= 0x2;
                    a3.b((agqr)builder.build());
                    final qte qte = (qte)this.a;
                    qte.d.k((Object)new qtf(afcr.o((Collection)qte.b), aexq.k(n2), true, afcr.o((Collection)((qte)this.a).c)));
                    qte.c((qte)this.a);
                    ((qte)this.a).e = true;
                    return;
                }
                case 7: {
                    break Label_0783;
                }
                case 6: {
                    break Label_0783;
                }
                case 5: {
                    break Label_0783;
                }
                case 4: {
                    break Label_0783;
                }
                case 3: {
                    break Label_0783;
                }
                case 2: {
                    break Label_0783;
                }
                case 1: {
                    break Label_0783;
                }
                case 8:
                case 0: {
                    Label_0801: {
                        break Label_0801;
                        final int a4 = pii.a;
                        try {
                            final Object a5 = this.a;
                            oaw.aa((Context)((pgf)a5).a, (aexq)((pgf)a5).h, (pds)this.b, (eg)((pgf)a5).l);
                            return;
                            Label_0572: {
                                final ddn a6 = owy.a;
                            }
                            ((ddw)this.b).e((Exception)new RuntimeException(t));
                            return;
                            ((afjf)((afjf)((afjf)((afjg)now.e).l()).i(t)).j("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment$1", "onFailure", 304, "DataUsageNoticeFragment.java")).r("DataUsageNoticeFragment: Failed to set up cookies.");
                            ((now)this.b).ah.a(not.c(1, 402));
                            return;
                            trn.n("Failed to finishSpan ".concat((String)this.a), t);
                            return;
                            c.i(((afig)nxp.a).g(), "Failed to activate effect.", "com/google/android/libraries/ar/faceviewer/components/rendering/RenderingManager$1", "onFailure", '\u010f', "RenderingManager.java", t);
                            return;
                            ((afjf)((afjf)((afjf)((afig)nox.e).h()).i(t)).j("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment$1", "onFailure", 266, "StreamlineFragment.java")).r("StreamlinedFragment: Failed to setup cookies.");
                            ((nox)this.b).af.a(not.b(202));
                            return;
                            iftrue(Label_0572:)(!((owx)this.a).f);
                            return;
                            c.i(((afig)nxq.a).g(), "Error sending message to web.", "com/google/android/libraries/ar/faceviewer/components/web/WebBridge$1", "onFailure", 'U', "WebBridge.java", t);
                            return;
                            trn.d("Unexpected failure on immediate future.", t);
                            return;
                            trn.n("Failed to takeSnapshot ".concat((String)this.a), t);
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
