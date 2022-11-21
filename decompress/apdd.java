import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdd extends ahcz implements aheo
{
    public static final apdd a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apdd.class, a = new apdd());
    }
    
    private apdd() {
        this.e = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apdd.b) == null) {
                    synchronized (apdd.class) {
                        if (apdd.b == null) {
                            apdd.b = (ahev)new ahcs((ahcz)apdd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdd.a;
            }
            case 4: {
                return new ahcr((ahcz)apdd.a);
            }
            case 3: {
                return new apdd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdd.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
