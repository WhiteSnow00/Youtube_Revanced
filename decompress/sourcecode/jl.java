import android.widget.Button;
import android.app.PendingIntent;
import android.view.accessibility.AccessibilityManager;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.widget.EditText;
import android.app.AlertDialog;
import android.os.Message;
import android.app.PendingIntent$CanceledException;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.media.session.MediaController$TransportControls;
import android.content.DialogInterface$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.content.Context;
import j$.util.Optional;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.youtube.app.common.inappupdate.DefaultInAppUpdateController;
import androidx.preference.Preference;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.SearchView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jl implements View$OnClickListener
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public jl(final SearchView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jl(final Toolbar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jl(final Preference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jl(final cbn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jl(final ew a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jl(final eya a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jl(final ezf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jl(final hm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final int b = this.b;
        int n = 2;
        final int n2 = 0;
        final Message message = null;
        final ajsq ajsq = null;
        boolean b2 = true;
        switch (b) {
            default: {
                gow.v(((fju)this.a).a.a, Uri.parse("https://support.google.com/nexus/answer/2840815"));
                return;
            }
            case 19: {
                final qpt b3 = ((fju)this.a).b;
                if (b3 != null) {
                    b3.y();
                }
                return;
            }
            case 18: {
                final DefaultInAppUpdateController defaultInAppUpdateController = (DefaultInAppUpdateController)this.a;
                defaultInAppUpdateController.b.v(akcf.p);
                defaultInAppUpdateController.a.d();
                return;
            }
            case 17: {
                int integer = ((ezf)this.a).c.getInteger(2131492887);
                final ezf ezf = (ezf)this.a;
                final TextView e = ezf.e;
                if (!ezf.m) {
                    integer = Integer.MAX_VALUE;
                }
                e.setMaxLines(integer);
                final ezf ezf2 = (ezf)this.a;
                ezf2.m ^= true;
                return;
            }
            case 16: {
                final eyo eyo = (eyo)this.a;
                final aihg i = eyo.i;
                i.getClass();
                final AlertDialog h = eyo.h;
                h.getClass();
                final EditText f = eyo.f;
                f.getClass();
                final EditText g = eyo.g;
                g.getClass();
                final String string = f.getText().toString();
                Optional optional;
                if (g.isShown()) {
                    optional = Optional.of((Object)g.getText().toString());
                }
                else {
                    optional = Optional.empty();
                }
                aihd aihd;
                if ((aihd = i.c) == null) {
                    aihd = aihd.a;
                }
                ajse a;
                if (aihd.b == 91739437) {
                    a = (ajse)aihd.c;
                }
                else {
                    a = ajse.a;
                }
                Label_0495: {
                    if (string.equals(a.d)) {
                        if (!optional.isEmpty()) {
                            final String s = (String)optional.get();
                            aihd aihd2;
                            if ((aihd2 = i.d) == null) {
                                aihd2 = aihd.a;
                            }
                            ajse a2;
                            if (aihd2.b == 91739437) {
                                a2 = (ajse)aihd2.c;
                            }
                            else {
                                a2 = ajse.a;
                            }
                            if (!s.equals(a2.d)) {
                                break Label_0495;
                            }
                        }
                        h.dismiss();
                        return;
                    }
                }
                final vmh d = eyo.d;
                final vmd vmd = new vmd(d.c, d.d, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vmd.a = string;
                if (optional.isPresent()) {
                    vmd.b = (String)optional.get();
                }
                final bu a3 = eyo.a;
                final vmh d2 = eyo.d;
                final Executor e2 = eyo.e;
                if (d2.h == null) {
                    d2.h = new vme(d2.e, d2.b);
                }
                tcp.n((aum)a3, ((vkh)d2.h).b((vjn)vmd, e2), (trb)new exr(eyo, 4), (trb)new hei(eyo, string, optional, h, 1));
                return;
            }
            case 15: {
                final eyk eyk = (eyk)this.a;
                final String string2 = eyk.g.getText().toString();
                if (string2.equals(eyk.i.c)) {
                    eyk.h.dismiss();
                    return;
                }
                final vmp c = eyk.c;
                final String e3 = eyk.i.e;
                final vmj vmj = new vmj(c.c, c.d, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vml)vmj).c = e3;
                vmj.a = string2;
                tcp.n((aum)eyk.a, eyk.c.a((vjn)vmj), (trb)new exr(eyk, 3), (trb)new fcy(eyk, string2, 1));
                return;
            }
            case 14: {
                final eye eye = (eye)this.a;
                final AlertDialog f2 = eye.f;
                f2.getClass();
                final aihc g2 = eye.g;
                g2.getClass();
                final EditText e4 = eye.e;
                e4.getClass();
                final String string3 = e4.getText().toString();
                aihd aihd3;
                if ((aihd3 = g2.c) == null) {
                    aihd3 = aihd.a;
                }
                ajse a4;
                if (aihd3.b == 91739437) {
                    a4 = (ajse)aihd3.c;
                }
                else {
                    a4 = ajse.a;
                }
                if (string3.equals(a4.d)) {
                    f2.dismiss();
                    return;
                }
                final vmh c2 = eye.c;
                final vmb vmb = new vmb(c2.c, c2.d, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vmb.a = string3;
                final bu a5 = eye.a;
                final vmh c3 = eye.c;
                final Executor d3 = eye.d;
                if (c3.i == null) {
                    c3.i = new vmc(c3.e, c3.b);
                }
                final ListenableFuture b4 = ((vkh)c3.i).b((vjn)vmb, d3);
                final tny b5 = eye.b;
                b5.getClass();
                tcp.n((aum)a5, b4, (trb)new exr(b5, 2), (trb)new eyc(eye, string3, f2, 0));
                return;
            }
            case 13: {
                final aiiq a6 = eya.a(((eya)this.a).d);
                if (a6 != null) {
                    final eya eya = (eya)this.a;
                    if (eya.f == null) {
                        eya.g = View.inflate((Context)eya.a, 2131624162, (ViewGroup)null);
                        eya.h = (ImageView)eya.g.findViewById(2131432006);
                        eya.i = (TextView)eya.g.findViewById(2131429196);
                        eya.j = (TextView)eya.g.findViewById(2131432092);
                        eya.k = (TextView)eya.g.findViewById(2131431819);
                        eya.l = (TextView)eya.g.findViewById(2131430591);
                        eya.m = (TextView)eya.g.findViewById(2131427550);
                        eya.f = eya.n.af((Context)eya.a).setTitle((CharSequence)eya.a.getString(2132018668)).setView(eya.g).setNegativeButton(2132017891, (DialogInterface$OnClickListener)null).setPositiveButton(2132020165, (DialogInterface$OnClickListener)new ceg(eya, 2)).create();
                    }
                    eya.e = a6;
                    final TextView j = eya.i;
                    ajsq ajsq2;
                    if ((a6.b & 0x1) != 0x0) {
                        if ((ajsq2 = a6.c) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    j.setText((CharSequence)abyh.b(ajsq2));
                    final TextView k = eya.j;
                    ajsq ajsq3;
                    if ((0x4 & a6.b) != 0x0) {
                        if ((ajsq3 = a6.e) == null) {
                            ajsq3 = ajsq.a;
                        }
                    }
                    else {
                        ajsq3 = null;
                    }
                    k.setText((CharSequence)abyh.b(ajsq3));
                    final aceo b6 = eya.b;
                    final ImageView h2 = eya.h;
                    aorm aorm;
                    if ((aorm = a6.d) == null) {
                        aorm = aorm.a;
                    }
                    b6.j(h2, aorm, acek.b);
                    final TextView l = eya.k;
                    ajsq ajsq4;
                    if ((a6.b & 0x8) != 0x0) {
                        if ((ajsq4 = a6.f) == null) {
                            ajsq4 = ajsq.a;
                        }
                    }
                    else {
                        ajsq4 = null;
                    }
                    tmy.t(l, (CharSequence)abyh.b(ajsq4));
                    final TextView m = eya.l;
                    ajsq ajsq5;
                    if ((a6.b & 0x10) != 0x0) {
                        if ((ajsq5 = a6.g) == null) {
                            ajsq5 = ajsq.a;
                        }
                    }
                    else {
                        ajsq5 = null;
                    }
                    tmy.t(m, (CharSequence)abyh.b(ajsq5));
                    final TextView m2 = eya.m;
                    ajsq ajsq6 = ajsq;
                    if ((a6.b & 0x20) != 0x0 && (ajsq6 = a6.h) == null) {
                        ajsq6 = ajsq.a;
                    }
                    tmy.t(m2, (CharSequence)abyh.b(ajsq6));
                    eya.f.show();
                }
                return;
            }
            case 12: {
                ((exn)this.a).g();
                return;
            }
            case 11: {
                ((etl)this.a).a.n();
                return;
            }
            case 10: {
                final etl etl = (etl)this.a;
                etl.b.q(etl.c, "yt_android_signout");
                return;
            }
            case 9: {
                ((rfn)this.a).c();
                return;
            }
            case 8: {
                ((Preference)this.a).rI(view);
                return;
            }
            case 7: {
                final int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id == 2131429940) {
                        final cbn cbn = (cbn)this.a;
                        if (cbn.V != null) {
                            final PlaybackStateCompat c4 = cbn.C;
                            if (c4 != null) {
                                if (c4.a != 3) {
                                    b2 = false;
                                }
                                int n3;
                                if (b2 && cbn.x()) {
                                    ((MediaController$TransportControls)((cbn)this.a).V.s().a).pause();
                                    n3 = 2132018685;
                                }
                                else if (b2 && ((cbn)this.a).z()) {
                                    ((MediaController$TransportControls)((cbn)this.a).V.s().a).stop();
                                    n3 = 2132018687;
                                }
                                else {
                                    n3 = n2;
                                    if (!b2) {
                                        n3 = n2;
                                        if (((cbn)this.a).y()) {
                                            ((MediaController$TransportControls)((cbn)this.a).V.s().a).play();
                                            n3 = 2132018686;
                                        }
                                    }
                                }
                                final AccessibilityManager t = ((cbn)this.a).T;
                                if (t != null && t.isEnabled() && n3 != 0) {
                                    final AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                    obtain.setPackageName((CharSequence)((cbn)this.a).d.getPackageName());
                                    obtain.setClassName((CharSequence)this.getClass().getName());
                                    obtain.getText().add(((cbn)this.a).d.getString(n3));
                                    ((cbn)this.a).T.sendAccessibilityEvent(obtain);
                                }
                            }
                        }
                    }
                    else if (id == 2131429938) {
                        ((fy)this.a).dismiss();
                    }
                    return;
                }
                if (((cbn)this.a).c.m()) {
                    if (id != 16908313) {
                        n = 1;
                    }
                    dmk.C(n);
                }
                ((fy)this.a).dismiss();
                return;
            }
            case 6: {
                final cbn cbn2 = (cbn)this.a;
                final boolean m3 = cbn2.M ^ true;
                cbn2.M = m3;
                if (m3) {
                    cbn2.n.setVisibility(0);
                }
                ((cbn)this.a).n();
                ((cbn)this.a).s(true);
                return;
            }
            case 5: {
                final eg v = ((cbn)this.a).V;
                if (v != null) {
                    final PendingIntent sessionActivity = ((dw)v.c).a.getSessionActivity();
                    if (sessionActivity != null) {
                        try {
                            sessionActivity.send();
                            ((fy)this.a).dismiss();
                        }
                        catch (final PendingIntent$CanceledException ex) {
                            new StringBuilder().append(sessionActivity);
                            Log.e("MediaRouteCtrlDialog", sessionActivity.toString().concat(" was not sent, it had been canceled."));
                        }
                    }
                }
                return;
            }
            case 4: {
                ((fy)this.a).dismiss();
                return;
            }
            case 3: {
                ((Toolbar)this.a).k();
                return;
            }
            case 2: {
                final SearchView searchView = (SearchView)this.a;
                if (view == searchView.mSearchButton) {
                    searchView.onSearchClicked();
                    return;
                }
                if (view == searchView.mCloseButton) {
                    searchView.onCloseClicked();
                    return;
                }
                if (view == searchView.mGoButton) {
                    searchView.onSubmitQuery();
                    return;
                }
                if (view == searchView.mVoiceButton) {
                    searchView.onVoiceClicked();
                    return;
                }
                if (view == searchView.mSearchSrcTextView) {
                    searchView.forceSuggestionQuery();
                }
                return;
            }
            case 1: {
                final ew ew = (ew)this.a;
                Message message2 = null;
                Label_2358: {
                    if (view == ew.i) {
                        final Message k2 = ew.k;
                        if (k2 != null) {
                            message2 = Message.obtain(k2);
                            break Label_2358;
                        }
                    }
                    if (view == ew.l) {
                        final Message n4 = ew.n;
                        if (n4 != null) {
                            message2 = Message.obtain(n4);
                            break Label_2358;
                        }
                    }
                    final Button o = ew.o;
                    message2 = message;
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                final ew ew2 = (ew)this.a;
                ew2.G.obtainMessage(1, (Object)ew2.b).sendToTarget();
                return;
            }
            case 0: {
                ((hm)this.a).f();
            }
        }
    }
}
