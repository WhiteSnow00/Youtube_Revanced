import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdm extends ahcz implements aheo
{
    public static final apdm a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private ajws f;
    private ajws g;
    private aofv h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apdm.class, a = new apdm());
    }
    
    private apdm() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apdm.b) == null) {
                    synchronized (apdm.class) {
                        if (apdm.b == null) {
                            apdm.b = (ahev)new ahcs((ahcz)apdm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdm.a;
            }
            case 4: {
                return new ahcr((ahcz)apdm.a);
            }
            case 3: {
                return new apdm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdm.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0005\u0007\u1409\u0007\b\u1409\u0002", new Object[] { "c", "d", "e", "g", "h", "i", "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
