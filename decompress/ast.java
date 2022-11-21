import android.text.Editable;
import android.text.Editable$Factory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ast extends Editable$Factory
{
    private static final Object a;
    private static volatile Editable$Factory b;
    private static Class c;
    
    static {
        a = new Object();
    }
    
    private ast() {
        try {
            ast.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, this.getClass().getClassLoader());
        }
        finally {}
    }
    
    public static Editable$Factory a() {
        if (ast.b == null) {
            synchronized (ast.a) {
                if (ast.b == null) {
                    ast.b = new ast();
                }
            }
        }
        return ast.b;
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class c = ast.c;
        if (c != null) {
            return (Editable)new ass(c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
