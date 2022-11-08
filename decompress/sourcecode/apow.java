import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apow extends agzi implements ahax
{
    public static final apow a;
    private static volatile ahbe c;
    public agzy b;
    private int d;
    private ajsq e;
    private aioe f;
    private ajsq g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)apow.class, (agzi)(a = new apow()));
    }
    
    private apow() {
        this.i = 2;
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
                if ((c = apow.c) == null) {
                    synchronized (apow.class) {
                        if (apow.c == null) {
                            apow.c = (ahbe)new agzb((agzi)apow.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apow.a;
            }
            case 4: {
                return new agza((agzi)apow.a);
            }
            case 3: {
                return new apow();
            }
            case 2: {
                return newMessageInfo((MessageLite)apow.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0003\u0005\u1409\u0001\u0006\u1409\u0002", new Object[] { "d", "e", "b", apov.class, "h", "f", "g" });
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
