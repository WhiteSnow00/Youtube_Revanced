// 
// Decompiled by Procyon v0.6.0
// 

final class afyl extends aesy
{
    private final String a;
    private final agbu b;
    
    public afyl(final String a, final agbu b) {
        this.a = a;
        this.b = b;
    }
    
    public final String toString() {
        final String a = this.a;
        final agbu b = this.b;
        final agbi a2 = agbi.a;
        final agbu a3 = agbu.a;
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
