import android.os.Bundle;
import android.app.ActivityOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aew extends sw
{
    private final ActivityOptions a;
    
    public aew(final ActivityOptions a) {
        this.a = a;
    }
    
    public final Bundle c() {
        return this.a.toBundle();
    }
}
