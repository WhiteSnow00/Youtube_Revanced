import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxn extends agzi implements ahax
{
    public static final apxn a;
    private static volatile ahbe f;
    public ajsq b;
    public ajsq c;
    public agyc d;
    public apxo e;
    private int g;
    private ahfw h;
    private anss i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(apxn.class, a = new apxn());
    }
    
    private apxn() {
        this.j = 2;
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
                if ((f = apxn.f) == null) {
                    synchronized (apxn.class) {
                        if (apxn.f == null) {
                            apxn.f = (ahbe)new agzb((agzi)apxn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxn.a;
            }
            case 4: {
                return new agza((agzi)apxn.a);
            }
            case 3: {
                return new apxn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxn.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "g", "b", "c", "h", "d", "e", "i" });
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
