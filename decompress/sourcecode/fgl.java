import android.content.ComponentName;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class fgl extends tdc
{
    private final Intent a;
    
    public fgl(final Intent a) {
        a.getClass();
        this.a = a;
    }
    
    public String a() {
        final ComponentName component = this.a.getComponent();
        if (component != null) {
            return component.getClassName();
        }
        return this.a.getAction();
    }
}
