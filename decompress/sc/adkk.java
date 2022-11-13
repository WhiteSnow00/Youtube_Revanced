import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public enum adkk implements adkh
{
    a;
    
    static final SparseArray b;
    private static final adkk[] d;
    public final int c;
    
    static {
        int i = 0;
        final adkk adkk;
        d = new adkk[] { adkk };
        b = new SparseArray();
        for (adkk[] values = values(); i < values.length; ++i) {
            final adkk adkk2 = values[i];
            adkk.b.put(adkk2.c, (Object)adkk2);
        }
    }
    
    private adkk() {
        this.c = 3;
    }
    
    @Override
    public final /* bridge */ adkh a(final int n) {
        return (adkk)adkk.b.get(n);
    }
    
    @Override
    public final String b() {
        return "v";
    }
}
