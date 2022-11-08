import java.lang.reflect.InvocationTargetException;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avp extends avr
{
    public static avp a;
    public static final avw b;
    private final Application e;
    
    static {
        b = (avw)avi.a;
    }
    
    public avp() {
        this(null);
    }
    
    public avp(final Application e) {
        this.e = e;
    }
    
    private final avo c(Class a, final Application application) {
        if (atv.class.isAssignableFrom((Class<?>)a)) {
            try {
                final avo avo = (avo)((Class<?>)a).getConstructor(Application.class).newInstance(application);
                avo.getClass();
                a = avo;
                return (avo)a;
            }
            catch (final InvocationTargetException ex) {
                new StringBuilder("Cannot create an instance of ").append(a);
                throw new RuntimeException("Cannot create an instance of ".concat(a.toString()), ex);
            }
            catch (final InstantiationException ex2) {
                new StringBuilder("Cannot create an instance of ").append(a);
                throw new RuntimeException("Cannot create an instance of ".concat(a.toString()), ex2);
            }
            catch (final IllegalAccessException ex3) {
                new StringBuilder("Cannot create an instance of ").append(a);
                throw new RuntimeException("Cannot create an instance of ".concat(a.toString()), ex3);
            }
            catch (final NoSuchMethodException ex4) {
                new StringBuilder("Cannot create an instance of ").append(a);
                throw new RuntimeException("Cannot create an instance of ".concat(a.toString()), ex4);
            }
        }
        a = super.a((Class)a);
        return (avo)a;
    }
    
    public final avo a(final Class clazz) {
        final Application e = this.e;
        if (e != null) {
            return this.c(clazz, e);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
    
    public final avo b(final Class clazz, final avx avx) {
        avo avo;
        if (this.e != null) {
            avo = this.a(clazz);
        }
        else {
            final Application application = (Application)avx.a(avp.b);
            if (application != null) {
                avo = this.c(clazz, application);
            }
            else {
                if (atv.class.isAssignableFrom(clazz)) {
                    throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
                }
                avo = super.a(clazz);
            }
        }
        return avo;
    }
}
