import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyf extends agzi implements ahax
{
    public static final atyf a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(atyf.class, a = new atyf());
    }
    
    private atyf() {
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
                if ((e = atyf.e) == null) {
                    synchronized (atyf.class) {
                        if (atyf.e == null) {
                            atyf.e = (ahbe)new agzb((agzi)atyf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atyf.a;
            }
            case 4: {
                return new agza((agzi)atyf.a);
            }
            case 3: {
                return new atyf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atyf.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1002\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", arbt.s });
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
