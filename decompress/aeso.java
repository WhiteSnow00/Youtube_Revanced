// 
// Decompiled by Procyon v0.6.0
// 

public final class aeso
{
    public final boolean a;
    public final atnb b;
    private final aesm c;
    private final aesj d;
    
    public aeso() {
    }
    
    public aeso(final aesm c, final aesj d, final atnb b) {
        this.a = true;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public static final asdz c() {
        return new asdz();
    }
    
    public final aesj a() {
        adme.U(this.a, "Synclet binding must be enabled to have a SyncConfig");
        final aesj d = this.d;
        d.getClass();
        return d;
    }
    
    public final aesm b() {
        adme.U(this.a, "Synclet binding must be enabled to have a SyncKey");
        final aesm c = this.c;
        c.getClass();
        return c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeso) {
            final aeso aeso = (aeso)o;
            if (this.a == aeso.a) {
                final aesm c = this.c;
                if (c == null) {
                    if (aeso.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(aeso.c)) {
                    return false;
                }
                final aesj d = this.d;
                if (d == null) {
                    if (aeso.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(aeso.d)) {
                    return false;
                }
                final atnb b = this.b;
                final atnb b2 = aeso.b;
                if (b == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b.equals(b2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final aesm c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final aesj d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final atnb b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (((n ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("SyncletBinding{enabled=");
        sb.append(a);
        sb.append(", syncKey=");
        sb.append(value);
        sb.append(", syncConfig=");
        sb.append(value2);
        sb.append(", syncletProvider=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
