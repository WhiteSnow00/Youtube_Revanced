import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknj extends agzi implements ahax
{
    public static final aknj a;
    private static volatile ahbe e;
    public akjf b;
    public agzy c;
    public agzy d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aknj.class, a = new aknj());
    }
    
    private aknj() {
        this.g = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
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
                if ((e = aknj.e) == null) {
                    synchronized (aknj.class) {
                        if (aknj.e == null) {
                            aknj.e = (ahbe)new agzb((agzi)aknj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknj.a;
            }
            case 4: {
                return new agza((agzi)aknj.a);
            }
            case 3: {
                return new aknj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknj.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0003\u0001\u1409\u0000\u0003\u041b\u0004\u041b", new Object[] { "f", "b", "c", aknf.class, "d", anss.class });
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
