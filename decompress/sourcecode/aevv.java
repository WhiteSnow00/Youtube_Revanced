import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevv extends agzi implements ahax
{
    public static final aevv a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(aevv.class, a = new aevv());
    }
    
    private aevv() {
        this.c = true;
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
                if ((d = aevv.d) == null) {
                    synchronized (aevv.class) {
                        if (aevv.d == null) {
                            aevv.d = (ahbe)new agzb((agzi)aevv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aevv.a;
            }
            case 4: {
                return new agza((agzi)aevv.a);
            }
            case 3: {
                return new aevv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aevv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
