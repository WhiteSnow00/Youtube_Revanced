import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgi extends agzi implements ahax
{
    public static final aqgi a;
    private static volatile ahbe b;
    private int c;
    private aqfp d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqgi.class, (agzi)(a = new aqgi()));
    }
    
    private aqgi() {
        this.e = 2;
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
                if ((b2 = aqgi.b) == null) {
                    synchronized (aqgi.class) {
                        if (aqgi.b == null) {
                            aqgi.b = (ahbe)new agzb((agzi)aqgi.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgi.a;
            }
            case 4: {
                return new agza((agzi)aqgi.a);
            }
            case 3: {
                return new aqgi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgi.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}