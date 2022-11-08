// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import android.os.Parcel;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;

public class FlexboxLayoutManager$LayoutParams extends nx implements FlexItem
{
    public static final Parcelable$Creator CREATOR;
    private float a;
    private float b;
    private int g;
    private float h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    
    static {
        CREATOR = (Parcelable$Creator)new f(19);
    }
    
    public FlexboxLayoutManager$LayoutParams() {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
    }
    
    public FlexboxLayoutManager$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
    }
    
    public FlexboxLayoutManager$LayoutParams(final Parcel parcel) {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.g = parcel.readInt();
        this.h = parcel.readFloat();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = (parcel.readByte() != 0);
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
    
    public final float a() {
        return this.h;
    }
    
    public final float b() {
        return this.a;
    }
    
    public final float c() {
        return this.b;
    }
    
    public final int d() {
        return this.g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final int e() {
        return this.height;
    }
    
    public final int f() {
        return this.bottomMargin;
    }
    
    public final int g() {
        return this.leftMargin;
    }
    
    public final int h() {
        return this.rightMargin;
    }
    
    public final int i() {
        return this.topMargin;
    }
    
    public final int j() {
        return this.l;
    }
    
    public final int k() {
        return this.k;
    }
    
    public final int l() {
        return this.j;
    }
    
    public final int m() {
        return this.i;
    }
    
    public final int n() {
        return 1;
    }
    
    public final int o() {
        return this.width;
    }
    
    public final boolean p() {
        return this.m;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeByte((byte)(byte)(this.m ? 1 : 0));
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
