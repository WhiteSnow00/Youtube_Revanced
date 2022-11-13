// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

public abstract class ElementProxy
{
    public static ElementProxy create(final byte[] array) {
        return ElementProxy$CppProxy.create(array);
    }
    
    public abstract ArrayList childElements();
    
    public abstract String key();
    
    public abstract PropertiesProxy properties();
    
    public abstract TypeProxy type();
}
