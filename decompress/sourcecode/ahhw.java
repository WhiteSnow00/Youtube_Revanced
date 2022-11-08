import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhw extends agzi implements ahax
{
    public static final ahhw a;
    private static volatile ahbe d;
    public agzy b;
    public ahhu c;
    private int e;
    private ahfw f;
    private ajsq g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahhw.class, a = new ahhw());
    }
    
    private ahhw() {
        this.h = 2;
        this.b = agzi.emptyProtobufList();
        emptyProtobufList();
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
                if ((d = ahhw.d) == null) {
                    synchronized (ahhw.class) {
                        if (ahhw.d == null) {
                            ahhw.d = (ahbe)new agzb((agzi)ahhw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahhw.a;
            }
            case 4: {
                return new agza((agzi)ahhw.a);
            }
            case 3: {
                return new ahhw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhw.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0004\u0001\u041b\u0004\u1409\u0000\u0005\u1409\u0003\u0007\u1409\u0002", new Object[] { "e", "b", ahhv.class, "f", "g", "c" });
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
