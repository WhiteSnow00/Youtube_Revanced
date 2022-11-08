import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyz extends agzi implements ahax
{
    public static final akyz a;
    private static volatile ahbe e;
    public akjf b;
    public akyx c;
    public akyw d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)akyz.class, (agzi)(a = new akyz()));
    }
    
    private akyz() {
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
                final ahbe e;
                if ((e = akyz.e) == null) {
                    synchronized (akyz.class) {
                        if (akyz.e == null) {
                            akyz.e = (ahbe)new agzb((agzi)akyz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akyz.a;
            }
            case 4: {
                return new agza((agzi)akyz.a);
            }
            case 3: {
                return new akyz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyz.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1009\u0002", new Object[] { "f", "b", "c", "d" });
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
