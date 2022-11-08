import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyu extends agzi implements ahax
{
    public static final akyu a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public akyt d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)akyu.class, (agzi)(a = new akyu()));
    }
    
    private akyu() {
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
                final ahbe f;
                if ((f = akyu.f) == null) {
                    synchronized (akyu.class) {
                        if (akyu.f == null) {
                            akyu.f = (ahbe)new agzb((agzi)akyu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akyu.a;
            }
            case 4: {
                return new agza((agzi)akyu.a);
            }
            case 3: {
                return new akyu();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyu.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0004\u100c\u0002", new Object[] { "b", "c", "d", "e", akwf.j });
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
