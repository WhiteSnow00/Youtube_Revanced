import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hds
{
    public final Uri a;
    public final aqyq b;
    public final apit c;
    public final int d;
    public final int e;
    public final apip f;
    public final Uri g;
    public final Uri h;
    public final Integer i;
    public final aqyy j;
    public final File k;
    
    public hds() {
    }
    
    public hds(final Uri a, final aqyq b, final apit c, final int d, final int e, final apip f, final Uri g, final Uri h, final Integer i, final aqyy j, final File k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hds) {
            final hds hds = (hds)o;
            if (this.a.equals((Object)hds.a) && ((agzi)this.b).equals(hds.b)) {
                final apit c = this.c;
                if (c == null) {
                    if (hds.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(hds.c)) {
                    return false;
                }
                if (this.d == hds.d && this.e == hds.e) {
                    final apip f = this.f;
                    if (f == null) {
                        if (hds.f != null) {
                            return false;
                        }
                    }
                    else if (!f.equals(hds.f)) {
                        return false;
                    }
                    final Uri g = this.g;
                    if (g == null) {
                        if (hds.g != null) {
                            return false;
                        }
                    }
                    else if (!g.equals((Object)hds.g)) {
                        return false;
                    }
                    final Uri h = this.h;
                    if (h == null) {
                        if (hds.h != null) {
                            return false;
                        }
                    }
                    else if (!h.equals((Object)hds.h)) {
                        return false;
                    }
                    final Integer i = this.i;
                    if (i == null) {
                        if (hds.i != null) {
                            return false;
                        }
                    }
                    else if (!i.equals(hds.i)) {
                        return false;
                    }
                    final aqyy j = this.j;
                    if (j == null) {
                        if (hds.j != null) {
                            return false;
                        }
                    }
                    else if (!((agzi)j).equals(hds.j)) {
                        return false;
                    }
                    if (this.k.equals(hds.k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = ((agzi)this.b).hashCode();
        final apit c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int d = this.d;
        final int e = this.e;
        final apip f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final Uri g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final Uri h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final Integer i = this.i;
        int hashCode8;
        if (i == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = i.hashCode();
        }
        final aqyy j = this.j;
        if (j != null) {
            hashCode3 = ((agzi)j).hashCode();
        }
        return ((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ d) * 1000003 ^ e) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode3) * 1000003 ^ this.k.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final int d = this.d;
        final int e = this.e;
        final String value4 = String.valueOf(this.f);
        final String value5 = String.valueOf(this.g);
        final String value6 = String.valueOf(this.h);
        final Integer i = this.i;
        final String value7 = String.valueOf(this.j);
        final String value8 = String.valueOf(this.k);
        final StringBuilder sb = new StringBuilder("SegmentProcessingData{sourceVideoUri=");
        sb.append(value);
        sb.append(", clipEditMetadata=");
        sb.append(value2);
        sb.append(", trimFeatures=");
        sb.append(value3);
        sb.append(", navigationSource=");
        sb.append(d);
        sb.append(", videoSegmentIndex=");
        sb.append(e);
        sb.append(", clipEditFeatures=");
        sb.append(value4);
        sb.append(", remoteVideoSourceUri=");
        sb.append(value5);
        sb.append(", remoteAudioSourceUri=");
        sb.append(value6);
        sb.append(", audioOffsetMs=");
        sb.append(i);
        sb.append(", visualRemixSourceData=");
        sb.append(value7);
        sb.append(", outputFile=");
        sb.append(value8);
        sb.append("}");
        return sb.toString();
    }
}
