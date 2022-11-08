import android.text.Editable;
import android.text.Editable$Factory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asb extends Editable$Factory
{
    private static final Object a;
    private static volatile Editable$Factory b;
    private static Class c;
    
    static {
        a = new Object();
    }
    
    private asb() {
        try {
            asb.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, this.getClass().getClassLoader());
        }
        finally {}
    }
    
    public static Editable$Factory a() {
        if (asb.b == null) {
            synchronized (asb.a) {
                if (asb.b == null) {
                    asb.b = new asb();
                }
            }
        }
        return asb.b;
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class c = asb.c;
        if (c != null) {
            return (Editable)new asl(c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
