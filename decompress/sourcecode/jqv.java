import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.widget.NumberPicker;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqv extends FrameLayout
{
    public final NumberPicker a;
    public List b;
    
    public jqv(final Context context) {
        super(context, (AttributeSet)null, 0);
        this.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2));
        inflate(context, 2131625359, (ViewGroup)this);
        this.a = (NumberPicker)this.findViewById(2131432067);
        this.b = new ArrayList();
    }
    
    public final int a() {
        return this.a.getValue();
    }
    
    public final void b(final String s) {
        final List b = this.b;
        b.getClass();
        if (b.contains(s)) {
            final NumberPicker a = this.a;
            final List b2 = this.b;
            b2.getClass();
            a.setValue(b2.indexOf(s));
        }
    }
    
    public final void c(final List b) {
        if (!b.isEmpty()) {
            this.b = b;
            final NumberPicker a = this.a;
            a.setMinValue(0);
            a.setMaxValue(b.size() - 1);
            a.setDisplayedValues((String[])adwd.aQ((Iterable)b, (Class)String.class));
        }
    }
}
