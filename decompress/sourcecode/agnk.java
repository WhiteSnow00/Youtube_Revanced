import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnk extends agzi implements ahax
{
    public static final agnk a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    
    static {
        agzi.registerDefaultInstance(agnk.class, a = new agnk());
    }
    
    private agnk() {
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = agnk.g) == null) {
                    synchronized (agnk.class) {
                        if (agnk.g == null) {
                            agnk.g = (ahbe)new agzb((agzi)agnk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agnk.a;
            }
            case 4: {
                return new agza((agzi)agnk.a);
            }
            case 3: {
                return new agnk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnk.a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004\u0004\u0208\u0005\u0208", new Object[] { "b", "c", "d", "e", "f" });
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
