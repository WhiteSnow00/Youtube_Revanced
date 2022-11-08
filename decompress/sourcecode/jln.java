import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.apps.youtube.app.vr.LaunchYouTubeVrActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;
import com.google.android.libraries.user.profile.photopicker.picker.intentonly.PhotoPickerIntentActivity;
import com.google.android.libraries.youtube.account.image.CropActivity;
import com.google.android.libraries.youtube.account.verification.ui.PhoneVerificationActivity;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
import android.os.Handler;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import android.content.Context;
import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.apps.youtube.app.settings.offline.activity.SmartDownloadsStorageControlsActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jln implements rc
{
    final /* synthetic */ fa a;
    private final /* synthetic */ int b;
    
    public jln(final SmartDownloadsStorageControlsActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jln(final WatchWhileActivity a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final ImageGalleryActivity a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final jlm a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final jlo a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final jmz a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final jqa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jln(final ksz a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final lhr a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final lhs a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final lln a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final pyz a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final qua a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final qwo a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final rgo a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final rlk a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final sod a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final uhc a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final upq a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final wnv a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public jln(final xeb a, final int b) {
        this.b = b;
        this.a = (fa)a;
    }
    
    public final void a(final Context context) {
        switch (this.b) {
            default: {
                final fa a = this.a;
                final xeb xeb = (xeb)a;
                if (!xeb.a) {
                    xeb.a = true;
                    xeb.aR();
                    final PairWithTvActivity pairWithTvActivity = (PairWithTvActivity)a;
                    return;
                }
                break;
            }
            case 19: {
                ((wnv)this.a).d();
                return;
            }
            case 18: {
                final fa a2 = this.a;
                final upq upq = (upq)a2;
                if (!upq.n) {
                    upq.n = true;
                    final Object ar = upq.aR();
                    final GalleryActivity galleryActivity = (GalleryActivity)a2;
                    final epr a3 = ((esm)ar).ha.a;
                    galleryActivity.m = (arud)a3.a.v.a();
                    final uyf uyf = (uyf)a3.a.w.a();
                    galleryActivity.c = (wyc)a3.as.db.a();
                    final tdz tdz = (tdz)a3.a.h.a();
                    galleryActivity.d = (adia)a3.a.lk.a();
                    final adio adio = (adio)a3.a.a.I.a();
                    galleryActivity.e = (Handler)a3.a.G.a();
                    galleryActivity.f = (aftr)a3.a.r.a();
                    galleryActivity.l = new acss();
                    galleryActivity.g = (ujg)a3.as.eU.a();
                }
                return;
            }
            case 17: {
                final fa a4 = this.a;
                final uhc uhc = (uhc)a4;
                if (!uhc.m) {
                    uhc.m = true;
                    final Object ar2 = uhc.aR();
                    final AudioSelectionActivity audioSelectionActivity = (AudioSelectionActivity)a4;
                    final epr a5 = ((esm)ar2).ha.a;
                    audioSelectionActivity.h = (wwv)a5.a.iG.a();
                    audioSelectionActivity.i = (vlq)a5.a.jg.a();
                    audioSelectionActivity.j = (vax)a5.as.E.a();
                }
                return;
            }
            case 16: {
                ((ImageGalleryActivity)this.a).d();
                ((aenr)((sod)this.a).aR()).xM().i();
                return;
            }
            case 15: {
                final fa a6 = this.a;
                final sod sod = (sod)a6;
                if (!sod.a) {
                    sod.a = true;
                    sod.aR();
                    final ImageGalleryActivity imageGalleryActivity = (ImageGalleryActivity)a6;
                }
                return;
            }
            case 14: {
                final fa a7 = this.a;
                final rlk rlk = (rlk)a7;
                if (!rlk.a) {
                    rlk.a = true;
                    final Object ar3 = rlk.aR();
                    final PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity)a7;
                    final epr a8 = ((esm)ar3).ha.a;
                    phoneVerificationActivity.b = (vax)a8.as.E.a();
                    phoneVerificationActivity.c = a8.i;
                    phoneVerificationActivity.d = (ttn)a8.j.a();
                }
                return;
            }
            case 13: {
                final fa a9 = this.a;
                final rgo rgo = (rgo)a9;
                if (!rgo.a) {
                    rgo.a = true;
                    rgo.aR();
                    final CropActivity cropActivity = (CropActivity)a9;
                }
                return;
            }
            case 12: {
                final fa a10 = this.a;
                final qwo qwo = (qwo)a10;
                if (qwo.e(qwo.d())) {
                    if (!qwo.a) {
                        qwo.a = true;
                        final Object ar4 = qwo.aR();
                        final PhotoPickerIntentActivity photoPickerIntentActivity = (PhotoPickerIntentActivity)a10;
                        final epr a11 = ((esm)ar4).ha.a;
                        photoPickerIntentActivity.b = (qwk)a11.as.gt.a();
                        photoPickerIntentActivity.c = a11.h;
                        photoPickerIntentActivity.h = (phq)a11.a.a.aw.a();
                        photoPickerIntentActivity.d = a11.b();
                        photoPickerIntentActivity.g = a11.ah();
                        photoPickerIntentActivity.f = a11.af();
                        photoPickerIntentActivity.e = (qwb)a11.h();
                        photoPickerIntentActivity.i = epr.am();
                    }
                }
                return;
            }
            case 11: {
                final fa a12 = this.a;
                final qua qua = (qua)a12;
                if (qua.j(qua.i())) {
                    if (!qua.r) {
                        qua.r = true;
                        final Object ar5 = qua.aR();
                        final EditActivity editActivity = (EditActivity)a12;
                        final epr a13 = ((esm)ar5).ha.a;
                        editActivity.m = (alm)a13.c.a();
                        editActivity.a = (qwk)a13.as.gt.a();
                        editActivity.b = (String)a13.as.gu.a();
                        editActivity.c = (qrm)a13.d.a();
                        editActivity.o = (phq)a13.a.a.aw.a();
                        editActivity.p = (phq)a13.a.a.ay.a();
                        editActivity.d = a13.b();
                        editActivity.l = (acun)a13.e.a();
                        editActivity.q = epr.am();
                    }
                }
                return;
            }
            case 10: {
                final fa a14 = this.a;
                final pyz pyz = (pyz)a14;
                if (!pyz.a) {
                    pyz.a = true;
                    pyz.aR();
                    final ParentToolsActivity parentToolsActivity = (ParentToolsActivity)a14;
                }
                return;
            }
            case 9: {
                final fa a15 = this.a;
                final lln lln = (lln)a15;
                if (!lln.a) {
                    lln.a = true;
                    final Object ar6 = lln.aR();
                    final WebViewFallbackActivity webViewFallbackActivity = (WebViewFallbackActivity)a15;
                    final esm esm = (esm)ar6;
                    webViewFallbackActivity.c = esm.b();
                    webViewFallbackActivity.n = (c)esm.gl.a();
                    webViewFallbackActivity.d = (lls)esm.gm.a();
                    webViewFallbackActivity.e = (llx)esm.go.a();
                    webViewFallbackActivity.f = (lmb)esm.gn.a();
                    webViewFallbackActivity.o = (lzi)esm.b.fL.a();
                    webViewFallbackActivity.g = (zki)esm.b.aC.a();
                    webViewFallbackActivity.h = (tox)esm.b.dj.a();
                    webViewFallbackActivity.i = (lmf)esm.gp.a();
                    webViewFallbackActivity.j = (ScheduledExecutorService)esm.b.r.a();
                    webViewFallbackActivity.k = llj.m();
                    webViewFallbackActivity.l = esm.gq;
                    webViewFallbackActivity.m = (Executor)esm.b.g.a();
                }
                return;
            }
            case 8: {
                ((WatchWhileActivity)this.a).o();
                ((aenr)((lhs)this.a).aR()).xM().i();
                return;
            }
            case 7: {
                ((lhs)this.a).e();
                return;
            }
            case 6: {
                ((lhs)this.a).e();
                return;
            }
            case 5: {
                final fa a16 = this.a;
                final ksz ksz = (ksz)a16;
                if (!ksz.a) {
                    ksz.a = true;
                    final Object ar7 = ksz.aR();
                    final LaunchYouTubeVrActivity launchYouTubeVrActivity = (LaunchYouTubeVrActivity)a16;
                    final esm esm2 = (esm)ar7;
                    launchYouTubeVrActivity.b = (abno)esm2.b.ev.a();
                    launchYouTubeVrActivity.c = (tox)esm2.b.dj.a();
                }
                return;
            }
            case 4: {
                ((SmartDownloadsStorageControlsActivity)this.a).d();
                ((aenr)((jqa)this.a).aR()).xM().i();
                return;
            }
            case 3: {
                final fa a17 = this.a;
                final jqa jqa = (jqa)a17;
                if (!jqa.a) {
                    jqa.a = true;
                    jqa.aR();
                    final SmartDownloadsStorageControlsActivity smartDownloadsStorageControlsActivity = (SmartDownloadsStorageControlsActivity)a17;
                }
                return;
            }
            case 2: {
                final fa a18 = this.a;
                final jmz jmz = (jmz)a18;
                if (!jmz.a) {
                    jmz.a = true;
                    jmz.aR();
                    final SettingsActivity settingsActivity = (SettingsActivity)a18;
                }
                return;
            }
            case 1: {
                final fa a19 = this.a;
                final jlm jlm = (jlm)a19;
                if (!jlm.a) {
                    jlm.a = true;
                    final Object ar8 = jlm.aR();
                    final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)a19;
                    final esm esm3 = (esm)ar8;
                    voiceSearchActivity.b = (Handler)esm3.b.G.a();
                    voiceSearchActivity.ar = (adbp)esm3.fA.a();
                    voiceSearchActivity.p = (wyo)esm3.b.cB.a();
                    voiceSearchActivity.q = (tox)esm3.b.dj.a();
                    voiceSearchActivity.ap = (arud)esm3.b.v.a();
                    voiceSearchActivity.ak = (uyf)esm3.b.w.a();
                    voiceSearchActivity.r = (wwv)esm3.b.iG.a();
                    voiceSearchActivity.aq = (adjo)esm3.fz.a();
                    voiceSearchActivity.s = (acxp)esm3.b.a.bj.a();
                    voiceSearchActivity.t = (vjl)esm3.b.gk.a();
                    voiceSearchActivity.u = (thh)esm3.b.P.a();
                    voiceSearchActivity.v = (gko)esm3.b.fo.a();
                    voiceSearchActivity.w = (tdz)esm3.b.h.a();
                    voiceSearchActivity.as = esm3.zl();
                    voiceSearchActivity.au = (alm)esm3.fC.a();
                    voiceSearchActivity.av = (cxz)esm3.b.a.aP.a();
                    voiceSearchActivity.x = (ScheduledExecutorService)esm3.b.r.a();
                    voiceSearchActivity.y = (afts)esm3.b.ey.a();
                    voiceSearchActivity.z = (acup)esm3.U.a();
                    voiceSearchActivity.al = new acss();
                    voiceSearchActivity.am = esm3.bk();
                    voiceSearchActivity.an = (uyi)esm3.b.a.q.a();
                    voiceSearchActivity.at = (agjt)esm3.fB.a();
                    final eqv b = esm3.b;
                    final eqx a20 = b.a;
                    voiceSearchActivity.A = a20.dZ;
                    voiceSearchActivity.B = a20.dY;
                    voiceSearchActivity.ao = (uyi)b.jV.a();
                }
                return;
            }
            case 0: {
                final fa a21 = this.a;
                final jlo jlo = (jlo)a21;
                if (!jlo.a) {
                    jlo.a = true;
                    final Object ar9 = jlo.aR();
                    final VoiceSearchActivityV2 voiceSearchActivityV2 = (VoiceSearchActivityV2)a21;
                    final esm esm4 = (esm)ar9;
                    voiceSearchActivityV2.b = (Handler)esm4.b.G.a();
                    voiceSearchActivityV2.r = esm4.ye();
                    voiceSearchActivityV2.s = new jjg(esm4.d, esm4.b.fo, (char[])null, null);
                    voiceSearchActivityV2.e = (wyo)esm4.b.cB.a();
                    voiceSearchActivityV2.f = (tox)esm4.b.dj.a();
                    voiceSearchActivityV2.q = (arud)esm4.b.v.a();
                    voiceSearchActivityV2.m = (uyf)esm4.b.w.a();
                    voiceSearchActivityV2.g = (wwv)esm4.b.iG.a();
                    voiceSearchActivityV2.h = (gko)esm4.b.fo.a();
                    voiceSearchActivityV2.i = (tdz)esm4.b.h.a();
                    voiceSearchActivityV2.u = esm4.zl();
                    voiceSearchActivityV2.n = new acss();
                    voiceSearchActivityV2.t = new e(esm4.b.w, esm4.fC, esm4.fA, esm4.U, (byte[])null, (char[])null, (byte[])null);
                    final uyi uyi = (uyi)esm4.fD.a();
                    voiceSearchActivityV2.o = esm4.bk();
                    voiceSearchActivityV2.p = (uyi)esm4.b.jV.a();
                    break;
                }
                break;
            }
        }
    }
}
