import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvm extends agzi implements ahax
{
    public static final amvm a;
    private static volatile ahbe c;
    public aoix b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(amvm.class, a = new amvm());
    }
    
    private amvm() {
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
                if ((c = amvm.c) == null) {
                    synchronized (amvm.class) {
                        if (amvm.c == null) {
                            amvm.c = (ahbe)new agzb((agzi)amvm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amvm.a;
            }
            case 4: {
                return new agza((agzi)amvm.a);
            }
            case 3: {
                return new amvm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvm.a, "\u0001\u0001\u0000\u0001\ue5b5\u3973\ue5b5\u3973\u0001\u0000\u0000\u0000\ue5b5\u3973\u1009\u0000", new Object[] { "d", "b" });
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
