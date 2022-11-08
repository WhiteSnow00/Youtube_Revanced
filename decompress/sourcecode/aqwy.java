import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwy extends agzi implements ahax
{
    private static final aqwy a;
    private static volatile ahbe b;
    private int c;
    private boolean d;
    
    static {
        agzi.registerDefaultInstance(aqwy.class, a = new aqwy());
    }
    
    private aqwy() {
    }
    
    public static /* synthetic */ aqwy a() {
        return aqwy.a;
    }
    
    public static aqwy b() {
        return aqwy.a;
    }
    
    public boolean c() {
        return this.d;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqwy.b) == null) {
                    synchronized (aqwy.class) {
                        if (aqwy.b == null) {
                            aqwy.b = (ahbe)new agzb((agzi)aqwy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwy.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqwy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
