import com.google.android.material.button.MaterialButton;
import android.view.View;
import com.google.android.material.button.MaterialButtonToggleGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advo extends akx
{
    final MaterialButtonToggleGroup a;
    
    public advo(final MaterialButtonToggleGroup a) {
        this.a = a;
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        final MaterialButtonToggleGroup a = this.a;
        int n = 0;
        Label_0093: {
            if (view instanceof MaterialButton) {
                int i = 0;
                n = 0;
                while (i < a.getChildCount()) {
                    if (a.getChildAt(i) == view) {
                        break Label_0093;
                    }
                    int n2 = n;
                    if (a.getChildAt(i) instanceof MaterialButton) {
                        n2 = n;
                        if (a.c(i)) {
                            n2 = n + 1;
                        }
                    }
                    ++i;
                    n = n2;
                }
            }
            n = -1;
        }
        aon.u((Object)bx.J(0, 1, n, 1, false, ((MaterialButton)view).b));
    }
}
