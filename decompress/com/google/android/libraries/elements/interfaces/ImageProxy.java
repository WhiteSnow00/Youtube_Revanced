// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

public abstract class ImageProxy
{
    public abstract ContentMode contentMode();
    
    public abstract boolean flipForRtlLayout();
    
    public abstract ImageFormatHint imageFormatHint();
    
    public abstract ArrayList sources();
}
