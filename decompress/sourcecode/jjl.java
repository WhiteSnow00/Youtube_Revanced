import android.view.ViewStub;
import android.widget.TextView;
import android.view.View;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjl
{
    public final int a;
    public Object b;
    public final Object c;
    
    public jjl() {
        this.c = new SparseArray(10);
        this.a = 20;
    }
    
    public jjl(final int a, final View c) {
        this.a = a;
        this.c = c;
        this.b = null;
    }
    
    public jjl(final h c, final int a) {
        this.c = c;
        this.a = a;
    }
    
    public final TextView a(final CharSequence text, final int n) {
        if (this.b == null) {
            this.b = ((ViewStub)((View)this.c).findViewById(this.a)).inflate();
        }
        final TextView textView = (TextView)((View)this.b).findViewById(n);
        if (textView != null) {
            textView.setText(text);
        }
        ((View)this.b).setVisibility(0);
        return textView;
    }
    
    public final void b() {
        final Object b = this.b;
        if (b != null) {
            ((View)b).setVisibility(8);
        }
    }
}
