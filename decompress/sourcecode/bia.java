// 
// Decompiled by Procyon v0.6.0
// 

public final class bia implements bhv
{
    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    public final int g;
    
    public bia(final aukm aukm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = 250000;
        this.c = aukm.a;
        this.d = 4;
        this.e = 250000;
        this.f = 50000000;
        this.g = 2;
    }
    
    protected static int a(final int n, final int n2, final int n3) {
        return aesy.w(n * (long)n2 * n3 / 1000000L);
    }
    
    protected static int b(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return 336000;
            }
            case 16: {
                return 256000;
            }
            case 15: {
                return 8000;
            }
            case 14: {
                return 3062500;
            }
            case 12: {
                return 7000;
            }
            case 11: {
                return 16000;
            }
            case 10: {
                return 100000;
            }
            case 9: {
                return 40000;
            }
            case 8: {
                return 2250000;
            }
            case 7: {
                return 192000;
            }
            case 6:
            case 18: {
                return 768000;
            }
            case 5: {
                return 80000;
            }
        }
    }
}
