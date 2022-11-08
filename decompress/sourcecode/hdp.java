import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdp
{
    public final heo a;
    public final ShortsVideoTrimView2 b;
    public final rbi c;
    public final urf d;
    public final boolean e;
    public final int f;
    public final int g;
    public final uir h;
    public final int i;
    
    public hdp() {
    }
    
    public hdp(final heo a, final ShortsVideoTrimView2 b, final rbi c, final urf d, final boolean e, final int f, final int g, final uir h, final int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    static hdo a() {
        return new hdo();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hdp) {
            final hdp hdp = (hdp)o;
            if (this.a.equals(hdp.a) && this.b.equals(hdp.b) && this.c.equals(hdp.c) && this.d.equals(hdp.d) && this.e == hdp.e && this.f == hdp.f && this.g == hdp.g) {
                final uir h = this.h;
                if (h == null) {
                    if (hdp.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(hdp.h)) {
                    return false;
                }
                final int i = this.i;
                final int j = hdp.i;
                if (i == 0) {
                    throw null;
                }
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        int n;
        if (!this.e) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final int f = this.f;
        final int g = this.g;
        final uir h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final int i = this.i;
        aqql.an(i);
        return ((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ f) * 1000003 ^ g) * 1000003 ^ hashCode5) * 1000003 ^ i;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final boolean e = this.e;
        final int f = this.f;
        final int g = this.g;
        final String value5 = String.valueOf(this.h);
        final int i = this.i;
        String am;
        if (i != 0) {
            am = aqql.am(i);
        }
        else {
            am = "null";
        }
        final StringBuilder sb = new StringBuilder("SegmentImportUiData{videoTrimController=");
        sb.append(value);
        sb.append(", videoTrimView=");
        sb.append(value2);
        sb.append(", videoControllerView=");
        sb.append(value3);
        sb.append(", videoViewManager=");
        sb.append(value4);
        sb.append(", isPannableCropEnabled=");
        sb.append(e);
        sb.append(", recordedLengthMs=");
        sb.append(f);
        sb.append(", maximumRecordingDurationMs=");
        sb.append(g);
        sb.append(", trimProgressBarDataTemplateBuilder=");
        sb.append(value5);
        sb.append(", trimContext=");
        sb.append(am);
        sb.append("}");
        return sb.toString();
    }
}
