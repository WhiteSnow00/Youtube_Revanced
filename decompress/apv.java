import androidx.lifecycle.LegacySavedStateHandleController$1;
import androidx.lifecycle.SavedStateHandleController;
import android.os.Bundle;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apv
{
    static int a(final TextView textView) {
        return textView.getBreakStrategy();
    }
    
    static int b(final TextView textView) {
        return textView.getHyphenationFrequency();
    }
    
    static ColorStateList c(final TextView textView) {
        return textView.getCompoundDrawableTintList();
    }
    
    static PorterDuff$Mode d(final TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }
    
    static void e(final TextView textView, final int breakStrategy) {
        textView.setBreakStrategy(breakStrategy);
    }
    
    public static void f(final TextView textView, final ColorStateList compoundDrawableTintList) {
        textView.setCompoundDrawableTintList(compoundDrawableTintList);
    }
    
    public static void g(final TextView textView, final PorterDuff$Mode compoundDrawableTintMode) {
        textView.setCompoundDrawableTintMode(compoundDrawableTintMode);
    }
    
    static void h(final TextView textView, final int hyphenationFrequency) {
        textView.setHyphenationFrequency(hyphenationFrequency);
    }
    
    public static SavedStateHandleController i(final cgl cgl, final auk auk, final String s, final Bundle bundle) {
        final Bundle a = cgl.a(s);
        final Class[] a2 = avj.a;
        final SavedStateHandleController savedStateHandleController = new SavedStateHandleController(s, apw.d(a, bundle));
        savedStateHandleController.b(cgl, auk);
        k(cgl, auk);
        return savedStateHandleController;
    }
    
    public static void j(final avq avq, final cgl cgl, final auk auk) {
        synchronized (avq.x) {
            final SavedStateHandleController value = avq.x.get("androidx.lifecycle.savedstate.vm.tag");
            monitorexit(avq.x);
            final SavedStateHandleController savedStateHandleController = value;
            if (savedStateHandleController != null && !savedStateHandleController.a) {
                savedStateHandleController.b(cgl, auk);
                k(cgl, auk);
            }
        }
    }
    
    private static void k(final cgl cgl, final auk auk) {
        final auj a = auk.a();
        if (a != auj.b && !a.a(auj.d)) {
            auk.b((auo)new LegacySavedStateHandleController$1(auk, cgl));
            return;
        }
        cgl.d(auh.class);
    }
}
