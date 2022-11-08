import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzv extends agzi implements ahax
{
    public static final akzv a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private aidl e;
    private ajtl f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)akzv.class, (agzi)(a = new akzv()));
    }
    
    private akzv() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = akzv.c) == null) {
                    synchronized (akzv.class) {
                        if (akzv.c == null) {
                            akzv.c = (ahbe)new agzb((agzi)akzv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akzv.a;
            }
            case 4: {
                return new agza((agzi)akzv.a);
            }
            case 3: {
                return new akzv();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzv.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0309\u1409\u001a", new Object[] { "d", "b", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
