// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.filters.model;

import java.util.Collection;
import android.text.TextUtils;
import android.content.Context;
import com.google.research.xeno.effect.Control;
import java.util.Iterator;
import java.util.Locale;
import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.Map;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class FilterMapTable$FilterDescriptor implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public boolean b;
    public final List c;
    public String d;
    public Map e;
    public atzq f;
    private final int g;
    private final String h;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(5);
    }
    
    public FilterMapTable$FilterDescriptor(final Parcel parcel) {
        this.c = Collections.synchronizedList(new ArrayList<Object>());
        this.a = afbj.e(parcel.readString());
        this.g = parcel.readInt();
        this.d = afbj.e(parcel.readString());
        this.h = afbj.e(parcel.readString());
        final int int1 = parcel.readInt();
        boolean b = true;
        if (int1 != 1) {
            b = false;
        }
        this.b = b;
        this.f = new atzq(parcel.readInt());
    }
    
    public FilterMapTable$FilterDescriptor(final String a, final String h, final boolean b, final boolean b2) {
        this.c = Collections.synchronizedList(new ArrayList<Object>());
        twd.n(a);
        this.a = a;
        if (b2 && umk.a.get(a) != null) {
            this.g = umk.a.get(a);
            this.h = "";
        }
        else {
            twd.n(h);
            this.h = h;
            this.g = -1;
        }
        this.b = b;
        this.d = a.toLowerCase(Locale.ENGLISH);
        this.f = new atzq(0);
    }
    
    public static FilterMapTable$FilterDescriptor a(final List list, final String s) {
        if (list != null) {
            if (s != null) {
                for (final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : list) {
                    if (j(filterMapTable$FilterDescriptor.a, s)) {
                        return filterMapTable$FilterDescriptor;
                    }
                }
            }
        }
        return null;
    }
    
    public static boolean g(final String s) {
        return s == null || j(s, "NORMAL");
    }
    
    public static boolean j(final String s, final String s2) {
        final boolean b = true;
        if (s == null) {
            final boolean b2 = b;
            if (s2 == null) {
                return b2;
            }
        }
        boolean b2;
        if (s != null && s2 != null) {
            if (!aewr.d(s, s2)) {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    public final Control b(final String s) {
        final Map e = this.e;
        if (e == null) {
            return null;
        }
        return (Control)e.get(s);
    }
    
    public final String c(final Context context) {
        if (!TextUtils.isEmpty((CharSequence)this.h)) {
            return this.h;
        }
        return context.getString(this.g);
    }
    
    public final void d() {
        final List c = this.c;
        monitorenter(c);
        int i = 0;
        try {
            this.b = false;
            final ArrayList list = new ArrayList(this.c);
            this.c.clear();
            monitorexit(c);
            while (i < list.size()) {
                ((oqz)list.get(i)).D();
                ++i;
            }
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean e(final String s) {
        final Map e = this.e;
        return e != null && e.containsKey(s);
    }
    
    public final boolean f() {
        return this.f.c();
    }
    
    public final boolean h() {
        synchronized (this.c) {
            return this.b;
        }
    }
    
    public final boolean i() {
        return this.f.d();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeInt(this.g);
        parcel.writeString(this.d);
        parcel.writeString(this.h);
        parcel.writeInt((int)(this.h() ? 1 : 0));
        parcel.writeInt(this.f.a);
    }
}
