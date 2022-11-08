// 
// Decompiled by Procyon v0.6.0
// 

public final class myb
{
    private final int a;
    
    public myb() {
    }
    
    public myb(final int a) {
        this.a = a;
    }
    
    public final boolean a() {
        return this.a == 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof myb)) {
            return false;
        }
        final myb myb = (myb)o;
        final int a = this.a;
        if (a != myb.a) {
            b = false;
        }
        if (a != 0) {
            return b;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        if (a != 0) {
            return a ^ 0xF4243;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        String s;
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    if (a != 4) {
                        s = "null";
                    }
                    else {
                        s = "DO_NOT_ENFORCE";
                    }
                }
                else {
                    s = "UNKNOWN";
                }
            }
            else {
                s = "NOT_SET";
            }
        }
        else {
            s = "ENFORCE";
        }
        return s;
    }
}
