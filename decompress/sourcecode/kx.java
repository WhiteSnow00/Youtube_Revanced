import android.view.View;
import android.widget.TextView;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class kx extends ahr
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ lc d;
    
    public kx(final lc d, final int a, final int b, final WeakReference c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Typeface typeface) {
        Typeface a = typeface;
        if (Build$VERSION.SDK_INT >= 28) {
            final int a2 = this.a;
            a = typeface;
            if (a2 != -1) {
                a = lb.a(typeface, a2, (this.b & 0x2) != 0x0);
            }
        }
        final lc d = this.d;
        final WeakReference c = this.c;
        if (d.c) {
            d.b = a;
            final TextView textView = (TextView)c.get();
            if (textView != null) {
                if (ana.am((View)textView)) {
                    textView.post((Runnable)new qo(textView, a, d.a, 1));
                    return;
                }
                textView.setTypeface(a, d.a);
            }
        }
    }
    
    public final void b() {
    }
}
