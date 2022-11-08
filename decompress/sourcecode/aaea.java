// 
// Decompiled by Procyon v0.6.0
// 

public final class aaea
{
    public final aexq a;
    public final long b;
    public final long c;
    public final double d;
    public final boolean e;
    public final aexq f;
    public final aexq g;
    public final int h;
    public final aexq i;
    public final aexq j;
    public final zyq k;
    public final int l;
    private final aexq m;
    
    public aaea() {
    }
    
    public aaea(final int l, final aexq m, final aexq a, final long b, final long c, final double d, final boolean e, final aexq f, final aexq g, final int h, final aexq i, final aexq j, final zyq k) {
        this.l = l;
        this.m = m;
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
    
    public static aadz a(final int e) {
        final aadz aadz = new aadz(null);
        aadz.e = e;
        aadz.g(0L);
        aadz.b(0L);
        aadz.h(0.0);
        aadz.i(false);
        aadz.e(0);
        aadz.d = null;
        return aadz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof aaea)) {
            return false;
        }
        final aaea aaea = (aaea)o;
        final int l = this.l;
        final int i = aaea.l;
        if (l != 0) {
            if (l == i && this.m.equals((Object)aaea.m) && this.a.equals((Object)aaea.a) && this.b == aaea.b && this.c == aaea.c && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(aaea.d) && this.e == aaea.e && this.f.equals((Object)aaea.f) && this.g.equals((Object)aaea.g) && this.h == aaea.h && this.i.equals((Object)aaea.i) && this.j.equals((Object)aaea.j)) {
                final zyq k = this.k;
                final zyq j = aaea.k;
                if (k == null) {
                    if (j != null) {
                        return false;
                    }
                }
                else if (!k.equals(j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int l = this.l;
        if (l != 0) {
            final int hashCode = this.m.hashCode();
            final int hashCode2 = this.a.hashCode();
            final long b = this.b;
            final long c = this.c;
            final int n = (int)(b ^ b >>> 32);
            final int n2 = (int)(c >>> 32 ^ c);
            final int n3 = (int)(Double.doubleToLongBits(this.d) >>> 32 ^ Double.doubleToLongBits(this.d));
            int n4;
            if (!this.e) {
                n4 = 1237;
            }
            else {
                n4 = 1231;
            }
            final int hashCode3 = this.f.hashCode();
            final int hashCode4 = this.g.hashCode();
            final int h = this.h;
            final int hashCode5 = this.i.hashCode();
            final int hashCode6 = this.j.hashCode();
            final zyq k = this.k;
            int hashCode7;
            if (k == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = k.hashCode();
            }
            return ((((((((((((l ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ h) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        String s = null;
        switch (this.l) {
            default: {
                s = "null";
                break;
            }
            case 22: {
                s = "NOTIFY_NEW_TRANSFER";
                break;
            }
            case 21: {
                s = "SET_DOWNLOAD_NETWORK_PREFERENCE";
                break;
            }
            case 20: {
                s = "RESUME_TRANSFER";
                break;
            }
            case 19: {
                s = "PAUSE_TRANSFER";
                break;
            }
            case 18: {
                s = "STREAM_TRANSFER_STARTED";
                break;
            }
            case 17: {
                s = "UPDATE_TRANSFER_OUTPUT_EXTRAS";
                break;
            }
            case 16: {
                s = "PAUSE_RUNNING_AND_PENDING_TRANSFERS";
                break;
            }
            case 15: {
                s = "WATCH_NEXT_COMPLETED";
                break;
            }
            case 14: {
                s = "QUIT";
                break;
            }
            case 13: {
                s = "ERROR_PAUSE_TRANSFER";
                break;
            }
            case 12: {
                s = "PAUSE_RUNNING_TRANSFERS";
                break;
            }
            case 11: {
                s = "RETRY";
                break;
            }
            case 10: {
                s = "ERROR_FATAL";
                break;
            }
            case 9: {
                s = "ERROR_RETRYABLE";
                break;
            }
            case 8: {
                s = "COMPLETED";
                break;
            }
            case 7: {
                s = "PROGRESS";
                break;
            }
            case 6: {
                s = "SIZE";
                break;
            }
            case 5: {
                s = "RESYNC_TRANSFER";
                break;
            }
            case 4: {
                s = "PING";
                break;
            }
            case 3: {
                s = "REMOVE_TRANSFER";
                break;
            }
            case 2: {
                s = "ADD_TRANSFER";
                break;
            }
            case 1: {
                s = "RESTORE";
                break;
            }
        }
        final String value = String.valueOf(this.m);
        final String value2 = String.valueOf(this.a);
        final long b = this.b;
        final long c = this.c;
        final double d = this.d;
        final boolean e = this.e;
        final String value3 = String.valueOf(this.f);
        final String value4 = String.valueOf(this.g);
        final int h = this.h;
        final String value5 = String.valueOf(this.i);
        final String value6 = String.valueOf(this.j);
        final String value7 = String.valueOf(this.k);
        final StringBuilder sb = new StringBuilder("Action{type=");
        sb.append(s);
        sb.append(", offlineStoreTag=");
        sb.append(value);
        sb.append(", transferId=");
        sb.append(value2);
        sb.append(", transferSize=");
        sb.append(b);
        sb.append(", bytesTransferred=");
        sb.append(c);
        sb.append(", transferSpeedBytesPerSecond=");
        sb.append(d);
        sb.append(", usingDataToDownloadStreams=");
        sb.append(e);
        sb.append(", mediaStatus=");
        sb.append(value3);
        sb.append(", failureReason=");
        sb.append(value4);
        sb.append(", statusReason=");
        sb.append(h);
        sb.append(", transfer=");
        sb.append(value5);
        sb.append(", downloadNetworkPreference=");
        sb.append(value6);
        sb.append(", outputExtras=");
        sb.append(value7);
        sb.append("}");
        return sb.toString();
    }
}
