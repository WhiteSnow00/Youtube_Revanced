import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitl extends agzi implements ahax
{
    public static final aitl a;
    private static volatile ahbe d;
    public agzy b;
    public agyc c;
    private int e;
    private ajsq f;
    private ajsq g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aitl.class, a = new aitl());
    }
    
    private aitl() {
        this.i = 2;
        this.b = agzi.emptyProtobufList();
        this.c = agyc.b;
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
                final ahbe d;
                if ((d = aitl.d) == null) {
                    synchronized (aitl.class) {
                        if (aitl.d == null) {
                            aitl.d = (ahbe)new agzb((agzi)aitl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aitl.a;
            }
            case 4: {
                return new agza((agzi)aitl.a);
            }
            case 3: {
                return new aitl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitl.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0004\u0001\u041b\u0003\u1409\u0002\u0004\u100a\u0003\u0006\u1409\u0000\u0007\u1409\u0001", new Object[] { "e", "b", aitk.class, "h", "c", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
