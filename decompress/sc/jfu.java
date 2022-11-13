import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import java.util.Iterator;
import android.content.Context;
import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorSet;
import java.util.List;
import android.app.Activity;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfu implements Runnable
{
    public final Object a;
    private final int b;
    
    public jfu(final bu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final SuggestedActionsMainController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final VoiceSearchActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final VoiceSearchActivityV2 a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final AboutPrefsFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final BillingsAndPaymentsPrefsFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final ListenableFuture a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final dfn a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final jfx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final jgb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final jih a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final jim a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final jmj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfu(final jnr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        ajut ajut = null;
        switch (b) {
            default: {
                ((Activity)this.a).recreate();
                return;
            }
            case 19: {
                final Object a = this.a;
                final BillingsAndPaymentsPrefsFragment billingsAndPaymentsPrefsFragment = (BillingsAndPaymentsPrefsFragment)a;
                if (billingsAndPaymentsPrefsFragment.ar()) {
                    final anzw n = billingsAndPaymentsPrefsFragment.d.n(10048);
                    if (n != null) {
                        final bu od = billingsAndPaymentsPrefsFragment.od();
                        if ((0x1 & n.b) != 0x0 && (ajut = n.c) == null) {
                            ajut = ajut.a;
                        }
                        od.setTitle((CharSequence)acak.b(ajut));
                        billingsAndPaymentsPrefsFragment.c.d((cey)a, (List)n.d);
                    }
                }
                return;
            }
            case 18: {
                final Object a2 = this.a;
                final AboutPrefsFragment aboutPrefsFragment = (AboutPrefsFragment)a2;
                if (aboutPrefsFragment.ar()) {
                    final anzw n2 = aboutPrefsFragment.d.n(10009);
                    if (n2 != null) {
                        final aczw c = aboutPrefsFragment.c;
                        aboutPrefsFragment.od().getApplicationContext();
                        final ahbx d = n2.d;
                        final afel d2 = afeq.d();
                        for (final anzx anzx : d) {
                            aoah aoah;
                            if ((aoah = anzx.g) == null) {
                                aoah = aoah.a;
                            }
                            ajut ajut2;
                            if ((ajut2 = aoah.c) == null) {
                                ajut2 = ajut.a;
                            }
                            final ahbx c2 = ajut2.c;
                            final ahbb ahbb = (ahbb)((ahbh)ajuv.a).createBuilder();
                            ((ahaz)ahbb).copyOnWrite();
                            final ajuv ajuv = (ajuv)ahbb.instance;
                            ajuv.b |= 0x1;
                            ajuv.c = "Open source licenses";
                            ((List)c2).contains(((ahaz)ahbb).build());
                            d2.h((Object)anzx);
                        }
                        c.d((cey)a2, (List)d2.g());
                    }
                }
                return;
            }
            case 17: {
                final jnr jnr = (jnr)this.a;
                jnr.i();
                jnr.d();
                return;
            }
            case 16: {
                ((Activity)this.a).recreate();
                return;
            }
            case 15: {
                final VoiceSearchActivityV2 voiceSearchActivityV2 = (VoiceSearchActivityV2)this.a;
                if (!voiceSearchActivityV2.isFinishing() && voiceSearchActivityV2.d != null) {
                    final ct i = voiceSearchActivityV2.c.i();
                    i.n((br)voiceSearchActivityV2.d);
                    i.a();
                    voiceSearchActivityV2.d.aK((acux)null);
                    voiceSearchActivityV2.d = null;
                }
                return;
            }
            case 14: {
                final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)this.a;
                if (!voiceSearchActivity.isFinishing() && voiceSearchActivity.k != null) {
                    final ct j = voiceSearchActivity.j.i();
                    j.n((br)voiceSearchActivity.k);
                    j.d();
                    voiceSearchActivity.k.aK((acux)null);
                    voiceSearchActivity.k = null;
                }
                return;
            }
            case 13: {
                final VoiceSearchActivity voiceSearchActivity2 = (VoiceSearchActivity)this.a;
                if (voiceSearchActivity2.h) {
                    voiceSearchActivity2.p(voiceSearchActivity2.g);
                }
                voiceSearchActivity2.s();
                return;
            }
            case 12: {
                ((Activity)this.a).recreate();
                return;
            }
            case 11: {
                final jmj jmj = (jmj)this.a;
                final SlimStatusBar m = jmj.m;
                final int b2 = jmj.b;
                final int c3 = jmj.c;
                final AnimatorSet k = new AnimatorSet();
                final Animator h = jgk.h((View)m, b2, c3, 400L);
                final Animator h2 = jgk.h((View)m, c3, b2, 400L);
                h2.setStartDelay(200L);
                k.playSequentially(new Animator[] { h, h2 });
                (jmj.k = k).start();
                return;
            }
            case 10: {
                ((jmj)this.a).c();
                return;
            }
            case 9: {
                final jmj jmj2 = (jmj)this.a;
                jmj2.e();
                jmj2.l.removeView((View)jmj2.m);
                jmj2.o = 0;
                return;
            }
            case 8: {
                ((jmj)this.a).d();
                return;
            }
            case 7: {
                final Object a3 = this.a;
                if (!((ListenableFuture)a3).isDone()) {
                    ((ListenableFuture)a3).cancel(true);
                }
                return;
            }
            case 6: {
                ((jim)this.a).q();
                return;
            }
            case 5: {
                tpe.x((Context)((jih)((dfn)this.a).a).at, 2132017860, 0);
                return;
            }
            case 4: {
                ((jih)this.a).bs();
                return;
            }
            case 3: {
                ((jih)this.a).aO.c();
                return;
            }
            case 2: {
                ((jgb)this.a).h();
                return;
            }
            case 1: {
                final SuggestedActionsMainController suggestedActionsMainController = (SuggestedActionsMainController)this.a;
                final ViewGroup h3 = suggestedActionsMainController.h;
                if (h3 != null) {
                    if (h3.getChildCount() != 0) {
                        final aonv aonv = (aonv)suggestedActionsMainController.h.getChildAt(0).getTag();
                        if (aonv != null) {
                            suggestedActionsMainController.d.add(aonv);
                        }
                        suggestedActionsMainController.l((Runnable)new inm(suggestedActionsMainController, 20));
                    }
                }
                return;
            }
            case 0: {
                ((jfx)this.a).f();
            }
        }
    }
}
