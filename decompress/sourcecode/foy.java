import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.animation.ValueAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class foy implements atjj
{
    public final /* synthetic */ foz a;
    private final /* synthetic */ int b;
    
    public foy(final foz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ValueAnimator b() {
        if (this.b != 0) {
            final int red = Color.red(this.a.b.t);
            final ValueAnimator setDuration = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofKeyframe("timed_markers_width", new Keyframe[] { Keyframe.ofInt(0.0f, 0), Keyframe.ofInt(0.2f, 0), Keyframe.ofInt(0.35f, this.a.b.o), Keyframe.ofInt(1.0f, this.a.b.n) }), PropertyValuesHolder.ofKeyframe("timed_markers_bar_height", new Keyframe[] { Keyframe.ofFloat(0.0f, (float)this.a.j), Keyframe.ofFloat(0.2f, (float)this.a.j), Keyframe.ofFloat(0.35f, (float)this.a.b.w), Keyframe.ofFloat(1.0f, (float)this.a.b.v) }), PropertyValuesHolder.ofKeyframe("timed_markers_color", new Keyframe[] { Keyframe.ofInt(0.0f, red), Keyframe.ofInt(0.2f, red), Keyframe.ofInt(0.35f, Color.red(this.a.b.s)), Keyframe.ofInt(1.0f, red) }) }).setDuration(1200L);
            setDuration.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(this, 5, (byte[])null));
            return setDuration;
        }
        final ValueAnimator setDuration2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofKeyframe("timed_markers_width", new Keyframe[] { Keyframe.ofInt(0.0f, this.a.b.n), Keyframe.ofInt(1.0f, this.a.b.o) }), PropertyValuesHolder.ofKeyframe("timed_markers_bar_height", new Keyframe[] { Keyframe.ofFloat(0.0f, (float)this.a.b.v), Keyframe.ofFloat(1.0f, (float)this.a.b.w) }), PropertyValuesHolder.ofKeyframe("timed_markers_color", new Keyframe[] { Keyframe.ofInt(0.0f, Color.red(this.a.b.t)), Keyframe.ofInt(1.0f, Color.red(this.a.b.s)) }) }).setDuration(200L);
        setDuration2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(this, 6));
        return setDuration2;
    }
}
