import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ands extends agzi implements ahax
{
    public static final ands a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public agzy d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ands.class, a = new ands());
    }
    
    private ands() {
        this.f = 2;
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
                if ((e = ands.e) == null) {
                    synchronized (ands.class) {
                        if (ands.e == null) {
                            ands.e = (ahbe)new agzb((agzi)ands.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ands.a;
            }
            case 4: {
                return new agza((agzi)ands.a);
            }
            case 3: {
                return new ands();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ands.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1004\u0000\u0002\u041b", new Object[] { "b", "c", "d", anss.class });
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
