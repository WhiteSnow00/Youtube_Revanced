import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprk extends agzi implements ahax
{
    public static final aprk a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance((Class)aprk.class, (agzi)(a = new aprk()));
    }
    
    private aprk() {
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aprk.e) == null) {
                    synchronized (aprk.class) {
                        if (aprk.e == null) {
                            aprk.e = (ahbe)new agzb((agzi)aprk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aprk.a;
            }
            case 4: {
                return new agza((agzi)aprk.a);
            }
            case 3: {
                return new aprk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
