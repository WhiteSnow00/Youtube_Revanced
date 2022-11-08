import android.content.ContextWrapper;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeod implements arix
{
    private volatile Object a;
    private final Object b;
    private final View c;
    
    public aeod(final View c) {
        this.b = new Object();
        this.c = c;
    }
    
    private final Context a(final Class clazz) {
        final Context b = b(this.c.getContext(), clazz);
        agot.G(b != b(b.getApplicationContext(), arix.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", (Object)this.c.getClass());
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
                    final Context a = this.a(ariq.class);
                    Object f;
                    if (a instanceof aeoa) {
                        final maw ad = ((aeob)((arix)((ariq)a).a()).aR()).aD();
                        aqzg.z(ad.c = this.c, (Class)View.class);
                        f = new est((eqv)ad.a, (eso)ad.b);
                    }
                    else {
                        if (!(a instanceof ariq)) {
                            final Context a2 = this.a(arix.class);
                            agot.J(a2 instanceof arix ^ true, "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", (Object)this.c.getClass(), (Object)a2.getClass().getName());
                            throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", this.c.getClass(), a2.getClass().getName()));
                        }
                        final ariq ariq = (ariq)a;
                        agot.G(false, "%s, Account views may only attach to account fragments.", (Object)this.c.getClass());
                        final maw av = ((aeoc)((arix)ariq.a()).aR()).av();
                        av.c = this.c;
                        f = av.f();
                    }
                    this.a = f;
                }
            }
        }
        return this.a;
    }
}
