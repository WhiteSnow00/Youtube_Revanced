import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.widget.Button;
import android.graphics.Color;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehb
{
    public static final HashMap a;
    
    static {
        a = new HashMap();
    }
    
    public static int a(final int n, final float n2) {
        return Color.argb((int)(n2 * 255.0f), Color.red(n), Color.green(n), Color.blue(n));
    }
    
    static void b(final Button button, final int n) {
        button.getBackground().mutate().setColorFilter(n, PorterDuff$Mode.SRC_ATOP);
    }
    
    static void c(final Context context, final Button button, final aegv aegv) {
        if (aegx.f(context).l(aegv)) {
            final int c = aegx.f(context).c(context, aegv);
            if (c != 0) {
                button.setTextColor(ColorStateList.valueOf(c));
            }
            return;
        }
        final HashMap a = aehb.a;
        if (a.containsKey(button.getId())) {
            button.setTextColor((ColorStateList)a.get(button.getId()));
            return;
        }
        throw new IllegalStateException("There is no saved default color for button");
    }
    
    static void d(final Context context, final Button button, final aegv aegv) {
        final int c = aegx.f(context).c(context, aegv);
        if (c != 0) {
            button.setTextColor(ColorStateList.valueOf(c));
        }
    }
}
