import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aity extends agzi implements ahax
{
    public static final aity a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(aity.class, a = new aity());
    }
    
    private aity() {
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
                if ((d = aity.d) == null) {
                    synchronized (aity.class) {
                        if (aity.d == null) {
                            aity.d = (ahbe)new agzb((agzi)aity.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aity.a;
            }
            case 4: {
                return new agza((agzi)aity.a);
            }
            case 3: {
                return new aity();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aity.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
