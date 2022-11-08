import android.text.Layout$Alignment;

// 
// Decompiled by Procyon v0.6.0
// 

final class bzc
{
    public long a;
    public long b;
    public CharSequence c;
    public int d;
    public float e;
    public int f;
    public int g;
    public float h;
    public int i;
    public float j;
    public int k;
    
    public bzc() {
        this.a = 0L;
        this.b = 0L;
        this.d = 2;
        this.e = -3.4028235E38f;
        this.f = 1;
        this.g = 0;
        this.h = -3.4028235E38f;
        this.i = Integer.MIN_VALUE;
        this.j = 1.0f;
        this.k = Integer.MIN_VALUE;
    }
    
    public final azw a() {
        final float h = this.h;
        float n = -3.4028235E38f;
        float f = h;
        if (h == -3.4028235E38f) {
            final int d = this.d;
            if (d != 4) {
                if (d != 5) {
                    f = 0.5f;
                }
                else {
                    f = 1.0f;
                }
            }
            else {
                f = 0.0f;
            }
        }
        int i = this.i;
        Label_0109: {
            if (i == Integer.MIN_VALUE) {
                final int d2 = this.d;
                Label_0106: {
                    if (d2 != 1) {
                        if (d2 != 3) {
                            if (d2 == 4) {
                                break Label_0106;
                            }
                            if (d2 != 5) {
                                i = 1;
                                break Label_0109;
                            }
                        }
                        i = 2;
                        break Label_0109;
                    }
                }
                i = 0;
            }
        }
        final azw azw = new azw();
        final int d3 = this.d;
        Layout$Alignment c = null;
        Label_0210: {
            Label_0205: {
                if (d3 != 1) {
                    if (d3 != 2) {
                        if (d3 != 3) {
                            if (d3 == 4) {
                                break Label_0205;
                            }
                            if (d3 != 5) {
                                final StringBuilder sb = new StringBuilder("Unknown textAlignment: ");
                                sb.append(d3);
                                bao.c("WebvttCueParser", sb.toString());
                                c = null;
                                break Label_0210;
                            }
                        }
                        c = Layout$Alignment.ALIGN_OPPOSITE;
                        break Label_0210;
                    }
                    c = Layout$Alignment.ALIGN_CENTER;
                    break Label_0210;
                }
            }
            c = Layout$Alignment.ALIGN_NORMAL;
        }
        azw.c = c;
        final float e = this.e;
        final int f2 = this.f;
        Label_0274: {
            Label_0267: {
                if (e != -3.4028235E38f && f2 == 0) {
                    if (e < 0.0f) {
                        break Label_0267;
                    }
                    if (e > 1.0f) {
                        break Label_0267;
                    }
                }
                if (e != -3.4028235E38f) {
                    n = e;
                    break Label_0274;
                }
                if (f2 != 0) {
                    break Label_0274;
                }
            }
            n = 1.0f;
        }
        azw.b(n, f2);
        azw.e = this.g;
        azw.f = f;
        azw.g = i;
        final float j = this.j;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException(String.valueOf(i));
                }
            }
            else if (f <= 0.5f) {
                f += f;
            }
            else {
                final float n2 = 1.0f - f;
                f = n2 + n2;
            }
        }
        else {
            f = 1.0f - f;
        }
        azw.h = Math.min(j, f);
        azw.k = this.k;
        final CharSequence c2 = this.c;
        if (c2 != null) {
            azw.a = c2;
        }
        return azw;
    }
}
