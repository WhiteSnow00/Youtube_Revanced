import j$.util.function.Consumer$_CC;
import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iza implements Consumer
{
    public final int a;
    private final int b;
    
    public iza(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        final int b = this.b;
        int n = 0;
        switch (b) {
            default: {
                final int a = this.a;
                final udp udp = (udp)o;
                final View a2 = udp.a;
                if (a2 == null) {
                    return;
                }
                if (a2 instanceof uei) {
                    n = (int)(a * udp.c);
                }
                a2.measure(n, a);
                udp.b();
                return;
            }
            case 6: {
                ((PivotBar)o).g(this.a, false, 0);
                return;
            }
            case 5: {
                final int a3 = this.a;
                final EdgeEffect edgeEffect = (EdgeEffect)o;
                final int b2 = krw.b;
                edgeEffect.onAbsorb(a3);
                return;
            }
            case 4: {
                ((fpn)o).k(this.a);
                return;
            }
            case 3: {
                ((fpn)o).w(this.a);
                return;
            }
            case 2: {
                ((fpn)o).l(this.a);
                return;
            }
            case 1: {
                ((fpn)o).A(this.a);
                return;
            }
            case 0: {
                ((fpn)o).u(this.a);
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.b) {
            default: {
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
