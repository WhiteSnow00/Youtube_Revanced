import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aptm extends ahcz implements aheo
{
    public static final aptm a;
    private static volatile ahev c;
    public ahdp b;
    private int d;
    private ajws e;
    private aisc f;
    private ajws g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aptm.class, a = new aptm());
    }
    
    private aptm() {
        this.i = 2;
        this.b = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aptm.c) == null) {
                    synchronized (aptm.class) {
                        if (aptm.c == null) {
                            aptm.c = (ahev)new ahcs((ahcz)aptm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aptm.a;
            }
            case 4: {
                return new ahcr((ahcz)aptm.a);
            }
            case 3: {
                return new aptm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptm.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0003\u0005\u1409\u0001\u0006\u1409\u0002", new Object[] { "d", "e", "b", aptl.class, "h", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
