import java.util.concurrent.Executor;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.ExperimentalUrlRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auhg extends ExperimentalUrlRequest
{
    protected abstract void a(final String p0, final String p1);
    
    protected abstract void g(final String p0);
    
    protected abstract void h(final UploadDataProvider p0, final Executor p1);
}
