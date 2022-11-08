import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzg extends agzi implements ahax
{
    public static final akzg a;
    private static volatile ahbe e;
    public int b;
    public akjd c;
    public int d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)akzg.class, (agzi)(a = new akzg()));
    }
    
    private akzg() {
        this.f = 2;
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
                if ((e = akzg.e) == null) {
                    synchronized (akzg.class) {
                        if (akzg.e == null) {
                            akzg.e = (ahbe)new agzb((agzi)akzg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akzg.a;
            }
            case 4: {
                return new agza((agzi)akzg.a);
            }
            case 3: {
                return new akzg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzg.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0004\u100c\u0003", new Object[] { "b", "c", "d", alsb.g });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
