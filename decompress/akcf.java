import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcf extends ahcz implements aheo
{
    public static final akcf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akcf.class, a = new akcf());
    }
    
    private akcf() {
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
                if ((b = akcf.b) == null) {
                    synchronized (akcf.class) {
                        if (akcf.b == null) {
                            akcf.b = (ahev)new ahcs((ahcz)akcf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcf.a;
            }
            case 4: {
                return new ahcr((ahcz)akcf.a);
            }
            case 3: {
                return new akcf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
