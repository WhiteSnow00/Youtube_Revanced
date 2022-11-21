import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class adiw
{
    public static final int[] a;
    public static final int[] b;
    int[] c;
    long[] d;
    long[] e;
    int[] f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public anyy l;
    public anyz m;
    public final wza n;
    public final Executor o;
    
    static {
        a = new int[] { 1, 2, 4, 8, 16, 30 };
        b = new int[] { 17, 33, 67, 133, 267, 500 };
    }
    
    public adiw(final wza n, final Executor o) {
        this.n = n;
        this.o = o;
    }
}
