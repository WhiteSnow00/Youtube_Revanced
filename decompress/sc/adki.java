import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public enum adki implements adkh
{
    a;
    
    static final SparseArray b;
    private static final adki[] d;
    public final int c;
    
    static {
        int i = 0;
        final adki adki;
        d = new adki[] { adki };
        b = new SparseArray();
        for (adki[] values = values(); i < values.length; ++i) {
            final adki adki2 = values[i];
            adki.b.put(adki2.c, (Object)adki2);
        }
    }
    
    private adki() {
        this.c = 1;
    }
    
    @Override
    public final /* bridge */ adkh a(final int n) {
        return (adki)adki.b.get(n);
    }
    
    @Override
    public final String b() {
        return "api";
    }
}
