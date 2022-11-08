import org.chromium.net.CronetEngine$Builder$LibraryLoader;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import java.util.Date;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audb extends aucl
{
    public audb(final Context context) {
        super(context);
    }
    
    public final ExperimentalCronetEngine build() {
        if (super.e == null) {
            super.e = this.getDefaultUserAgent();
        }
        return (ExperimentalCronetEngine)new auda(this);
    }
}
