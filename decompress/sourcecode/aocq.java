import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocq extends agzi implements ahax
{
    public static final aocq a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(aocq.class, a = new aocq());
    }
    
    private aocq() {
        this.d = "";
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
                if ((e = aocq.e) == null) {
                    synchronized (aocq.class) {
                        if (aocq.e == null) {
                            aocq.e = (ahbe)new agzb((agzi)aocq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aocq.a;
            }
            case 4: {
                return new agza((agzi)aocq.a);
            }
            case 3: {
                return new aocq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "b", "c", anvq.u, "d" });
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
