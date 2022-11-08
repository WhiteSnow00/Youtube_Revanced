import android.content.ContextWrapper;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arit implements arix
{
    private volatile Object a;
    private final Object b;
    private final boolean c;
    private final View d;
    
    public arit(final View d, final boolean c) {
        this.b = new Object();
        this.d = d;
        this.c = c;
    }
    
    private final Context b(final Class clazz, final boolean b) {
        Context context;
        for (context = this.d.getContext(); context instanceof ContextWrapper && !clazz.isInstance(context); context = ((ContextWrapper)context).getBaseContext()) {}
        if (context == aqqn.r(context.getApplicationContext())) {
            aqqn.l(b, "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", new Object[] { this.d.getClass() });
            return null;
        }
        return context;
    }
    
    private final arix c(final boolean b) {
        if (this.c) {
            final Context b2 = this.b(ariq.class, b);
            if (b2 instanceof ariq) {
                aqqn.l(b2.getClass().equals(ariq.class), "%s, Only account views can attach to account fragments.", new Object[] { this.d.getClass() });
                return (arix)((ariq)b2).a();
            }
            if (b) {
                return null;
            }
            final Context b3 = this.b(arix.class, false);
            aqqn.l(b3 instanceof arix ^ true, "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context %s", new Object[] { this.d.getClass(), b3.getClass().getName() });
        }
        else {
            final Context b4 = this.b(arix.class, b);
            if (b4 instanceof arix) {
                return (arix)b4;
            }
            if (b) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity.", this.d.getClass()));
    }
    
    public final arix a() {
        return this.c(true);
    }
    
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final arix c = this.c(false);
                    Object f;
                    if (this.c) {
                        final maw av = ((aris)aqqm.k((Object)c, (Class)aris.class)).av();
                        av.c = this.d;
                        f = av.f();
                    }
                    else {
                        final maw yx = ((arir)aqqm.k((Object)c, (Class)arir.class)).yx();
                        aqzg.z(yx.c = this.d, (Class)View.class);
                        f = new esu((eqv)yx.b, (esm)yx.a);
                    }
                    this.a = f;
                }
            }
        }
        return this.a;
    }
}
