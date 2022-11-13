import j$.util.function.Consumer$_CC;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwu implements Consumer
{
    public final hww a;
    public final boolean b;
    public final PaneDescriptor c;
    
    public hwu(final hww a, final boolean b, final PaneDescriptor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void accept(final Object o) {
        final hww a = this.a;
        final boolean b = this.b;
        final PaneDescriptor c = this.c;
        final ggq ggq = (ggq)o;
        final Fragment$SavedState e = a.e;
        if (e != null) {
            ggq.ai(e);
        }
        final ct i = a.og().i();
        i.w(2131430603, (br)ggq, "primary_fragment_tag");
        if (b) {
            hww.s(a.o(), c, true);
            i.i = 8194;
        }
        i.a();
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}
