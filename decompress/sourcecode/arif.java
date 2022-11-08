import android.app.Application;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class arif implements arix
{
    protected final Activity a;
    private volatile Object b;
    private final Object c;
    private final arix d;
    
    public arif(final Activity a) {
        this.c = new Object();
        this.a = a;
        this.d = (arix)new arik((qt)a);
    }
    
    public final Object aR() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = this.b();
                }
            }
        }
        return this.b;
    }
    
    protected Object b() {
        if (this.a.getApplication() instanceof arix) {
            final cdn b = ((arie)aqqm.k((Object)this.d, (Class)arie.class)).b();
            b.c = this.a;
            return new esm((eqv)b.a, (esn)b.b, (Activity)b.c);
        }
        if (Application.class.equals(this.a.getApplication().getClass())) {
            throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        }
        throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Found: ".concat(String.valueOf(String.valueOf(this.a.getApplication().getClass()))));
    }
}
