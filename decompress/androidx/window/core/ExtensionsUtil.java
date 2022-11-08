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
        TAG = atno.b((Class)ExtensionsUtil.class).c();
    }
    
    private ExtensionsUtil() {
    }
    
    public final int getSafeVendorApiLevel() {
        final boolean b = false;
        int vendorApiLevel;
        try {
            vendorApiLevel = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        }
        catch (final UnsupportedOperationException ex) {
            if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                return 0;
            }
            vendorApiLevel = (b ? 1 : 0);
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            vendorApiLevel = (b ? 1 : 0);
            if (BuildConfig.INSTANCE.getVerificationMode() != VerificationMode.LOG) {}
        }
        return vendorApiLevel;
    }
}
