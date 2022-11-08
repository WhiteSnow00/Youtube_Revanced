import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmn extends agzi implements ahax
{
    public static final akmn a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(akmn.class, a = new akmn());
    }
    
    private akmn() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = akmn.e) == null) {
                    synchronized (akmn.class) {
                        if (akmn.e == null) {
                            akmn.e = (ahbe)new agzb((agzi)akmn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akmn.a;
            }
            case 4: {
                return new agza((agzi)akmn.a);
            }
            case 3: {
                return new akmn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
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
