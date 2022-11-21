import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxa extends ahcz implements aheo
{
    public static final apxa a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public ahdp d;
    public aisc e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apxa.class, a = new apxa());
    }
    
    private apxa() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
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
                final ahev f;
                if ((f = apxa.f) == null) {
                    synchronized (apxa.class) {
                        if (apxa.f == null) {
                            apxa.f = (ahev)new ahcs((ahcz)apxa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxa.a;
            }
            case 4: {
                return new ahcr((ahcz)apxa.a);
            }
            case 3: {
                return new apxa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxa.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001\u001a\u0002\u1409\u0000\u0004\u001a", new Object[] { "b", "c", "e", "d" });
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
