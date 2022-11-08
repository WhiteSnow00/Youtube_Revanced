// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.net;

import java.util.Arrays;
import org.chromium.net.ExperimentalCronetEngine$Builder;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.CronetEngine$Builder;
import android.content.Context;
import org.chromium.net.CronetProvider;

public class PlayServicesCronetProvider extends CronetProvider
{
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";
    
    public PlayServicesCronetProvider(final Context context) {
        super(context);
    }
    
    private void tryToInstallCronetProvider() {
        try {
            njl.b(this.mContext);
        }
        catch (final mpc | mpb mpc | mpb) {}
    }
    
    public CronetEngine$Builder createBuilder() {
        try {
            njl.b(this.mContext);
            try {
                final mwb a = njl.a();
                kgk.aL((Object)a);
                final ClassLoader classLoader = a.e.getClassLoader();
                kgk.aL((Object)classLoader);
                return (CronetEngine$Builder)new ExperimentalCronetEngine$Builder((ICronetEngineBuilder)classLoader.loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            }
            catch (final ReflectiveOperationException ex) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", ex);
            }
        }
        catch (final mpb mpb) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", mpb);
        }
        catch (final mpc mpc) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", (Throwable)mpc);
        }
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof PlayServicesCronetProvider) {
                if (!this.mContext.equals(((PlayServicesCronetProvider)o).mContext)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }
    
    public String getVersion() {
        this.tryToInstallCronetProvider();
        synchronized (njl.a) {
            return njl.b;
        }
    }
    
    public int hashCode() {
        return Arrays.hashCode(new Object[] { PlayServicesCronetProvider.class, this.mContext });
    }
    
    public boolean isEnabled() {
        this.tryToInstallCronetProvider();
        return njl.c();
    }
}
