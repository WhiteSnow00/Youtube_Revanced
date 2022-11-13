import android.os.Bundle;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class di
{
    public static int b(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 4) {
            return 4;
        }
        if (n == 8) {
            return 3;
        }
        final StringBuilder sb = new StringBuilder("Unknown visibility ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void d(int n, final View view) {
        if (--n == 0) {
            final ViewGroup viewGroup = (ViewGroup)view.getParent();
            if (viewGroup != null) {
                if (cl.W(2)) {
                    final StringBuilder sb = new StringBuilder("SpecialEffectsController: Removing view ");
                    sb.append(view);
                    sb.append(" from container ");
                    sb.append(viewGroup);
                }
                viewGroup.removeView(view);
            }
            return;
        }
        if (n == 1) {
            if (cl.W(2)) {
                new StringBuilder("SpecialEffectsController: Setting view ").append(view);
            }
            view.setVisibility(0);
            return;
        }
        if (n != 2) {
            if (cl.W(2)) {
                new StringBuilder("SpecialEffectsController: Setting view ").append(view);
            }
            view.setVisibility(4);
            return;
        }
        if (cl.W(2)) {
            new StringBuilder("SpecialEffectsController: Setting view ").append(view);
        }
        view.setVisibility(8);
    }
    
    public static void e(final View view, final avv avv) {
        view.setTag(2131432376, (Object)avv);
    }
    
    public static void f(final View view, final aun aun) {
        view.setTag(2131432373, (Object)aun);
    }
    
    public static String g(final int n) {
        if (n == 1) {
            return "NONE";
        }
        if (n == 2) {
            return "ADDING";
        }
        if (n != 3) {
            return "null";
        }
        return "REMOVING";
    }
    
    public static String qh(final int n) {
        if (n == 1) {
            return "REMOVED";
        }
        if (n == 2) {
            return "VISIBLE";
        }
        if (n == 3) {
            return "GONE";
        }
        if (n != 4) {
            return "null";
        }
        return "INVISIBLE";
    }
    
    public static int qi(final View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }
    
    public void h(final br br) {
    }
    
    public void i() {
    }
    
    public void j(final br br) {
    }
    
    public void k(final br br, final Bundle bundle) {
    }
}
