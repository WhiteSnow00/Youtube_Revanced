// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class PanelsConfiguration implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final PanelDescriptor a;
    public final PanelDescriptor b;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(8);
    }
    
    public PanelsConfiguration(final PanelDescriptor a, final PanelDescriptor b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public static PanelsConfiguration a(final PanelDescriptor panelDescriptor, final PanelDescriptor panelDescriptor2) {
        return new PanelsConfiguration(panelDescriptor, panelDescriptor2);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof PanelsConfiguration) {
            final PanelsConfiguration panelsConfiguration = (PanelsConfiguration)o;
            if (this.a.equals(panelsConfiguration.a) && this.b.equals(panelsConfiguration.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeParcelable((Parcelable)this.b, n);
    }
}
