import j$.util.function.Consumer$_CC;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import android.support.v4.app.Fragment$SavedState;
import java.util.concurrent.Callable;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.Observer;
import android.view.MenuItem;
import j$.util.Optional;
import java.util.List;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.orientation.PlayerEnterExitFullscreenControllerImpl;
import com.google.android.apps.youtube.app.common.csi.WatchUiActionLatencyLogger;
import android.widget.TextView;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvi implements Consumer
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public fvi(final aibe b, final TextView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fvi(final WatchUiActionLatencyLogger a, final wyw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final PlayerEnterExitFullscreenControllerImpl a, final msr b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final fvl a, final alaf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final fvn a, final aome b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final fwl a, final zqd b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final fwp a, final aomw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final fwp a, final zqd b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final gge a, final PaneDescriptor b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final hfx a, final uby b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final hlf b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fvi(final hmt a, final hnf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final hmt a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final hmu a, final ackm b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final how b, final Context a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fvi(final iat b, final Context a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fvi(final idc a, final List b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fvi(final uak a, final Optional b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void accept(final Object o) {
        final int c = this.c;
        int n = 2;
        switch (c) {
            default: {
                ((idc)this.a).a.f((List)this.b, (abdh)o);
                return;
            }
            case 19: {
                final Object a = this.a;
                final Object b = this.b;
                final MenuItem menuItem = (MenuItem)o;
                final uak uak = (uak)a;
                ((xhp)uak.b).addObserver((Observer)uak.c);
                ((xhp)uak.b).b(uak.g(menuItem));
                ((iav)uak.a).d(((xhp)uak.b).h());
                uak.e = b;
                return;
            }
            case 18: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                final YouTubeTextView youTubeTextView = (YouTubeTextView)o;
                final iat iat = (iat)b2;
                tpe.v((View)youTubeTextView, iat.a != 0);
                String text;
                if (TextUtils.isEmpty((CharSequence)iat.c)) {
                    text = ((Context)a2).getString(iat.b);
                }
                else {
                    text = ((Context)a2).getString(iat.b, new Object[] { iat.c });
                }
                youTubeTextView.setText((CharSequence)text);
                return;
            }
            case 17: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                final Drawable background = (Drawable)o;
                background.setColorFilter(((aibe)b3).c, PorterDuff$Mode.SRC_IN);
                ((TextView)a3).setBackground(background);
                return;
            }
            case 16: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                final anti anti = (anti)o;
                final ReelPlayerView bf = ((how)b4).bf;
                final int c2 = anti.c;
                final int d = anti.d;
                final Context context = (Context)a4;
                tsy.c(context, (View)bf, (CharSequence)context.getString(2132019353, new Object[] { c2, d }));
                return;
            }
            case 15: {
                ((hmu)this.a).B.d((ackm)this.b, (ajmo)o);
                return;
            }
            case 14: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                final ansq ansq = (ansq)o;
                final hmt hmt = (hmt)a5;
                if (hmt.d.isPresent() && ((String)hmt.d.get()).equals(ansq.e)) {
                    ((hne)hmt.a.a()).m((hnf)b5);
                }
                return;
            }
            case 13: {
                final Object a6 = this.a;
                final Object b6 = this.b;
                final ansq ansq2 = (ansq)o;
                final hmt hmt2 = (hmt)a6;
                if (hmt2.d.isPresent() && ((String)hmt2.d.get()).equals(b6) && ansq2.e.equals(b6)) {
                    hmt2.c.ifPresent((Consumer)gyr.e);
                }
                return;
            }
            case 12: {
                ((guw)((hlf)this.b).c.a()).e((aiqj)o, ((Intent)this.a).getExtras());
                return;
            }
            case 11: {
                final Object a7 = this.a;
                final Object b7 = this.b;
                final Exception ex = (Exception)o;
                ((uby)b7).H();
                ((hfx)a7).f(ex);
                return;
            }
            case 10: {
                ((msr)this.b).Q((Callable)new exo((PlayerEnterExitFullscreenControllerImpl)this.a, (hsi)o, 7));
                return;
            }
            case 9: {
                final Object a8 = this.a;
                final Object b8 = this.b;
                final PaneDescriptor paneDescriptor = (PaneDescriptor)o;
                final gge gge = (gge)a8;
                gge.v((PaneDescriptor)b8, gge.f(), paneDescriptor);
                gge.B(paneDescriptor, (Fragment$SavedState)null, (Object)null, (String)null, 0, 0, false, false);
                return;
            }
            case 8: {
                final Object a9 = this.a;
                final Object b9 = this.b;
                final zqd zqd = (zqd)o;
                if (!zqd.a || !zqd.b || !zqd.c) {
                    final aomw aomw = (aomw)b9;
                    final int e = aomw.e;
                    final fwp fwp = (fwp)a9;
                    if (fwp.d.containsKey(e)) {
                        fwp.f(aomw.e);
                        return;
                    }
                }
                ((fwp)a9).f(((aomw)b9).d);
                return;
            }
            case 7: {
                final Object a10 = this.a;
                final Object b10 = this.b;
                final wyw wyw = (wyw)o;
                final aomw aomw2 = (aomw)b10;
                if ((aomw2.b & 0x80) != 0x0) {
                    wyw.J(3, (wzz)new wyt(aomw2.i), (alhi)null);
                }
                final fwp fwp2 = (fwp)a10;
                Optional.ofNullable((Object)fwp2.g).ifPresent((Consumer)new fwo(fwp2, aomw2, wyw));
                return;
            }
            case 6: {
                Optional.ofNullable(this.b).ifPresent((Consumer)new fvi((fwp)this.a, (aomw)o, 8));
                return;
            }
            case 5: {
                final Object a11 = this.a;
                final Object b11 = this.b;
                final fwp fwp3 = (fwp)o;
                if (((fwl)a11).e == 3) {
                    fwp3.e((zqd)b11);
                }
                return;
            }
            case 4: {
                final Object a12 = this.a;
                final Object b12 = this.b;
                final View view = (View)o;
                final fvl fvl = (fvl)a12;
                final acvw m = fvl.c.m;
                final alaf alaf = (alaf)b12;
                alad alad;
                if ((alad = alaf.f) == null) {
                    alad = alad.a;
                }
                akbo a13;
                if (alad.b == 102716411) {
                    a13 = (akbo)alad.c;
                }
                else {
                    a13 = akbo.a;
                }
                alad alad2;
                if ((alad2 = alaf.f) == null) {
                    alad2 = alad.a;
                }
                m.b(a13, view, (Object)alad2, fvl.c.r);
                return;
            }
            case 3: {
                final Object a14 = this.a;
                final Object b13 = this.b;
                final wyw wyw2 = (wyw)o;
                final wyt wyt = new wyt(((aome)b13).D.I());
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                final ahaz builder2 = ((ahbh)algx.a).createBuilder();
                final boolean booleanValue = ((fvn)a14).a();
                builder2.copyOnWrite();
                final algx algx = (algx)builder2.instance;
                if (!booleanValue) {
                    n = 3;
                }
                algx.c = n - 1;
                algx.b |= 0x1;
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                final algx n2 = (algx)builder2.build();
                n2.getClass();
                alhi.n = n2;
                alhi.b |= 0x8000;
                wyw2.J(3, (wzz)wyt, (alhi)builder.build());
                return;
            }
            case 2: {
                final Object a15 = this.a;
                final Object b14 = this.b;
                final wyw wyw3 = (wyw)o;
                final aome aome = (aome)b14;
                final wyt wyt2 = new wyt(aome.D);
                final ahaz builder3 = ((ahbh)alhi.a).createBuilder();
                final ahaz builder4 = ((ahbh)alil.a).createBuilder();
                final boolean booleanValue2 = ((fvn)a15).a();
                builder4.copyOnWrite();
                final alil alil = (alil)builder4.instance;
                alil.b |= 0x2;
                alil.d = booleanValue2;
                final String f = aome.f;
                builder4.copyOnWrite();
                final alil alil2 = (alil)builder4.instance;
                f.getClass();
                alil2.b |= 0x1;
                alil2.c = f;
                builder3.copyOnWrite();
                final alhi alhi2 = (alhi)builder3.instance;
                final alil z = (alil)builder4.build();
                z.getClass();
                alhi2.z = z;
                alhi2.c |= 0x4000;
                wyw3.w((wzz)wyt2, (alhi)builder3.build());
                return;
            }
            case 1: {
                final Object a16 = this.a;
                ((xan)o).b(((wyw)this.b).i());
                ((WatchUiActionLatencyLogger)a16).b = true;
                return;
            }
            case 0: {
                final Object a17 = this.a;
                final Object b15 = this.b;
                final String d2 = (String)o;
                final fwz j = ((fvn)a17).j;
                aomb aomb;
                if ((aomb = ((aome)b15).u) == null) {
                    aomb = aomb.a;
                }
                aomj a18;
                if (aomb.b == 136390057) {
                    a18 = (aomj)aomb.c;
                }
                else {
                    a18 = aomj.a;
                }
                final long c3 = a18.c;
                if (!TextUtils.isEmpty((CharSequence)d2) && c3 >= 0L) {
                    final String g = j.g;
                    if (g == null || g.equals(d2)) {
                        final fwy fwy = new fwy((fwx)a17, c3);
                        j.b.remove(fwy);
                        if (!d2.equals(j.d)) {
                            j.d();
                        }
                        j.d = d2;
                        if (j.b() >= c3 && j.h()) {
                            ((fwx)a17).h(d2);
                            return;
                        }
                        j.b.offer(fwy);
                        j.f();
                    }
                }
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.c) {
            default: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 19: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 18: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 17: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 16: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 15: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 14: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 13: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 12: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 11: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 10: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 9: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 8: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 0: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
        }
    }
}
