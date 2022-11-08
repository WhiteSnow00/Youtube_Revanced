import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alag extends agzi implements ahax
{
    public static final alag a;
    private static volatile ahbe e;
    public akjf b;
    public String c;
    public alah d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)alag.class, (agzi)(a = new alag()));
    }
    
    private alag() {
        this.g = 2;
        this.c = "";
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
                if ((e = alag.e) == null) {
                    synchronized (alag.class) {
                        if (alag.e == null) {
                            alag.e = (ahbe)new agzb((agzi)alag.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alag.a;
            }
            case 4: {
                return new agza((agzi)alag.a);
            }
            case 3: {
                return new alag();
            }
            case 2: {
                return newMessageInfo((MessageLite)alag.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
