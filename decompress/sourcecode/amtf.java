import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtf extends agzi implements ahax
{
    public static final amtf a;
    private static volatile ahbe d;
    public boolean b;
    public long c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(amtf.class, a = new amtf());
    }
    
    private amtf() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amtf.d) == null) {
                    synchronized (amtf.class) {
                        if (amtf.d == null) {
                            amtf.d = (ahbe)new agzb((agzi)amtf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amtf.a;
            }
            case 4: {
                return new agza((agzi)amtf.a);
            }
            case 3: {
                return new amtf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001", new Object[] { "e", "b", "c" });
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
