import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aace extends aacm
{
    public final int a;
    public final byte[] b;
    public final byte[] c;
    private final String d;
    private final int e;
    private final String f;
    private final int g;
    private final boolean h;
    
    public aace(final String d, final int e, final String f, final int g, final int a, final byte[] b, final byte[] c, final boolean h) {
        if (d != null) {
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.a = a;
            this.b = b;
            this.c = c;
            this.h = h;
            return;
        }
        throw new NullPointerException("Null videoId");
    }
    
    public final int a() {
        return this.a;
    }
    
    public final int b() {
        return this.e;
    }
    
    public final int c() {
        return this.g;
    }
    
    public final String d() {
        return this.f;
    }
    
    public final String e() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aacm) {
            final aacm aacm = (aacm)o;
            if (this.d.equals(aacm.e()) && this.e == aacm.b()) {
                final String f = this.f;
                if (f == null) {
                    if (aacm.d() != null) {
                        return false;
                    }
                }
                else if (!f.equals(aacm.d())) {
                    return false;
                }
                if (this.g == aacm.c() && this.a == aacm.a()) {
                    final byte[] b = this.b;
                    final boolean b2 = aacm instanceof aace;
                    byte[] array;
                    if (b2) {
                        array = ((aace)aacm).b;
                    }
                    else {
                        array = aacm.g();
                    }
                    if (Arrays.equals(b, array)) {
                        final byte[] c = this.c;
                        byte[] array2;
                        if (b2) {
                            array2 = ((aace)aacm).c;
                        }
                        else {
                            array2 = aacm.h();
                        }
                        if (Arrays.equals(c, array2) && this.h == aacm.f()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean f() {
        return this.h;
    }
    
    public final byte[] g() {
        return this.b;
    }
    
    public final byte[] h() {
        return this.c;
    }
    
    public final int hashCode() {
        final int hashCode = this.d.hashCode();
        final int e = this.e;
        final String f = this.f;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final int g = this.g;
        final int a = this.a;
        final int hashCode3 = Arrays.hashCode(this.b);
        final int hashCode4 = Arrays.hashCode(this.c);
        int n;
        if (!this.h) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ e) * 1000003 ^ hashCode2) * 1000003 ^ g) * 1000003 ^ a) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n;
    }
    
    public final String toString() {
        final String d = this.d;
        final int e = this.e;
        final String f = this.f;
        final int g = this.g;
        final int a = this.a;
        final String string = Arrays.toString(this.b);
        final String string2 = Arrays.toString(this.c);
        final boolean h = this.h;
        final StringBuilder sb = new StringBuilder("OfflineHash{videoId=");
        sb.append(d);
        sb.append(", itag=");
        sb.append(e);
        sb.append(", storageId=");
        sb.append(f);
        sb.append(", merkleLevel=");
        sb.append(g);
        sb.append(", blockIndex=");
        sb.append(a);
        sb.append(", digest=");
        sb.append(string);
        sb.append(", hashState=");
        sb.append(string2);
        sb.append(", matchesBytesOnDisk=");
        sb.append(h);
        sb.append("}");
        return sb.toString();
    }
}
