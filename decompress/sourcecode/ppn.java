import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppn
{
    public final String a;
    public final String b;
    public final int c;
    
    public ppn() {
    }
    
    public ppn(final String a, final String b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final agsv a() {
        final agza builder = ((agzi)agsv.a).createBuilder();
        final String a = this.a;
        builder.copyOnWrite();
        final agsv agsv = (agsv)builder.instance;
        a.getClass();
        final int b = agsv.b;
        int n = 1;
        agsv.b = (b | 0x1);
        agsv.c = a;
        final int c = this.c;
        final int n2 = c - 1;
        if (c != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            n = 2;
                        }
                    }
                    else {
                        n = 5;
                    }
                }
                else {
                    n = 4;
                }
            }
            else {
                n = 3;
            }
            builder.copyOnWrite();
            final agsv agsv2 = (agsv)builder.instance;
            agsv2.e = n - 1;
            agsv2.b |= 0x4;
            if (!TextUtils.isEmpty((CharSequence)this.b)) {
                final String b2 = this.b;
                builder.copyOnWrite();
                final agsv agsv3 = (agsv)builder.instance;
                b2.getClass();
                agsv3.b |= 0x2;
                agsv3.d = b2;
            }
            return (agsv)builder.build();
        }
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ppn) {
            final ppn ppn = (ppn)o;
            if (this.a.equals(ppn.a) && this.b.equals(ppn.b)) {
                final int c = this.c;
                final int c2 = ppn.c;
                if (c == 0) {
                    throw null;
                }
                if (c == c2) {
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
        final int c = this.c;
        if (c != 0) {
            return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ c;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        String s;
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            s = "null";
                        }
                        else {
                            s = "IMPORTANCE_NONE";
                        }
                    }
                    else {
                        s = "IMPORTANCE_LOW";
                    }
                }
                else {
                    s = "IMPORTANCE_HIGH";
                }
            }
            else {
                s = "IMPORTANCE_DEFAULT";
            }
        }
        else {
            s = "IMPORTANCE_UNSPECIFIED";
        }
        final StringBuilder sb = new StringBuilder("ChimeNotificationChannel{id=");
        sb.append(a);
        sb.append(", group=");
        sb.append(b);
        sb.append(", importance=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
