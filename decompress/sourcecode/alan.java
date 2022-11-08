import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alan extends agzi implements ahax
{
    public static final alan a;
    private static volatile ahbe g;
    public int b;
    public akjf c;
    public String d;
    public int e;
    public alao f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)alan.class, (agzi)(a = new alan()));
    }
    
    private alan() {
        this.h = 2;
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
                final ahbe g;
                if ((g = alan.g) == null) {
                    synchronized (alan.class) {
                        if (alan.g == null) {
                            alan.g = (ahbe)new agzb((agzi)alan.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alan.a;
            }
            case 4: {
                return new agza((agzi)alan.a);
            }
            case 3: {
                return new alan();
            }
            case 2: {
                return newMessageInfo((MessageLite)alan.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1008\u0001\u0004\u100c\u0002\u0005\u1409\u0003", new Object[] { "b", "c", "d", "e", akwf.p, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
