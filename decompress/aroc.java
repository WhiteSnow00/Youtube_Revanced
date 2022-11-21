import android.content.ContextWrapper;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aroc implements arog
{
    private volatile Object a;
    private final Object b;
    private final boolean c;
    private final View d;
    
    public aroc(final View d, final boolean c) {
        this.b = new Object();
        this.d = d;
        this.c = c;
    }
    
    private final Context b(final Class clazz, final boolean b) {
        Context context;
        for (context = this.d.getContext(); context instanceof ContextWrapper && !clazz.isInstance(context); context = ((ContextWrapper)context).getBaseContext()) {}
        if (context == areq.B(context.getApplicationContext())) {
            areq.v(b, "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.d.getClass());
            return null;
        }
        return context;
    }
    
    private final arog c(final boolean b) {
        if (this.c) {
            final Context b2 = this.b(arnz.class, b);
            if (b2 instanceof arnz) {
                areq.v(b2.getClass().equals(arnz.class), "%s, Only account views can attach to account fragments.", this.d.getClass());
                return (arog)((arnz)b2).a();
            }
            if (b) {
                return null;
            }
            final Context b3 = this.b(arog.class, false);
            areq.v(b3 instanceof arog ^ true, "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context %s", this.d.getClass(), b3.getClass().getName());
        }
        else {
            final Context b4 = this.b(arog.class, b);
            if (b4 instanceof arog) {
                return (arog)b4;
            }
            if (b) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity.", this.d.getClass()));
    }
    
    public final arog a() {
        return this.c(true);
    }
    
    @Override
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final arog c = this.c(false);
                    Object y;
                    if (this.c) {
                        final cdr at = ((arob)aqvs.i((Object)c, (Class)arob.class)).at();
                        at.c = this.d;
                        y = at.y();
                    }
                    else {
                        final cdr yz = ((aroa)aqvs.i((Object)c, (Class)aroa.class)).yz();
                        arxu.o(yz.c = this.d, View.class);
                        y = new esz((era)yz.b, (esr)yz.a);
                    }
                    this.a = y;
                }
            }
        }
        return this.a;
    }
}
