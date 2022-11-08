import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byy
{
    public String a;
    public String b;
    public Set c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public boolean p;
    
    public byy() {
        this.a = "";
        this.b = "";
        this.c = Collections.emptySet();
        this.d = "";
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.o = -1;
        this.p = false;
    }
    
    public static int b(final int n, final String s, final String s2, final int n2) {
        if (s.isEmpty() || n == -1) {
            return n;
        }
        if (s.equals(s2)) {
            return n + n2;
        }
        return -1;
    }
    
    public final int a() {
        final int k = this.k;
        if (k == -1 && this.l == -1) {
            return -1;
        }
        int n = false ? 1 : 0;
        final boolean b = k == 1;
        if (this.l == 1) {
            n = 2;
        }
        return (b ? 1 : 0) | n;
    }
}
