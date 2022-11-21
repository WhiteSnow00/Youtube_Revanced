import android.content.pm.Signature;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegg
{
    private static final aefs a;
    
    static {
        a = new aefs("PhoneskyVerificationUtils", null);
    }
    
    public static boolean a(final Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                final Signature[] signatures = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatures != null) {
                    final int length = signatures.length;
                    if (length != 0) {
                        for (int i = 0; i < length; ++i) {
                            final String p = aegu.p(signatures[i].toByteArray());
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(p) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(p))) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                aegg.a.j("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
}
