import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzq extends agzi implements ahax
{
    public static final apzq a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apzq.class, a = new apzq());
    }
    
    private apzq() {
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
                if ((c = apzq.c) == null) {
                    synchronized (apzq.class) {
                        if (apzq.c == null) {
                            apzq.c = (ahbe)new agzb((agzi)apzq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apzq.a;
            }
            case 4: {
                return new agza((agzi)apzq.a);
            }
            case 3: {
                return new apzq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzq.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
