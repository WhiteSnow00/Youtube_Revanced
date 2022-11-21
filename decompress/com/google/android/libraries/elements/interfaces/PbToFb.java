// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;

public abstract class PbToFb
{
    public static StatusOr convert(final ByteBuffer byteBuffer, final boolean b, final boolean b2, final boolean b3) {
        return PbToFb$CppProxy.convert(byteBuffer, b, b2, b3);
    }
}
