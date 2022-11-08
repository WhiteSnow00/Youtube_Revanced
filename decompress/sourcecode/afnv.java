import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afnv extends agzi implements ahax
{
    public static final afnv a;
    private static volatile ahbe d;
    public int b;
    public afnw c;
    
    static {
        agzi.registerDefaultInstance(afnv.class, a = new afnv());
    }
    
    private afnv() {
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
                if ((d = afnv.d) == null) {
                    synchronized (afnv.class) {
                        if (afnv.d == null) {
                            afnv.d = (ahbe)new agzb((agzi)afnv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afnv.a;
            }
            case 4: {
                return new agza((agzi)afnv.a);
            }
            case 3: {
                return new afnv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afnv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
