import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amw
{
    static CharSequence a(final View view) {
        return view.getStateDescription();
    }
    
    static void b(final View view, final CharSequence stateDescription) {
        view.setStateDescription(stateDescription);
    }
}
