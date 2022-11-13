import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggc implements Supplier
{
    public final int a;
    
    public ggc(final int a) {
        this.a = a;
    }
    
    @Override
    public final Object get() {
        return new Pane(this.a);
    }
}
