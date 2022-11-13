import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.view.View;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import android.widget.ImageView;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwc extends ius implements View$OnClickListener, View$OnLongClickListener, iuu
{
    public ImageView b;
    public boolean c;
    private final abho d;
    private final Set e;
    private final wyw f;
    private boolean g;
    private final qv h;
    private final pvh i;
    
    public iwc(final abho d, final wyw f, final iyt iyt, final qv h, final pvh i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = d;
        final HashSet e = new HashSet();
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        d.b.a((abhp)new izg(this, 1));
        h.a((iyv)new ivt(this, 3));
        iyt.getClass();
        e.add(new pvh(iyt));
    }
    
    private final void z(final boolean j) {
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            final iyt iyt = (iyt)((pvh)iterator.next()).a;
            iyt.j = j;
            iyt.b();
        }
    }
    
    @Override
    protected final void a(final boolean b) {
        this.z(false);
    }
    
    @Override
    protected final void d(final boolean b) {
        this.h.b();
        this.z(true);
        this.f.l((wzz)new wyt(xaa.c(85016)));
    }
    
    @Override
    protected final boolean h(final boolean b) {
        return !this.d.b.d() && !this.c && this.g;
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final trs trs) {
    }
    
    public final void oY(final boolean b) {
    }
    
    public final void oZ(final ControlsState controlsState) {
    }
    
    public final void onClick(final View view) {
        final YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay)this.i.a;
        if (youTubeControlsOverlay.H != 0) {
            youTubeControlsOverlay.C();
            youTubeControlsOverlay.S();
        }
        this.f.J(3, (wzz)new wyt(xaa.c(85016)), (alhi)null);
    }
    
    public final boolean onLongClick(final View view) {
        return false;
    }
    
    public final void pa(final boolean b) {
    }
    
    public final void pb(final boolean b) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void r(final fkr fkr) {
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean g) {
        this.g = g;
        this.f();
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
    }
}
