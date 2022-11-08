import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apox extends agzi implements ahax
{
    public static final apox a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)apox.class, (agzi)(a = new apox()));
    }
    
    private apox() {
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
                final ahbe b2;
                if ((b2 = apox.b) == null) {
                    synchronized (apox.class) {
                        if (apox.b == null) {
                            apox.b = (ahbe)new agzb((agzi)apox.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apox.a;
            }
            case 4: {
                return new agza((agzi)apox.a);
            }
            case 3: {
                return new apox();
            }
            case 2: {
                return newMessageInfo((MessageLite)apox.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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
