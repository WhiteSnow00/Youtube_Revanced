import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfw extends ahcz implements aheo
{
    public static final apfw a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private apfx e;
    private apfv f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apfw.class, a = new apfw());
    }
    
    private apfw() {
        this.i = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfw.b) == null) {
                    synchronized (apfw.class) {
                        if (apfw.b == null) {
                            apfw.b = (ahev)new ahcs((ahcz)apfw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfw.a;
            }
            case 4: {
                return new ahcr((ahcz)apfw.a);
            }
            case 3: {
                return new apfw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfw.a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0005\u0001\u1409\u0001\u0005\u1409\u0005\t\u1409\b\n\u1409\u0000\f\u1409\n", new Object[] { "c", "e", "f", "g", "d", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
