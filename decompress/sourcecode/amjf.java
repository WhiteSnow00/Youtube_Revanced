import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjf extends agzd implements agze
{
    public static final amjf a;
    private static volatile ahbe c;
    public agzy b;
    private int d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amjf.class, (agzi)(a = new amjf()));
    }
    
    private amjf() {
        this.f = 2;
        this.b = emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((c = amjf.c) == null) {
                    synchronized (amjf.class) {
                        if (amjf.c == null) {
                            amjf.c = (ahbe)new agzb((agzi)amjf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amjf.a;
            }
            case 4: {
                return new agzc(amjf.a);
            }
            case 3: {
                return new amjf();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "d", "b", amje.class, "e" });
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
