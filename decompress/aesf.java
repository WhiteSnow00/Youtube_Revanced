import java.util.List;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesf
{
    public final String a;
    public final MessageLite b;
    public final aese c;
    public final afgh d;
    public final qqj e;
    public final afxj f;
    
    public aesf() {
    }
    
    public aesf(final String a, final MessageLite b, final aese c, final afgh d, final qqj e, final afxj f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static arfi a() {
        final arfi arfi = new arfi();
        arfi.c = aese.a(1);
        arfi.g = qrn.a;
        return arfi;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aesf) {
            final aesf aesf = (aesf)o;
            if (this.a.equals(aesf.a) && this.b.equals(aesf.b) && this.c.equals(aesf.c) && agpx.T(this.d, aesf.d) && this.e.equals(aesf.e)) {
                final afxj f = this.f;
                final afxj f2 = aesf.f;
                if (f == null) {
                    if (f2 != null) {
                        return false;
                    }
                }
                else if (!f.equals(f2)) {
                    return false;
                }
                return true;
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
        final int hashCode5 = this.e.hashCode();
        final afxj f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        return ((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final String value5 = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder("ProtoDataStoreConfig{name=");
        sb.append(a);
        sb.append(", schema=");
        sb.append(value);
        sb.append(", storage=");
        sb.append(value2);
        sb.append(", migrations=");
        sb.append(value3);
        sb.append(", handler=");
        sb.append(value4);
        sb.append(", ioExecutor=");
        sb.append(value5);
        sb.append(", lamsConfig=null}");
        return sb.toString();
    }
}
