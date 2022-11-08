// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.player;

import java.util.List;
import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class LoggingUrlModel implements Comparable, Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final aeyr b;
    public final Set c;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(17);
    }
    
    public LoggingUrlModel(final alud alud) {
        final int b = alud.b;
        boolean b2 = true;
        if (0x1 != (b & 0x1)) {
            b2 = false;
        }
        agot.D(b2);
        this.a = alud.c;
        this.b = agnj.E((aeyr)new uzv(this, 12));
        this.c = new HashSet();
        if (alud.d.size() != 0) {
            for (final aluc aluc : alud.d) {
                final Set c = this.c;
                alub alub;
                if ((alub = alub.b(aluc.c)) == null) {
                    alub = alub.a;
                }
                c.add(alub);
            }
        }
    }
    
    public LoggingUrlModel(final lpw lpw) {
        String c;
        if ((lpw.b & 0x1) != 0x0) {
            c = lpw.c;
        }
        else {
            c = "";
        }
        this.a = c;
        this.b = agnj.E((aeyr)new uzv(this, 11));
        this.c = new HashSet();
        final Iterator<Object> iterator = ((List<Object>)lpw.d).iterator();
        while (iterator.hasNext()) {
            final alub b = alub.b((int)iterator.next());
            if (b != null) {
                this.c.add(b);
            }
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int h) {
        final agza builder = ((agzi)lpw.a).createBuilder();
        final String a = this.a;
        builder.copyOnWrite();
        final lpw lpw = (lpw)builder.instance;
        a.getClass();
        lpw.b |= 0x1;
        lpw.c = a;
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            h = ((alub)iterator.next()).h;
            builder.copyOnWrite();
            final lpw lpw2 = (lpw)builder.instance;
            final agzq d = lpw2.d;
            if (!d.c()) {
                lpw2.d = agzi.mutableCopy(d);
            }
            lpw2.d.g(h);
        }
        uji.ag((MessageLite)builder.build(), parcel);
    }
}
