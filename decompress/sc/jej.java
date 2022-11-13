// 
// Decompiled by Procyon v0.6.0
// 

public final class jej
{
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    private final abj e;
    
    public jej() {
        this.e = new abj();
    }
    
    public static int d(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        if (n != 5) {
            return 1;
        }
        return 4;
    }
    
    public final void a(final jei jei) {
        this.e.add((Object)jei);
    }
    
    public final void b(final int a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        Label_0040: {
            int b;
            if (a != 0 && a != 3) {
                b = 5;
                if (a != 5) {
                    break Label_0040;
                }
            }
            else {
                b = a;
            }
            this.b = b;
        }
        int n = 0;
        while (true) {
            final abj e = this.e;
            if (n >= e.b) {
                break;
            }
            ((jei)e.b(n)).O(a);
            ++n;
        }
    }
    
    public final boolean c() {
        final int a = this.a;
        return a == 5 || a == 4;
    }
}
