import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankl extends agzi implements ahax
{
    public static final ankl a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public ajsq d;
    public akxf e;
    public agyc f;
    private aioe h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ankl.class, a = new ankl());
    }
    
    private ankl() {
        this.j = 2;
        this.c = "";
        this.f = agyc.b;
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
                final ahbe g;
                if ((g = ankl.g) == null) {
                    synchronized (ankl.class) {
                        if (ankl.g == null) {
                            ankl.g = (ahbe)new agzb((agzi)ankl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ankl.a;
            }
            case 4: {
                return new agza((agzi)ankl.a);
            }
            case 3: {
                return new ankl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankl.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1009\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "h", "i", "e", "f" });
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
