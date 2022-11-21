import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehz
{
    public static aehz a;
    public final int b;
    public final boolean c;
    public final Object d;
    
    public aehz(final int b, final boolean c) {
        this.b = b;
        this.d = null;
        this.c = c;
    }
    
    public aehz(final MotionEvent d, final int b, final boolean c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public aehz(final PaneDescriptor d, final int b, final boolean c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public static int a(final MotionEvent motionEvent, final int n, final boolean b) {
        return b((int)motionEvent.getX(), n, b);
    }
    
    public static int b(final int n, final int n2, final boolean b) {
        float n3;
        if (!b) {
            n3 = 0.33333334f;
        }
        else {
            n3 = 0.0f;
        }
        final int n4 = n2 / 2;
        final float n5 = (float)n;
        final float n6 = (float)n2;
        final float n7 = (float)n4;
        final float n8 = n6 * n3 / 2.0f;
        if (n5 < n7 - n8) {
            return 2;
        }
        if (n5 > n7 + n8) {
            return 1;
        }
        return 0;
    }
}
