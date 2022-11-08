import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzi extends agzi implements ahax
{
    public static final akzi a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public String d;
    public aiut e;
    public aiuu f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)akzi.class, (agzi)(a = new akzi()));
    }
    
    private akzi() {
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
                if ((g = akzi.g) == null) {
                    synchronized (akzi.class) {
                        if (akzi.g == null) {
                            akzi.g = (ahbe)new agzb((agzi)akzi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akzi.a;
            }
            case 4: {
                return new agza((agzi)akzi.a);
            }
            case 3: {
                return new akzi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzi.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
