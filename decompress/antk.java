import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antk extends ahcz implements aheo
{
    public static final antk a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(antk.class, a = new antk());
    }
    
    private antk() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = antk.b) == null) {
                    synchronized (antk.class) {
                        if (antk.b == null) {
                            antk.b = (ahev)new ahcs((ahcz)antk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return antk.a;
            }
            case 4: {
                return new ahcr((ahcz)antk.a);
            }
            case 3: {
                return new antk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antk.a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007\u1409\u0001", new Object[] { "c", "d" });
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
