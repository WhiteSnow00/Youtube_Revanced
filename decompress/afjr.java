import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afjr implements Comparator
{
    protected afjr() {
    }
    
    public static afjr d(final Comparator comparator) {
        afjr afjr;
        if (comparator instanceof afjr) {
            afjr = (afjr)comparator;
        }
        else {
            afjr = new afen(comparator);
        }
        return afjr;
    }
    
    public afjr a() {
        return (afjr)new afjn(this);
    }
    
    public afjr b() {
        return (afjr)new afjo(this);
    }
    
    public afjr c() {
        return (afjr)new afkj(this);
    }
    
    @Override
    public abstract int compare(final Object p0, final Object p1);
}
