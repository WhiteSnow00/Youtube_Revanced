import org.chromium.net.CronetEngine$Builder$LibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import java.util.Date;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class audn extends aucl
{
    public audn(final Context context) {
        super(context);
    }
    
    public final ExperimentalCronetEngine build() {
        if (super.e == null) {
            super.e = this.getDefaultUserAgent();
        }
        return (ExperimentalCronetEngine)new CronetUrlRequestContext((aucl)this);
    }
}
