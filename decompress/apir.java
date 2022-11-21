import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apir extends ahcz implements aheo
{
    public static final apir a;
    private static volatile ahev g;
    public int b;
    public String c;
    public ahdp d;
    public ahdp e;
    public aisc f;
    private aisc h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apir.class, a = new apir());
    }
    
    private apir() {
        this.i = 2;
        this.c = "";
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
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
                final ahev g;
                if ((g = apir.g) == null) {
                    synchronized (apir.class) {
                        if (apir.g == null) {
                            apir.g = (ahev)new ahcs((ahcz)apir.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apir.a;
            }
            case 4: {
                return new ahcr((ahcz)apir.a);
            }
            case 3: {
                return new apir();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apir.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0002\u0001\u1008\u0000\u0002\u001b\u0003\u001b\u0005\u1409\u0002\u0006\u1409\u0003", new Object[] { "b", "c", "d", aoeo.class, "e", aoeo.class, "f", "h" });
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
