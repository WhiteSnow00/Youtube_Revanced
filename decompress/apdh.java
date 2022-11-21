import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdh extends ahcz implements aheo
{
    public static final apdh a;
    private static volatile ahev b;
    private int c;
    private apdg d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apdh.class, a = new apdh());
    }
    
    private apdh() {
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
                if ((b = apdh.b) == null) {
                    synchronized (apdh.class) {
                        if (apdh.b == null) {
                            apdh.b = (ahev)new ahcs((ahcz)apdh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdh.a;
            }
            case 4: {
                return new ahcr((ahcz)apdh.a);
            }
            case 3: {
                return new apdh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdh.a, "\u0001\u0001\u0000\u0001\ufc44\u29e0\ufc44\u29e0\u0001\u0000\u0000\u0001\ufc44\u29e0\u1409\u0000", new Object[] { "c", "d" });
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
