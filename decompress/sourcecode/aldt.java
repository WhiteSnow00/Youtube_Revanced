import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldt extends agzd implements agze
{
    public static final aldt a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private anss e;
    private ahfw f;
    private anss g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aldt.class, (agzi)(a = new aldt()));
    }
    
    private aldt() {
        this.h = 2;
        final agyc b = agyc.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = aldt.b) == null) {
                    synchronized (aldt.class) {
                        if (aldt.b == null) {
                            aldt.b = (ahbe)new agzb((agzi)aldt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aldt.a;
            }
            case 4: {
                return new agzc(aldt.a);
            }
            case 3: {
                return new aldt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldt.a, "\u0001\u0004\u0000\u0001\b \u0004\u0000\u0000\u0004\b\u1409\u0006\u0012\u1409\f\u001e\u1409\n \u1409\u0015", new Object[] { "c", "d", "f", "e", "g" });
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
