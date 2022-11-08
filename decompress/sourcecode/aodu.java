import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodu extends agzi implements ahax
{
    public static final aodu a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public anuk d;
    
    static {
        final aodu a2 = new aodu();
        agzi.registerDefaultInstance(aodu.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqli.a, a2, (MessageLite)a2, null, 9, ahcm.k, aodu.class);
    }
    
    private aodu() {
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
                if ((e = aodu.e) == null) {
                    synchronized (aodu.class) {
                        if (aodu.e == null) {
                            aodu.e = (ahbe)new agzb((agzi)aodu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aodu.a;
            }
            case 4: {
                return new agza((agzi)aodu.a);
            }
            case 3: {
                return new aodu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
