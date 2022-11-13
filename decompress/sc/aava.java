import java.util.concurrent.Executor;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aava implements Runnable
{
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public aava(final aave c, final Context d, final ViewGroup e, final int a, final int b, final int f) {
        this.f = f;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
    }
    
    public aava(final zst c, final View d, final int a, final int b, final ako e, final int f) {
        this.f = f;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    @Override
    public final void run() {
        if (this.f != 0) {
            final Object c = this.c;
            final Object d = this.d;
            final int a = this.a;
            final int b = this.b;
            final Object e = this.e;
            final Rect rect = new Rect();
            ((View)d).getWindowVisibleDisplayFrame(rect);
            int top = rect.top;
            if (a >= top) {
                top = a;
            }
            int n = top;
            if (top + b > rect.bottom) {
                n = rect.bottom - b;
            }
            ((Executor)((zst)c).f).execute(new aasq((ako)e, n, 1));
            return;
        }
        final Object c2 = this.c;
        final Object d2 = this.d;
        final Object e2 = this.e;
        final int a2 = this.a;
        final int b2 = this.b;
        final aavd k = new aavd((Context)d2, (aask)c2);
        final aave aave = (aave)c2;
        aave.k = k;
        ((ViewGroup)e2).addView((View)aave.k, a2, b2);
    }
}
