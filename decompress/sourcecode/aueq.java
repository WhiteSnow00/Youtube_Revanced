import java.net.URLStreamHandler;
import org.chromium.net.ExperimentalCronetEngine;
import java.net.URLStreamHandlerFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aueq implements URLStreamHandlerFactory
{
    private final ExperimentalCronetEngine a;
    
    public aueq(final ExperimentalCronetEngine a) {
        this.a = a;
    }
    
    @Override
    public final URLStreamHandler createURLStreamHandler(final String s) {
        if (!"http".equals(s) && !"https".equals(s)) {
            return null;
        }
        return new auen(this.a);
    }
}
