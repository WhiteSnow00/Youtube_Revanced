import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnt extends agzi implements ahax
{
    public static final ajnt a;
    private static volatile ahbe e;
    public int b;
    public ajns c;
    public aegg d;
    
    static {
        agzi.registerDefaultInstance((Class)ajnt.class, (agzi)(a = new ajnt()));
    }
    
    private ajnt() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajnt.e) == null) {
                    synchronized (ajnt.class) {
                        if (ajnt.e == null) {
                            ajnt.e = (ahbe)new agzb((agzi)ajnt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajnt.a;
            }
            case 4: {
                return new agza((agzi)ajnt.a);
            }
            case 3: {
                return new ajnt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
