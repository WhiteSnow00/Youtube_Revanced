// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.SOURCE)
public @interface WebSettingsBoundaryInterface$ForceDarkBehavior {
    public static final int FORCE_DARK_ONLY = 0;
    public static final int MEDIA_QUERY_ONLY = 1;
    public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
}
