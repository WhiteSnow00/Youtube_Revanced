// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.fragments;

import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PlaylistEditorFragment$EditorState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final CharSequence a;
    public final CharSequence b;
    public final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new fzs(18);
    }
    
    public PlaylistEditorFragment$EditorState(final Parcel parcel) {
        this.a = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = aqvq.cm(parcel.readInt());
    }
    
    public PlaylistEditorFragment$EditorState(final CharSequence a, final CharSequence b, final int c) {
        this.a = a;
        this.b = b;
        if (c != 0) {
            this.c = c;
            return;
        }
        throw null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int c) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        TextUtils.writeToParcel(this.b, parcel, 0);
        c = this.c;
        if (c != 0) {
            parcel.writeInt(c - 1);
            return;
        }
        throw null;
    }
}
