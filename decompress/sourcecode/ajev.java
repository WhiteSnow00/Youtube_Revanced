import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajev extends agzi implements ahax
{
    public static final ajev a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public int d;
    
    static {
        final ajev a2 = new ajev();
        agzi.registerDefaultInstance(ajev.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)apng.a, a2, (MessageLite)a2, null, 393415810, ahcm.k, ajev.class);
    }
    
    private ajev() {
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
                if ((e = ajev.e) == null) {
                    synchronized (ajev.class) {
                        if (ajev.e == null) {
                            ajev.e = (ahbe)new agzb((agzi)ajev.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajev.a;
            }
            case 4: {
                return new agza((agzi)ajev.a);
            }
            case 3: {
                return new ajev();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajev.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", apwq.a() });
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
