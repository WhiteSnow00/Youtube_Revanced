import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alry extends agzi implements ahax
{
    public static final alry a;
    private static volatile ahbe d;
    public String b;
    public String c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(alry.class, a = new alry());
    }
    
    private alry() {
        this.f = 2;
        this.b = "";
        this.c = "";
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
                if ((d = alry.d) == null) {
                    synchronized (alry.class) {
                        if (alry.d == null) {
                            alry.d = (ahbe)new agzb((agzi)alry.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alry.a;
            }
            case 4: {
                return new agza((agzi)alry.a);
            }
            case 3: {
                return new alry();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alry.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0006", new Object[] { "e", "b", "c" });
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
