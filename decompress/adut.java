import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adut
{
    public static final int[] a;
    
    static {
        a = new int[] { 16843848 };
    }
    
    public static void a(final View view, final float n) {
        final int integer = view.getResources().getInteger(2131492870);
        final StateListAnimator stateListAnimator = new StateListAnimator();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, "elevation", new float[] { 0.0f });
        final long n2 = integer;
        stateListAnimator.addState(new int[] { 16842910, 2130970339, -2130970340 }, (Animator)ofFloat.setDuration(n2));
        stateListAnimator.addState(new int[] { 16842910 }, (Animator)ObjectAnimator.ofFloat((Object)view, "elevation", new float[] { n }).setDuration(n2));
        stateListAnimator.addState(new int[0], (Animator)ObjectAnimator.ofFloat((Object)view, "elevation", new float[] { 0.0f }).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
