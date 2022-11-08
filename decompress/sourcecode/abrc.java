// 
// Decompiled by Procyon v0.6.0
// 

public final class abrc
{
    public static final abrc a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public String l;
    public int m;
    public String n;
    
    static {
        a = new abrc();
    }
    
    public abrc() {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = 255;
        this.l = "#000000";
        this.m = 255;
        this.n = "#000000";
    }
    
    public abrc(final abrc abrc) {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = 255;
        this.l = "#000000";
        this.m = 255;
        this.n = "#000000";
        this.b = abrc.b;
        this.c = abrc.c;
        this.d = abrc.d;
        this.e = abrc.e;
        this.f = abrc.f;
        this.g = abrc.g;
        this.h = abrc.h;
        this.i = abrc.i;
        this.j = abrc.j;
        this.k = abrc.k;
        this.l = abrc.l;
        this.m = abrc.m;
        this.n = abrc.n;
    }
    
    public final String a() {
        final StringBuilder sb = new StringBuilder(128);
        if (!this.j.equals("#FFFFFF")) {
            sb.append("<font color=");
            sb.append(this.j);
            sb.append(">");
        }
        if (this.c) {
            sb.append("<I>");
        }
        return sb.toString();
    }
    
    public final String b() {
        final StringBuilder sb = new StringBuilder(128);
        if (this.c) {
            sb.append("</I>");
        }
        if (!this.j.equals("#FFFFFF")) {
            sb.append("</font>");
        }
        return sb.toString();
    }
}
