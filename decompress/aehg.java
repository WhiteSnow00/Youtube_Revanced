import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehg
{
    public static final aefs a;
    
    static {
        a = new aefs("SystemBarHelper");
    }
    
    public static void a(final View view) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() & 0xFFFFE9FD);
    }
}
