import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtm extends agzi implements ahax
{
    public static final ahtm a;
    private static volatile ahbe d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahtm.class, a = new ahtm());
    }
    
    private ahtm() {
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
                if ((d = ahtm.d) == null) {
                    synchronized (ahtm.class) {
                        if (ahtm.d == null) {
                            ahtm.d = (ahbe)new agzb((agzi)ahtm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahtm.a;
            }
            case 4: {
                return new agza((agzi)ahtm.a);
            }
            case 3: {
                return new ahtm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
