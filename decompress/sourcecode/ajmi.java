import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmi extends agzi implements ahax
{
    public static final ajmi a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ajmi.class, (agzi)(a = new ajmi()));
    }
    
    private ajmi() {
        this.f = 2;
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = ajmi.b) == null) {
                    synchronized (ajmi.class) {
                        if (ajmi.b == null) {
                            ajmi.b = (ahbe)new agzb((agzi)ajmi.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajmi.a;
            }
            case 4: {
                return new agza((agzi)ajmi.a);
            }
            case 3: {
                return new ajmi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmi.a, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0006\u1409\u0004", new Object[] { "c", "d", "e" });
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
