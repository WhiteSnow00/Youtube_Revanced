import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfs extends agzi implements ahax
{
    public static final amfs a;
    private static volatile ahbe e;
    public agzy b;
    public int c;
    public agyc d;
    private int f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)amfs.class, (agzi)(a = new amfs()));
    }
    
    private amfs() {
        this.h = 2;
        this.b = emptyProtobufList();
        this.d = agyc.b;
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
                if ((e = amfs.e) == null) {
                    synchronized (amfs.class) {
                        if (amfs.e == null) {
                            amfs.e = (ahbe)new agzb((agzi)amfs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amfs.a;
            }
            case 4: {
                return new agza((agzi)amfs.a);
            }
            case 3: {
                return new amfs();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfs.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u041b\u0002\u1004\u0000\u0003\u1409\u0001\u0004\u100a\u0002", new Object[] { "f", "b", amfv.class, "c", "g", "d" });
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
