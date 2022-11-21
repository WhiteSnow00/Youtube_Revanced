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
    public final afci b;
    public final Set c;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(17);
    }
    
    public LoggingUrlModel(final alyh alyh) {
        final int b = alyh.b;
        boolean b2 = true;
        if (0x1 != (b & 0x1)) {
            b2 = false;
        }
        adme.T(b2);
        this.a = alyh.c;
        this.b = adzw.M((afci)new vdf(this, 11));
        this.c = new HashSet();
        if (alyh.d.size() != 0) {
            for (final alyg alyg : alyh.d) {
                final Set c = this.c;
                alyf alyf;
                if ((alyf = alyf.b(alyg.c)) == null) {
                    alyf = alyf.a;
                }
                c.add(alyf);
            }
        }
    }
    
    public LoggingUrlModel(final lro lro) {
        String c;
        if ((lro.b & 0x1) != 0x0) {
            c = lro.c;
        }
        else {
            c = "";
        }
        this.a = c;
        this.b = adzw.M((afci)new vdf(this, 10));
        this.c = new HashSet();
        final Iterator<Object> iterator = ((List<Object>)lro.d).iterator();
        while (iterator.hasNext()) {
            final alyf b = alyf.b((int)iterator.next());
            if (b != null) {
                this.c.add(b);
            }
        }
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.a.compareTo(((LoggingUrlModel)o).a);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int h) {
        final ahcr builder = ((ahcz)lro.a).createBuilder();
        final String a = this.a;
        builder.copyOnWrite();
        final lro lro = (lro)builder.instance;
        a.getClass();
        lro.b |= 0x1;
        lro.c = a;
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            h = ((alyf)iterator.next()).h;
            builder.copyOnWrite();
            final lro lro2 = (lro)builder.instance;
            final ahdh d = lro2.d;
            if (!d.c()) {
                lro2.d = ahcz.mutableCopy(d);
            }
            lro2.d.g(h);
        }
        ume.ad((MessageLite)builder.build(), parcel);
    }
}
