import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobw extends agzi implements ahax
{
    public static final aobw a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aobw.class, a = new aobw());
    }
    
    private aobw() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aobw.c) == null) {
                    synchronized (aobw.class) {
                        if (aobw.c == null) {
                            aobw.c = (ahbe)new agzb((agzi)aobw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aobw.a;
            }
            case 4: {
                return new agza((agzi)aobw.a);
            }
            case 3: {
                return new aobw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobw.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1008\u0005", new Object[] { "d", "b" });
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
