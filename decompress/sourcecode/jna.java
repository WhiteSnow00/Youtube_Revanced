import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jna
{
    public final CharSequence a;
    public final CharSequence b;
    public final afcw c;
    public final afcr d;
    public final afcr e;
    
    public jna() {
    }
    
    public jna(final CharSequence a, final CharSequence b, final afcw c, final afcr d, final afcr e) {
        this.a = a;
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null summaryValues");
        }
        this.c = c;
        if (d == null) {
            throw new NullPointerException("Null entries");
        }
        this.d = d;
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null entryValues");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jna) {
            final jna jna = (jna)o;
            final CharSequence a = this.a;
            if (a == null) {
                if (jna.a != null) {
                    return false;
                }
            }
            else if (!a.equals(jna.a)) {
                return false;
            }
            final CharSequence b = this.b;
            if (b == null) {
                if (jna.b != null) {
                    return false;
                }
            }
            else if (!b.equals(jna.b)) {
                return false;
            }
            if (this.c.equals((Object)jna.c) && adwd.ar((List)this.d, jna.d) && adwd.ar((List)this.e, jna.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final CharSequence a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final CharSequence b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String string = this.c.toString();
        final String string2 = this.d.toString();
        final String string3 = this.e.toString();
        final StringBuilder sb = new StringBuilder("InlineSettingsData{title=");
        sb.append(value);
        sb.append(", summary=");
        sb.append(value2);
        sb.append(", summaryValues=");
        sb.append(string);
        sb.append(", entries=");
        sb.append(string2);
        sb.append(", entryValues=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }
}
