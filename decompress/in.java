import android.view.KeyEvent$DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class in implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, iy
{
    public final im a;
    public ey b;
    ii c;
    
    public in(final im a) {
        this.a = a;
    }
    
    public final void a(final im im, final boolean b) {
        if (b || im == this.a) {
            final ey b2 = this.b;
            if (b2 != null) {
                ((fy)b2).dismiss();
            }
        }
    }
    
    public final boolean b(final im im) {
        return false;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.z((MenuItem)((ih)this.c.k()).a(n), 0);
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        this.c.d(this.a, true);
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        int n2 = n;
        if (n != 82) {
            final int n3;
            if ((n3 = n) != 4) {
                return this.a.performShortcut(n3, keyEvent, 0);
            }
            n2 = 4;
        }
        int n3;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            final Window window = this.b.getWindow();
            n3 = n2;
            if (window != null) {
                final View decorView = window.getDecorView();
                n3 = n2;
                if (decorView != null) {
                    final KeyEvent$DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                    n3 = n2;
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, (Object)this);
                        return true;
                    }
                }
            }
        }
        else {
            n3 = n2;
            if (keyEvent.getAction() == 1) {
                n3 = n2;
                if (!keyEvent.isCanceled()) {
                    final Window window2 = this.b.getWindow();
                    n3 = n2;
                    if (window2 != null) {
                        final View decorView2 = window2.getDecorView();
                        n3 = n2;
                        if (decorView2 != null) {
                            final KeyEvent$DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                            n3 = n2;
                            if (keyDispatcherState2 != null) {
                                n3 = n2;
                                if (keyDispatcherState2.isTracking(keyEvent)) {
                                    this.a.i(true);
                                    dialogInterface.dismiss();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return this.a.performShortcut(n3, keyEvent, 0);
    }
}
