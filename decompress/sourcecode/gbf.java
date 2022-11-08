import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbf extends cim
{
    private static final void e(final ciy ciy) {
        ciy.a.put("hatsSurveyView:HEIGHT", ciy.b.getHeight());
    }
    
    public final Animator a(final ViewGroup viewGroup, final ciy ciy, final ciy ciy2) {
        if (ciy != null && ciy2 != null) {
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)viewGroup, "translationY", new float[] { (float)(ciy2.a.get("hatsSurveyView:HEIGHT") - ciy.a.get("hatsSurveyView:HEIGHT")), 0.0f });
            ((Animator)ofFloat).setInterpolator((TimeInterpolator)new atr());
            return (Animator)ofFloat;
        }
        return null;
    }
    
    public final void b(final ciy ciy) {
        e(ciy);
    }
    
    public final void c(final ciy ciy) {
        e(ciy);
    }
}
