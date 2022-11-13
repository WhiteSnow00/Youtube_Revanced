import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import android.widget.CheckBox;
import android.view.View;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import java.util.concurrent.Executor;
import android.view.View$OnClickListener;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import android.graphics.Bitmap;
import android.widget.ImageView;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hui implements ttg
{
    public final Object a;
    private final int b;
    
    public hui(final acto a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final hun a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final hyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final ibe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final ifr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final igd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final ihk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final ioe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final isx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final jac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hui(final jnc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(Object u) {
        final int b = this.b;
        boolean checked = true;
        final boolean b2 = true;
        final boolean b3 = true;
        switch (b) {
            default: {
                final Object a = this.a;
                ((Throwable)u).getLocalizedMessage();
                ((jnc)a).e.setVisibility(8);
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final Optional optional = (Optional)u;
                if (optional != null && optional.isPresent()) {
                    u = ((acto)a2).u;
                    ((ImageView)u).setImageBitmap((Bitmap)optional.get());
                }
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final AccountId accountId = (AccountId)u;
                if (accountId != null) {
                    final jac jac = (jac)a3;
                    final Intent setFlags = new Intent().setClassName((Context)jac.b, fwc.i("settings.SettingsActivity")).putExtra(":android:show_fragment", fwc.i("settings.accessibility.AccessibilityPrefsFragment")).putExtra("com.google.android.apps.youtube.app.settings.NavigateBackFinishes", true).setFlags(335544320);
                    aejc.a(setFlags, accountId);
                    jac.b.startActivity(setFlags);
                    jac.g.J(3, (wzz)new wyt(xaa.c(100673)), (alhi)null);
                }
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final jae jae = (jae)u;
                if (jae != null) {
                    if (jae.f < 2L) {
                        final long e = jae.e;
                        if (e != 0L) {
                            final long n = ((jac)a4).c.c() - e;
                            if (n < 0L || n < jac.a) {
                                return;
                            }
                        }
                        if ((jae.b & 0x1) == 0x0) {
                            final jac jac2 = (jac)a4;
                            final acvy d = jac2.d;
                            acwa acwa;
                            if (jac2.k.X() && !jac2.k.Y()) {
                                final acvz d2 = jac2.d.j().d(2131232576);
                                d2.c = jac2.b.getString(2132017395);
                                acwa = d2.a((CharSequence)jac2.b.getString(2132019682), jac2.a()).c((CharSequence)jac2.b.getString(2132017892), (View$OnClickListener)ial.e).j();
                            }
                            else {
                                final acvz d3 = jac2.d.j().d(2131232576);
                                d3.c = jac2.b.getString(2132017396);
                                acwa = d3.c((CharSequence)jac2.b.getString(2132019682), jac2.a()).a((CharSequence)jac2.b.getString(2132017892), (View$OnClickListener)ial.f).j();
                            }
                            d.l(acwa);
                            jac2.g.l((wzz)new wyt(xaa.c(100673)));
                            ((qqr)((atke)jac2.l.a).a()).b((aezf)new jab(jac2.c.c()), (Executor)afum.a).addListener((Runnable)tg.g, (Executor)afum.a);
                        }
                    }
                }
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final aqre aqre = (aqre)u;
                ((isx)a5).f(aqre != null && aqre.d && b3);
                return;
            }
            case 15: {
                final Object a6 = this.a;
                ttr.d("Error getting player feature settings.", (Throwable)u);
                ((isx)a6).f(false);
                return;
            }
            case 14: {
                final Object a7 = this.a;
                final Throwable t = (Throwable)u;
                ((ioe)a7).e();
                ttr.d("Failed to get has offline access.", t);
                return;
            }
            case 13: {
                ttr.d("Failed to complete delete of video ".concat(String.valueOf(this.a)), (Throwable)u);
                return;
            }
            case 12: {
                final Object a8 = this.a;
                final Throwable t2 = (Throwable)u;
                if (t2 != null) {
                    final dbj x = tbi.x(t2);
                    final ihk ihk = (ihk)a8;
                    ihk.c.k();
                    ihk.b.e((Throwable)x);
                }
                return;
            }
            case 11: {
                final Object a9 = this.a;
                final aezp aezp = (aezp)u;
                if (aezp != null && aezp.h()) {
                    final oiy c = ((igd)a9).c;
                    aqfw aqfw;
                    if ((aqfw = ((ajeo)aezp.c()).h) == null) {
                        aqfw = aqfw.a;
                    }
                    c.b(aqfw, oix.a().a());
                }
                return;
            }
            case 10: {
                final Object a10 = this.a;
                final aezp aezp2 = (aezp)u;
                if (aezp2 != null && aezp2.h()) {
                    ((igd)a10).d.d((aqnu)aezp2.c(), ota.a().f());
                }
                return;
            }
            case 9: {
                final Object a11 = this.a;
                final Boolean b4 = (Boolean)u;
                final CheckBox f = ((ifr)a11).f;
                f.getClass();
                if (b4 == null || !b4) {
                    checked = false;
                }
                f.setChecked(checked);
                return;
            }
            case 8: {
                final Object a12 = this.a;
                ttr.b("Failed to read the offlineStreamSelection value.".concat(String.valueOf(String.valueOf(u))));
                final CheckBox f2 = ((ifr)a12).f;
                f2.getClass();
                f2.setChecked(false);
                return;
            }
            case 7: {
                final Object a13 = this.a;
                ttr.c(ibf.a, "Error thrown while attempting to find an available MDx route: ".concat(String.valueOf(String.valueOf(u))));
                ((ibe)a13).a();
                return;
            }
            case 6: {
                final Object a14 = this.a;
                final Throwable t3 = (Throwable)u;
                final hyb hyb = (hyb)a14;
                hyb.aj.e(t3);
                hyb.dismiss();
                return;
            }
            case 5: {
                final Object a15 = this.a;
                final Boolean b5 = (Boolean)u;
                final hun hun = (hun)a15;
                if (!hun.P) {
                    hun.e();
                    return;
                }
                final boolean booleanValue = b5;
                hun.I = booleanValue;
                Label_1353: {
                    if (booleanValue) {
                        adkp.R(hun.y != null, (Object)"Video editing fragment is not initialized");
                        final View viewById = hun.a.findViewById(2131432308);
                        try {
                            final usu y = ((hun)a15).y;
                            final NestedScrollView u2 = ((hun)a15).u;
                            u2.getClass();
                            View o;
                            if (viewById == null) {
                                o = ((br)y).O;
                            }
                            else {
                                o = viewById;
                            }
                            adkp.R(o != null, (Object)"Upload video edit fragment root view does not exist");
                            while (true) {
                                for (ViewParent viewParent = o.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                                    if (viewParent == u2) {
                                        final boolean b6 = b2;
                                        adkp.H(b6);
                                        y.a = u2;
                                        y.a.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)y);
                                        viewById.setVisibility(0);
                                        break Label_1353;
                                    }
                                }
                                final boolean b6 = false;
                                continue;
                            }
                        }
                        catch (final RuntimeException ex) {
                            hun.aa.h("Cannot setup the video edit fragment", ex);
                            hun.I = false;
                            viewById.setVisibility(8);
                        }
                    }
                }
                hun.w(5);
                return;
            }
            case 4: {
                final Object a16 = this.a;
                final Throwable t4 = (Throwable)u;
                final hun hun2 = (hun)a16;
                hun2.x(hun2.L, 5, t4);
                return;
            }
            case 3: {
                final Object a17 = this.a;
                final Throwable t5 = (Throwable)u;
                final hun hun3 = (hun)a17;
                hun3.x(hun3.K, 4, t5);
                return;
            }
            case 2: {
                final Object a18 = this.a;
                final View view = (View)u;
                ((hun)a18).a.getSupportActionBar().r();
                return;
            }
            case 1: {
                final Object a19 = this.a;
                final View view2 = (View)u;
                ((hun)a19).a.getSupportActionBar().r();
                return;
            }
            case 0: {
                final Object a20 = this.a;
                final View view3 = (View)u;
                ((hun)a20).a.getSupportActionBar().f();
            }
        }
    }
}
