// 
// Decompiled by Procyon v0.6.0
// 

public final class arhu
{
    public static final arhu a;
    public final boolean b;
    public final String c;
    public final int d;
    public final boolean e;
    public final arhe f;
    
    static {
        a = new arhu();
    }
    
    private arhu() {
        this.b = false;
        this.c = "";
        this.d = 0;
        this.e = false;
        this.f = null;
    }
    
    public arhu(final String c, final int d, final boolean e, final arhe f) {
        this.b = true;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final String toString() {
        String string;
        if (this.b) {
            final String c = this.c;
            final String hexString = Integer.toHexString(this.d);
            final boolean e = this.e;
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(" Color format: 0x");
            sb.append(hexString);
            sb.append(" isH264HighProfileSupported: ");
            sb.append(e);
            string = sb.toString();
        }
        else {
            string = "Unsupported codec";
        }
        return string;
    }
}
