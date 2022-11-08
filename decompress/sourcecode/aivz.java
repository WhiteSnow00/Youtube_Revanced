import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivz extends agzi implements ahax
{
    public static final aivz a;
    private static volatile ahbe d;
    public int b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(aivz.class, a = new aivz());
    }
    
    private aivz() {
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
                if ((d = aivz.d) == null) {
                    synchronized (aivz.class) {
                        if (aivz.d == null) {
                            aivz.d = (ahbe)new agzb((agzi)aivz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aivz.a;
            }
            case 4: {
                return new agza((agzi)aivz.a);
            }
            case 3: {
                return new aivz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001", new Object[] { "e", "b", "c" });
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
