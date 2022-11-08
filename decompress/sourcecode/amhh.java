import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhh extends agzi implements ahax
{
    public static final amhh a;
    private static volatile ahbe d;
    public int b;
    public aioe c;
    private aibi e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amhh.class, (agzi)(a = new amhh()));
    }
    
    private amhh() {
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
                final ahbe d;
                if ((d = amhh.d) == null) {
                    synchronized (amhh.class) {
                        if (amhh.d == null) {
                            amhh.d = (ahbe)new agzb((agzi)amhh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhh.a;
            }
            case 4: {
                return new agza((agzi)amhh.a);
            }
            case 3: {
                return new amhh();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "e", "c" });
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
