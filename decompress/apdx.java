import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdx extends ahcz implements aheo
{
    public static final apdx a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apdx.class, a = new apdx());
    }
    
    private apdx() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = apdx.b) == null) {
                    synchronized (apdx.class) {
                        if (apdx.b == null) {
                            apdx.b = (ahev)new ahcs((ahcz)apdx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdx.a;
            }
            case 4: {
                return new ahcr((ahcz)apdx.a);
            }
            case 3: {
                return new apdx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdx.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0003", new Object[] { "c", "d" });
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
