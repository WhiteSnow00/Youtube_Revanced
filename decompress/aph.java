import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.CompoundButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aph
{
    public static ColorStateList a(final CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }
    
    public static PorterDuff$Mode b(final CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }
    
    public static void c(final CompoundButton compoundButton, final ColorStateList buttonTintList) {
        compoundButton.setButtonTintList(buttonTintList);
    }
    
    public static void d(final CompoundButton compoundButton, final PorterDuff$Mode buttonTintMode) {
        compoundButton.setButtonTintMode(buttonTintMode);
    }
}
