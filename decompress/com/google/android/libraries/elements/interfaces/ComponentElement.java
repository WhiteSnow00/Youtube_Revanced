// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.nio.ByteBuffer;

public abstract class ComponentElement
{
    public static ComponentElement create(final ByteBuffer byteBuffer) {
        return ComponentElement$CppProxy.create(byteBuffer);
    }
}
