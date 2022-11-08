// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livechat.innertube;

import android.os.Parcelable;

public abstract class SupportedPickerPanelWrapper implements Parcelable
{
    public final Object a;
    
    public SupportedPickerPanelWrapper(final Object a) {
        this.a = a;
    }
    
    public abstract String a();
    
    public abstract boolean b();
}
