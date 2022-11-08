import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzr extends agzi implements ahax
{
    public static final akzr a;
    private static volatile ahbe h;
    public int b;
    public akjd c;
    public String d;
    public akzn e;
    public akzp f;
    public akzq g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)akzr.class, (agzi)(a = new akzr()));
    }
    
    private akzr() {
        this.i = 2;
        this.d = "";
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
                final ahbe h;
                if ((h = akzr.h) == null) {
                    synchronized (akzr.class) {
                        if (akzr.h == null) {
                            akzr.h = (ahbe)new agzb((agzi)akzr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akzr.a;
            }
            case 4: {
                return new agza((agzi)akzr.a);
            }
            case 3: {
                return new akzr();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzr.a, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\t\u1009\b\f\u1009\u000b\u0010\u1009\u000e", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
