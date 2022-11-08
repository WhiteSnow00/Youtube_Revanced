import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcd extends agzi implements ahax
{
    public static final apcd a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apcd.class, a = new apcd());
    }
    
    private apcd() {
        this.f = 2;
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
                final ahbe b2;
                if ((b2 = apcd.b) == null) {
                    synchronized (apcd.class) {
                        if (apcd.b == null) {
                            apcd.b = (ahbe)new agzb((agzi)apcd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcd.a;
            }
            case 4: {
                return new agza((agzi)apcd.a);
            }
            case 3: {
                return new apcd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcd.a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
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
