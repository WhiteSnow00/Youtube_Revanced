import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class aapt
{
    private final int a;
    private final String b;
    
    public aapt(final int n) {
        this(n, null);
    }
    
    public aapt(final int a, final String b) {
        adme.K(d(a));
        this.a = a;
        this.b = b;
    }
    
    public static boolean d(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                return true;
            }
        }
    }
    
    public int a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public boolean c() {
        final int a = this.a;
        return a == 5 || a == 6;
    }
    
    public boolean e() {
        final int a = this.a;
        return a == 3 || a == 6 || a == 10;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof aapt && this.a == ((aapt)o).a;
    }
    
    public boolean f() {
        final int a = this.a;
        return a == 2 || a == 5 || a == 9;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
