// 
// Decompiled by Procyon v0.6.0
// 

final class agce extends aewr
{
    private final String a;
    private final agfn b;
    
    public agce(final String a, final agfn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final agfn b = this.b;
        final agfb a2 = agfb.a;
        final agfn a3 = agfn.a;
        final int ordinal = b.ordinal();
        String s;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        s = "UNKNOWN";
                    }
                    else {
                        s = "CRUNCHY";
                    }
                }
                else {
                    s = "RAW";
                }
            }
            else {
                s = "LEGACY";
            }
        }
        else {
            s = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", a, s);
    }
}
