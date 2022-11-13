import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.ui.navigationbar.NavigationBarDividerLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghg
{
    public static final boolean a;
    public NavigationBarDividerLayout b;
    private final Activity c;
    
    static {
        a = (Build$VERSION.SDK_INT >= 27);
    }
    
    public ghg(final Activity c) {
        this.c = c;
    }
    
    public final void a(final TypedArray typedArray) {
        final boolean a = ghg.a;
        if (!a) {
            return;
        }
        if (typedArray == null) {
            return;
        }
        final int[] a2 = ghh.a;
        if (typedArray.hasValue(0)) {
            final int color = typedArray.getColor(0, 0);
            if (a) {
                final Window window = this.c.getWindow();
                if (window.getNavigationBarColor() != color) {
                    window.setNavigationBarColor(color);
                }
            }
        }
        if (typedArray.hasValue(1)) {
            if (typedArray.getInt(1, 0) != 1) {
                if (a) {
                    final View decorView = this.c.getWindow().getDecorView();
                    final int systemUiVisibility = decorView.getSystemUiVisibility();
                    if ((systemUiVisibility & 0x10) != 0x0) {
                        decorView.setSystemUiVisibility(systemUiVisibility & 0xFFFFFFEF);
                    }
                }
            }
            else if (a) {
                final View decorView2 = this.c.getWindow().getDecorView();
                final int systemUiVisibility2 = decorView2.getSystemUiVisibility();
                if ((systemUiVisibility2 & 0x10) != 0x10) {
                    decorView2.setSystemUiVisibility(systemUiVisibility2 | 0x10);
                }
            }
        }
        if (typedArray.hasValue(2)) {
            final int color2 = typedArray.getColor(2, 0);
            final NavigationBarDividerLayout b = this.b;
            if (b != null) {
                if (color2 != b.c) {
                    b.c = color2;
                    b.a.setColor(color2);
                    if (b.b > 0) {
                        b.invalidate();
                    }
                }
            }
        }
        if (typedArray.hasValue(3)) {
            final int dimensionPixelSize = typedArray.getDimensionPixelSize(3, 0);
            final NavigationBarDividerLayout b2 = this.b;
            if (b2 != null) {
                if (dimensionPixelSize != b2.b) {
                    b2.b = Math.max(0, dimensionPixelSize);
                    b2.requestLayout();
                    b2.invalidate();
                }
            }
        }
    }
    
    public final void b(final Context context) {
        if (!ghg.a) {
            return;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, ghh.b, 2130969996, 2132083354);
        this.a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
