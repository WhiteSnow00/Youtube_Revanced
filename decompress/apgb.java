import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgb extends ahcz implements aheo
{
    public static final apgb a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apgb.class, a = new apgb());
    }
    
    private apgb() {
        this.f = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apgb.b) == null) {
                    synchronized (apgb.class) {
                        if (apgb.b == null) {
                            apgb.b = (ahev)new ahcs((ahcz)apgb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgb.a;
            }
            case 4: {
                return new ahcr((ahcz)apgb.a);
            }
            case 3: {
                return new apgb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgb.a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002\u1409\u0005\u0005\u1409\u0000", new Object[] { "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
