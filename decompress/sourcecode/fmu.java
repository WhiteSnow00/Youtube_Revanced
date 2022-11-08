import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmu extends agzi implements ahax
{
    public static final fmu a;
    private static volatile ahbe i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public ahas g;
    public int h;
    
    static {
        agzi.registerDefaultInstance((Class)fmu.class, (agzi)(a = new fmu()));
    }
    
    private fmu() {
        this.g = ahas.a;
        this.d = true;
        this.e = true;
    }
    
    public final boolean a(final int n) {
        return this.g.containsKey(n);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = fmu.i) == null) {
                    synchronized (fmu.class) {
                        if (fmu.i == null) {
                            fmu.i = (ahbe)new agzb((agzi)fmu.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return fmu.a;
            }
            case 4: {
                return new agza((agzi)fmu.a);
            }
            case 3: {
                return new fmu();
            }
            case 2: {
                return newMessageInfo((MessageLite)fmu.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1002\u0003\u00052\u0006\u1004\u0004", new Object[] { "b", "c", "d", "e", "f", "g", fmt.a, "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
