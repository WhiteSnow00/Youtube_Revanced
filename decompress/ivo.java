import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivo implements iuu
{
    public final TextView a;
    private boolean b;
    
    public ivo(final View view) {
        final TextView a = (TextView)view.findViewById(2131430447);
        (this.a = a).setTag(2131428686, (Object)true);
        a.setVisibility(8);
        anb.aw((View)a);
        view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fti(this, 16));
    }
    
    @Override
    public final void i(final boolean b) {
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    @Override
    public final void l(final boolean b) {
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
    }
    
    @Override
    public final void oZ(final ControlsState controlsState) {
        if (this.b == controlsState.i()) {
            return;
        }
        final boolean i = controlsState.i();
        this.b = i;
        tpe.v((View)this.a, i);
    }
    
    @Override
    public final void pa(final boolean b) {
    }
    
    @Override
    public final void pb(final boolean b) {
    }
    
    @Override
    public final void pc(final boolean b) {
    }
    
    @Override
    public final void r(final fkr fkr) {
    }
    
    @Override
    public final void s(final boolean b) {
    }
    
    @Override
    public final void t(final boolean b) {
    }
    
    @Override
    public final void u(final boolean b) {
    }
    
    @Override
    public final void v(final boolean b) {
    }
    
    @Override
    public final void w(final boolean b) {
    }
    
    @Override
    public final void x(final int n) {
    }
    
    @Override
    public final void y(final boolean b) {
    }
}
