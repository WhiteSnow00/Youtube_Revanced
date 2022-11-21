import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfz extends ahcz implements aheo
{
    public static final apfz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apfz.class, a = new apfz());
    }
    
    private apfz() {
        this.g = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfz.b) == null) {
                    synchronized (apfz.class) {
                        if (apfz.b == null) {
                            apfz.b = (ahev)new ahcs((ahcz)apfz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfz.a;
            }
            case 4: {
                return new ahcr((ahcz)apfz.a);
            }
            case 3: {
                return new apfz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfz.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0001", new Object[] { "c", "d", "f", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
