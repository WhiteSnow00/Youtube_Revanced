import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpp extends agzi implements ahax
{
    public static final ajpp a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajpp.class, (agzi)(a = new ajpp()));
    }
    
    private ajpp() {
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
                if ((b2 = ajpp.b) == null) {
                    synchronized (ajpp.class) {
                        if (ajpp.b == null) {
                            ajpp.b = (ahbe)new agzb((agzi)ajpp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajpp.a;
            }
            case 4: {
                return new agza((agzi)ajpp.a);
            }
            case 3: {
                return new ajpp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpp.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0001", new Object[] { "c", "d" });
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
