// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import android.os.Parcel;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.view.ViewGroup$MarginLayoutParams;

public class FlexboxLayout$LayoutParams extends ViewGroup$MarginLayoutParams implements FlexItem
{
    public static final Parcelable$Creator CREATOR;
    private int a;
    private float b;
    private float c;
    private int d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new f(18);
    }
    
    public FlexboxLayout$LayoutParams(final int n) {
        super(new ViewGroup$LayoutParams(n, -1));
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
    }
    
    public FlexboxLayout$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lze.b);
        this.a = obtainStyledAttributes.getInt(8, 1);
        this.b = obtainStyledAttributes.getFloat(2, 0.0f);
        this.c = obtainStyledAttributes.getFloat(3, 1.0f);
        this.d = obtainStyledAttributes.getInt(0, -1);
        this.e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        this.f = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        this.i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        this.j = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
    }
    
    public FlexboxLayout$LayoutParams(final Parcel parcel) {
        boolean j = false;
        super(0, 0);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        if (parcel.readByte() != 0) {
            j = true;
        }
        this.j = j;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
    
    public FlexboxLayout$LayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
    }
    
    public FlexboxLayout$LayoutParams(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
    }
    
    public FlexboxLayout$LayoutParams(final FlexboxLayout$LayoutParams flexboxLayout$LayoutParams) {
        super((ViewGroup$MarginLayoutParams)flexboxLayout$LayoutParams);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
        this.a = flexboxLayout$LayoutParams.a;
        this.b = flexboxLayout$LayoutParams.b;
        this.c = flexboxLayout$LayoutParams.c;
        this.d = flexboxLayout$LayoutParams.d;
        this.e = flexboxLayout$LayoutParams.e;
        this.f = flexboxLayout$LayoutParams.f;
        this.g = flexboxLayout$LayoutParams.g;
        this.h = flexboxLayout$LayoutParams.h;
        this.i = flexboxLayout$LayoutParams.i;
        this.j = flexboxLayout$LayoutParams.j;
    }
    
    public final float a() {
        return this.e;
    }
    
    public final float b() {
        return this.b;
    }
    
    public final float c() {
        return this.c;
    }
    
    public final int d() {
        return this.d;
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
        return this.i;
    }
    
    public final int k() {
        return this.h;
    }
    
    public final int l() {
        return this.g;
    }
    
    public final int m() {
        return this.f;
    }
    
    public final int n() {
        return this.a;
    }
    
    public final int o() {
        return this.width;
    }
    
    public final boolean p() {
        return this.j;
    }
    
    public final void q() {
        this.c = 0.0f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeByte((byte)(byte)(this.j ? 1 : 0));
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
