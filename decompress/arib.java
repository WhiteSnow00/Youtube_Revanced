// 
// Decompiled by Procyon v0.6.0
// 

public final class arib
{
    public static final arib a;
    public final boolean b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final arhf f;
    public final boolean g;
    
    static {
        a = new arib();
    }
    
    private arib() {
        this.b = false;
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
    }
    
    public arib(final String c, final Integer d, final Integer e, final arhf f, final boolean g) {
        this.b = true;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final String toString() {
        if (!this.b) {
            return "Unsupported codec";
        }
        final Integer d = this.d;
        String concat = "N/A";
        String concat2;
        if (d != null) {
            concat2 = "0x".concat(String.valueOf(Integer.toHexString(d)));
        }
        else {
            concat2 = "N/A";
        }
        final Integer e = this.e;
        if (e != null) {
            concat = "0x".concat(String.valueOf(Integer.toHexString(e)));
        }
        final String c = this.c;
        final boolean g = this.g;
        arhc arhc;
        if ((arhc = arhc.b(this.f.e)) == null) {
            arhc = arhc.a;
        }
        final int d2 = arhc.d;
        final arhf f = this.f;
        final int f2 = f.f;
        final int g2 = f.g;
        final long h = f.h;
        final StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(" Surface color format: ");
        sb.append(concat2);
        sb.append(" YUV color format: ");
        sb.append(concat);
        sb.append(" isH264HighProfileSupported: ");
        sb.append(g);
        sb.append(" bitrateAdjusterType ");
        sb.append(d2);
        sb.append(" periodicKeyframeIntervalSec ");
        sb.append(f2);
        sb.append(" forcedKeyframeIntervalSec ");
        sb.append(g2);
        sb.append(" maxFrameGapBeforeRequestingKeyframeNs ");
        sb.append(h);
        return sb.toString();
    }
}
