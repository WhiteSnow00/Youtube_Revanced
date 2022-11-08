import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowb extends agzi implements ahax
{
    public static final aowb a;
    private static volatile ahbe d;
    public agzy b;
    public anss c;
    private int e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aowb.class, a = new aowb());
    }
    
    private aowb() {
        this.g = 2;
        this.b = agzi.emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe d;
                if ((d = aowb.d) == null) {
                    synchronized (aowb.class) {
                        if (aowb.d == null) {
                            aowb.d = (ahbe)new agzb((agzi)aowb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aowb.a;
            }
            case 4: {
                return new agza((agzi)aowb.a);
            }
            case 3: {
                return new aowb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001", new Object[] { "e", "b", anss.class, "c", "f" });
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
