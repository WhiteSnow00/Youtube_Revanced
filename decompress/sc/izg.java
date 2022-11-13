import android.widget.FrameLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izg implements abhp
{
    final Object a;
    private final int b;
    
    public izg(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izg(final iwc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izg(final jcn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(int n, final int n2, final int n3) {
        final int b = this.b;
        if (b == 0) {
            final YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay)this.a;
            youTubeControlsOverlay.R = true;
            if (!youTubeControlsOverlay.aa(youTubeControlsOverlay.g.b.e() ^ true)) {
                int n4 = 0;
                Label_0169: {
                    int n5 = 0;
                    Label_0163: {
                        if ((n4 = n) != 2) {
                            if ((n5 = n) != 1) {
                                break Label_0163;
                            }
                            n4 = 1;
                        }
                        n5 = n4;
                        if (((YouTubeControlsOverlay)this.a).g.b.f()) {
                            n5 = n4;
                            if (n3 != 0) {
                                n5 = n4;
                                if (((YouTubeControlsOverlay)this.a).Z()) {
                                    n5 = n4;
                                    if (((YouTubeControlsOverlay)this.a).N.a == abbx.b) {
                                        n = 1;
                                        break Label_0169;
                                    }
                                }
                            }
                        }
                    }
                    n = 0;
                    n4 = n5;
                }
                if (n != 0) {
                    ((YouTubeControlsOverlay)this.a).C();
                    ((YouTubeControlsOverlay)this.a).S();
                }
                if (n4 != n2) {
                    if (!((YouTubeControlsOverlay)this.a).g.b.e() && ((YouTubeControlsOverlay)this.a).g.getParent() == null) {
                        final abhm h = ((YouTubeControlsOverlay)this.a).h;
                        final RecyclerView g = h.g;
                        if (g != null) {
                            if (h.h == null) {
                                h.h = (acqr)((acud)h.f).b(g, h.b);
                            }
                            final acqr h2 = h.h;
                            if (h2 != null) {
                                h2.a(h.g);
                            }
                            else {
                                h.g.ac((nq)h.b);
                            }
                        }
                        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
                        layoutParams.gravity = 80;
                        ((YouTubeControlsOverlay)this.a).g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                        final YouTubeControlsOverlay youTubeControlsOverlay2 = (YouTubeControlsOverlay)this.a;
                        final FrameLayout l = youTubeControlsOverlay2.l;
                        l.getClass();
                        l.addView((View)youTubeControlsOverlay2.g);
                        ((YouTubeControlsOverlay)this.a).g.bringToFront();
                        ((YouTubeControlsOverlay)this.a).X();
                    }
                    else if (((YouTubeControlsOverlay)this.a).g.b.e() && ((YouTubeControlsOverlay)this.a).g.getParent() != null) {
                        final abhm h3 = ((YouTubeControlsOverlay)this.a).h;
                        final RecyclerView g2 = h3.g;
                        if (g2 != null) {
                            final acqr h4 = h3.h;
                            if (h4 != null) {
                                h4.b(g2);
                            }
                            else {
                                g2.ac((nq)h3.b);
                            }
                        }
                        ((YouTubeControlsOverlay)this.a).g.clearAnimation();
                        final YouTubeControlsOverlay youTubeControlsOverlay3 = (YouTubeControlsOverlay)this.a;
                        final FrameLayout i = youTubeControlsOverlay3.l;
                        i.getClass();
                        i.removeView((View)youTubeControlsOverlay3.g);
                    }
                    if (n == 0 && ((YouTubeControlsOverlay)this.a).g.b.d()) {
                        ((YouTubeControlsOverlay)this.a).C();
                    }
                    final YouTubeControlsOverlay youTubeControlsOverlay4 = (YouTubeControlsOverlay)this.a;
                    ((try)youTubeControlsOverlay4.i).a(youTubeControlsOverlay4.g.b.e() ^ true);
                }
            }
            ((YouTubeControlsOverlay)this.a).R = false;
            return;
        }
        if (b != 1) {
            return;
        }
        ((ius)this.a).f();
    }
    
    public final void d(float u, final boolean b) {
        final int b2 = this.b;
        if (b2 != 0) {
            if (b2 != 1) {
                final Object a = this.a;
                if (((abie)a).i) {
                    u = aei.u(u, 1.0f);
                    ((jcn)a).b().c.setCurrentFraction(1.0f - u);
                }
            }
            return;
        }
        if (b && ((YouTubeControlsOverlay)this.a).g.b.g()) {
            ((YouTubeControlsOverlay)this.a).C();
        }
    }
}
