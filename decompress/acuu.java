import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class acuu extends ackw
{
    public acuu(final Context context, final acmh acmh) {
        super(context, acmh);
    }
    
    @Override
    protected final /* bridge */ ViewGroup a(final Context context) {
        final FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams((ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-2, -2));
        return (ViewGroup)frameLayout;
    }
}
