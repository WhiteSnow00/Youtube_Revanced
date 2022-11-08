import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwu extends agzi implements ahax
{
    public static final atwu a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(atwu.class, a = new atwu());
    }
    
    private atwu() {
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
                if ((d = atwu.d) == null) {
                    synchronized (atwu.class) {
                        if (atwu.d == null) {
                            atwu.d = (ahbe)new agzb((agzi)atwu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atwu.a;
            }
            case 4: {
                return new agza((agzi)atwu.a);
            }
            case 3: {
                return new atwu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
