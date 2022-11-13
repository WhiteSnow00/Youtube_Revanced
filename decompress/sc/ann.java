import android.view.View;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ann
{
    public static void a(final Window window, final boolean b) {
        final View decorView = window.getDecorView();
        final int systemUiVisibility = decorView.getSystemUiVisibility();
        int systemUiVisibility2;
        if (b) {
            systemUiVisibility2 = (systemUiVisibility & 0xFFFFF8FF);
        }
        else {
            systemUiVisibility2 = (systemUiVisibility | 0x700);
        }
        decorView.setSystemUiVisibility(systemUiVisibility2);
    }
}
