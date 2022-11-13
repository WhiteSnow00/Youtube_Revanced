import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class arcw extends FrameLayout
{
    final arcx a;
    private Configuration b;
    
    public arcw(final arcx a, final Context context) {
        this.a = a;
        super(context);
        this.b = new Configuration(context.getResources().getConfiguration());
    }
    
    private final void a(final Configuration configuration) {
        final int diff = configuration.diff(this.b);
        if ((diff & 0x1000) == 0x0 && (diff & 0x80) == 0x0) {
            return;
        }
        this.b = new Configuration(configuration);
        final arcx a = this.a;
        a.c(a.p);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a(this.a.a.getResources().getConfiguration());
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a(configuration);
    }
}
