// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import androidx.window.extensions.WindowExtensionsProvider;

public final class ExtensionsUtil
{
    public static final ExtensionsUtil INSTANCE;
    private static final String TAG;
    
    static {
        INSTANCE = new ExtensionsUtil();
        TAG = atrg.b(ExtensionsUtil.class).c();
    }
    
    private ExtensionsUtil() {
    }
    
    public final int getSafeVendorApiLevel() {
        int vendorApiLevel = 0;
        try {
            vendorApiLevel = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        }
        catch (final UnsupportedOperationException ex) {
            if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                return 0;
            }
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            if (BuildConfig.INSTANCE.getVerificationMode() != VerificationMode.LOG) {}
        }
        return vendorApiLevel;
    }
}
