import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hr implements MenuItem$OnMenuItemClickListener
{
    private static final Class[] a;
    private final Object b;
    private Method c;
    
    static {
        a = new Class[] { MenuItem.class };
    }
    
    public hr(final Object b, final String s) {
        this.b = b;
        final Class<?> class1 = b.getClass();
        try {
            this.c = class1.getMethod(s, (Class<?>[])hr.a);
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
            sb.append(s);
            sb.append(" in class ");
            sb.append(class1.getName());
            final InflateException ex2 = new InflateException(sb.toString());
            ex2.initCause((Throwable)ex);
            throw ex2;
        }
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        try {
            if (this.c.getReturnType() == Boolean.TYPE) {
                return (boolean)this.c.invoke(this.b, menuItem);
            }
            this.c.invoke(this.b, menuItem);
            return true;
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
