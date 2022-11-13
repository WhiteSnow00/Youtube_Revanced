import java.util.Set;
import java.util.Iterator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.TextView;
import java.util.function.Function;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore.MainAppPlayerOverlayDataProvider;
import android.support.v7.widget.SearchView;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fti implements View$OnLayoutChangeListener
{
    public final Object a;
    private final int b;
    
    public fti(final SearchView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final MainAppPlayerOverlayDataProvider a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final BottomUiContainer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final BottomUiContainer a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final DefaultPipController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final FullscreenEngagementPanelOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final YouTubeInlineAdOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final fyv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final gdk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final gkc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final hmo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final hqx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final hte a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final hyi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final hzm a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final ick a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final isi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final ivo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fti(final iyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onLayoutChange(final View view, int i, int c, int width, int n, int c2, final int n2, final int n3, final int n4) {
        final int b = this.b;
        final boolean b2 = true;
        final int n5 = 0;
        switch (b) {
            default: {
                c = n - c;
                i = width - i;
                if (n3 - c2 != i || n4 - n2 != c) {
                    final boolean inMultiWindowMode = ((YouTubeInlineAdOverlay)this.a).a.isInMultiWindowMode();
                    final YouTubeInlineAdOverlay youTubeInlineAdOverlay = (YouTubeInlineAdOverlay)this.a;
                    final iwf b3 = youTubeInlineAdOverlay.b;
                    boolean b4 = b2;
                    if (c <= i) {
                        b4 = (inMultiWindowMode && b2);
                    }
                    final boolean g = youTubeInlineAdOverlay.d.g();
                    final slo g2 = b3.g;
                    if (g2 != null) {
                        final sla sla = (sla)((slh)g2).c;
                        final sks sks = (sks)((slh)g2).b;
                        sla.a(b4, sks.j, sks.i, g);
                    }
                }
                return;
            }
            case 19: {
                final YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay)this.a;
                if (fbu.aM(youTubeControlsOverlay.W)) {
                    if (youTubeControlsOverlay.Q) {
                        n -= c;
                        width -= i;
                        if (width >= n) {
                            final Rect rect = (Rect)youTubeControlsOverlay.y.aX();
                            if (rect == null) {
                                i = 0;
                            }
                            else {
                                i = rect.top;
                            }
                            if (rect == null) {
                                c = n5;
                            }
                            else {
                                c = rect.bottom;
                            }
                            n *= (int)1.7777778f;
                            final atjm y = youTubeControlsOverlay.y;
                            width = (width - n) / 2;
                            y.tu((Object)new Rect(width, i, width, c));
                        }
                    }
                }
                return;
            }
            case 18: {
                final Object a = this.a;
                i = n - c;
                if (i == n4 - n2) {
                    return;
                }
                ((iyb)a).j.tu((Object)i);
                return;
            }
            case 17: {
                final FullscreenEngagementPanelOverlay fullscreenEngagementPanelOverlay = (FullscreenEngagementPanelOverlay)this.a;
                final kxv k = fullscreenEngagementPanelOverlay.k;
                if (k != null) {
                    k.c.tu((Object)new Rect(i, c, width, n));
                }
                if (fullscreenEngagementPanelOverlay.G()) {
                    i -= ((ViewGroup$MarginLayoutParams)view.getLayoutParams()).leftMargin;
                }
                else {
                    width += ((ViewGroup$MarginLayoutParams)view.getLayoutParams()).rightMargin;
                }
                fullscreenEngagementPanelOverlay.f.tu((Object)new Rect(i, c, width, n));
                return;
            }
            case 16: {
                final TextView a2 = ((ivo)this.a).a;
                i = (int)((width - i) * 0.16666667f);
                a2.setPadding(i, 10, i, 10);
                return;
            }
            case 15: {
                final Object a3 = this.a;
                final isi isi = (isi)a3;
                c2 = isi.c;
                c = n - c;
                i = width - i;
                if (c == c2 && i == isi.d) {
                    return;
                }
                isi.c = c;
                isi.d = i;
                ((abbk)a3).Z(22);
                return;
            }
            case 14: {
                if (n - c != n4 - n2) {
                    ((ick)this.a).b();
                }
                return;
            }
            case 13: {
                final Object a4 = this.a;
                i = view.getWidth();
                ((hyi)a4).f(i, false);
                return;
            }
            case 12: {
                final Object a5 = this.a;
                i = view.getWidth();
                final hwl hwl = (hwl)a5;
                hwl.ca = i;
                hwl.cb = view.getHeight();
                return;
            }
            case 11: {
                if (n != n4) {
                    final hte hte = (hte)this.a;
                    c = hte.a.getHeight();
                    i = hte.b.getLineHeight();
                    if (hte.i != apiy.d && !hte.k) {
                        i = c - i * 4;
                    }
                    else {
                        i = c / 2;
                    }
                    tpe.aF((View)hte.c, tpe.at(i), (Class)ViewGroup$LayoutParams.class);
                    hte.d.G(c / 2);
                    final BottomSheetBehavior d = hte.d;
                    if (d.z != 5) {
                        d.H(4);
                    }
                }
                return;
            }
            case 10: {
                ((hqx)this.a).c.setY((float)n);
                return;
            }
            case 9: {
                final hmo hmo = (hmo)this.a;
                if (hmo.l != null) {
                    i = hmo.g - view.getHeight();
                    hmo.i = i;
                    tpe.aF((View)((hmg)hmo.l).a, tpe.at(i), (Class)ViewGroup$LayoutParams.class);
                }
                return;
            }
            case 8: {
                final Object a6 = this.a;
                i = n - c;
                if (i == n4 - n2) {
                    return;
                }
                ((gkc)a6).a.m(fxz.g, i);
                return;
            }
            case 7: {
                final DefaultPipController defaultPipController = (DefaultPipController)this.a;
                if (defaultPipController.A.d) {
                    if (i != c2 || width != n3 || c != n2 || n != n4) {
                        defaultPipController.k((Function)new fnr(defaultPipController, 14));
                    }
                }
                return;
            }
            case 6: {
                ((gdk)this.a).a.m(fxz.f, n - c);
                return;
            }
            case 5: {
                ((BottomUiContainer)this.a).h(view);
                view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                return;
            }
            case 4: {
                final Object a7 = this.a;
                if (n3 - c2 != width - i) {
                    final BottomUiContainer bottomUiContainer = (BottomUiContainer)a7;
                    final View j = bottomUiContainer.j;
                    if (j != null && bottomUiContainer.r == 1) {
                        if (bottomUiContainer.a != 0) {
                            width = bottomUiContainer.getWidth();
                            if (width < bottomUiContainer.a) {
                                tpe.aF(j, tpe.aE(-1, -2), (Class)ViewGroup$LayoutParams.class);
                                return;
                            }
                            j.setMinimumWidth(bottomUiContainer.b);
                            i = bottomUiContainer.b;
                            if (width >= i) {
                                c = bottomUiContainer.c;
                                if (width <= (i = c)) {
                                    i = -2;
                                }
                            }
                            tpe.aF(j, tpe.aE(i, -2), (Class)ViewGroup$LayoutParams.class);
                        }
                    }
                }
                return;
            }
            case 3: {
                final fyv fyv = (fyv)this.a;
                if (fyv.b.getLineCount() != fyv.e) {
                    fyv.e = fyv.b.getLineCount();
                    if (!fyv.a.isRunning()) {
                        fyv.a.setIntValues(new int[] { fyv.c, fyv.a() });
                    }
                }
                return;
            }
            case 2: {
                final Object a8 = this.a;
                i = n - c;
                if (i != n4 - n2) {
                    final hzm hzm = (hzm)a8;
                    if (hzm.a != null) {
                        final Iterator<Object> iterator = ((Set<Object>)hzm.b).iterator();
                        while (iterator.hasNext()) {
                            iterator.next().g(i);
                        }
                    }
                }
                return;
            }
            case 1: {
                ((SearchView)this.a).adjustDropDownSizeAndPosition();
                return;
            }
            case 0: {
                final Object a9 = this.a;
                if (Math.abs(n4 - n2) == Math.abs(n - c) && Math.abs(n3 - c2) == Math.abs(width - i)) {
                    return;
                }
                ((MainAppPlayerOverlayDataProvider)a9).g();
            }
        }
    }
}
