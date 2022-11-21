import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakv
{
    public final String a;
    private final String b;
    private final byte[] c;
    private final byte[] d;
    private final int e;
    
    public aakv() {
    }
    
    public aakv(final String b, final String a, final int e, final byte[] c) {
        this.b = b;
        if (a != null) {
            this.a = a;
            this.e = e;
            this.c = c;
            this.d = null;
            return;
        }
        throw new NullPointerException("Null videoId");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aakv) {
            final aakv aakv = (aakv)o;
            if (this.b.equals(aakv.b) && this.a.equals(aakv.a) && this.e == aakv.e) {
                final byte[] c = this.c;
                final boolean b = aakv instanceof aakv;
                byte[] array;
                if (b) {
                    array = aakv.c;
                }
                else {
                    array = aakv.c;
                }
                if (Arrays.equals(c, array)) {
                    if (b) {
                        final byte[] d = aakv.d;
                    }
                    if (Arrays.equals(null, (byte[])null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.b.hashCode() ^ 0xF4243) * 1000003 ^ this.a.hashCode()) * 1000003 ^ this.e) * 1000003 ^ Arrays.hashCode(this.c)) * 1000003 ^ Arrays.hashCode((byte[])null);
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String a = this.a;
        final String string = Integer.toString(this.e - 1);
        final String string2 = Arrays.toString(this.c);
        final String string3 = Arrays.toString((byte[])null);
        final StringBuilder sb = new StringBuilder("OfflinePlayerRequestParams{identityId=");
        sb.append(b);
        sb.append(", videoId=");
        sb.append(a);
        sb.append(", offlineModeType=");
        sb.append(string);
        sb.append(", trackingParams=");
        sb.append(string2);
        sb.append(", offlineSharingWrappedKey=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }
}
