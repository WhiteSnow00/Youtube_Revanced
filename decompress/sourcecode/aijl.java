import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijl extends agzi implements ahax
{
    public static final aijl a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aijl.class, a = new aijl());
    }
    
    private aijl() {
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
                if ((c = aijl.c) == null) {
                    synchronized (aijl.class) {
                        if (aijl.c == null) {
                            aijl.c = (ahbe)new agzb((agzi)aijl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aijl.a;
            }
            case 4: {
                return new agza((agzi)aijl.a);
            }
            case 3: {
                return new aijl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aijn.b });
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
