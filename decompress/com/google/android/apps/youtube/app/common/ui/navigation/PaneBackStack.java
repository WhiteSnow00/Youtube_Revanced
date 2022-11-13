// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation;

import android.support.v4.app.Fragment$SavedState;
import java.util.List;
import android.os.Parcel;
import java.util.LinkedList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class PaneBackStack implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final LinkedList a;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(4);
    }
    
    public PaneBackStack() {
        this.a = new LinkedList();
    }
    
    public PaneBackStack(final Parcel parcel) {
        this();
        parcel.readTypedList((List)this.a, PaneBackStack$BackStackEntry.CREATOR);
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final PaneBackStack$BackStackEntry b() {
        return this.a.peek();
    }
    
    public final PaneBackStack$BackStackEntry c() {
        return this.a.pollFirst();
    }
    
    public final void d(final PaneDescriptor paneDescriptor, final Fragment$SavedState fragment$SavedState, final Object o, final String s) {
        this.a.addFirst(new PaneBackStack$BackStackEntry(paneDescriptor, fragment$SavedState, o, s));
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean e() {
        return this.a.isEmpty();
    }
    
    public final void f() {
        final PaneBackStack$BackStackEntry paneBackStack$BackStackEntry = this.a.peekLast();
        this.a.clear();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList((List)this.a);
    }
}
