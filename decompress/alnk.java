import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnk extends ahcz implements aheo
{
    public static final alnk a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alnk.class, a = new alnk());
    }
    
    private alnk() {
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
                if ((b = alnk.b) == null) {
                    synchronized (alnk.class) {
                        if (alnk.b == null) {
                            alnk.b = (ahev)new ahcs((ahcz)alnk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnk.a;
            }
            case 4: {
                return new ahcr((ahcz)alnk.a);
            }
            case 3: {
                return new alnk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnk.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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