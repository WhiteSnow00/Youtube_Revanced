import android.content.ContextWrapper;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arli implements arlm
{
    private volatile Object a;
    private final Object b;
    private final boolean c;
    private final View d;
    
    public arli(final View d, final boolean c) {
        this.b = new Object();
        this.d = d;
        this.c = c;
    }
    
    private final Context b(final Class clazz, final boolean b) {
        Context context;
        for (context = this.d.getContext(); context instanceof ContextWrapper && !clazz.isInstance(context); context = ((ContextWrapper)context).getBaseContext()) {}
        if (context == aqsz.r(context.getApplicationContext())) {
            aqsz.l(b, "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", new Object[] { this.d.getClass() });
            return null;
        }
        return context;
    }
    
    private final arlm c(final boolean b) {
        if (this.c) {
            final Context b2 = this.b(arlf.class, b);
            if (b2 instanceof arlf) {
                aqsz.l(b2.getClass().equals(arlf.class), "%s, Only account views can attach to account fragments.", new Object[] { this.d.getClass() });
                return (arlm)((arlf)b2).a();
            }
            if (b) {
                return null;
            }
            final Context b3 = this.b(arlm.class, false);
            aqsz.l(b3 instanceof arlm ^ true, "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context %s", new Object[] { this.d.getClass(), b3.getClass().getName() });
        }
        else {
            final Context b4 = this.b(arlm.class, b);
            if (b4 instanceof arlm) {
                return (arlm)b4;
            }
            if (b) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity.", this.d.getClass()));
    }
    
    public final arlm a() {
        return this.c(true);
    }
    
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final arlm c = this.c(false);
                    Object f;
                    if (this.c) {
                        final mcb av = ((arlh)aqsy.k((Object)c, (Class)arlh.class)).av();
                        av.c = this.d;
                        f = av.f();
                    }
                    else {
                        final mcb yw = ((arlg)aqsy.k((Object)c, (Class)arlg.class)).yw();
                        arbu.y(yw.c = this.d, View.class);
                        f = new esx((eqy)yw.b, (esp)yw.a);
                    }
                    this.a = f;
                }
            }
        }
        return this.a;
    }
}
