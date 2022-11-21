import android.app.Application;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class arno implements arog
{
    protected final Activity a;
    private volatile Object b;
    private final Object c;
    private final arog d;
    
    public arno(final Activity a) {
        this.c = new Object();
        this.a = a;
        this.d = new arnt((qu)a);
    }
    
    @Override
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
        if (this.a.getApplication() instanceof arog) {
            final cdr b = ((arnn)aqvs.i((Object)this.d, (Class)arnn.class)).b();
            b.c = this.a;
            return new esr((era)b.a, (ess)b.b, (Activity)b.c);
        }
        if (Application.class.equals(this.a.getApplication().getClass())) {
            throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        }
        throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Found: ".concat(String.valueOf(String.valueOf(this.a.getApplication().getClass()))));
    }
}
