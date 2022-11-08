import java.util.Arrays;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozi
{
    public final String a;
    public final MessageLite b;
    public final afnt c;
    public final Integer d;
    public final mnq e;
    public final int[] f;
    public final int[] g;
    public final int h;
    
    public ozi() {
    }
    
    public ozi(final String a, final MessageLite b, final afnt c, final Integer d, final int[] f, final int[] g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = 1;
        this.e = null;
        this.f = f;
        this.g = g;
    }
    
    public static ozh a() {
        final ozh ozh = new ozh();
        ozh.c();
        return ozh;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ozi) {
            final ozi ozi = (ozi)o;
            if (this.a.equals(ozi.a) && this.b.equals(ozi.b)) {
                final afnt c = this.c;
                if (c == null) {
                    if (ozi.c != null) {
                        return false;
                    }
                }
                else if (!((agzi)c).equals((Object)ozi.c)) {
                    return false;
                }
                final Integer d = this.d;
                if (d == null) {
                    if (ozi.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(ozi.d)) {
                    return false;
                }
                final int h = this.h;
                final int h2 = ozi.h;
                if (h == 0) {
                    throw null;
                }
                if (h2 == 1) {
                    final mnq e = ozi.e;
                    final int[] f = this.f;
                    int[] array;
                    if (ozi instanceof ozi) {
                        array = ozi.f;
                    }
                    else {
                        array = ozi.f;
                    }
                    if (Arrays.equals(f, array) && Arrays.equals(this.g, ozi.g)) {
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
        final int hashCode2 = this.b.hashCode();
        final afnt c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = ((agzi)c).hashCode();
        }
        final Integer d = this.d;
        if (d != null) {
            hashCode3 = d.hashCode();
        }
        if (this.h != 0) {
            return ((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode3) * 583896283 ^ 0x1) * -721379959 ^ Arrays.hashCode(this.f)) * 1000003 ^ Arrays.hashCode(this.g);
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final Integer d = this.d;
        String string;
        if (this.h != 0) {
            string = Integer.toString(0);
        }
        else {
            string = "null";
        }
        final String string2 = Arrays.toString(this.f);
        final String string3 = Arrays.toString(this.g);
        final StringBuilder sb = new StringBuilder("ClearcutData{logSource=");
        sb.append(a);
        sb.append(", message=");
        sb.append(value);
        sb.append(", visualElements=");
        sb.append(value2);
        sb.append(", eventCode=");
        sb.append(d);
        sb.append(", wallTime=null, elapsedTime=null, qosTier=");
        sb.append(string);
        sb.append(", logVerifier=null, experimentIds=");
        sb.append(string2);
        sb.append(", testCodes=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }
}
