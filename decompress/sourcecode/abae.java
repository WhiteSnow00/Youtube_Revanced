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

public final class abae implements aazx
{
    private final List a;
    
    public abae(final aazx... array) {
        final List<aazx> list = Arrays.asList(array);
        list.getClass();
        this.a = list;
    }
    
    public final void d() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).d();
        }
    }
    
    public final void f(final ControlsState controlsState) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).f(controlsState);
        }
    }
    
    public final void k(final ControlsOverlayStyle controlsOverlayStyle) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).k(controlsOverlayStyle);
        }
    }
    
    public final void n(final long n, final long n2, final long n3, final long n4) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).n(n, n2, n3, n4);
        }
    }
    
    public final void oE() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).oE();
        }
    }
    
    public final void oF() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).oF();
        }
    }
    
    public final void oG(final String s, final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).oG(s, b);
        }
    }
    
    public final void oH(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).oH(b);
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public final void pj(final aazw aazw) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).pj(aazw);
        }
    }
    
    public final void pk(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).pk(b);
        }
    }
    
    public final void pl(final long n, final long n2, final long n3, final long n4, final long n5) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).pl(n, n2, n3, n4, n5);
        }
    }
    
    public final void r(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).r(b);
        }
    }
    
    public final void rb(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).rb(b);
        }
    }
    
    public final void rf() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).rf();
        }
    }
    
    public final void s(final CharSequence charSequence) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).s(charSequence);
        }
    }
    
    public final void u(final Map map) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).u(map);
        }
    }
    
    public final void v() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).v();
        }
    }
    
    public final void y(final ancs ancs, final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aazx)iterator.next()).y(ancs, b);
        }
    }
}
