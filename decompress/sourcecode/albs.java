import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albs extends agzi implements ahax
{
    public static final albs a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance((Class)albs.class, (agzi)(a = new albs()));
    }
    
    private albs() {
        this.d = 2;
        this.b = emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((c = albs.c) == null) {
                    synchronized (albs.class) {
                        if (albs.c == null) {
                            albs.c = (ahbe)new agzb((agzi)albs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return albs.a;
            }
            case 4: {
                return new agza((agzi)albs.a);
            }
            case 3: {
                return new albs();
            }
            case 2: {
                return newMessageInfo((MessageLite)albs.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aizm.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
