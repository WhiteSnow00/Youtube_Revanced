import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpd extends agzi implements ahax
{
    public static final ajpd a;
    private static volatile ahbe d;
    public agzy b;
    public agyc c;
    private int e;
    private aioe f;
    private anss g;
    private aioe h;
    private anss i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)ajpd.class, (agzi)(a = new ajpd()));
    }
    
    private ajpd() {
        this.k = 2;
        this.b = emptyProtobufList();
        this.c = agyc.b;
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
                if ((d = ajpd.d) == null) {
                    synchronized (ajpd.class) {
                        if (ajpd.d == null) {
                            ajpd.d = (ahbe)new agzb((agzi)ajpd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajpd.a;
            }
            case 4: {
                return new agza((agzi)ajpd.a);
            }
            case 3: {
                return new ajpd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpd.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0004\u0004\u100a\u0005\u0005\u1409\u0001\u0006\u1409\u0003\u0007\u1409\u0002", new Object[] { "e", "b", anss.class, "f", "j", "c", "g", "i", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
