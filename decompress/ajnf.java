import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnf extends ahcz implements aheo
{
    public static final ajnf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private aisc h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(ajnf.class, a = new ajnf());
    }
    
    private ajnf() {
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
                if ((b = ajnf.b) == null) {
                    synchronized (ajnf.class) {
                        if (ajnf.b == null) {
                            ajnf.b = (ahev)new ahcs((ahcz)ajnf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajnf.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnf.a);
            }
            case 3: {
                return new ajnf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnf.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002\u1409\u0004\u0003\u1409\u0005\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1409\u0001\b\u1409\u0000", new Object[] { "c", "h", "i", "f", "g", "e", "d" });
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
