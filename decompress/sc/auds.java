import org.chromium.net.CronetEngine$Builder$LibraryLoader;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import java.util.Date;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auds extends audc
{
    public auds(final Context context) {
        super(context);
    }
    
    public final /* bridge */ ICronetEngineBuilder addPublicKeyPins(final String s, final Set set, final boolean b, final Date date) {
        super.d(s, set, b, date);
        return this;
    }
    
    public final /* bridge */ ICronetEngineBuilder addQuicHint(final String s, final int n, final int n2) {
        super.e(s, n, n2);
        return this;
    }
    
    public final ExperimentalCronetEngine build() {
        if (super.e == null) {
            super.e = this.getDefaultUserAgent();
        }
        return new audr(this);
    }
    
    @Override
    public final ICronetEngineBuilder enableBrotli(final boolean i) {
        super.i = i;
        return this;
    }
    
    @Override
    public final ICronetEngineBuilder enableHttp2(final boolean h) {
        super.h = h;
        return this;
    }
    
    public final /* bridge */ ICronetEngineBuilder enableHttpCache(final int n, final long n2) {
        super.f(n, n2);
        return this;
    }
    
    @Override
    public final ICronetEngineBuilder enableNetworkQualityEstimator(final boolean m) {
        super.m = m;
        return this;
    }
    
    @Override
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(final boolean d) {
        super.d = d;
        return this;
    }
    
    @Override
    public final ICronetEngineBuilder enableQuic(final boolean g) {
        super.g = g;
        return this;
    }
    
    public final /* bridge */ ICronetEngineBuilder enableSdch(final boolean b) {
        return this;
    }
    
    @Override
    public final ICronetEngineBuilder setExperimentalOptions(final String l) {
        super.l = l;
        return this;
    }
    
    public final /* bridge */ ICronetEngineBuilder setLibraryLoader(final CronetEngine$Builder$LibraryLoader cronetEngine$Builder$LibraryLoader) {
        return this;
    }
    
    public final /* bridge */ ICronetEngineBuilder setStoragePath(final String s) {
        super.h(s);
        return this;
    }
    
    public final /* bridge */ ICronetEngineBuilder setThreadPriority(final int n) {
        super.i(n);
        return this;
    }
    
    @Override
    public final ICronetEngineBuilder setUserAgent(final String e) {
        super.e = e;
        return this;
    }
}
