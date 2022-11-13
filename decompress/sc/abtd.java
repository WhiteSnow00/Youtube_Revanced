// 
// Decompiled by Procyon v0.6.0
// 

public final class abtd
{
    public static final abtd a;
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
        a = new abtd();
    }
    
    public abtd() {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = 255;
        this.l = "#000000";
        this.m = 255;
        this.n = "#000000";
    }
    
    public abtd(final abtd abtd) {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = 255;
        this.l = "#000000";
        this.m = 255;
        this.n = "#000000";
        this.b = abtd.b;
        this.c = abtd.c;
        this.d = abtd.d;
        this.e = abtd.e;
        this.f = abtd.f;
        this.g = abtd.g;
        this.h = abtd.h;
        this.i = abtd.i;
        this.j = abtd.j;
        this.k = abtd.k;
        this.l = abtd.l;
        this.m = abtd.m;
        this.n = abtd.n;
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
