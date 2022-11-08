import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdq extends agzi implements ahax
{
    public static final apdq a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apdq.class, a = new apdq());
    }
    
    private apdq() {
        this.c = "";
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
                if ((d = apdq.d) == null) {
                    synchronized (apdq.class) {
                        if (apdq.d == null) {
                            apdq.d = (ahbe)new agzb((agzi)apdq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdq.a;
            }
            case 4: {
                return new agza((agzi)apdq.a);
            }
            case 3: {
                return new apdq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
