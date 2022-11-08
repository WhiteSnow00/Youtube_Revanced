import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowa extends agzi implements ahax
{
    public static final aowa a;
    private static volatile ahbe e;
    public ajsq b;
    public ajsq c;
    public agzy d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aowa.class, a = new aowa());
    }
    
    private aowa() {
        this.g = 2;
        this.d = agzi.emptyProtobufList();
    }
    
    @Override
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
                if ((e = aowa.e) == null) {
                    synchronized (aowa.class) {
                        if (aowa.e == null) {
                            aowa.e = (ahbe)new agzb((agzi)aowa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aowa.a;
            }
            case 4: {
                return new agza((agzi)aowa.a);
            }
            case 3: {
                return new aowa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowa.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b", new Object[] { "f", "b", "c", "d", anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
