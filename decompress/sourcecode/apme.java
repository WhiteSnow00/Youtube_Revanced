import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apme extends agzi implements ahax
{
    public static final apme a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)apme.class, (agzi)(a = new apme()));
    }
    
    private apme() {
        this.f = 2;
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
                if ((b2 = apme.b) == null) {
                    synchronized (apme.class) {
                        if (apme.b == null) {
                            apme.b = (ahbe)new agzb((agzi)apme.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apme.a;
            }
            case 4: {
                return new agza((agzi)apme.a);
            }
            case 3: {
                return new apme();
            }
            case 2: {
                return newMessageInfo((MessageLite)apme.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
