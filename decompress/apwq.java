import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwq extends ahcz implements aheo
{
    public static final apwq a;
    private static volatile ahev b;
    private int c;
    private apwo d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apwq.class, a = new apwq());
    }
    
    private apwq() {
        this.e = 2;
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
                if ((b = apwq.b) == null) {
                    synchronized (apwq.class) {
                        if (apwq.b == null) {
                            apwq.b = (ahev)new ahcs((ahcz)apwq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwq.a;
            }
            case 4: {
                return new ahcr((ahcz)apwq.a);
            }
            case 3: {
                return new apwq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwq.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
