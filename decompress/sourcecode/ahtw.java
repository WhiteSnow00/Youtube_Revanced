import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtw extends agzi implements ahax
{
    public static final ahtw a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahtw.class, a = new ahtw());
    }
    
    private ahtw() {
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
                if ((c = ahtw.c) == null) {
                    synchronized (ahtw.class) {
                        if (ahtw.c == null) {
                            ahtw.c = (ahbe)new agzb((agzi)ahtw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahtw.a;
            }
            case 4: {
                return new agza((agzi)ahtw.a);
            }
            case 3: {
                return new ahtw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtw.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
