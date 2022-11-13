import android.view.View$OnClickListener;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abec implements abed
{
    private final TextView a;
    
    public abec(final TextView a) {
        a.getClass();
        this.a = a;
    }
    
    public final void a(final View$OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
    
    public final void b(final CharSequence text) {
        this.a.setText(text);
    }
    
    public final void c(final int visibility) {
        this.a.setVisibility(visibility);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("[");
        sb.append(this.a.getId());
        sb.append("]");
        return sb.toString();
    }
}
