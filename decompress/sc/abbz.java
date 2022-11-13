import java.util.Map;
import android.view.KeyEvent;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbz implements abbs
{
    private final List a;
    
    public abbz(final abbs... array) {
        final List<abbs> list = Arrays.asList(array);
        list.getClass();
        this.a = list;
    }
    
    @Override
    public final void d() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).d();
        }
    }
    
    @Override
    public final void f(final ControlsState controlsState) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).f(controlsState);
        }
    }
    
    @Override
    public final void n(final long n, final long n2, final long n3, final long n4) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).n(n, n2, n3, n4);
        }
    }
    
    @Override
    public final void oE() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).oE();
        }
    }
    
    @Override
    public final void oF() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).oF();
        }
    }
    
    @Override
    public final void oG(final String s, final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).oG(s, b);
        }
    }
    
    @Override
    public final void oH(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).oH(b);
        }
    }
    
    @Override
    public final void oU(final ControlsOverlayStyle controlsOverlayStyle) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).oU(controlsOverlayStyle);
        }
    }
    
    @Override
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    @Override
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    @Override
    public final void pl(final abbr abbr) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).pl(abbr);
        }
    }
    
    @Override
    public final void pm(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).pm(b);
        }
    }
    
    @Override
    public final void pn(final long n, final long n2, final long n3, final long n4, final long n5) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).pn(n, n2, n3, n4, n5);
        }
    }
    
    @Override
    public final void r(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).r(b);
        }
    }
    
    @Override
    public final void rh(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).rh(b);
        }
    }
    
    @Override
    public final void rl() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).rl();
        }
    }
    
    @Override
    public final void s(final CharSequence charSequence) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).s(charSequence);
        }
    }
    
    @Override
    public final void u(final Map map) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).u(map);
        }
    }
    
    @Override
    public final void v() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).v();
        }
    }
    
    @Override
    public final void x() {
        aale.c((abbs)this);
    }
    
    @Override
    public final void y(final anew anew, final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbs)iterator.next()).y(anew, b);
        }
    }
}
