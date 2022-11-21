import j$.util.Objects;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsh extends RuntimeException
{
    public final adsg a;
    public final Optional b;
    
    public adsh(final String s, final adsg a, final Optional b) {
        String s2;
        if (s == null && a.equals(adsg.a)) {
            s2 = null;
        }
        else {
            s2 = s;
            if (!a.equals(adsg.a)) {
                if (s == null) {
                    s2 = a.name();
                }
                else {
                    s2 = String.format("%s [%s]", s, a.name());
                }
            }
        }
        super(s2);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof adsh;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final adsh adsh = (adsh)o;
            b3 = b2;
            if (this.a == adsh.a) {
                if (this.getMessage() == null && adsh.getMessage() == null) {
                    b3 = true;
                }
                else {
                    b3 = b2;
                    if (this.getMessage() != null) {
                        if (this.getMessage().equals(adsh.getMessage())) {
                            return true;
                        }
                        b3 = b2;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.getMessage() });
    }
}
