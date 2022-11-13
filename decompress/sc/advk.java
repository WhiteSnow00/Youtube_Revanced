import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advk extends akw
{
    final CheckableImageButton a;
    
    public advk(final CheckableImageButton a) {
        this.a = a;
    }
    
    public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        aom.o(this.a.b);
        aom.p(this.a.a);
    }
}
