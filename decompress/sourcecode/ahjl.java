import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjl extends agzi implements ahax
{
    public static final ahjl a;
    private static volatile ahbe e;
    public int b;
    public aorm c;
    public ahjm d;
    private ahfw f;
    private ahkt g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)ahjl.class, (agzi)(a = new ahjl()));
    }
    
    private ahjl() {
        this.h = 2;
        final agyc b = agyc.b;
    }
    
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
                if ((e = ahjl.e) == null) {
                    synchronized (ahjl.class) {
                        if (ahjl.e == null) {
                            ahjl.e = (ahbe)new agzb((agzi)ahjl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahjl.a;
            }
            case 4: {
                return new agza((agzi)ahjl.a);
            }
            case 3: {
                return new ahjl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjl.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "f", "g" });
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
