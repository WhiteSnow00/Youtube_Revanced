import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akce extends ahcz implements aheo
{
    public static final akce a;
    private static volatile ahev b;
    private int c;
    private ajfu d;
    private ajfs e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akce.class, a = new akce());
    }
    
    private akce() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = akce.b) == null) {
                    synchronized (akce.class) {
                        if (akce.b == null) {
                            akce.b = (ahev)new ahcs((ahcz)akce.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akce.a;
            }
            case 4: {
                return new ahcr((ahcz)akce.a);
            }
            case 3: {
                return new akce();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akce.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
