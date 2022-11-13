// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.systemhealth.termination;

import java.io.File;
import android.content.Context;

public class NativeCrashDetectorUtil
{
    public static final File b(final Context context) {
        final File filesDir = context.getFilesDir();
        final String separator = File.separator;
        final StringBuilder sb = new StringBuilder("systemhealth");
        sb.append(separator);
        sb.append("nativecrash");
        return new File(filesDir, sb.toString());
    }
    
    private native void setupCrashDetector(final String p0, final long p1);
    
    public final void a(final Context context, final long n, final boolean b) {
        Label_0017: {
            if (!b) {
                break Label_0017;
            }
            try {
                agse.c("nativecrashdetectorutil", new String[0]);
                while (true) {
                    this.setupCrashDetector(b(context).getAbsolutePath(), n);
                    return;
                    tpe.am(context, "nativecrashdetectorutil");
                    continue;
                }
            }
            catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                zlm.c(zll.a, zlk.A, "Unable to link native crash library.", (Throwable)unsatisfiedLinkError);
            }
        }
    }
}
