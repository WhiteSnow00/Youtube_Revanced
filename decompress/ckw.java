import android.content.res.TypedArray;
import androidx.viewpager.widget.ViewPager;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckw extends ViewGroup$LayoutParams
{
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    
    public ckw() {
        super(-1, -1);
        this.c = 0.0f;
    }
    
    public ckw(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0.0f;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ViewPager.a);
        this.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
