import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxb extends akx
{
    final CheckableImageButton a;
    
    public adxb(final CheckableImageButton a) {
        this.a = a;
    }
    
    public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        aon.p(this.a.b);
        aon.q(this.a.a);
    }
}
