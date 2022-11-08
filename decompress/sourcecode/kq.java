import android.content.Intent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kq
{
    public static int a(final View view) {
        return view.getTextAlignment();
    }
    
    public static int b(final View view) {
        return view.getTextDirection();
    }
    
    static void c(final View view, final int textAlignment) {
        view.setTextAlignment(textAlignment);
    }
    
    static void d(final View view, final int textDirection) {
        view.setTextDirection(textDirection);
    }
    
    public static final Intent e(final String[] array) {
        final Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array);
        putExtra.getClass();
        return putExtra;
    }
}
