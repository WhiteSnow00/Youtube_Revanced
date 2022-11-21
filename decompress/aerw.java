import android.content.ContextWrapper;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aerw implements arog
{
    private volatile Object a;
    private final Object b;
    private final View c;
    
    public aerw(final View c) {
        this.b = new Object();
        this.c = c;
    }
    
    private final Context a(final Class clazz) {
        final Context b = b(this.c.getContext(), clazz);
        adme.W(b != b(b.getApplicationContext(), arog.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.c.getClass());
        return b;
    }
    
    private static Context b(Context baseContext, final Class clazz) {
        while (baseContext instanceof ContextWrapper && !clazz.isInstance(baseContext)) {
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return baseContext;
    }
    
    @Override
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final Context a = this.a(arnz.class);
                    Object y;
                    if (a instanceof aert) {
                        final mcp af = ((aeru)((arog)((arnz)a).a()).aR()).aF();
                        arxu.o(af.c = this.c, View.class);
                        y = new esy((era)af.a, (est)af.b);
                    }
                    else {
                        if (!(a instanceof arnz)) {
                            final Context a2 = this.a(arog.class);
                            adme.Z(a2 instanceof arog ^ true, "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", this.c.getClass(), a2.getClass().getName());
                            throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", this.c.getClass(), a2.getClass().getName()));
                        }
                        final arnz arnz = (arnz)a;
                        adme.W(false, "%s, Account views may only attach to account fragments.", this.c.getClass());
                        final cdr at = ((aerv)((arog)arnz.a()).aR()).at();
                        at.c = this.c;
                        y = at.y();
                    }
                    this.a = y;
                }
            }
        }
        return this.a;
    }
}
