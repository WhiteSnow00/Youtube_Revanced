// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.METHOD })
public @interface CalledByNativeUnchecked {
}
