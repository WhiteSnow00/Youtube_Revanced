import android.text.Editable;
import android.text.Editable$Factory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asq extends Editable$Factory
{
    private static final Object a;
    private static volatile Editable$Factory b;
    private static Class c;
    
    static {
        a = new Object();
    }
    
    private asq() {
        try {
            asq.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, this.getClass().getClassLoader());
        }
        finally {}
    }
    
    public static Editable$Factory a() {
        if (asq.b == null) {
            synchronized (asq.a) {
                if (asq.b == null) {
                    asq.b = new asq();
                }
            }
        }
        return asq.b;
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class c = asq.c;
        if (c != null) {
            return (Editable)new asp(c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
