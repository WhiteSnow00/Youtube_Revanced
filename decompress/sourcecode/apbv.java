import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbv extends agzi implements ahax
{
    public static final apbv a;
    private static volatile ahbe f;
    public ajsq b;
    public ajsq c;
    public ahgm d;
    public long e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apbv.class, a = new apbv());
    }
    
    private apbv() {
        this.h = 2;
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
                if ((f = apbv.f) == null) {
                    synchronized (apbv.class) {
                        if (apbv.f == null) {
                            apbv.f = (ahbe)new agzb((agzi)apbv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apbv.a;
            }
            case 4: {
                return new agza((agzi)apbv.a);
            }
            case 3: {
                return new apbv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbv.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1002\u0003\u0004\u1409\u0001\u0006\u1009\u0002", new Object[] { "g", "b", "e", "c", "d" });
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
