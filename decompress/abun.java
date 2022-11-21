// 
// Decompiled by Procyon v0.6.0
// 

public final class abun
{
    public static final abun a;
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
        a = new abun();
    }
    
    public abun() {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = 255;
        this.l = "#000000";
        this.m = 255;
        this.n = "#000000";
    }
    
    public abun(final abun abun) {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = 255;
        this.l = "#000000";
        this.m = 255;
        this.n = "#000000";
        this.b = abun.b;
        this.c = abun.c;
        this.d = abun.d;
        this.e = abun.e;
        this.f = abun.f;
        this.g = abun.g;
        this.h = abun.h;
        this.i = abun.i;
        this.j = abun.j;
        this.k = abun.k;
        this.l = abun.l;
        this.m = abun.m;
        this.n = abun.n;
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
