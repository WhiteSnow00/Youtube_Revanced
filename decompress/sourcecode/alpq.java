import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpq extends agzi implements ahax
{
    public static final alpq a;
    private static volatile ahbe f;
    public String b;
    public agzy c;
    public agyc d;
    public ajsq e;
    private int g;
    private anss h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(alpq.class, a = new alpq());
    }
    
    private alpq() {
        this.j = 2;
        this.b = "";
        this.c = agzi.emptyProtobufList();
        this.d = agyc.b;
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
                final ahbe f;
                if ((f = alpq.f) == null) {
                    synchronized (alpq.class) {
                        if (alpq.f == null) {
                            alpq.f = (ahbe)new agzb((agzi)alpq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alpq.a;
            }
            case 4: {
                return new agza((agzi)alpq.a);
            }
            case 3: {
                return new alpq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpq.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003\u0006\u1409\u0004", new Object[] { "g", "b", "c", anss.class, "h", "i", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
