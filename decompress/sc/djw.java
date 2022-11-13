// 
// Decompiled by Procyon v0.6.0
// 

final class djw extends djy
{
    public djw() {
    }
    
    public final float a(int max, final int n, final int n2, final int n3) {
        if (djw.g) {
            return Math.min(n2 / (float)max, n3 / (float)n);
        }
        max = Math.max(n / n3, max / n2);
        if (max == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(max);
    }
    
    public final int b(final int n, final int n2, final int n3, final int n4) {
        if (djw.g) {
            return 2;
        }
        return 1;
    }
}
